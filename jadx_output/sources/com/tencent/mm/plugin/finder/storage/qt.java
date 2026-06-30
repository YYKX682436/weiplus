package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class qt extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qt f127447d = new com.tencent.mm.plugin.finder.storage.qt();

    public qt() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_DISPLAY_AUTO_PLAY_TIPS_TIME_LONG_SYNC, 0L);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
        if (o4Var != null) {
            o4Var.B("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L);
        }
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
