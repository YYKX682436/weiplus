package rc3;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f393995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rc3.w0 w0Var, yz5.l lVar, java.lang.String str) {
        super(0);
        this.f393994d = w0Var;
        this.f393995e = lVar;
        this.f393996f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393994d;
        if ((w0Var.f394099t & 1) != 0) {
            com.tencent.mars.xlog.Log.w(w0Var.f394105z, "evaluate in wrong status " + w0Var.f394099t + " , discard event");
        } else {
            java.lang.String str = this.f393996f;
            yz5.l lVar = this.f393995e;
            if (lVar != null) {
                java.util.HashMap hashMap = w0Var.f394097r;
                int i17 = w0Var.f394098s + 1;
                w0Var.f394098s = i17;
                hashMap.put(java.lang.Integer.valueOf(i17), lVar);
                qc3.f fVar = w0Var.A;
                if (fVar != null) {
                    fVar.w9(str, w0Var.f394098s);
                }
            } else {
                qc3.f fVar2 = w0Var.A;
                if (fVar2 != null) {
                    fVar2.w9(str, 0);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
