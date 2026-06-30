package df;

/* loaded from: classes7.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(df.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229544d = w1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df.r1(this.f229544d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df.r1 r1Var = (df.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df.w1 w1Var = this.f229544d;
        w1Var.getClass();
        w1Var.y(new df.h1(w1Var));
        df.a0 a0Var = this.f229544d.f229585i;
        if (a0Var != null) {
            a0Var.g();
        }
        android.view.ViewGroup viewGroup = this.f229544d.f229583g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        df.w1 w1Var2 = this.f229544d;
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.skyline.SkylineRuntime skylineRuntime = w1Var2.f229582f;
            if (skylineRuntime != null) {
                skylineRuntime.destroyWindow(w1Var2.f229580d);
            }
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new df.q1(w1Var2));
        }
        return jz5.f0.f302826a;
    }
}
