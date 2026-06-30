package oj0;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj0.h f345735d;

    public g(oj0.h hVar) {
        this.f345735d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.g gVar = rs0.i.f399296a;
        oj0.h hVar = this.f345735d;
        rs0.h hVar2 = hVar.f345741f;
        if (hVar2 == null) {
            kotlin.jvm.internal.o.o("mEGLEnvironment");
            throw null;
        }
        gVar.u(hVar2);
        hVar.f345737b.quit();
        android.os.HandlerThread handlerThread = hVar.f345739d;
        if (handlerThread == null) {
            kotlin.jvm.internal.o.o("callbackThread");
            throw null;
        }
        handlerThread.quit();
        rh0.d0 d0Var = hVar.f345745j;
        if (d0Var != null) {
            ((p05.l4) d0Var).o();
        }
        hVar.f345745j = null;
    }
}
