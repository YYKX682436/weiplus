package oj0;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj0.h f345730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f345731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f345733g;

    public d(oj0.h hVar, yz5.l lVar, java.lang.String str, float f17) {
        this.f345730d = hVar;
        this.f345731e = lVar;
        this.f345732f = str;
        this.f345733g = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj0.h hVar = this.f345730d;
        java.util.List list = hVar.f345748m;
        yz5.l lVar = this.f345731e;
        synchronized (list) {
            ((java.util.ArrayList) hVar.f345748m).add(lVar);
        }
        rs0.g gVar = rs0.i.f399296a;
        gVar.g();
        oj0.h hVar2 = this.f345730d;
        rh0.d0 d0Var = hVar2.f345745j;
        if (d0Var != null) {
            ((p05.l4) d0Var).g(this.f345732f, this.f345733g);
            rh0.d0.c(d0Var, hVar2.f345743h, hVar2.f345744i, 0L, 0, false, false, false, 124, null);
        }
        oj0.h hVar3 = this.f345730d;
        synchronized (hVar3.f345748m) {
            if (((java.util.ArrayList) hVar3.f345748m).size() > 0) {
                ((yz5.l) ((java.util.ArrayList) hVar3.f345748m).remove(0)).invoke(gVar.v(hVar3.f345744i, hVar3.f345746k, hVar3.f345747l));
            }
        }
        rs0.h hVar4 = this.f345730d.f345741f;
        if (hVar4 == null) {
            kotlin.jvm.internal.o.o("mEGLEnvironment");
            throw null;
        }
        android.opengl.EGLDisplay eGLDisplay = hVar4.f399292a;
        if (hVar4 != null) {
            gVar.x(eGLDisplay, hVar4.f399293b);
        } else {
            kotlin.jvm.internal.o.o("mEGLEnvironment");
            throw null;
        }
    }
}
