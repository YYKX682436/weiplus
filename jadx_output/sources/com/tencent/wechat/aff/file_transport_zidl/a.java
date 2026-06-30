package com.tencent.wechat.aff.file_transport_zidl;

/* loaded from: classes15.dex */
public class a extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.file_transport_zidl.a f216879b = new com.tencent.wechat.aff.file_transport_zidl.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.file_transport_zidl.ZIDL_ymzsQjd0K f216880a;

    public a() {
        com.tencent.wechat.aff.file_transport_zidl.ZIDL_ymzsQjd0K zIDL_ymzsQjd0K = new com.tencent.wechat.aff.file_transport_zidl.ZIDL_ymzsQjd0K();
        this.f216880a = zIDL_ymzsQjd0K;
        this.zidlCreateName = "file_transport.CgiUploadInitiator@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_file_transport", "aff_biz");
        zIDL_ymzsQjd0K.ZIDL_ymzsQjd0C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f216880a.ZIDL_A(this.nativeHandler);
    }
}
