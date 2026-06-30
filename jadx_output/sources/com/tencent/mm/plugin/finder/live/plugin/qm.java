package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk2.c f114025d;

    public qm(xk2.c cVar) {
        this.f114025d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xk2.c cVar = this.f114025d;
        cVar.c();
        cVar.b();
    }
}
