package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes15.dex */
public class p extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ilink_stream.p f217294b = new com.tencent.wechat.aff.ilink_stream.p();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFWdJ6K f217295a;

    public p() {
        com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFWdJ6K zIDL_NyGFWdJ6K = new com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFWdJ6K();
        this.f217295a = zIDL_NyGFWdJ6K;
        this.zidlCreateName = "ilink_stream.IlinkStreamContext@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink_stream", "ilink_stream");
        zIDL_NyGFWdJ6K.ZIDL_NyGFWdJ6C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.ilink_stream.d dVar) {
        this.f217295a.ZIDL_B(this.nativeHandler, dVar.toByteArrayOrNull());
    }

    public void b(com.tencent.wechat.aff.ilink_stream.t tVar) {
        this.f217295a.ZIDL_C(this.nativeHandler, tVar.toByteArrayOrNull());
    }

    public void c(com.tencent.wechat.aff.ilink_stream.w wVar) {
        this.f217295a.ZIDL_D(this.nativeHandler, wVar.f217330d);
    }

    public com.tencent.wechat.aff.ilink_stream.o d(com.tencent.wechat.aff.ilink_stream.b bVar) {
        return (com.tencent.wechat.aff.ilink_stream.o) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f217295a.ZIDL_A(this.nativeHandler, bVar.toByteArrayOrNull()), new com.tencent.wechat.aff.ilink_stream.p$$a());
    }

    public void foregroundChanged(boolean z17) {
        this.f217295a.ZIDL_E(this.nativeHandler, z17);
    }
}
