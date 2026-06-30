package com.tencent.wechat.aff.ext_device;

/* loaded from: classes15.dex */
public class j extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ext_device.j f216698b = new com.tencent.wechat.aff.ext_device.j();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ext_device.ZIDL_cjhuET5mK f216699a;

    public j() {
        com.tencent.wechat.aff.ext_device.ZIDL_cjhuET5mK zIDL_cjhuET5mK = new com.tencent.wechat.aff.ext_device.ZIDL_cjhuET5mK();
        this.f216699a = zIDL_cjhuET5mK;
        this.zidlCreateName = "ext_device.ExtDeviceReport@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_ext_device", "aff_biz");
        zIDL_cjhuET5mK.ZIDL_cjhuET5mC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.ext_device.a aVar, java.lang.String str, java.lang.String str2, long j17, com.tencent.wechat.aff.ext_device.h hVar) {
        this.f216699a.ZIDL_BV(this.nativeHandler, hVar, aVar.f216695d, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }

    public void b(com.tencent.wechat.aff.ext_device.a aVar, java.lang.String str, java.lang.String str2, long j17, com.tencent.wechat.aff.ext_device.i iVar) {
        this.f216699a.ZIDL_AV(this.nativeHandler, iVar, aVar.f216695d, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }
}
