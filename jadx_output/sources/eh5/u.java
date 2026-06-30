package eh5;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252973d;

    public u(eh5.y yVar) {
        this.f252973d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f252973d;
        yVar.f252984p = false;
        yVar.show();
    }
}
