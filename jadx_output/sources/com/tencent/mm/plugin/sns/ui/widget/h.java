package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.l f171143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f171144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f171145g;

    public h(android.view.View view, com.tencent.mm.plugin.sns.ui.widget.l lVar, java.lang.Object obj, android.view.ViewTreeObserver viewTreeObserver) {
        this.f171142d = view;
        this.f171143e = lVar;
        this.f171144f = obj;
        this.f171145g = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1$1");
        boolean isAttachedToWindow = this.f171142d.isAttachedToWindow();
        com.tencent.mm.plugin.sns.ui.widget.l lVar = this.f171143e;
        java.lang.Object i17 = lVar.i();
        java.lang.String j17 = lVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preDraw call: lastModel = ");
        java.lang.Object obj = this.f171144f;
        sb6.append(lVar.l(obj));
        sb6.append(" currentModel = ");
        sb6.append(lVar.l(i17));
        sb6.append(" onPreDrawListenerList.size = ");
        sb6.append(((java.util.ArrayList) com.tencent.mm.plugin.sns.ui.widget.l.b(lVar)).size());
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        java.util.List b17 = com.tencent.mm.plugin.sns.ui.widget.l.b(lVar);
        java.util.ArrayList<com.tencent.mm.plugin.sns.ui.widget.f> arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add((com.tencent.mm.plugin.sns.ui.widget.f) it.next());
        }
        for (com.tencent.mm.plugin.sns.ui.widget.f fVar : arrayList) {
            fVar.a(isAttachedToWindow, obj, i17);
            ((java.util.ArrayList) com.tencent.mm.plugin.sns.ui.widget.l.b(lVar)).remove(fVar);
        }
        this.f171145g.removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1$1");
        return true;
    }
}
