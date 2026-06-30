package com.tencent.wechat.aff.ext_device;

/* loaded from: classes11.dex */
public class m extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ext_device.m f216700c = new com.tencent.wechat.aff.ext_device.m();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ext_device.ZIDL__wvRFproK f216701a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.ext_device.ZIDL__wvRFproKE f216702b;

    public m() {
        com.tencent.wechat.aff.ext_device.ZIDL__wvRFproK zIDL__wvRFproK = new com.tencent.wechat.aff.ext_device.ZIDL__wvRFproK();
        this.f216701a = zIDL__wvRFproK;
        com.tencent.wechat.aff.ext_device.ZIDL__wvRFproKE zIDL__wvRFproKE = new com.tencent.wechat.aff.ext_device.ZIDL__wvRFproKE();
        this.f216702b = zIDL__wvRFproKE;
        this.zidlCreateName = "ext_device.ExtDeviceStatusManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_ext_device", "aff_biz");
        zIDL__wvRFproK.ZIDL__wvRFproC(this, zIDL__wvRFproKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public com.tencent.wechat.aff.ext_device.n a(java.lang.String str) {
        return com.tencent.wechat.aff.ext_device.n.a(this.f216701a.ZIDL_K(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public boolean b(long j17, int i17) {
        return this.f216701a.ZIDL_O(this.nativeHandler, j17, i17);
    }

    public void c(int i17, int i18, java.lang.String str) {
        this.f216701a.ZIDL_A(this.nativeHandler, i17, i18, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void d(java.lang.String str, com.tencent.wechat.aff.ext_device.k kVar) {
        this.f216702b.f216688d.put(str, kVar);
    }

    public void e(java.lang.String str, long j17, com.tencent.wechat.aff.ext_device.l lVar) {
        this.f216701a.ZIDL_IV(this.nativeHandler, lVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }

    public void f(java.lang.String str) {
        this.f216702b.f216688d.remove(str);
    }
}
