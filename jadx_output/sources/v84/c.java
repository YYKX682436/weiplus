package v84;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final v84.b f434091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f434092b;

    /* renamed from: c, reason: collision with root package name */
    public final int f434093c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f434094d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f434095e = new java.util.ArrayList();

    public c(android.content.Context context, v84.b bVar) {
        this.f434094d = context;
        this.f434091a = bVar;
        if (this.f434092b == 0) {
            this.f434092b = i65.a.b(context, 180);
        }
        if (this.f434093c == 0) {
            this.f434093c = i65.a.b(context, 220);
        }
    }

    public abstract void a(android.graphics.Rect rect);

    public synchronized void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSprites", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        try {
            c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpriteNum", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            int i17 = this.f434091a.f434090g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpriteNum", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            for (int i18 = 0; i18 < i17; i18++) {
                this.f434095e.add(d());
            }
            java.util.Iterator it = this.f434095e.iterator();
            while (it.hasNext()) {
                a((android.graphics.Rect) it.next());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("longTouchAd.BaseScene", "buildSprites exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSprites", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
    }

    public abstract void c();

    public abstract android.graphics.Rect d();

    public android.graphics.Rect e(android.graphics.Rect rect, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRect", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        int i27 = i19 / 2;
        rect.left = i17 - i27;
        rect.right = i17 + i27;
        rect.top = i18 - i27;
        rect.bottom = i18 + i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRect", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        return rect;
    }
}
