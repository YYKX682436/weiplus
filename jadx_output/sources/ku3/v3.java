package ku3;

/* loaded from: classes3.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f312436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f312437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(ku3.y3 y3Var, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312436d = y3Var;
        this.f312437e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.v3(this.f312436d, this.f312437e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.v3 v3Var = (ku3.v3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.y3 y3Var = this.f312436d;
        android.widget.TextView g17 = y3Var.g();
        kotlin.jvm.internal.f0 f0Var = this.f312437e;
        g17.setText(java.lang.String.valueOf(f0Var.f310116d));
        if (f0Var.f310116d == 0) {
            ju3.d0.k(y3Var.f312471f, ju3.c0.Q2, null, 2, null);
            y3Var.g().setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
