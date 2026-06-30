package ux2;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux2.f f431849d;

    public d(ux2.f fVar) {
        this.f431849d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ux2.f fVar = this.f431849d;
        if (fVar.f431856f) {
            pm0.v.C(fVar.f431864n);
            db5.d5 d5Var = fVar.f431863m;
            if (d5Var != null) {
                d5Var.dismiss();
            } else {
                kotlin.jvm.internal.o.o("bubble");
                throw null;
            }
        }
    }
}
