package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class v extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public v(com.tencent.mm.plugin.voipmp.platform.x xVar) {
        com.tencent.mm.plugin.voipmp.platform.ZIDL_DVO6HrxwK zIDL_DVO6HrxwK = new com.tencent.mm.plugin.voipmp.platform.ZIDL_DVO6HrxwK();
        this.zidlCreateName = "voipmp.VoipmpCoreNativeController@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_voipmp", "aff_biz");
        zIDL_DVO6HrxwK.ZIDL_DVO6HrxwC(this, this.zidlCreateName, this.zidlSvrIdentity, xVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.mm.plugin.voipmp.platform.u uVar = new com.tencent.mm.plugin.voipmp.platform.u(this, this.nativeHandler);
        uVar.f177286c = this.nativeHandler;
        uVar.f177284a = this.zidlIdentity;
        uVar.f177285b = this.zidlSvrIdentity;
    }
}
