package com.tencent.wechat.aff.emoticon;

/* loaded from: classes16.dex */
public class e extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public e(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.aff.emoticon.ZIDL_J6WrA01dRK zIDL_J6WrA01dRK = new com.tencent.wechat.aff.emoticon.ZIDL_J6WrA01dRK();
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_emoticon", "aff_biz");
        zIDL_J6WrA01dRK.ZIDL_J6WrA01dRC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.emoticon.d dVar = new com.tencent.wechat.aff.emoticon.d(this, this.nativeHandler);
        dVar.f216639c = this.nativeHandler;
        dVar.f216637a = this.zidlIdentity;
        dVar.f216638b = this.zidlSvrIdentity;
    }
}
