package sp2;

/* loaded from: classes2.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.m3 f411053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(int i17, sp2.m3 m3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411052e = i17;
        this.f411053f = m3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.i3(this.f411052e, this.f411053f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411051d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f411052e;
            if (i18 > 0) {
                this.f411051d = 1;
                if (kotlinx.coroutines.k1.b(i18, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        sp2.m3 m3Var = this.f411053f;
        android.view.View decorView = m3Var.getActivity().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(m3Var.P6(), -1, -1);
        }
        m3Var.P6().post(new sp2.h3(m3Var));
        return jz5.f0.f302826a;
    }
}
