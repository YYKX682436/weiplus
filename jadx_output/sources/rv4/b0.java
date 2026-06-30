package rv4;

/* loaded from: classes12.dex */
public final class b0 implements mv4.i {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f400438a;

    /* renamed from: b, reason: collision with root package name */
    public int f400439b;

    /* renamed from: c, reason: collision with root package name */
    public int f400440c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400441d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f400442e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f400444g;

    /* renamed from: h, reason: collision with root package name */
    public int f400445h;

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(rv4.w r9, android.content.Context r10) {
        /*
            r8 = this;
            java.lang.String r0 = "session"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r10, r1)
            r8.<init>()
            r8.f400438a = r9
            r1 = 1
            r8.f400445h = r1
            jz5.g r9 = r9.f400559e
            jz5.n r9 = (jz5.n) r9
            java.lang.Object r9 = r9.getValue()
            rv4.g0 r9 = (rv4.g0) r9
            org.json.JSONObject r9 = r9.f400465a
            java.lang.String r2 = "items"
            org.json.JSONArray r2 = r9.optJSONArray(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            r8.f400443f = r4
            r4 = 0
            if (r2 == 0) goto L7e
            java.util.List r2 = pv4.a.g(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L47:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r2.next()
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            rv4.w r6 = r8.f400438a
            kotlin.jvm.internal.o.g(r6, r0)
            if (r5 != 0) goto L5b
            goto L6f
        L5b:
            java.lang.String r7 = "hotword"
            java.lang.String r7 = r5.optString(r7)
            if (r7 == 0) goto L6c
            int r7 = r7.length()
            if (r7 != 0) goto L6a
            goto L6c
        L6a:
            r7 = r4
            goto L6d
        L6c:
            r7 = r1
        L6d:
            if (r7 == 0) goto L71
        L6f:
            r5 = 0
            goto L77
        L71:
            rv4.c0 r7 = new rv4.c0
            r7.<init>(r8, r5, r6)
            r5 = r7
        L77:
            if (r5 != 0) goto L7a
            goto L47
        L7a:
            r3.add(r5)
            goto L47
        L7e:
            r8.f400442e = r3
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131768696(0x7f103578, float:1.9168646E38)
            java.lang.String r10 = r10.getString(r0)
            java.lang.String r0 = "title"
            java.lang.String r9 = r9.optString(r0, r10)
            java.lang.String r10 = "optString(...)"
            kotlin.jvm.internal.o.f(r9, r10)
            r8.f400441d = r9
            rv4.w r9 = r8.f400438a
            rv4.t r9 = r9.a()
            java.lang.String r10 = "hideVertical"
            org.json.JSONObject r9 = r9.f400554a
            r2 = 0
            long r9 = r9.optLong(r10, r2)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 != 0) goto Laf
            goto Lb0
        Laf:
            r1 = r4
        Lb0:
            r8.f400444g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.b0.<init>(rv4.w, android.content.Context):void");
    }

    @Override // mv4.d
    public int a() {
        return this.f400439b;
    }

    @Override // mv4.d
    public void b(int i17) {
    }

    public boolean c() {
        boolean z17;
        if (!this.f400444g) {
            return false;
        }
        java.util.List list = this.f400442e;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((rv4.c0) ((mv4.j) it.next())).b()) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }

    @Override // mv4.c
    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f400442e).iterator();
        while (it.hasNext()) {
            rv4.c0 c0Var = (rv4.c0) ((mv4.j) it.next());
            c0Var.getClass();
            ov4.c a17 = c0Var.a(ov4.d.f349206e);
            nv4.k kVar = c0Var.f400448b.f331675b;
            kVar.getClass();
            a17.toString();
            kVar.b(a17);
        }
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f400445h = i17;
        int i18 = 0;
        for (java.lang.Object obj : this.f400442e) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((rv4.c0) ((mv4.j) obj)).f400456j = i19;
            i18 = i19;
        }
    }

    @Override // mv4.d
    public void f(int i17) {
        this.f400440c = i17;
    }

    @Override // mv4.d
    public int getMarginTop() {
        return this.f400440c;
    }

    @Override // mv4.d
    public java.lang.String getTitle() {
        return this.f400441d;
    }
}
