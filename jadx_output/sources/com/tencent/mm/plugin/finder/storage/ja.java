package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class ja extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ja f126991d = new com.tencent.mm.plugin.finder.storage.ja();

    public ja() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        dq.b bVar = ((cq.k) c17).f221226g;
        bVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = bVar.f242285b;
        if (o4Var != null) {
            o4Var.W("KEY_FINDER_EDU_TIPS_SHOW_TIME_".concat("dislike_edu_tips"));
        }
        if (o4Var != null) {
            o4Var.W("KEY_FINDER_EDU_TIPS_FEATURE_USE_COUNT_".concat("dislike_edu_tips"));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "resetEduTipsRecord key=".concat("dislike_edu_tips"));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_FEED_BACK_TIPS_BUBBLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
