package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes15.dex */
public final class l3 implements com.tencent.mm.plugin.mv.ui.view.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.m3 f151891a;

    /* renamed from: b, reason: collision with root package name */
    public final float f151892b;

    /* renamed from: c, reason: collision with root package name */
    public final long f151893c;

    /* renamed from: d, reason: collision with root package name */
    public int f151894d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f151895e;

    public l3(com.tencent.mm.plugin.mv.ui.view.m3 viewProvider) {
        kotlin.jvm.internal.o.g(viewProvider, "viewProvider");
        this.f151891a = viewProvider;
        this.f151892b = 200.0f;
        this.f151893c = 5000L;
        this.f151895e = new com.tencent.mm.plugin.mv.ui.view.k3(this);
    }

    public void a() {
        this.f151894d = 0;
        com.tencent.mm.plugin.mv.ui.view.m3 m3Var = this.f151891a;
        ((com.tencent.mm.plugin.mv.ui.view.n3) m3Var).f151910a.removeCallbacks(this.f151895e);
        ((com.tencent.mm.plugin.mv.ui.view.n3) m3Var).f151910a.f151706i.forceFinished(true);
        ((com.tencent.mm.plugin.mv.ui.view.n3) m3Var).f151910a.scrollTo(0, 0);
    }
}
