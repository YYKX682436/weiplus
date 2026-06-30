package df2;

/* loaded from: classes3.dex */
public final class tz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz(df2.a00 a00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231483d = a00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.tz(this.f231483d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.tz tzVar = (df2.tz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tzVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.a00 a00Var = this.f231483d;
        com.tencent.mars.xlog.Log.i(a00Var.f229648m, "notify show, animView = " + a00Var.b7());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) a00Var.S6(com.tencent.mm.R.id.rp7);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        com.tencent.mm.view.MMPAGView b76 = a00Var.b7();
        if (b76 != null) {
            b76.setComposition(a00Var.f229651p);
            b76.d();
            b76.setRepeatCount(1);
            b76.setProgress(0.0d);
            b76.a(new df2.sz(a00Var));
            b76.g();
        }
        return jz5.f0.f302826a;
    }
}
