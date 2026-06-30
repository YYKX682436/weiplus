package vi1;

/* loaded from: classes7.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f437511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f437512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(android.app.ProgressDialog progressDialog, vi1.z3 z3Var) {
        super(1);
        this.f437511d = progressDialog;
        this.f437512e = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vi1.z3 z3Var = this.f437512e;
        android.app.ProgressDialog progressDialog = this.f437511d;
        ik1.h0.b(new vi1.x3((r45.x20) obj, z3Var, progressDialog));
        progressDialog.dismiss();
        return jz5.f0.f302826a;
    }
}
