/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on Jul 31, 2013 6:22:49 PM
 * Time to generate: 00:25.068 seconds
 *
 */

package com.huawei.unibi.molap.merger.Util;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.ClassCache;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MolapSliceMergerUtilAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return MolapSliceMergerUtil.class;
    }
    
    public void testConstructor() throws Throwable {
        new MolapSliceMergerUtil();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetFileMap() throws Throwable {
        File file = new File("testMolapSliceMergerUtilParam11");
        File[] files = new File[3];
        files[0] = new File("testMolapSliceMergerUtilParam1");
        files[1] = file;
        files[2] = file;
        File[][] sliceFiles = new File[1][];
        sliceFiles[0] = files;
        LinkedHashMap result = (LinkedHashMap) MolapSliceMergerUtil.getFileMap(sliceFiles);
        assertEquals("result.size()", 2, result.size());
        assertTrue("(LinkedHashMap) result.containsKey(\"testMolapSliceMergerUtilParam1\")", result.containsKey("testMolapSliceMergerUtilParam1"));
    }
    
    public void testGetFileMap1() throws Throwable {
        File[] files = new File[0];
        File[][] sliceFiles = new File[1][];
        sliceFiles[0] = files;
        LinkedHashMap result = (LinkedHashMap) MolapSliceMergerUtil.getFileMap(sliceFiles);
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetFileMap2() throws Throwable {
        File[][] sliceFiles = new File[0][];
        LinkedHashMap result = (LinkedHashMap) MolapSliceMergerUtil.getFileMap(sliceFiles);
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetFileMap3() throws Throwable {
        File[] files = new File[1];
        files[0] = new File("testMolapSliceMergerUtilParam1");
        File[] files2 = new File[0];
        File[][] sliceFiles = new File[2][];
        sliceFiles[0] = files;
        sliceFiles[1] = files2;
        LinkedHashMap result = (LinkedHashMap) MolapSliceMergerUtil.getFileMap(sliceFiles);
        assertEquals("result.size()", 1, result.size());
        assertTrue("(LinkedHashMap) result.containsKey(\"testMolapSliceMergerUtilParam1\")", result.containsKey("testMolapSliceMergerUtilParam1"));
    }
    
    public void testCopyFileThrowsFileNotFoundException() throws Throwable {
        try {
            MolapSliceMergerUtil.copyFile(new File("testMolapSliceMergerUtilParam11"), new File("testMolapSliceMergerUtilParam1"));
            fail("Expected FileNotFoundException to be thrown");
        } catch (FileNotFoundException ex) {
            assertEquals("ex.getClass()", FileNotFoundException.class, ex.getClass());
            assertThrownBy(FileInputStream.class, ex);
        }
    }
    
    public void testCopyFileThrowsNullPointerException() throws Throwable {
        try {
            MolapSliceMergerUtil.copyFile((File) null, new File("testMolapSliceMergerUtilParam1"));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "name can't be null", ex.getMessage());
            assertThrownBy(FilePermission.class, ex);
        }
    }
    
    public void testCopyFileThrowsThrowable() throws Throwable {
        InputStream inputStream = (InputStream) Mockingbird.getProxyObject(InputStream.class);
        OutputStream outputStream = (OutputStream) Mockingbird.getProxyObject(OutputStream.class);
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, inputStream, "read", "(byte[])int", new Integer(0), 1);
        Mockingbird.setReturnValue(false, outputStream, "write", "(byte[],int,int)void", null, 1);
        Mockingbird.setReturnValue(false, inputStream, "read", "(byte[])int", new Integer(0), 1);
        Mockingbird.setReturnValue(false, outputStream, "write", "(byte[],int,int)void", null, 1);
        Mockingbird.setException(false, inputStream, "read", "(byte[])int", iOException, 1);
        Mockingbird.enterTestMode(MolapSliceMergerUtil.class);
        try {
            callPrivateMethod("com.huawei.unibi.molap.merger.Util.MolapSliceMergerUtil", "copyFile", new Class[] {InputStream.class, OutputStream.class}, null, new Object[] {inputStream, outputStream});
            fail("Expected Throwable to be thrown");
        } catch (Throwable ex) {
            assertThrownBy(ClassCache.class, ex);
            // dependencies on static and environment state led to removal of 1 assertion
        }
    }
    
    public void testGetFileMapThrowsNullPointerException() throws Throwable {
        File[] files = new File[3];
        files[0] = new File("testMolapSliceMergerUtilParam1");
        File[][] sliceFiles = new File[1][];
        sliceFiles[0] = files;
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException1() throws Throwable {
        File[] files = new File[0];
        File[][] sliceFiles = new File[3][];
        sliceFiles[0] = files;
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException2() throws Throwable {
        File file = (File) Mockingbird.getProxyObject(File.class);
        File[] files = new File[0];
        File[] files2 = new File[0];
        File[] files3 = new File[0];
        File[] files4 = new File[0];
        File[] files5 = new File[1];
        files5[0] = file;
        File[][] sliceFiles = new File[7][];
        sliceFiles[0] = files;
        sliceFiles[1] = files2;
        sliceFiles[2] = files3;
        sliceFiles[3] = files4;
        sliceFiles[4] = files5;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(file.getName(), "agitar7431581947297807173tmp");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(ArrayList.class), "add", "(java.lang.Object)boolean", Boolean.TRUE, 1);
        Mockingbird.enterTestMode(MolapSliceMergerUtil.class);
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException3() throws Throwable {
        File[][] sliceFiles = new File[1][];
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException4() throws Throwable {
        File[] files = new File[2];
        File[][] sliceFiles = new File[2][];
        sliceFiles[0] = files;
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException5() throws Throwable {
        try {
            MolapSliceMergerUtil.getFileMap((File[][]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException6() throws Throwable {
        File[] files = new File[0];
        File[] files2 = new File[3];
        File[][] sliceFiles = new File[3][];
        sliceFiles[0] = files;
        sliceFiles[1] = files2;
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
    
    public void testGetFileMapThrowsNullPointerException7() throws Throwable {
        File file = (File) Mockingbird.getProxyObject(File.class);
        File file2 = (File) Mockingbird.getProxyObject(File.class);
        File[] files = new File[0];
        File[] files2 = new File[0];
        File[] files3 = new File[4];
        files3[0] = file;
        files3[1] = file2;
        files3[2] = file2;
        File[][] sliceFiles = new File[5][];
        sliceFiles[0] = files;
        sliceFiles[1] = files2;
        sliceFiles[2] = files3;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(file.getName(), "agitar952825196356413734tmp");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(ArrayList.class), "add", "(java.lang.Object)boolean", Boolean.TRUE, 1);
        Mockingbird.setReturnValue(file2.getName(), "agitar657390936519341074tmp");
        ArrayList arrayList = (ArrayList) Mockingbird.getProxyObject(ArrayList.class);
        Mockingbird.setReturnValue(false, arrayList, "add", "(java.lang.Object)boolean", Boolean.TRUE, 1);
        Mockingbird.setReturnValue(file2.getName(), "agitar657390936519341074tmp");
        Mockingbird.setReturnValue(false, arrayList, "add", "(java.lang.Object)boolean", Boolean.TRUE, 1);
        Mockingbird.enterTestMode(MolapSliceMergerUtil.class);
        try {
            MolapSliceMergerUtil.getFileMap(sliceFiles);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapSliceMergerUtil.class, ex);
        }
    }
}
