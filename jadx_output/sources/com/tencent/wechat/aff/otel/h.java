package com.tencent.wechat.aff.otel;

/* loaded from: classes15.dex */
public class h extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.otel.h f217443b = new com.tencent.wechat.aff.otel.h();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.otel.ZIDL_MpcBE4WyrK f217444a;

    public h() {
        com.tencent.wechat.aff.otel.ZIDL_MpcBE4WyrK zIDL_MpcBE4WyrK = new com.tencent.wechat.aff.otel.ZIDL_MpcBE4WyrK();
        this.f217444a = zIDL_MpcBE4WyrK;
        this.zidlCreateName = "otel.OtelTraceProvider@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_common", "aff_biz");
        zIDL_MpcBE4WyrK.ZIDL_MpcBE4WyrC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(long j17, com.tencent.wechat.aff.otel.a aVar) {
        this.f217444a.ZIDL_D(this.nativeHandler, j17, aVar.toByteArrayOrNull());
    }

    public com.tencent.wechat.aff.otel.c b() {
        return (com.tencent.wechat.aff.otel.c) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.otel.c.f217419g, this.f217444a.ZIDL_E(this.nativeHandler));
    }

    public long c(java.lang.String str) {
        return this.f217444a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public com.tencent.wechat.aff.otel.f d(long j17, com.tencent.wechat.aff.otel.a aVar) {
        return (com.tencent.wechat.aff.otel.f) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.otel.f.f217434g, this.f217444a.ZIDL_C(this.nativeHandler, j17, aVar.toByteArrayOrNull()));
    }
}
