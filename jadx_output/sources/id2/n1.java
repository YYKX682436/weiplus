package id2;

/* loaded from: classes.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f290679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f290680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(jz5.l lVar, android.widget.TextView textView, id2.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290679d = lVar;
        this.f290680e = textView;
        this.f290681f = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.n1(this.f290679d, this.f290680e, this.f290681f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.n1 n1Var = (id2.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.l lVar = this.f290679d;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        id2.v1 v1Var = this.f290681f;
        if (booleanValue) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            android.widget.TextView textView = this.f290680e;
            db5.t7.i(textView.getContext(), textView.getContext().getString(com.tencent.mm.R.string.f491560dj2), com.tencent.mm.R.raw.icons_outlined_done);
            pm0.v.V(1000L, new id2.m1(v1Var));
        } else {
            db5.t7.m(v1Var.getActivity(), v1Var.getActivity().getString(com.tencent.mm.R.string.f491559dj1));
            com.tencent.mars.xlog.Log.i(v1Var.f290834d, "[finderPayFullWholeProcess] errCode:" + ((java.lang.String) lVar.f302834e));
        }
        return jz5.f0.f302826a;
    }
}
