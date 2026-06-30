package tr2;

/* loaded from: classes8.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.pw0 f421406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr2.v f421407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.pw0 pw0Var, tr2.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421406d = pw0Var;
        this.f421407e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr2.p(this.f421406d, this.f421407e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        tr2.p pVar = (tr2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f421406d.getInteger(1) == 2) {
            tr2.v vVar = this.f421407e;
            vVar.f421414e = 0;
            vVar.f421413d = null;
            vVar.O6(null);
            androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).M7(vVar.getContext().getString(com.tencent.mm.R.string.ogr), sr2.z2.f411825f);
            dq.b b17 = cq.k1.b();
            b17.c(null);
            b17.b(null);
        }
        return jz5.f0.f302826a;
    }
}
