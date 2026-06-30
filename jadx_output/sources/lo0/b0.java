package lo0;

/* loaded from: classes14.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319967a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f319968b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f319969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f319970d;

    /* renamed from: e, reason: collision with root package name */
    public final double f319971e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f319972f;

    /* renamed from: g, reason: collision with root package name */
    public final lo0.b f319973g;

    /* renamed from: h, reason: collision with root package name */
    public double f319974h;

    /* renamed from: i, reason: collision with root package name */
    public final int f319975i;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (r26.i0.y(r12, r11, false) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(org.json.JSONObject r11, java.lang.String r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.b0.<init>(org.json.JSONObject, java.lang.String, java.util.Map):void");
    }

    public b0() {
        this.f319967a = ya.b.ORIGIN;
        this.f319968b = false;
        this.f319969c = "原片";
        this.f319970d = android.graphics.Color.parseColor("#61D2D2D2");
        this.f319971e = 0.0d;
        this.f319972f = "";
        this.f319973g = null;
        this.f319974h = 0.0d;
        this.f319975i = 0;
    }

    public b0(lo0.b0 b0Var, java.util.Map map) {
        this.f319967a = b0Var.f319967a;
        this.f319968b = b0Var.f319968b;
        this.f319969c = b0Var.f319969c;
        this.f319970d = b0Var.f319970d;
        double d17 = b0Var.f319971e;
        this.f319971e = d17;
        this.f319972f = b0Var.f319972f;
        lo0.b bVar = b0Var.f319973g;
        this.f319973g = bVar != null ? (lo0.b) map.get(bVar.f319960a) : null;
        this.f319974h = d17;
        this.f319975i = b0Var.f319975i;
    }
}
