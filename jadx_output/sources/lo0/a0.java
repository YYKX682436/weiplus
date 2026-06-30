package lo0;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319950a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f319951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f319952c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f319953d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f319954e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f319955f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f319956g;

    /* renamed from: h, reason: collision with root package name */
    public final lo0.b f319957h;

    /* renamed from: i, reason: collision with root package name */
    public final lo0.f f319958i;

    /* renamed from: j, reason: collision with root package name */
    public final int f319959j;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r26.i0.y(r14, r8, false) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(org.json.JSONObject r13, java.lang.String r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.a0.<init>(org.json.JSONObject, java.lang.String, java.util.Map):void");
    }

    public a0() {
        this.f319950a = "off";
        this.f319951b = "停用";
        this.f319952c = android.graphics.Color.parseColor("#61D2D2D2");
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f319953d = p0Var;
        this.f319954e = p0Var;
        this.f319955f = p0Var;
        this.f319959j = 0;
        this.f319956g = false;
        this.f319957h = null;
        this.f319958i = new lo0.f("beauty-suite-off", p0Var);
    }

    public a0(lo0.a0 suiteToClone, java.util.Map badges) {
        kotlin.jvm.internal.o.g(suiteToClone, "suiteToClone");
        kotlin.jvm.internal.o.g(badges, "badges");
        this.f319950a = suiteToClone.f319950a;
        this.f319951b = suiteToClone.f319951b;
        this.f319952c = suiteToClone.f319952c;
        java.util.List<lo0.m> list = suiteToClone.f319953d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.m mVar : list) {
            mVar.getClass();
            arrayList.add(new lo0.m(mVar, badges));
        }
        this.f319953d = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList2, ((lo0.m) it.next()).f320047c);
        }
        this.f319954e = arrayList2;
        java.util.Map d17 = d75.b.d(arrayList2, lo0.y.f320092d);
        java.util.List<lo0.j> list2 = suiteToClone.f319955f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        for (lo0.j jVar : list2) {
            jVar.getClass();
            arrayList3.add(new lo0.j(jVar, d17));
        }
        this.f319955f = arrayList3;
        this.f319959j = suiteToClone.f319959j;
        this.f319956g = suiteToClone.f319956g;
        lo0.b bVar = suiteToClone.f319957h;
        this.f319957h = bVar != null ? (lo0.b) badges.get(bVar.f319960a) : null;
        java.util.List list3 = this.f319954e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = list3.iterator();
        while (it6.hasNext()) {
            lo0.b bVar2 = ((lo0.k) it6.next()).f320031n;
            if (bVar2 != null) {
                arrayList4.add(bVar2);
            }
        }
        this.f319958i = new lo0.f(suiteToClone.f319958i.f319985a, arrayList4);
    }
}
