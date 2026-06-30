package df2;

/* loaded from: classes3.dex */
public final class ny extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wy f230895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.l1 f230896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f230897g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(df2.wy wyVar, com.tencent.mm.plugin.finder.live.util.l1 l1Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230895e = wyVar;
        this.f230896f = l1Var;
        this.f230897g = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ny(this.f230895e, this.f230896f, this.f230897g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ny) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView liveCritBuffAnimView;
        lj2.u0 y17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230894d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f230894d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = this.f230896f.f115601s;
        df2.wy wyVar = this.f230895e;
        zi2.w wVar = (zi2.w) wyVar.R6(zi2.w.class);
        android.widget.FrameLayout criticalGiftLayout = (wVar == null || (y17 = ((fi2.a) wVar.x1()).y(str)) == null) ? null : y17.getCriticalGiftLayout();
        if (criticalGiftLayout != null) {
            android.view.View childAt = criticalGiftLayout.getChildAt(0);
            if (childAt == null || !(childAt instanceof com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView)) {
                criticalGiftLayout.removeAllViews();
                android.content.Context context = criticalGiftLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                liveCritBuffAnimView = new com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView(context);
                criticalGiftLayout.addView(liveCritBuffAnimView, new android.view.ViewGroup.LayoutParams(-2, -2));
            } else {
                liveCritBuffAnimView = (com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView) childAt;
            }
            criticalGiftLayout.setVisibility(0);
            java.lang.String string = liveCritBuffAnimView.getContext().getString(com.tencent.mm.R.string.e49, wyVar.f231743t.format(this.f230897g));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            liveCritBuffAnimView.a(string);
        }
        return jz5.f0.f302826a;
    }
}
