package df2;

/* loaded from: classes.dex */
public final class tq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(df2.ar arVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231466d = arVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.tq(this.f231466d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.tq tqVar = (df2.tq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f231466d.S6(com.tencent.mm.R.id.tiq);
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            db5.t7.makeText(context, com.tencent.mm.R.string.f491554nq1, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
