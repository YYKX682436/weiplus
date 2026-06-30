package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ue implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f211087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f211088e;

    public ue(com.tencent.mm.ui.he heVar, java.lang.Runnable runnable) {
        this.f211088e = heVar;
        this.f211087d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.he heVar = this.f211088e;
        heVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.pe(heVar));
        nm.j.f338443g.a(new com.tencent.mm.ui.ve(heVar));
        heVar.b();
        java.lang.Runnable runnable = this.f211087d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
