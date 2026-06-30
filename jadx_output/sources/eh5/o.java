package eh5;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252968d;

    public o(eh5.y yVar) {
        this.f252968d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f252968d;
        yVar.f252984p = false;
        super/*android.app.Dialog*/.dismiss();
    }
}
