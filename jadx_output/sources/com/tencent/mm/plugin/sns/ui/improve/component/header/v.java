package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f168883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168883d = h0Var;
        this.f168884e = improveHeaderUIC;
        this.f168885f = i17;
        this.f168886g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.v vVar = new com.tencent.mm.plugin.sns.ui.improve.component.header.v(this.f168883d, this.f168884e, this.f168885f, this.f168886g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.v vVar = (com.tencent.mm.plugin.sns.ui.improve.component.header.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        aa4.a aVar2 = aa4.a.f2635a;
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168884e;
        android.app.Activity context = improveHeaderUIC.getContext();
        int foldHeight = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getCoverLayout(improveHeaderUIC).getFoldHeight();
        int i17 = this.f168885f;
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview a17 = aVar2.a(context, i17, this.f168886g, foldHeight);
        kotlin.jvm.internal.h0 h0Var = this.f168883d;
        h0Var.f310123d = a17;
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview access$getBackPreview$p = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getBackPreview$p(improveHeaderUIC);
        if (access$getBackPreview$p != null) {
            access$getBackPreview$p.onPause();
        }
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview access$getBackPreview$p2 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getBackPreview$p(improveHeaderUIC);
        if (access$getBackPreview$p2 != null) {
            access$getBackPreview$p2.onDestroy();
        }
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getCoverLayout(improveHeaderUIC).removeAllViews();
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout access$getCoverLayout = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getCoverLayout(improveHeaderUIC);
        access$getCoverLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "reset: ");
        access$getCoverLayout.f169067e = 1;
        access$getCoverLayout.setHeight(access$getCoverLayout.f169066d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getSnsCoverStatus$p(improveHeaderUIC).f434167a = true;
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getCoverLayout(improveHeaderUIC).addView((android.view.View) h0Var.f310123d);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$setupPreviewMask(improveHeaderUIC, (com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview) h0Var.f310123d);
        if (i17 == 0 && (absSnsBackPreview = (com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview) h0Var.f310123d) != null) {
            absSnsBackPreview.setOnClickListener(new com.tencent.mm.plugin.sns.ui.improve.component.header.u(improveHeaderUIC));
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
        return f0Var;
    }
}
