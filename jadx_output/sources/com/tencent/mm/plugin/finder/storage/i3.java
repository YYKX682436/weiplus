package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.i3 f126924d = new com.tencent.mm.plugin.finder.storage.i3();

    public i3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "Feed锚点最小播放时间点", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_anchor_show_min_start_time, false, 2, null);
        aVar.a("FinderAnchorShowMinStartTime", kz5.c0.i(5, 10), kz5.c0.i("5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        return aVar;
    }
}
