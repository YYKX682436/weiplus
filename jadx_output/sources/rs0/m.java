package rs0;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs0.n f399305d;

    public m(rs0.n nVar) {
        this.f399305d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.n nVar = this.f399305d;
        rs0.h hVar = nVar.f399308b;
        if (hVar != null) {
            rs0.g gVar = rs0.i.f399296a;
            kotlin.jvm.internal.o.d(hVar);
            gVar.u(hVar);
        }
        android.os.HandlerThread handlerThread = nVar.f399307a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }
}
