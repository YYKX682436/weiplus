package rp0;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp0.e f398336d;

    public a(rp0.e eVar) {
        this.f398336d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rp0.e eVar = this.f398336d;
        jc3.j0 j0Var = ((mc3.f) eVar.f398341a).f325635q;
        if (j0Var != null) {
            ((rc3.w0) j0Var).pause();
        }
        eVar.f398347g = null;
    }
}
