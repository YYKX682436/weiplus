package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* loaded from: classes14.dex */
public class ColorBigImgData {
    public long capture_time;
    public java.lang.String checksum;
    public java.util.ArrayList<java.lang.Float> five_points;
    public java.lang.String image;

    public java.lang.String getImage() {
        return this.image;
    }

    public void setCaptureTime(long j17) {
        this.capture_time = j17;
    }

    public void setChecksum(java.lang.String str) {
        this.checksum = str;
    }

    public void setFivePoints(float[] fArr) {
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        this.five_points = arrayList;
        if (fArr != null) {
            arrayList.add(java.lang.Float.valueOf(fArr[176]));
            this.five_points.add(java.lang.Float.valueOf(fArr[177]));
            this.five_points.add(java.lang.Float.valueOf(fArr[178]));
            this.five_points.add(java.lang.Float.valueOf(fArr[179]));
            this.five_points.add(java.lang.Float.valueOf(fArr[64]));
            this.five_points.add(java.lang.Float.valueOf(fArr[65]));
            this.five_points.add(java.lang.Float.valueOf(fArr[90]));
            this.five_points.add(java.lang.Float.valueOf(fArr[91]));
            this.five_points.add(java.lang.Float.valueOf(fArr[102]));
            this.five_points.add(java.lang.Float.valueOf(fArr[103]));
        }
    }

    public void setImage(java.lang.String str) {
        this.image = str;
    }
}
