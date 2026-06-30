package com.tencent.wechat.zrpc;

/* loaded from: classes15.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public b(com.tencent.wechat.zrpc.d dVar) {
        com.tencent.wechat.zrpc.ZIDL_c9_jRtgnK zIDL_c9_jRtgnK = new com.tencent.wechat.zrpc.ZIDL_c9_jRtgnK();
        com.tencent.wechat.zrpc.ZIDL_c9_jRtgnKE zIDL_c9_jRtgnKE = new com.tencent.wechat.zrpc.ZIDL_c9_jRtgnKE();
        this.zidlCreateName = "zrpc.ExtChannel@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_lib_zrpc_ext_channel", "aff_biz");
        zIDL_c9_jRtgnK.ZIDL_c9_jRtgnC(this, zIDL_c9_jRtgnKE, this.zidlCreateName, this.zidlSvrIdentity, dVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.zrpc.a aVar = new com.tencent.wechat.zrpc.a(this, this.nativeHandler);
        aVar.f220038c = this.nativeHandler;
        aVar.f220036a = this.zidlIdentity;
        aVar.f220037b = this.zidlSvrIdentity;
    }
}
