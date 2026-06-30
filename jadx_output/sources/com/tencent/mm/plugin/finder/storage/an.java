package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class an extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.an f126477d = new com.tencent.mm.plugin.finder.storage.an();

    public an() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "发送弹幕时点提前(MS)", null, null, 12, null);
        aVar.a("FINDER_POST_BULLET_AHEAD", kz5.c0.i(0, 1000, 2000, 3000), kz5.c0.i("0", "1000", "2000", "3000"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_post_bullet_ahead, false, 2, null);
        return aVar;
    }
}
