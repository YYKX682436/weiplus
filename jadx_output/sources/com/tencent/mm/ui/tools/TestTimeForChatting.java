package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class TestTimeForChatting extends com.tencent.mm.ui.widget.DrawnCallBackLinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f210261d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.od f210262e;

    /* renamed from: f, reason: collision with root package name */
    public int f210263f;

    /* renamed from: g, reason: collision with root package name */
    public int f210264g;

    public TestTimeForChatting(android.content.Context context) {
        super(context);
        this.f210261d = 0;
        this.f210263f = 0;
        this.f210264g = 0;
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TestTimeForChatting", "klem frameCount:%d", java.lang.Integer.valueOf(this.f210261d));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11198, java.lang.Integer.valueOf(this.f210261d));
    }

    @Override // com.tencent.mm.ui.widget.DrawnCallBackLinearLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        this.f210261d++;
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TestTimeForChatting", th6, "dispatchDraw", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.report.service.f0.b(9);
        com.tencent.mm.plugin.report.service.f0.b(18);
        com.tencent.mm.plugin.report.service.f0.b(25);
        com.tencent.mm.plugin.report.service.f0.b(24);
        com.tencent.mm.plugin.report.service.f0.b(20);
        com.tencent.mm.plugin.report.service.f0.b(18);
        if (this.f210262e != null) {
            post(new com.tencent.mm.ui.tools.md(this));
        }
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TestTimeForChatting", "start chatting response time: %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 0));
        this.f210261d = 0;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        rect.toString();
        rect.bottom += this.f210263f;
        rect.right += this.f210264g;
        return super.fitSystemWindows(rect);
    }

    public void setOndispatchDraw(com.tencent.mm.ui.tools.od odVar) {
        this.f210262e = odVar;
    }

    public TestTimeForChatting(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210261d = 0;
        this.f210263f = 0;
        this.f210264g = 0;
    }
}
