package com.tencent.wechat.aff.same_net_verify;

/* loaded from: classes8.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.same_net_verify.b f217486b = new com.tencent.wechat.aff.same_net_verify.b();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.same_net_verify.ZIDL_ocx5sk2RK f217487a;

    public b() {
        com.tencent.wechat.aff.same_net_verify.ZIDL_ocx5sk2RK zIDL_ocx5sk2RK = new com.tencent.wechat.aff.same_net_verify.ZIDL_ocx5sk2RK();
        this.f217487a = zIDL_ocx5sk2RK;
        this.zidlCreateName = "same_net_verify.SameNetVerifyManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_same_net_verify", "aff_biz");
        zIDL_ocx5sk2RK.ZIDL_ocx5sk2RC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f217487a.ZIDL_A(this.nativeHandler);
    }

    public void b(java.util.ArrayList arrayList, java.lang.String str, com.tencent.wechat.aff.same_net_verify.a aVar) {
        this.f217487a.ZIDL_BV(this.nativeHandler, aVar, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList), str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
