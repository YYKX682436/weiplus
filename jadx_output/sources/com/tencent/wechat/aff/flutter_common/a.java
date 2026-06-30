package com.tencent.wechat.aff.flutter_common;

/* loaded from: classes11.dex */
public class a extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.flutter_common.a f216881b = new com.tencent.wechat.aff.flutter_common.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.flutter_common.ZIDL_B1wKktOZSK f216882a;

    public a() {
        com.tencent.wechat.aff.flutter_common.ZIDL_B1wKktOZSK zIDL_B1wKktOZSK = new com.tencent.wechat.aff.flutter_common.ZIDL_B1wKktOZSK();
        this.f216882a = zIDL_B1wKktOZSK;
        this.zidlCreateName = "flutter_common.FlutterCommonManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("feat_flutter_common", "aff_biz");
        zIDL_B1wKktOZSK.ZIDL_B1wKktOZSC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public long a() {
        return this.f216882a.ZIDL_A(this.nativeHandler);
    }
}
