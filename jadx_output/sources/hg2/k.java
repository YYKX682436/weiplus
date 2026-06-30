package hg2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281365e;

    /* renamed from: f, reason: collision with root package name */
    public int f281366f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hg2.l f281368h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hg2.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281368h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hg2.k kVar = new hg2.k(this.f281368h, continuation);
        kVar.f281367g = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        hg2.l lVar;
        kotlinx.coroutines.y0 y0Var;
        android.view.ViewGroup viewGroup;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281366f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f281367g;
            lVar = this.f281368h;
            android.view.ViewGroup viewGroup2 = lVar.f281369m;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                this.f281367g = y0Var2;
                this.f281364d = lVar;
                this.f281365e = viewGroup2;
                this.f281366f = 1;
                if (hg2.l.Z6(lVar, 3, this) == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                viewGroup = viewGroup2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        viewGroup = (android.view.ViewGroup) this.f281365e;
        lVar = (hg2.l) this.f281364d;
        y0Var = (kotlinx.coroutines.y0) this.f281367g;
        kotlin.ResultKt.throwOnFailure(obj);
        viewGroup.setVisibility(8);
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = lVar.f291099e;
        hg2.s.a(context, ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null, y0Var, null);
        return jz5.f0.f302826a;
    }
}
