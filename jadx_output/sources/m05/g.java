package m05;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.ui.wc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f322562a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f322563b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f322564c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f322565d;

    public g(java.lang.String viewId, android.view.View targetView) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        this.f322562a = viewId;
        this.f322563b = targetView;
        this.f322564c = new java.util.ArrayList(4);
        this.f322565d = new android.graphics.Rect();
    }

    @Override // com.tencent.mm.ui.wc
    public void a(android.view.MotionEvent motionEvent) {
        java.lang.String str;
        java.lang.String str2;
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getAction() == 1) {
            android.view.View view = this.f322563b;
            android.graphics.Rect rect = this.f322565d;
            view.getGlobalVisibleRect(rect);
            if (view.isShown() && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                java.util.ArrayList arrayList = this.f322564c;
                arrayList.add(java.lang.Long.valueOf(motionEvent.getEventTime()));
                while (arrayList.size() > 3) {
                    arrayList.remove(0);
                }
                if (arrayList.size() == 3) {
                    long longValue = ((java.lang.Number) arrayList.get(2)).longValue();
                    java.lang.Object obj = arrayList.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    long longValue2 = longValue - ((java.lang.Number) obj).longValue();
                    if (longValue2 <= 1000) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "hit max threshold: " + longValue2 + ", " + arrayList);
                        if (!view.isEnabled()) {
                            str = "1";
                            str2 = "view is not enabled";
                        } else if (!view.isClickable()) {
                            str = "2";
                            str2 = "view is not clickable";
                        } else if (view.hasOnClickListeners()) {
                            str = "9999";
                            str2 = "common reason";
                        } else {
                            str = "3";
                            str2 = "view has not click listener";
                        }
                        java.lang.String str3 = str;
                        java.lang.String str4 = str2;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("btn no response: ");
                        java.lang.String viewId = this.f322562a;
                        sb6.append(viewId);
                        sb6.append(", ");
                        sb6.append(str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayReport|WcPayBtnDisabledReport", sb6.toString());
                        kotlin.jvm.internal.o.g(viewId, "viewId");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "3", viewId, str3, str4, "", java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) <= 1.0f ? 0 : 1));
                        arrayList.clear();
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.wc
    public java.lang.String key() {
        return this.f322562a;
    }
}
