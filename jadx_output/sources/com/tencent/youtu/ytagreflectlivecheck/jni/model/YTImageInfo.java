package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* loaded from: classes13.dex */
public class YTImageInfo {
    public java.lang.String checksum;
    public java.util.ArrayList<java.lang.Float> five_points;
    public java.lang.String image;

    public YTImageInfo(com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage yTActReflectImage) {
        this.image = new java.lang.String(android.util.Base64.encode(yTActReflectImage.image, 2));
        this.checksum = yTActReflectImage.checksum;
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        this.five_points = arrayList;
        float[] fArr = yTActReflectImage.xys;
        if (fArr != null) {
            arrayList.add(java.lang.Float.valueOf(fArr[176]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[177]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[178]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[179]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[64]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[65]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[90]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[91]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[102]));
            this.five_points.add(java.lang.Float.valueOf(yTActReflectImage.xys[103]));
        }
    }

    private void createFileWithByte(java.lang.String str, byte[] bArr) {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.File file = new java.io.File(str);
        java.io.FileOutputStream fileOutputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream2);
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                } catch (java.lang.Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    if (bufferedOutputStream == null) {
                        return;
                    }
                    bufferedOutputStream.close();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    if (bufferedOutputStream == null) {
                        throw th;
                    }
                    try {
                        bufferedOutputStream.close();
                        throw th;
                    } catch (java.lang.Exception unused5) {
                        throw th;
                    }
                }
            } catch (java.lang.Exception unused6) {
                bufferedOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedOutputStream = null;
            }
        } catch (java.lang.Exception unused7) {
            bufferedOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            bufferedOutputStream = null;
        }
        try {
            bufferedOutputStream.close();
        } catch (java.lang.Exception unused8) {
        }
    }
}
