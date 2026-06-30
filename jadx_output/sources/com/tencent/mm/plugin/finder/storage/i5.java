package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.i5 f126928d = new com.tencent.mm.plugin.finder.storage.i5();

    public i5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(4000, "弹幕快捷跟发 按钮消失后预热退场时间(MS)", null, null, 12, null);
        aVar.a("FINDER_BULLET_FAST_FOLLOW_EXTEND_END", kz5.c0.i(3000, 4000, 5000), kz5.c0.i("3000", "4000", "5000"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_bullet_fast_follow_extend_end, false, 2, null);
        return aVar;
    }
}
