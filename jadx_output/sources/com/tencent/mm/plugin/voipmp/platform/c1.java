package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class c1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.c1 f177232b = new com.tencent.mm.plugin.voipmp.platform.c1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voipmp.platform.ZIDL_XwAjBIoHK f177233a;

    public c1() {
        com.tencent.mm.plugin.voipmp.platform.ZIDL_XwAjBIoHK zIDL_XwAjBIoHK = new com.tencent.mm.plugin.voipmp.platform.ZIDL_XwAjBIoHK();
        this.f177233a = zIDL_XwAjBIoHK;
        this.zidlCreateName = "voipmp.VoipmpFlutterUIService@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_voipmp", "aff_biz");
        zIDL_XwAjBIoHK.ZIDL_XwAjBIoHC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.mm.plugin.voipmp.platform.q qVar, com.tencent.mm.plugin.voipmp.platform.b1 b1Var) {
        this.f177233a.ZIDL_AV(this.nativeHandler, b1Var, qVar.f177283d);
    }
}
