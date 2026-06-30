package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class x0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public x0(com.tencent.mm.plugin.voipmp.platform.z0 z0Var) {
        com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMK zIDL_ibmKH7hbMK = new com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMK();
        this.zidlCreateName = "voipmp.VoipmpCoreUIController@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_voipmp", "aff_biz");
        zIDL_ibmKH7hbMK.ZIDL_ibmKH7hbMC(this, this.zidlCreateName, this.zidlSvrIdentity, z0Var);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.mm.plugin.voipmp.platform.w0 w0Var = new com.tencent.mm.plugin.voipmp.platform.w0(this, this.nativeHandler);
        w0Var.f177291c = this.nativeHandler;
        w0Var.f177289a = this.zidlIdentity;
        w0Var.f177290b = this.zidlSvrIdentity;
    }

    public x0(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMK zIDL_ibmKH7hbMK = new com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMK();
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_voipmp", "aff_biz");
        zIDL_ibmKH7hbMK.ZIDL_ibmKH7hbMC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }
}
