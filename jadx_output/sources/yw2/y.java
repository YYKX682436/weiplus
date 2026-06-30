package yw2;

/* loaded from: classes2.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f466676d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f466677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderJumpAnchorView f466680h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yz5.l lVar, yw2.a0 a0Var, com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466678f = lVar;
        this.f466679g = a0Var;
        this.f466680h = finderJumpAnchorView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yw2.y yVar = new yw2.y(this.f466678f, this.f466679g, this.f466680h, continuation);
        yVar.f466677e = obj;
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466676d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f466677e;
            this.f466677e = y0Var2;
            this.f466676d = 1;
            java.lang.Object invoke = this.f466678f.invoke(this);
            if (invoke == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = invoke;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f466677e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean h17 = kotlinx.coroutines.z0.h(y0Var);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!h17) {
            com.tencent.mars.xlog.Log.w("Finder.TimelineDrawerBuilder", "showLastViewedAnchor scope canceled");
            return f0Var;
        }
        if (this.f466679g.D == null) {
            return f0Var;
        }
        this.f466680h.setBelow(booleanValue);
        return f0Var;
    }
}
