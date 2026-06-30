package com.tencent.youtu.ytagreflectlivecheck.requester;

/* loaded from: classes6.dex */
public interface RGBConfigRequester {

    /* loaded from: classes6.dex */
    public interface RGBConfigRequestCallBack {
        void onFailed(int i17);

        void onSuccess(java.lang.String str, int i17);
    }

    /* loaded from: classes6.dex */
    public static class RGBConfigRequestCallBackType {
        public static int RGB_FullResponse = 0;
        public static int RGB_OnlyRgbConfig = 1;
    }

    /* loaded from: classes13.dex */
    public static class YTColorSeqReq {
        public java.lang.String app_id;
        public java.lang.String business_name;
        public java.lang.String person_id;
        public java.lang.String build_brand = android.os.Build.BRAND;
        public java.lang.String build_model = android.os.Build.MODEL;
        public java.lang.String build_hardware = android.os.Build.HARDWARE;
        public java.lang.String build_serial = android.os.Build.SERIAL;
        public java.lang.String build_id = android.os.Build.ID;
        public java.lang.String build_display = android.os.Build.DISPLAY;
        public java.lang.String build_product = android.os.Build.PRODUCT;
        public java.lang.String build_device = android.os.Build.DEVICE;
        public java.lang.String build_test = null;
        public java.lang.String android_apilevel = "" + android.os.Build.VERSION.SDK_INT;
        public java.lang.String android_version = android.os.Build.VERSION.RELEASE;
        public int platform = 2;

        public YTColorSeqReq(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.app_id = str;
            this.business_name = str2;
            this.person_id = str3;
        }
    }

    void request(com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester.RGBConfigRequestCallBack rGBConfigRequestCallBack);
}
