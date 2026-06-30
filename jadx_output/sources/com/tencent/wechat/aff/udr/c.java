package com.tencent.wechat.aff.udr;

/* loaded from: classes16.dex */
public class c extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public c(com.tencent.wechat.aff.udr.e eVar) {
        com.tencent.wechat.aff.udr.ZIDL_C2BeJe9_UK zIDL_C2BeJe9_UK = new com.tencent.wechat.aff.udr.ZIDL_C2BeJe9_UK();
        this.zidlCreateName = "udr.IUdrCppBizCallBack@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("aff_feat_udr", "aff_feat_udr");
        zIDL_C2BeJe9_UK.ZIDL_C2BeJe9_UC(this, this.zidlCreateName, this.zidlSvrIdentity, eVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.udr.b bVar = new com.tencent.wechat.aff.udr.b(this, this.nativeHandler);
        bVar.f217533c = this.nativeHandler;
        bVar.f217531a = this.zidlIdentity;
        bVar.f217532b = this.zidlSvrIdentity;
    }
}
