package rc3;

/* loaded from: classes7.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(rc3.w0 w0Var) {
        super(0);
        this.f393997d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393997d;
        if (!bf3.h0.a(w0Var.f394099t, 4)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause, has service?");
            sb6.append(w0Var.A != null);
            com.tencent.mm.sdk.platformtools.Log.c(w0Var.f394105z, sb6.toString(), new java.lang.Object[0]);
            w0Var.f394099t = 8;
            java.util.Iterator it = w0Var.f394092m.iterator();
            while (it.hasNext()) {
                ((jc3.u) it.next()).onPause();
            }
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.z3();
            }
        }
        return jz5.f0.f302826a;
    }
}
