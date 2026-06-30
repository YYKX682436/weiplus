package com.tencent.wechat.aff.game;

/* loaded from: classes8.dex */
public class f extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.game.f f216925b = new com.tencent.wechat.aff.game.f();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.game.ZIDL_Ic7lghK2K f216926a;

    public f() {
        com.tencent.wechat.aff.game.ZIDL_Ic7lghK2K zIDL_Ic7lghK2K = new com.tencent.wechat.aff.game.ZIDL_Ic7lghK2K();
        this.f216926a = zIDL_Ic7lghK2K;
        this.zidlCreateName = "game.GameSyncManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_game", "aff_biz");
        zIDL_Ic7lghK2K.ZIDL_Ic7lghK2C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(int i17, java.lang.String str, int i18, com.tencent.wechat.aff.game.c cVar) {
        this.f216926a.ZIDL_A(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i18, cVar.toByteArrayOrNull());
    }
}
