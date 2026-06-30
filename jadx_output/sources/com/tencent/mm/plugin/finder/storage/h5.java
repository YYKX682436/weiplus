package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.h5 f126871d = new com.tencent.mm.plugin.finder.storage.h5();

    public h5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(2000, "弹幕快捷跟发 按钮操作后消失时间(MS)", null, null, 12, null);
        aVar.a("FINDER_BULLET_FAST_FOLLOW_DURATION", kz5.c0.i(1000, 2000, 3000), kz5.c0.i("1000", "2000", "3000"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_bullet_fast_follow_duration, false, 2, null);
        return aVar;
    }
}
