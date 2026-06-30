package ms4;

/* loaded from: classes8.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js4.o f331014d;

    public e0(js4.o oVar) {
        this.f331014d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        js4.o oVar = this.f331014d;
        if (oVar != null) {
            oVar.onSuccess(java.lang.Boolean.TRUE);
        }
    }
}
