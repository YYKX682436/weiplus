package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class g extends p13.c implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final p13.u f137407n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.ref.WeakReference f137408o;

    public g(int i17, p13.u uVar) {
        this.f137407n = uVar;
        this.f137408o = new java.lang.ref.WeakReference(uVar.f351151m);
        uVar.f351151m = null;
    }

    @Override // p13.c
    public int getPriority() {
        return 0;
    }

    @Override // p13.c
    public boolean i() {
        p13.u uVar = this.f137407n;
        p13.v vVar = new p13.v(uVar);
        vVar.f351157b = this;
        vVar.f351158c = -2;
        vVar.f351160e = new java.util.LinkedList();
        vVar.f351159d = p13.r.b(uVar.f351141c, false);
        com.tencent.mm.sdk.platformtools.n3 n3Var = uVar.f351152n;
        if (n3Var != null) {
            n3Var.post(new com.tencent.mm.plugin.fts.f(this, vVar));
            return true;
        }
        o13.x xVar = (o13.x) this.f137408o.get();
        if (xVar == null) {
            return true;
        }
        xVar.X2(vVar);
        return true;
    }

    @Override // p13.c
    public int k() {
        return -1;
    }

    @Override // p13.c
    public boolean m() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
        } catch (java.lang.Exception unused) {
        }
    }
}
