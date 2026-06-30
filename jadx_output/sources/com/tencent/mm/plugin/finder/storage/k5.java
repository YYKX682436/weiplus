package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.k5 f127048d = new com.tencent.mm.plugin.finder.storage.k5();

    public k5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(200, "弹幕快捷跟发 长按假插间隔(MS)", null, null, 12, null);
        aVar.a("FINDER_BULLET_FAST_FOLLOW_LONG_PRESS_INTERVAL", kz5.c0.i(100, 200, 300), kz5.c0.i("100", "200", "300"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_bullet_fast_follow_long_press_interval, false, 2, null);
        return aVar;
    }
}
