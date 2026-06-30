package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f112038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ci f112039e;

    public bi(java.lang.Object obj, com.tencent.mm.plugin.finder.live.plugin.ci ciVar) {
        this.f112038d = obj;
        this.f112039e = ciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = this.f112038d;
        r45.ac4 ac4Var = obj instanceof r45.ac4 ? (r45.ac4) obj : null;
        if (ac4Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = this.f112039e.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
    }
}
