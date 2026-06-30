package lo0;

/* loaded from: classes14.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f320035a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f320036b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f320037c;

    /* renamed from: d, reason: collision with root package name */
    public final int f320038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f320039e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f320040f;

    /* renamed from: g, reason: collision with root package name */
    public final lo0.b f320041g;

    /* renamed from: h, reason: collision with root package name */
    public final lo0.f f320042h;

    /* renamed from: i, reason: collision with root package name */
    public final int f320043i;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r26.i0.y(r2, r13, false) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(org.json.JSONObject r18, java.lang.String r19, java.util.Map r20, lo0.r0 r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.k0.<init>(org.json.JSONObject, java.lang.String, java.util.Map, lo0.r0):void");
    }

    public k0() {
        this.f320035a = "original";
        this.f320036b = false;
        this.f320037c = "原片";
        this.f320038d = android.graphics.Color.parseColor("#61D2D2D2");
        this.f320039e = "";
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f320040f = p0Var;
        this.f320041g = null;
        this.f320042h = new lo0.f("makeup-details-original", p0Var);
        this.f320043i = 0;
    }

    public k0(lo0.k0 k0Var, java.util.Map badges) {
        this.f320035a = k0Var.f320035a;
        this.f320036b = k0Var.f320036b;
        this.f320037c = k0Var.f320037c;
        this.f320038d = k0Var.f320038d;
        this.f320039e = k0Var.f320039e;
        java.util.List<lo0.h0> list = k0Var.f320040f;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.h0 h0Var : list) {
            h0Var.getClass();
            kotlin.jvm.internal.o.g(badges, "badges");
            arrayList.add(new lo0.h0(h0Var, badges));
        }
        this.f320040f = arrayList;
        lo0.b bVar = k0Var.f320041g;
        this.f320041g = bVar != null ? (lo0.b) badges.get(bVar.f319960a) : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lo0.b bVar2 = ((lo0.h0) it.next()).f320005i;
            if (bVar2 != null) {
                arrayList2.add(bVar2);
            }
        }
        this.f320042h = new lo0.f(k0Var.f320042h.f319985a, arrayList2);
        this.f320043i = k0Var.f320043i;
    }
}
