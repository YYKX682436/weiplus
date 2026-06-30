package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class i implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.l f171157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f171159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f171160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f171161h;

    public i(com.tencent.mm.plugin.sns.ui.widget.l lVar, android.view.View view, java.lang.Object obj, kotlinx.coroutines.y0 y0Var, java.lang.Object obj2) {
        this.f171157d = lVar;
        this.f171158e = view;
        this.f171159f = obj;
        this.f171160g = y0Var;
        this.f171161h = obj2;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        com.tencent.mm.plugin.sns.ui.widget.l lVar = this.f171157d;
        java.lang.String j17 = lVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachedFlow call at=");
        sb6.append(booleanValue);
        sb6.append(" view=");
        android.view.View view = this.f171158e;
        sb6.append(view.isAttachedToWindow());
        sb6.append(" model=");
        sb6.append(lVar.l(this.f171159f));
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (booleanValue && view.isAttachedToWindow()) {
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.widget.h(view, lVar, this.f171161h, viewTreeObserver));
            kotlinx.coroutines.z0.e(this.f171160g, null, 1, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        return f0Var;
    }
}
