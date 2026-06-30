package jj5;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f300042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj5.f f300043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity, jj5.f fVar) {
        super(0);
        this.f300042d = appCompatActivity;
        this.f300043e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.n0 n0Var;
        jj5.d dVar = new jj5.d(this.f300042d);
        jj5.f fVar = this.f300043e;
        j75.f Q6 = fVar.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
            kotlin.jvm.internal.o.g(n0Var.f446320p, "<set-?>");
            java.util.ArrayList<java.lang.String> stringArrayListExtra = fVar.getIntent().getStringArrayListExtra("selectedUserNames");
            kotlin.jvm.internal.o.e(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            dVar.f300041f = stringArrayListExtra;
            rk0.c.c("MicroMsg.SelectedDataSourceUIC", stringArrayListExtra.toString(), new java.lang.Object[0]);
        }
        return dVar;
    }
}
