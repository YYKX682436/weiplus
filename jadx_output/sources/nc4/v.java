package nc4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f336181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f336182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nc4.d0 d0Var, android.view.MenuItem menuItem, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336180e = d0Var;
        this.f336181f = menuItem;
        this.f336182g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        nc4.v vVar = new nc4.v(this.f336180e, this.f336181f, this.f336182g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        java.lang.Object invokeSuspend = ((nc4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336179d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nc4.d0 d0Var = this.f336180e;
            nc4.c cVar = (nc4.c) nc4.d0.P6(d0Var).get(new java.lang.Integer(this.f336181f.getItemId()));
            if (cVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
                return f0Var;
            }
            nc4.u uVar = new nc4.u(cVar, d0Var, this.f336182g);
            this.f336179d = 1;
            if (cVar.b(uVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
        return f0Var;
    }
}
