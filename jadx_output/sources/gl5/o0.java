package gl5;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gl5.d1 d1Var) {
        super(0);
        this.f273055d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gl5.d1 d1Var = this.f273055d;
        android.view.View findViewById = d1Var.e().findViewById(com.tencent.mm.R.id.f483488b04);
        findViewById.setOnClickListener(new gl5.n0(d1Var));
        return findViewById;
    }
}
