package w84;

/* loaded from: classes4.dex */
public abstract class a extends v84.c {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer f444030f;

    public a(android.content.Context context, com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer, v84.b bVar) {
        super(context, bVar);
        this.f444030f = gLViewContainer;
        b();
    }

    @Override // v84.c
    public void a(android.graphics.Rect rect) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
        t84.c cVar = new t84.c(this.f434094d);
        int abs = java.lang.Math.abs(rect.right - rect.left);
        int abs2 = java.lang.Math.abs(rect.top - rect.bottom);
        t84.b bVar = new t84.b(abs, abs2);
        ((android.widget.FrameLayout.LayoutParams) bVar).leftMargin = rect.left;
        ((android.widget.FrameLayout.LayoutParams) bVar).topMargin = rect.top;
        cVar.k(bVar);
        cVar.f(this.f434091a.f434084a);
        cVar.j(0.0f);
        this.f444030f.d(cVar);
        f(cVar, (abs / 2) + rect.left, rect.top + (abs2 / 2), abs, abs2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
    }

    @Override // v84.c
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            this.f434095e.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        }
        com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer gLViewContainer = this.f444030f;
        gLViewContainer.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        gLViewContainer.queueEvent(new t84.e(gLViewContainer));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.BaseGLAnimScene");
    }

    public abstract void f(t84.c cVar, int i17, int i18, int i19, int i27);
}
