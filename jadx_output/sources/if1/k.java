package if1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f291077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if1.l f291078e;

    public k(if1.l lVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar2) {
        this.f291078e = lVar;
        this.f291077d = lVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if1.l lVar = this.f291078e;
        if (lVar.f291081e) {
            android.view.View view = lVar.f291091r;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.x0.b(view)) {
                if (if1.l.f291079t == null || !if1.l.f291079t.equals(this.f291078e.f291091r)) {
                    return;
                }
                if1.l.f291079t = null;
                return;
            }
            if1.r c17 = if1.s.c(this.f291078e.f291091r);
            if (java.lang.Math.abs(this.f291078e.f291083g.f291094b - c17.f291094b) > 1.0f || java.lang.Math.abs(this.f291078e.f291083g.f291095c - c17.f291095c) > 1.0f || ((java.util.HashMap) this.f291078e.f291080d).size() != 1) {
                return;
            }
            if1.l lVar2 = this.f291078e;
            float abs = java.lang.Math.abs(lVar2.f291089p.f291094b - lVar2.f291090q.f291094b);
            if1.l lVar3 = this.f291078e;
            if (abs <= lVar3.f291086m) {
                float abs2 = java.lang.Math.abs(lVar3.f291089p.f291095c - lVar3.f291090q.f291095c);
                if1.l lVar4 = this.f291078e;
                if (abs2 <= lVar4.f291086m) {
                    float f17 = lVar4.f291089p.f291094b;
                    float f18 = this.f291078e.f291090q.f291094b;
                    float f19 = this.f291078e.f291089p.f291095c;
                    float f27 = this.f291078e.f291090q.f291095c;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f291078e.f291085i.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""));
                        jSONObject.put("touch", this.f291078e.f291089p.a());
                    } catch (org.json.JSONException unused) {
                    }
                    if (!this.f291078e.f291085i.d("disableScroll", false)) {
                        if1.l lVar5 = this.f291078e;
                        lVar5.f291087n = android.view.MotionEvent.obtain(lVar5.f291088o);
                        this.f291078e.f291087n.setAction(0);
                        this.f291078e.f291085i.j("fakeDownEvent", true);
                        this.f291078e.f291091r.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f291078e.f291091r.setDuplicateParentStateEnabled(false);
                        if1.l lVar6 = this.f291078e;
                        lVar6.a(lVar6.f291091r, android.view.MotionEvent.obtain(lVar6.f291087n));
                    }
                    if1.l lVar7 = this.f291078e;
                    com.tencent.mm.plugin.appbrand.jsapi.l lVar8 = this.f291077d;
                    if1.m mVar = new if1.m();
                    java.lang.String jSONObject2 = jSONObject.toString();
                    lVar7.getClass();
                    lVar8.d(mVar.k(), jSONObject2, null);
                    return;
                }
            }
            float f28 = this.f291078e.f291089p.f291094b;
            float f29 = this.f291078e.f291090q.f291094b;
            float f37 = this.f291078e.f291089p.f291095c;
            float f38 = this.f291078e.f291090q.f291095c;
        }
    }
}
