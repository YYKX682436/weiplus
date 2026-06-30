package tj3;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f419759d;

    public l(tj3.p pVar) {
        this.f419759d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tj3.p pVar = this.f419759d;
        if (pVar.f419791j) {
            return;
        }
        pVar.d().setVisibility(4);
    }
}
