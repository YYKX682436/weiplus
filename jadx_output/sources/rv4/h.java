package rv4;

/* loaded from: classes12.dex */
public final class h implements mv4.e {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f400472a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f400473b;

    /* renamed from: c, reason: collision with root package name */
    public final rv4.i f400474c;

    /* renamed from: d, reason: collision with root package name */
    public int f400475d;

    /* renamed from: e, reason: collision with root package name */
    public int f400476e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400477f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f400478g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400479h;

    /* renamed from: i, reason: collision with root package name */
    public final int f400480i;

    /* renamed from: j, reason: collision with root package name */
    public final int f400481j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f400482k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f400483l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f400484m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f400485n;

    /* renamed from: o, reason: collision with root package name */
    public int f400486o;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f400487p;

    /* renamed from: q, reason: collision with root package name */
    public org.json.JSONArray f400488q;

    /* JADX WARN: Removed duplicated region for block: B:126:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(rv4.w r27, android.content.Context r28, rv4.i r29) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.h.<init>(rv4.w, android.content.Context, rv4.i):void");
    }

    @Override // mv4.d
    public int a() {
        return this.f400475d;
    }

    @Override // mv4.d
    public void b(int i17) {
    }

    @Override // mv4.c
    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f400478g).iterator();
        while (it.hasNext()) {
            rv4.k kVar = (rv4.k) it.next();
            nv4.k kVar2 = kVar.f400503a.f331675b;
            ov4.c a17 = kVar.a(ov4.d.f349206e);
            kVar2.getClass();
            a17.toString();
            kVar2.b(a17);
        }
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f400486o = i17;
        int i18 = 0;
        for (java.lang.Object obj : this.f400478g) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((rv4.k) obj).f400519q = i19;
            i18 = i19;
        }
    }

    @Override // mv4.d
    public void f(int i17) {
        this.f400476e = i17;
    }

    public void g(boolean z17) {
        rv4.w wVar = this.f400472a;
        if (z17) {
            java.util.List list = this.f400478g;
            ((java.util.ArrayList) list).clear();
            this.f400488q = new org.json.JSONArray();
            this.f400487p = new org.json.JSONObject();
            this.f400482k = ((java.util.ArrayList) list).isEmpty();
            k();
            l(false);
            java.lang.String str = wVar.f331674a;
            java.lang.String str2 = this.f400485n;
            ov4.f fVar = ov4.f.f349231f;
            ov4.g[] gVarArr = ov4.g.f349235d;
            wVar.f331675b.c(new ov4.e(str, null, str2, 0, 101, fVar, 0L, "6", i().a(), "", 0, null, 0, 7242, null));
        }
        wVar.f331675b.c(h(z17 ? ov4.d.f349213o : ov4.d.f349214p, "清空"));
    }

    @Override // mv4.d
    public int getMarginTop() {
        return this.f400476e;
    }

    @Override // mv4.d
    public java.lang.String getTitle() {
        return this.f400477f;
    }

    public final ov4.c h(ov4.d dVar, java.lang.String str) {
        org.json.JSONObject jSONObject;
        rv4.w wVar = this.f400472a;
        jv4.i iVar = wVar.f400557c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String b17 = fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        java.lang.String str2 = wVar.f331674a;
        java.lang.String str3 = this.f400485n;
        java.lang.String a17 = i().a();
        java.lang.String str4 = "0|0|" + b17 + '|' + b17 + "|1||||title|0";
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str2, null, str3, 0L, dVar, a17, str4, 0, 0, null, 0, 3, 0, 0, jSONObject2, 6026, null);
    }

    public ov4.h i() {
        return new ov4.h(this.f400486o, this.f400477f, 1);
    }

    public boolean j() {
        return this.f400479h && ((this.f400478g.isEmpty() ^ true) || this.f400482k);
    }

    public final void k() {
        org.json.JSONArray jSONArray = this.f400488q;
        if (jSONArray != null) {
            com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "saveHistoryList: " + jSONArray);
            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:history0", jSONArray.toString());
        }
        org.json.JSONObject jSONObject = this.f400487p;
        if (jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "saveLocalAccountMap: " + jSONObject);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("FTSBizClickFlow", jSONObject.toString());
    }

    public void l(boolean z17) {
        boolean z18 = this.f400484m;
        this.f400484m = z17;
        if (z18 != z17) {
            qv4.p0 p0Var = (qv4.p0) this.f400474c;
            if (z17) {
                p0Var.getClass();
            } else {
                p0Var.f367003a.f400562c = false;
            }
        }
    }

    @Override // nv4.g
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f400477f);
        sb6.append('-');
        sb6.append(this.f400483l);
        sb6.append('-');
        sb6.append(((java.util.ArrayList) this.f400478g).size() > this.f400480i);
        sb6.append('-');
        sb6.append(this.f400484m);
        sb6.append('-');
        sb6.append(this.f400482k);
        sb6.append('-');
        sb6.append(this.f400485n);
        return sb6.toString();
    }

    @Override // nv4.g
    public void w() {
        java.lang.String str;
        if (this.f400482k) {
            return;
        }
        java.util.List list = this.f400478g;
        if (((java.util.ArrayList) list).isEmpty()) {
            return;
        }
        boolean z17 = ((java.util.ArrayList) list).size() > this.f400480i;
        rv4.w wVar = this.f400472a;
        if (z17 && !this.f400483l) {
            java.lang.String str2 = wVar.f331674a;
            java.lang.String str3 = this.f400485n;
            ov4.f fVar = ov4.f.f349230e;
            if (this.f400484m) {
                ov4.g[] gVarArr = ov4.g.f349235d;
                str = "8";
            } else {
                ov4.g[] gVarArr2 = ov4.g.f349235d;
                str = "7";
            }
            wVar.f331675b.d("his-title-unfold-btn-" + this.f400484m, new ov4.e(str2, null, str3, 0, 101, fVar, 0L, str, i().a(), "", 0, null, 0, 7242, null));
        }
        if (this.f400483l) {
            java.lang.String str4 = wVar.f331674a;
            java.lang.String str5 = this.f400485n;
            ov4.f fVar2 = ov4.f.f349230e;
            ov4.g[] gVarArr3 = ov4.g.f349235d;
            ov4.e eVar = new ov4.e(str4, null, str5, 0, 101, fVar2, 0L, "6#5", i().a(), "", 0, null, 0, 7242, null);
            nv4.k kVar = wVar.f331675b;
            kVar.d("his-title-clear-btn", eVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("his-title-clear-btn-");
            java.lang.String str6 = this.f400485n;
            sb6.append(str6);
            java.lang.String sb7 = sb6.toString();
            ov4.d dVar = ov4.d.f349207f;
            kVar.d(sb7, h(dVar, "清空"));
            kVar.d("his-title-hide-btn-" + str6, h(dVar, "不再展示"));
        }
    }
}
