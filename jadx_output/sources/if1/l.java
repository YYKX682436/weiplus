package if1;

/* loaded from: classes7.dex */
public class l implements android.view.View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static volatile android.view.View f291079t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f291080d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f291081e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f291082f;

    /* renamed from: g, reason: collision with root package name */
    public if1.r f291083g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f291084h;

    /* renamed from: i, reason: collision with root package name */
    public final c01.l2 f291085i;

    /* renamed from: m, reason: collision with root package name */
    public final float f291086m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.MotionEvent f291087n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.MotionEvent f291088o;

    /* renamed from: p, reason: collision with root package name */
    public final if1.r f291089p;

    /* renamed from: q, reason: collision with root package name */
    public final if1.r f291090q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f291091r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f291092s;

    public l(com.tencent.mm.plugin.appbrand.jsapi.l lVar, c01.l2 l2Var) {
        iz5.a.d(null, lVar);
        iz5.a.d(null, l2Var);
        this.f291085i = l2Var;
        lVar.getComponentId();
        this.f291092s = lVar;
        this.f291086m = android.view.ViewConfiguration.get(lVar.getContext()).getScaledTouchSlop();
        this.f291089p = new if1.r();
        this.f291090q = new if1.r();
        this.f291084h = new if1.k(this, lVar);
    }

    public final void a(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.Object parent = view.getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            view.dispatchTouchEvent(motionEvent);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        motionEvent.offsetLocation(-(viewGroup.getScrollX() - view.getX()), -(viewGroup.getScrollY() - view.getY()));
        a((android.view.View) parent, motionEvent);
    }

    public if1.r[] b(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
            if1.r rVar = (if1.r) ((java.util.HashMap) this.f291080d).get(java.lang.Integer.valueOf(motionEvent.getPointerId(i17)));
            if (rVar != null) {
                rVar.f291094b = motionEvent.getX(i17);
                rVar.f291095c = motionEvent.getY(i17);
                arrayList.add(rVar);
            }
        }
        if1.r[] rVarArr = new if1.r[arrayList.size()];
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            rVarArr[i18] = (if1.r) arrayList.get(i18);
        }
        return rVarArr;
    }

    public final void c(com.tencent.mm.plugin.appbrand.jsapi.l lVar, if1.r rVar, com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, java.lang.String str) {
        if (rVar == null || n5Var == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
            jSONObject.put("touch", rVar.a());
        } catch (org.json.JSONException unused) {
        }
        lVar.d(n5Var.k(), jSONObject.toString(), null);
    }

    public final void d(android.view.View view, boolean z17, if1.r rVar) {
        this.f291091r = view;
        this.f291081e = z17;
        if (z17) {
            return;
        }
        c01.l2 l2Var = this.f291085i;
        l2Var.j("fakeDownEvent", false);
        l2Var.j("onLongClick", false);
        this.f291091r.removeCallbacks(this.f291084h);
        if1.r rVar2 = this.f291089p;
        rVar2.f291093a = -1;
        rVar2.f291094b = 0.0f;
        rVar2.f291095c = 0.0f;
        this.f291087n = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        if (r0 != 6) goto L99;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if1.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
