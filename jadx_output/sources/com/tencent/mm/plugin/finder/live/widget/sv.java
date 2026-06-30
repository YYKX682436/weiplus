package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sv {

    /* renamed from: i, reason: collision with root package name */
    public static final r45.h84 f119839i;

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f119840a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.y0 f119841b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f119842c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.lv f119843d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f119844e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.qv f119845f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.pv f119846g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f119847h;

    static {
        new com.tencent.mm.plugin.finder.live.widget.hv(null);
        r45.h84 h84Var = new r45.h84();
        h84Var.set(0, "-1");
        f119839i = h84Var;
    }

    public sv(android.widget.RelativeLayout panelRoot) {
        kotlin.jvm.internal.o.g(panelRoot, "panelRoot");
        this.f119840a = panelRoot;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) panelRoot.findViewById(com.tencent.mm.R.id.oiv);
        this.f119842c = recyclerView;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) panelRoot.findViewById(com.tencent.mm.R.id.esh);
        this.f119843d = new com.tencent.mm.plugin.finder.live.widget.lv(this);
        this.f119844e = new java.util.ArrayList();
        this.f119845f = new com.tencent.mm.plugin.finder.live.widget.qv(f119839i, "");
        panelRoot.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fv(this));
        panelRoot.setTranslationY(com.tencent.mm.ui.bl.b(panelRoot.getContext()).y);
        relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.gv(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(panelRoot.getContext(), 0, false));
    }

    public static /* synthetic */ void b(com.tencent.mm.plugin.finder.live.widget.sv svVar, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        if ((i18 & 8) != 0) {
            j17 = 0;
        }
        svVar.a(i17, str3, str4, j17);
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, long j17) {
        boolean z17 = false;
        if (i17 == 6 || !kotlin.jvm.internal.o.b(str, f119839i.getString(0))) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            if (i17 != 1 && i17 != 2) {
                jSONObject.put("effects_id", str);
                jSONObject.put("effects_name", str2);
            }
            if (i17 == 7) {
                jSONObject.put("use_time", j17);
            }
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && c1Var.a8()) {
                z17 = true;
            }
            if (z17) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.J1, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.c1 c1Var2 = ml2.c1.f327325e;
                zy2.zb.j5((zy2.zb) c18, 46L, jSONObject.toString(), null, 4, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#reportAnchorElement living=");
            mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
            sb6.append(c1Var3 != null ? java.lang.Boolean.valueOf(c1Var3.a8()) : null);
            sb6.append(' ');
            sb6.append(jSONObject);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveScreenEffectWidget", sb6.toString());
        }
    }

    public final void c(com.tencent.mm.plugin.finder.live.widget.qv qvVar) {
        hn0.f fVar;
        hn0.f fVar2;
        com.tencent.mm.plugin.finder.live.widget.qv qvVar2 = this.f119845f;
        if (!(!kotlin.jvm.internal.o.b(qvVar2.f119555a.getString(0), qvVar.f119555a.getString(0)))) {
            qvVar2 = null;
        }
        r45.h84 h84Var = qvVar.f119555a;
        if (qvVar2 != null) {
            r45.h84 h84Var2 = qvVar2.f119555a;
            if (!kotlin.jvm.internal.o.b(h84Var2.getString(0), f119839i.getString(0))) {
                a(7, h84Var2.getString(0), h84Var2.getString(1), java.lang.System.currentTimeMillis() - dk2.ef.f233409x);
                if (kotlin.jvm.internal.o.b(h84Var.getString(0), "-1")) {
                    b(this, 6, h84Var2.getString(0), h84Var2.getString(1), 0L, 8, null);
                }
            }
        }
        this.f119845f = qvVar;
        dk2.ef efVar = dk2.ef.f233372a;
        efVar.h0(qvVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveScreenEffectWidget", "#curSelectedFilter set " + h84Var.getString(0));
        if (kotlin.jvm.internal.o.b(h84Var.getString(0), "-1")) {
            in0.q e17 = efVar.e();
            if (e17 != null && (fVar2 = e17.f420773t) != null) {
                ((hn0.p) fVar2).g(kz5.p0.f313996d);
            }
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string = h84Var.getString(0);
            if (string == null) {
                string = "";
            }
            arrayList.add(new jz5.l(string, qvVar.f119556b));
            in0.q e18 = efVar.e();
            if (e18 != null && (fVar = e18.f420773t) != null) {
                ((hn0.p) fVar).g(arrayList);
            }
        }
        java.lang.String string2 = this.f119845f.f119555a.getString(0);
        java.lang.String str = string2 != null ? string2 : "";
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.j0.f327583i.a("effects_id_list", str);
    }
}
