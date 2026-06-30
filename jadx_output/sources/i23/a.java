package i23;

/* loaded from: classes12.dex */
public final class a implements su4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f288074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i23.e f288075b;

    public a(androidx.appcompat.app.AppCompatActivity appCompatActivity, i23.e eVar) {
        this.f288074a = appCompatActivity;
        this.f288075b = eVar;
    }

    @Override // su4.p0
    public void a() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        g23.a aVar = fVar.f469398d.f415693e;
        if (aVar.f267889f) {
            java.lang.String str = aVar.f267887d;
            kotlin.jvm.internal.o.f(str, "getExtParams(...)");
            java.lang.String str2 = aVar.f267888e;
            kotlin.jvm.internal.o.f(str2, "getNavBarParms(...)");
            org.json.JSONObject X6 = fVar.X6(str, str2);
            z50.b bVar = z50.c.f470162a;
            android.app.Activity context = this.f288075b.getContext();
            java.lang.String str3 = aVar.f267884a;
            kotlin.jvm.internal.o.f(str3, "getHotword(...)");
            bVar.d(context, str3, aVar.f267885b, aVar.f267886c, X6);
        }
    }

    @Override // su4.p0
    public su4.e2 b() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        boolean z17 = false;
        if (fTSMainUI == null) {
            return new su4.e2(false, "");
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        g23.d dVar = fVar.f469398d.f415696h;
        if (fVar.e7() && dVar.f267898b) {
            xj.m mVar = (xj.m) ((jz5.n) fVar.f469409r).getValue();
            java.lang.String str = mVar != null ? mVar.f454753a : null;
            if (!(str == null || str.length() == 0)) {
                z17 = true;
            }
        }
        java.lang.String str2 = dVar.f267897a;
        kotlin.jvm.internal.o.f(str2, "getAdTitle(...)");
        return new su4.e2(z17, str2);
    }

    @Override // su4.p0
    public su4.e2 c() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        boolean z17 = false;
        if (fTSMainUI == null) {
            return new su4.e2(false, "");
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        g23.c cVar = fVar.f469398d.f415697i;
        if (fVar.e7() && cVar.f267896f) {
            z17 = true;
        }
        java.lang.String str = cVar.f267891a;
        kotlin.jvm.internal.o.f(str, "getHotword(...)");
        return new su4.e2(z17, str);
    }

    @Override // su4.p0
    public org.json.JSONObject d() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return jSONObject;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((z13.f) a17).U6(jSONObject);
        return jSONObject;
    }

    @Override // su4.p0
    public void e(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.fts.ui.widget.v vVar = ((z13.f) a17).f469399e;
        if (vVar == null || !vVar.u()) {
            return;
        }
        if (kotlin.jvm.internal.o.b(key, "isAISearchVisible")) {
            vVar.I = java.lang.Boolean.parseBoolean(value);
        } else if (kotlin.jvm.internal.o.b(key, "isYuanbaoVisible")) {
            boolean parseBoolean = java.lang.Boolean.parseBoolean(value);
            vVar.f138329J = parseBoolean;
            vVar.f138333y.getClass();
            if (!parseBoolean) {
                ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).oj(wj.t0.f446509r, null);
            }
        }
        vVar.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // su4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f() {
        /*
            r6 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r6.f288074a
            boolean r1 = r0 instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI
            if (r1 == 0) goto L9
            com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = (com.tencent.mm.plugin.fts.ui.FTSMainUI) r0
            goto La
        L9:
            r0 = 0
        La:
            r1 = 0
            if (r0 != 0) goto L10
            t50.f r0 = t50.f.f415698e
            return r1
        L10:
            pf5.z r2 = pf5.z.f353948a
            pf5.v r0 = r2.a(r0)
            java.lang.Class<z13.f> r2 = z13.f.class
            androidx.lifecycle.c1 r0 = r0.a(r2)
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r2)
            z13.f r0 = (z13.f) r0
            t50.e r0 = r0.f469398d
            g23.a r2 = r0.f415693e
            boolean r2 = r2.f267889f
            jz5.g r3 = r0.f415691c
            r4 = 1
            if (r2 == 0) goto L47
            boolean r2 = r0.b()
            if (r2 == 0) goto L47
            r2 = r3
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            t50.g[] r5 = t50.g.f415705d
            if (r2 != r4) goto L47
            r2 = r4
            goto L48
        L47:
            r2 = r1
        L48:
            if (r2 == 0) goto L4e
            t50.f r0 = t50.f.f415700g
            goto Lac
        L4e:
            int r2 = r0.a()
            if (r2 <= 0) goto L68
            boolean r2 = r0.b()
            if (r2 == 0) goto L68
            g23.c r2 = r0.f415697i
            boolean r2 = r2.f267896f
            if (r2 != 0) goto L66
            g23.d r2 = r0.f415696h
            boolean r2 = r2.f267898b
            if (r2 == 0) goto L68
        L66:
            r2 = r4
            goto L69
        L68:
            r2 = r1
        L69:
            if (r2 == 0) goto L6e
            t50.f r0 = t50.f.f415702i
            goto Lac
        L6e:
            g23.b r2 = r0.f415694f
            boolean r2 = r2.f267890a
            if (r2 == 0) goto L82
            int r2 = r0.a()
            if (r2 <= 0) goto L82
            boolean r2 = r0.b()
            if (r2 == 0) goto L82
            r2 = r4
            goto L83
        L82:
            r2 = r1
        L83:
            if (r2 == 0) goto L88
            t50.f r0 = t50.f.f415701h
            goto Lac
        L88:
            g23.a r2 = r0.f415693e
            boolean r2 = r2.f267889f
            if (r2 == 0) goto La5
            boolean r0 = r0.b()
            if (r0 == 0) goto La5
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            t50.g[] r2 = t50.g.f415705d
            if (r0 != 0) goto La5
            r1 = r4
        La5:
            if (r1 == 0) goto Laa
            t50.f r0 = t50.f.f415699f
            goto Lac
        Laa:
            t50.f r0 = t50.f.f415698e
        Lac:
            int r0 = r0.f415704d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.a.f():int");
    }

    @Override // su4.p0
    public void g() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return;
        }
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.f440239f;
        vu4.b bVar = vu4.b.E;
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        dVar.b(aVar, bVar, ((z13.f) a17).a7(), "");
    }

    @Override // su4.p0
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this.f288075b.getActivity();
    }

    @Override // su4.p0
    public org.json.JSONArray h() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return new org.json.JSONArray();
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return ((z13.f) a17).Z6();
    }

    @Override // su4.p0
    public void i(android.content.Context context, java.lang.String query, int i17, java.lang.String parentSearchId, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(parentSearchId, "parentSearchId");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        org.json.JSONObject a76 = fVar.a7();
        org.json.JSONObject c76 = fVar.c7();
        c76.put("parentSearchID", parentSearchId);
        if (str != null) {
            c76.put("mixerCommonContext", str);
        }
        z50.b bVar = z50.c.f470162a;
        r45.jo0 jo0Var = new r45.jo0();
        jo0Var.f377988f = query.hashCode();
        jo0Var.f377987e = 0;
        r45.di6 di6Var = new r45.di6();
        di6Var.f372513e = query;
        di6Var.f372512d = query;
        jo0Var.f377986d = di6Var;
        int optInt = a76.optInt("isFromVoice", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("parentSearchID", parentSearchId);
        hashMap.put("isFromVoice", java.lang.String.valueOf(optInt));
        hashMap.put("clickType", "7");
        bVar.a(context, query, jo0Var, i17, hashMap, c76);
    }

    @Override // su4.p0
    public boolean isTeenMode() {
        return !com.tencent.mm.plugin.fts.ui.n3.h();
    }

    @Override // su4.p0
    public void j() {
        k23.c1 a17 = k23.c1.f303536h.a(this.f288074a);
        k23.t2 t2Var = a17.f303540f;
        t2Var.f303697b.set(jz5.h.b(t2Var.f303696a));
        boolean U6 = a17.U6();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSFloatingVoiceV3UIC", "refreshVoiceV3Btn: enable=" + U6);
        if (!U6) {
            k23.v0 v0Var = a17.f303541g;
            if (v0Var != null) {
                v0Var.B(false);
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = a17.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI");
        ((com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI) activity).f7();
        k23.v0 v0Var2 = a17.f303541g;
        if (v0Var2 != null) {
            v0Var2.B(true);
            v0Var2.G(true);
        }
    }

    @Override // su4.p0
    public void k() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return;
        }
        fTSMainUI.f137937y0.a();
        this.f288075b.hideVKB();
    }

    @Override // su4.p0
    public void l() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return;
        }
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.f440241h;
        vu4.b bVar = vu4.b.E;
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        dVar.b(aVar, bVar, ((z13.f) a17).a7(), "");
    }

    @Override // su4.p0
    public boolean m() {
        return k23.c1.f303536h.a(this.f288074a).W6();
    }

    @Override // su4.p0
    public int n() {
        return com.tencent.mm.R.id.f487699pi0;
    }

    @Override // su4.p0
    public boolean o() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return false;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return ((z13.f) a17).e7();
    }

    @Override // su4.p0
    public org.json.JSONObject p() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f288074a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = appCompatActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) appCompatActivity : null;
        if (fTSMainUI == null) {
            return jSONObject;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((z13.f) a17).V6(jSONObject);
        return jSONObject;
    }
}
