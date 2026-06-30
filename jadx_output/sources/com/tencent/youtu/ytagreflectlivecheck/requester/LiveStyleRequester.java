package com.tencent.youtu.ytagreflectlivecheck.requester;

/* loaded from: classes13.dex */
public interface LiveStyleRequester {

    /* loaded from: classes13.dex */
    public static class LiveStyleAndroidData {
        public float lux = 0.0f;
        public java.lang.String build_brand = android.os.Build.BRAND;
        public java.lang.String build_model = android.os.Build.MODEL;
        public java.lang.String build_hardware = android.os.Build.HARDWARE;
        public java.lang.String build_display = android.os.Build.DISPLAY;
        public java.lang.String build_product = android.os.Build.PRODUCT;
        public java.lang.String build_device = android.os.Build.DEVICE;
        public java.lang.String android_apilevel = "" + android.os.Build.VERSION.SDK_INT;
        public java.lang.String android_version = android.os.Build.VERSION.RELEASE;
    }

    /* loaded from: classes13.dex */
    public static class SeleceData {
        public com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.LiveStyleAndroidData android_data;
        public int platform = 2;
        public int protocal = 1;
        public java.lang.String version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        public java.lang.String reflect_param = " version 2 ";
        public int change_point_num = 2;

        public SeleceData(float f17) {
            com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.LiveStyleAndroidData liveStyleAndroidData = new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.LiveStyleAndroidData();
            this.android_data = liveStyleAndroidData;
            liveStyleAndroidData.lux = f17;
        }
    }

    /* loaded from: classes13.dex */
    public static class YTLiveStyleReq {
        public java.lang.String app_id;
        public com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.SeleceData select_data;

        public YTLiveStyleReq(float f17, java.lang.String str) {
            this.select_data = new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.SeleceData(f17);
            this.app_id = str;
        }
    }
}
