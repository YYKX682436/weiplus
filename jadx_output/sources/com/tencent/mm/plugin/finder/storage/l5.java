package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l5 f127109d = new com.tencent.mm.plugin.finder.storage.l5();

    public l5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5000, "弹幕快捷跟发 按钮无操作消失时间(MS)", null, null, 12, null);
        aVar.a("FINDER_BULLET_FAST_FOLLOW_NO_OP_DURATION", kz5.c0.i(4000, 5000, 6000), kz5.c0.i("4000", "5000", "6000"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_bullet_fast_follow_no_op_duration, false, 2, null);
        return aVar;
    }
}
