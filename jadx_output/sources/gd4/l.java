package gd4;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270745d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270746e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270747f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270748g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270749h;

    public l(kotlin.coroutines.Continuation continuation) {
        super(6, continuation);
    }

    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
        gd4.l lVar = new gd4.l((kotlin.coroutines.Continuation) obj6);
        lVar.f270745d = (n74.z) obj;
        lVar.f270746e = (n74.a0) obj2;
        lVar.f270747f = (n74.a0) obj3;
        lVar.f270748g = (android.widget.FrameLayout.LayoutParams) obj4;
        lVar.f270749h = (gd4.e) obj5;
        java.lang.Object invokeSuspend = lVar.invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gd4.f fVar = new gd4.f((n74.z) this.f270745d, (n74.a0) this.f270746e, (n74.a0) this.f270747f, (android.widget.FrameLayout.LayoutParams) this.f270748g, (gd4.e) this.f270749h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
        return fVar;
    }
}
