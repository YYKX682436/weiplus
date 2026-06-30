package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p5 f127350d = new com.tencent.mm.plugin.finder.storage.p5();

    public p5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(30, "弹幕点赞数外显阈值", null, null, 12, null);
        aVar.a("FINDER_BULLET_LIKE_COUNT_SHOW_THRESHOLD", kz5.c0.i(1, 10, 30, 100), kz5.c0.i("1", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "100"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_video_bullet_like_count_threshold, false, 2, null);
        return aVar;
    }
}
