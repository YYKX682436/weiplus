package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes11.dex */
public class k extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.k f177277b = new com.tencent.mm.plugin.voipmp.platform.k();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voipmp.platform.ZIDL_OJonAzsFK f177278a;

    public k() {
        com.tencent.mm.plugin.voipmp.platform.ZIDL_OJonAzsFK zIDL_OJonAzsFK = new com.tencent.mm.plugin.voipmp.platform.ZIDL_OJonAzsFK();
        this.f177278a = zIDL_OJonAzsFK;
        this.zidlCreateName = "voipmp.VoIPMPIlinkSDKStatAPI@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_voipmp", "aff_biz");
        zIDL_OJonAzsFK.ZIDL_OJonAzsFC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(er4.k kVar, er4.j jVar) {
        this.f177278a.ZIDL_B(this.nativeHandler, kVar.f256113d, jVar.toByteArrayOrNull());
    }

    public void launch() {
        this.f177278a.ZIDL_A(this.nativeHandler);
    }
}
