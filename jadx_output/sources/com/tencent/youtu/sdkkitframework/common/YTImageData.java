package com.tencent.youtu.sdkkitframework.common;

/* loaded from: classes13.dex */
public class YTImageData {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "YTImageData";
    public java.lang.String checksum;
    public int height;
    public byte[] imgData;
    public int width;
    public float[] xys;

    public YTImageData() {
    }

    private int[] convertBGRByteToColor(byte[] bArr) {
        int i17;
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i18 = 0;
        int i19 = length % 3 != 0 ? 1 : 0;
        int i27 = (length / 3) + i19;
        int[] iArr = new int[i27];
        if (i19 == 0) {
            while (i18 < i27) {
                int i28 = i18 * 3;
                iArr[i18] = ((bArr[i28 + 2] << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) & 16711680) | (bArr[i28] & 255) | ((bArr[i28 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
        } else {
            while (true) {
                i17 = i27 - 1;
                if (i18 >= i17) {
                    break;
                }
                int i29 = i18 * 3;
                iArr[i18] = ((bArr[i29 + 2] << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) & 16711680) | (bArr[i29] & 255) | ((bArr[i29 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
            iArr[i17] = -16777216;
        }
        return iArr;
    }

    private int[] convertRGBByteToColor(byte[] bArr) {
        int i17;
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i18 = 0;
        int i19 = length % 3 != 0 ? 1 : 0;
        int i27 = (length / 3) + i19;
        int[] iArr = new int[i27];
        if (i19 == 0) {
            while (i18 < i27) {
                int i28 = i18 * 3;
                iArr[i18] = (bArr[i28 + 2] & 255) | ((bArr[i28] << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) & 16711680) | ((bArr[i28 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
        } else {
            while (true) {
                i17 = i27 - 1;
                if (i18 >= i17) {
                    break;
                }
                int i29 = i18 * 3;
                iArr[i18] = (bArr[i29 + 2] & 255) | ((bArr[i29] << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) & 16711680) | ((bArr[i29 + 1] << 8) & 65280) | (-16777216);
                i18++;
            }
            iArr[i17] = -16777216;
        }
        return iArr;
    }

    public android.graphics.Bitmap bgr2Bitmap() {
        int[] convertBGRByteToColor = convertBGRByteToColor(this.imgData);
        int i17 = this.width;
        return android.graphics.Bitmap.createBitmap(convertBGRByteToColor, 0, i17, i17, this.height, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public byte[] bgr2JPEG() {
        return bgr2JPEG(100);
    }

    public java.lang.Object clone() {
        com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData = new com.tencent.youtu.sdkkitframework.common.YTImageData();
        yTImageData.imgData = (byte[]) this.imgData.clone();
        yTImageData.width = this.width;
        yTImageData.height = this.height;
        return yTImageData;
    }

    public byte[] compressBitmap(int i17) {
        byte[] bArr = this.imgData;
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        decodeByteArray.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getImgData() {
        return this.imgData;
    }

    public int getWidth() {
        return this.width;
    }

    public android.graphics.Bitmap jpeg2Bitmap() {
        byte[] bArr = this.imgData;
        return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public void resize(int i17, int i18, int i19) {
        android.graphics.Bitmap jpeg2Bitmap = jpeg2Bitmap();
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(jpeg2Bitmap, i17, i18, true);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createScaledBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i19, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        jpeg2Bitmap.recycle();
        this.width = i17;
        this.height = i18;
        this.imgData = byteArray;
    }

    public void setHeight(int i17) {
        this.height = i17;
    }

    public void setImgData(byte[] bArr) {
        this.imgData = bArr;
    }

    public void setWidth(int i17) {
        this.width = i17;
    }

    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("img", new java.lang.String(this.imgData));
            jSONObject.put("checksum", this.checksum);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "video data tojson error:" + android.util.Log.getStackTraceString(e17));
            return new org.json.JSONObject();
        }
    }

    public java.lang.String toString() {
        return "ImageData{imgDataSize=" + this.imgData.length + ", width=" + this.width + ", height=" + this.height + '}';
    }

    public void writeImg2LocalDisk(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(com.tencent.youtu.sdkkitframework.common.FileUtils.createFile(str, str2));
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
    }

    public void writeImgByteArray2LocalDisk(java.lang.String str, java.lang.String str2) {
        java.io.File createFile = com.tencent.youtu.sdkkitframework.common.FileUtils.createFile(str, str2);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(this.imgData);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createFile);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.FileNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    public void writeJPEGImg2LocalDisk(java.lang.String str, java.lang.String str2) {
        java.io.File createFile = com.tencent.youtu.sdkkitframework.common.FileUtils.createFile(str, str2);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(createFile);
                try {
                    fileOutputStream2.write(this.imgData);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (java.lang.Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused3) {
            }
        } catch (java.lang.Exception unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public android.graphics.Bitmap yuv2Bitmap() {
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(this.imgData, 17, this.width, this.height, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 95, byteArrayOutputStream);
        return android.graphics.BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
    }

    public byte[] yuv2JPEG(int i17) {
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(this.imgData, 17, this.width, this.height, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), i17, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public YTImageData(byte[] bArr, int i17, int i18) {
        this.imgData = bArr;
        this.width = i17;
        this.height = i18;
    }

    public byte[] bgr2JPEG(int i17) {
        int[] convertBGRByteToColor = convertBGRByteToColor((byte[]) this.imgData.clone());
        int i18 = this.width;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(convertBGRByteToColor, 0, i18, i18, this.height, android.graphics.Bitmap.Config.ARGB_8888);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        createBitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public YTImageData(byte[] bArr, float[] fArr, int i17, int i18) {
        this.imgData = bArr;
        this.xys = fArr;
        this.width = i17;
        this.height = i18;
    }
}
