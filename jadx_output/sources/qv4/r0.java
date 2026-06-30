package qv4;

/* loaded from: classes12.dex */
public final class r0 implements jv4.h, kv4.m, sv4.d, rv4.y {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f367007a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f367008b;

    /* renamed from: c, reason: collision with root package name */
    public final su4.p0 f367009c;

    /* renamed from: d, reason: collision with root package name */
    public jv4.i f367010d;

    /* renamed from: e, reason: collision with root package name */
    public rv4.h f367011e;

    /* renamed from: f, reason: collision with root package name */
    public rv4.b0 f367012f;

    /* renamed from: g, reason: collision with root package name */
    public rv4.a f367013g;

    /* renamed from: h, reason: collision with root package name */
    public rv4.p f367014h;

    /* renamed from: i, reason: collision with root package name */
    public final kv4.g f367015i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f367016j;

    /* renamed from: k, reason: collision with root package name */
    public int f367017k;

    /* renamed from: l, reason: collision with root package name */
    public final int f367018l;

    /* renamed from: m, reason: collision with root package name */
    public final int f367019m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f367020n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f367021o;

    public r0(rv4.w session, com.tencent.mm.ui.MMActivity context, su4.p0 config) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        this.f367007a = session;
        this.f367008b = context;
        this.f367009c = config;
        this.f367015i = new kv4.g(0);
        this.f367016j = new java.util.ArrayList();
        new java.lang.ref.WeakReference(null);
        this.f367018l = 1;
        this.f367019m = 2;
        this.f367021o = jz5.h.b(new qv4.q0(this));
    }

    public static final void d(qv4.r0 r0Var, boolean z17) {
        long currentTimeMillis;
        jv4.i iVar = r0Var.f367010d;
        if (iVar != null) {
            java.lang.String value = java.lang.String.valueOf(z17);
            kotlin.jvm.internal.o.g(value, "value");
            jv4.e eVar = (jv4.e) ((jv4.p) iVar).f302262e;
            eVar.getClass();
            eVar.f302235a.e("isAISearchVisible", value);
        }
        rv4.w wVar = r0Var.f367007a;
        rv4.t a17 = wVar.a();
        if (z17) {
            currentTimeMillis = 0;
        } else {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            currentTimeMillis = java.lang.System.currentTimeMillis();
        }
        a17.f400554a.put("hideAiSearch", currentTimeMillis);
        wVar.a().a();
    }

    public static final void e(qv4.r0 r0Var, boolean z17) {
        long currentTimeMillis;
        jv4.i iVar = r0Var.f367010d;
        if (iVar != null) {
            java.lang.String value = java.lang.String.valueOf(z17);
            kotlin.jvm.internal.o.g(value, "value");
            jv4.e eVar = (jv4.e) ((jv4.p) iVar).f302262e;
            eVar.getClass();
            eVar.f302235a.e("isYuanbaoVisible", value);
        }
        rv4.w wVar = r0Var.f367007a;
        rv4.t a17 = wVar.a();
        if (z17) {
            currentTimeMillis = 0;
        } else {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            currentTimeMillis = java.lang.System.currentTimeMillis();
        }
        a17.f400554a.put("hideYuanbaoAd", currentTimeMillis);
        wVar.a().a();
    }

    @Override // jv4.h
    public androidx.recyclerview.widget.k3 a(android.view.ViewGroup parent, jv4.m type) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(type, "type");
        switch (type.ordinal()) {
            case 1:
                android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efu, parent, false);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                return new qv4.e(inflate);
            case 2:
                android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.egl, parent, false);
                kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
                return new qv4.k0(inflate2);
            case 3:
                android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.egc, parent, false);
                kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
                return new qv4.z(inflate3);
            case 4:
                android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.egb, parent, false);
                kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
                return new qv4.m(inflate4);
            case 5:
                android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.eg6, parent, false);
                kotlin.jvm.internal.o.f(inflate5, "inflate(...)");
                return new jv4.g(inflate5);
            case 6:
            case 7:
            default:
                return new jv4.g(new android.view.View(parent.getContext()));
            case 8:
                android.view.View inflate6 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489129eg2, parent, false);
                kotlin.jvm.internal.o.f(inflate6, "inflate(...)");
                return new qv4.b0(inflate6);
            case 9:
                if (this.f367017k == this.f367019m) {
                    android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efs, parent, false);
                    kotlin.jvm.internal.o.f(inflate7, "inflate(...)");
                    return new qv4.b(inflate7);
                }
                android.view.View inflate8 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.efr, parent, false);
                kotlin.jvm.internal.o.f(inflate8, "inflate(...)");
                return new qv4.b(inflate8);
            case 10:
                android.view.View inflate9 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.egc, parent, false);
                kotlin.jvm.internal.o.f(inflate9, "inflate(...)");
                return new kv4.d(inflate9);
            case 11:
                android.view.View inflate10 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.egd, parent, false);
                kotlin.jvm.internal.o.f(inflate10, "inflate(...)");
                return new kv4.b(inflate10);
            case 12:
                return new qv4.s0(new android.view.View(parent.getContext()));
        }
    }

    @Override // jv4.h
    public java.util.List b() {
        return this.f367016j;
    }

    @Override // jv4.h
    public void c(jv4.i iVar) {
        this.f367010d = iVar;
    }

    public boolean f() {
        rv4.p pVar = this.f367014h;
        if (pVar == null) {
            return true;
        }
        kotlin.jvm.internal.o.d(pVar);
        return !pVar.h();
    }

    public final rv4.x g() {
        return (rv4.x) ((jz5.n) this.f367021o).getValue();
    }

    public rv4.z h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.b0 b0Var = this.f367012f;
        if (b0Var != null) {
            arrayList.add(new rv4.d0(this.f367007a, b0Var.f400444g, b0Var.f400441d, false, 8, null));
            java.util.List list = b0Var.f400442e;
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                rv4.w wVar = this.f367007a;
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) obj);
                boolean b17 = c0Var.b();
                java.lang.String str = c0Var.f400449c;
                java.lang.Integer num = c0Var.f400451e;
                arrayList.add(new rv4.e0(wVar, b17, str, num != null ? num.intValue() : 0, ((java.util.ArrayList) list).size(), i17, b0Var.f400444g));
                i17 = i18;
            }
        }
        rv4.h hVar = this.f367011e;
        if (hVar != null) {
            arrayList.add(new rv4.n(this.f367007a, hVar.f400479h, hVar.f400477f, false, 8, null));
        }
        rv4.p pVar = this.f367014h;
        if (pVar != null && (!pVar.f400528c.isEmpty())) {
            arrayList.add(new rv4.s(this.f367007a, pVar.f400540o, pVar.f400539n, false, 8, null));
        }
        return new rv4.z(arrayList);
    }

    public void i() {
        this.f367020n = true;
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jv4.i iVar = this.f367010d;
        su4.e2 c17 = iVar != null ? ((jv4.e) ((jv4.p) iVar).f302262e).f302235a.c() : null;
        rv4.w wVar = this.f367007a;
        if (c17 != null && c17.f412875a) {
            org.json.JSONObject a17 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 4), new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, c17.f412876b), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f400554a.optLong("hideAiSearch", 0L) != 0)))));
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        jv4.i iVar2 = this.f367010d;
        su4.e2 b17 = iVar2 != null ? ((jv4.e) ((jv4.p) iVar2).f302262e).f302235a.b() : null;
        if (b17 != null && b17.f412875a) {
            org.json.JSONObject a18 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 5), new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, b17.f412876b), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f400554a.optLong("hideYuanbaoAd", 0L) != 0)))));
            if (a18 != null) {
                arrayList.add(a18);
            }
        }
        rv4.b0 b0Var = this.f367012f;
        if (b0Var != null) {
            boolean z17 = wVar.a().f400554a.optLong("hideVertical", 0L) != 0;
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("settingType", 1);
            lVarArr[1] = new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, b0Var.f400441d);
            lVarArr[2] = new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!z17));
            java.util.List list = b0Var.f400442e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) it.next());
                java.util.Iterator it6 = it;
                java.util.Map l17 = kz5.c1.l(new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, c0Var.f400449c), new jz5.l("visible", java.lang.Boolean.valueOf(c0Var.b())), new jz5.l("settingType", 2));
                java.lang.Long l18 = c0Var.f400450d;
                if (l18 != null) {
                    l17.put("isSwitchOn", java.lang.Long.valueOf(l18.longValue()));
                }
                java.lang.Boolean bool = c0Var.f400454h;
                if (bool != null) {
                    l17.put("isSwitchClosed", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                java.lang.Integer num = c0Var.f400451e;
                if (num != null) {
                    l17.put("businessType", java.lang.Integer.valueOf(num.intValue()));
                }
                arrayList2.add(l17);
                it = it6;
            }
            lVarArr[3] = new jz5.l("items", arrayList2);
            org.json.JSONObject a19 = ri.l0.a(kz5.c1.k(lVarArr));
            if (a19 != null) {
                arrayList.add(a19);
            }
        }
        rv4.h hVar = this.f367011e;
        if (hVar != null) {
            org.json.JSONObject a27 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 3), new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, hVar.f400477f), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f400554a.optLong("hidehis", 0L) != 0)))));
            if (a27 != null) {
                arrayList.add(a27);
            }
        }
        rv4.p pVar = this.f367014h;
        if (pVar != null && (!pVar.f400528c.isEmpty())) {
            org.json.JSONObject a28 = ri.l0.a(kz5.c1.k(new jz5.l("settingType", 6), new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, pVar.f400539n), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f400554a.optLong("hideHotSearch", 0L) != 0)))));
            if (a28 != null) {
                arrayList.add(a28);
            }
        }
        if (this.f367009c.m()) {
            java.lang.String string = this.f367008b.getString(com.tencent.mm.R.string.f492950ie3);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(ri.l0.a(kz5.c1.k(new jz5.l("settingType", 10), new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, string), new jz5.l("isSwitchOn", java.lang.Boolean.valueOf(!(wVar.a().f400554a.optLong("hideVoiceV3Btn", 0L) != 0))))));
        }
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.APP;
        liteAppReferrerInfo.extraData = ri.l0.a(kz5.c1.k(new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, wVar.f331674a), new jz5.l("items", kz5.n0.V(arrayList))));
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new qv4.l0(this);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.mm.ui.MMActivity mMActivity = this.f367008b;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite292c2ce0ae0ce2b6ff62226ac60ed4b4");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/seach-page-setting/entry");
        bundle.putBoolean("forbidRightGesture", true);
        bundle.putString("minVersion", "2.0.0");
        bundle.putDouble("heightPercent", 0.67d);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        ((com.tencent.mm.feature.lite.i) g0Var).jk(mMActivity, bundle, true, false, sVar, new qv4.m0());
    }

    public void j() {
        boolean z17;
        rv4.p pVar;
        com.tencent.mars.xlog.Log.i("FTS.GlobalTeachViewAdapter", "reloadData, enableLargeGapSection: " + f() + ", aiSearchPosition: " + this.f367017k);
        rv4.b0 b0Var = this.f367012f;
        boolean z18 = false;
        if (b0Var != null && b0Var.c()) {
            rv4.b0 b0Var2 = this.f367012f;
            if (b0Var2 != null) {
                int i17 = 32 - 10;
                int i18 = 24 - 10;
                if (!f()) {
                    i17 = i18;
                }
                b0Var2.f400439b = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
            }
            z17 = false;
        } else {
            z17 = true;
        }
        rv4.h hVar = this.f367011e;
        if (hVar != null && hVar.j()) {
            rv4.h hVar2 = this.f367011e;
            if (hVar2 != null) {
                boolean f17 = f();
                int i19 = z17 ? 14 : 6;
                int i27 = 32 - i19;
                int i28 = 24 - i19;
                if (!f17) {
                    i27 = i28;
                }
                hVar2.f400475d = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i27);
            }
            z17 = false;
        }
        rv4.p pVar2 = this.f367014h;
        if (pVar2 != null && pVar2.h()) {
            z18 = true;
        }
        if (z18 && (pVar = this.f367014h) != null) {
            boolean f18 = f();
            int i29 = z17 ? 14 : 6;
            int i37 = 32 - i29;
            int i38 = 24 - i29;
            if (!f18) {
                i37 = i38;
            }
            pVar.f400537l = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i37);
        }
        jv4.i iVar = this.f367010d;
        if (iVar != null) {
            ((jv4.p) iVar).y(true);
        }
    }

    public final void k() {
        jv4.i iVar = this.f367010d;
        rv4.w session = this.f367007a;
        session.f400557c = iVar;
        qv4.p0 p0Var = new qv4.p0(g());
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mm.ui.MMActivity context = this.f367008b;
        kotlin.jvm.internal.o.g(context, "context");
        this.f367011e = new rv4.h(session, context, p0Var);
        this.f367012f = new rv4.b0(session, context);
        jv4.i iVar2 = this.f367010d;
        int i17 = 0;
        int f17 = iVar2 != null ? ((jv4.e) ((jv4.p) iVar2).f302262e).f302235a.f() : 0;
        this.f367017k = f17;
        int i18 = this.f367019m;
        int i19 = this.f367018l;
        if (f17 == i19 || f17 == i18) {
            this.f367013g = new rv4.a(session, context);
        }
        this.f367014h = new rv4.p(session, context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.a aVar = this.f367013g;
        if (aVar != null && this.f367017k == i18) {
            arrayList.add(new kv4.h(aVar));
        }
        rv4.b0 b0Var = this.f367012f;
        if (b0Var != null) {
            arrayList.add(new kv4.m0(b0Var, this));
        }
        rv4.h hVar = this.f367011e;
        if (hVar != null) {
            arrayList.add(new kv4.n(hVar, this));
        }
        rv4.p pVar = this.f367014h;
        if (pVar != null) {
            arrayList.add(new kv4.t(pVar, this));
        }
        rv4.a aVar2 = this.f367013g;
        if (aVar2 != null && this.f367017k == i19) {
            arrayList.add(new kv4.h(aVar2));
        }
        su4.p0 p0Var2 = this.f367009c;
        if (!p0Var2.isTeenMode() && !p0Var2.m()) {
            arrayList.add(new tv4.e(g()));
        }
        arrayList.add(new kv4.f(this.f367015i));
        this.f367016j = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        rv4.b0 b0Var2 = this.f367012f;
        if (b0Var2 != null) {
            arrayList2.add(b0Var2);
        }
        rv4.h hVar2 = this.f367011e;
        if (hVar2 != null) {
            arrayList2.add(hVar2);
        }
        rv4.p pVar2 = this.f367014h;
        if (pVar2 != null) {
            arrayList2.add(pVar2);
        }
        rv4.a aVar3 = this.f367013g;
        if (aVar3 != null) {
            arrayList2.add(aVar3);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            mv4.c cVar = (mv4.c) next;
            cVar.e(i27);
            cVar.d();
            i17 = i27;
        }
        j();
    }

    public void l(boolean z17) {
        long currentTimeMillis;
        rv4.h hVar = this.f367011e;
        if (hVar != null) {
            hVar.f400479h = z17;
            hVar.f400482k = false;
            hVar.l(false);
            hVar.f400483l = false;
            rv4.w wVar = hVar.f400472a;
            rv4.t a17 = wVar.a();
            if (z17) {
                currentTimeMillis = 0;
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            a17.f400554a.put("hidehis", currentTimeMillis);
            wVar.a().a();
        }
        j();
    }

    public void m(boolean z17) {
        long currentTimeMillis;
        rv4.p pVar = this.f367014h;
        if (pVar != null) {
            pVar.f400540o = z17;
            rv4.w wVar = pVar.f400526a;
            rv4.t a17 = wVar.a();
            if (z17) {
                currentTimeMillis = 0;
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            a17.f400554a.put("hideHotSearch", currentTimeMillis);
            wVar.a().a();
        }
        j();
    }

    public void n(boolean z17) {
        long currentTimeMillis;
        rv4.b0 b0Var = this.f367012f;
        if (b0Var != null) {
            b0Var.f400444g = z17;
            rv4.w wVar = b0Var.f400438a;
            rv4.t a17 = wVar.a();
            if (z17) {
                currentTimeMillis = 0;
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            a17.f400554a.put("hideVertical", currentTimeMillis);
            wVar.a().a();
        }
        j();
    }

    public void o(int i17, boolean z17) {
        rv4.b0 b0Var = this.f367012f;
        if (b0Var != null) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            rv4.w wVar = b0Var.f400438a;
            org.json.JSONObject optJSONObject = wVar.a().f400554a.optJSONObject("localVerticalSwitchMap");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            java.util.Iterator it = ((java.util.ArrayList) b0Var.f400442e).iterator();
            while (it.hasNext()) {
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) it.next());
                java.lang.Integer num = c0Var.f400451e;
                boolean b17 = (num != null && num.intValue() == i17) ? z17 : c0Var.b();
                long j17 = b17 ? 0L : currentTimeMillis;
                c0Var.f400450d = java.lang.Long.valueOf(j17);
                java.lang.Integer num2 = c0Var.f400451e;
                c0Var.f400453g = b17 && num2 != null && num2.intValue() == i17;
                if (num2 != null) {
                    optJSONObject.put(java.lang.String.valueOf(num2.intValue()), j17);
                }
            }
            com.tencent.mars.xlog.Log.i("FTSGlobalTeachVerticalEntryData", "setSubItemVisible: " + i17 + ", " + z17 + ", " + optJSONObject);
            rv4.t a17 = wVar.a();
            a17.getClass();
            a17.f400554a.put("localVerticalSwitchMap", optJSONObject);
            wVar.a().a();
        }
        j();
    }
}
