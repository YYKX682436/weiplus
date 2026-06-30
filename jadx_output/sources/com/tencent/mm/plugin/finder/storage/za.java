package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class za extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.za f128442d = new com.tencent.mm.plugin.finder.storage.za();

    public za() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        if (activity != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("次数: ");
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
            sb6.append(o4Var != null ? o4Var.q("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L) : 0L);
            db5.t7.makeText(activity, sb6.toString(), 1).show();
        }
        return jz5.f0.f302826a;
    }
}
