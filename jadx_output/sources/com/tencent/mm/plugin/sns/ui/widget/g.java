package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class g implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.l f171131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f171132e;

    public g(com.tencent.mm.plugin.sns.ui.widget.l lVar, java.lang.Object obj) {
        this.f171131d = lVar;
        this.f171132e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.sns.ui.widget.l lVar = this.f171131d;
        java.lang.Object i17 = lVar.i();
        com.tencent.mars.xlog.Log.i(lVar.j(), "onViewAttachedToWindow: model = " + lVar.l(i17) + " v = " + v17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAttachedFlow$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        kotlinx.coroutines.flow.j2 j2Var = lVar.f171197n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAttachedFlow$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.sns.ui.widget.l lVar = this.f171131d;
        java.lang.Object i17 = lVar.i();
        com.tencent.mars.xlog.Log.i(lVar.j(), "onViewDetachedFromWindow: model = " + lVar.l(i17) + " v = " + v17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAttachedFlow$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        kotlinx.coroutines.flow.j2 j2Var = lVar.f171197n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAttachedFlow$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setHasBindAfterDetach$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        lVar.f171192i = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setHasBindAfterDetach$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAttachStateChangeListenerHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        lVar.f171195l = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAttachStateChangeListenerHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        android.view.View m17 = lVar.m();
        if (m17 != null) {
            m17.removeOnAttachStateChangeListener(this);
        }
        if (i17 == null) {
            i17 = this.f171132e;
        }
        lVar.p(i17);
        kotlinx.coroutines.y0 h17 = lVar.h();
        if (h17 != null) {
            kotlinx.coroutines.z0.c(h17, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        lVar.f171189f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
    }
}
