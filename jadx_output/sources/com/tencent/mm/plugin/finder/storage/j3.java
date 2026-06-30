package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j3 f126977d = new com.tencent.mm.plugin.finder.storage.j3();

    public j3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "Feed锚点气泡展示时间", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_anchor_tips_min_duration, false, 2, null);
        aVar.a("FinderAnchorTipsMinDuration", kz5.c0.i(5, 10), kz5.c0.i("5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        return aVar;
    }
}
