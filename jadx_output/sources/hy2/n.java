package hy2;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy2.o f286068d;

    public n(hy2.o oVar) {
        this.f286068d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar = this.f286068d.f286070b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
