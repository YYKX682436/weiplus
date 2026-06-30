package vp2;

/* loaded from: classes2.dex */
public abstract class h0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f438924d;

    /* renamed from: e, reason: collision with root package name */
    public final dk2.bc f438925e;

    /* renamed from: f, reason: collision with root package name */
    public dk2.dc f438926f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.ic f438927g;

    public h0(r45.yk2 npsSurveyInfo, r45.fa2 container) {
        kotlin.jvm.internal.o.g(npsSurveyInfo, "npsSurveyInfo");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438924d = container;
        try {
            this.f438925e = new dk2.bc(npsSurveyInfo);
        } catch (java.lang.Exception e17) {
            this.f438925e = null;
            com.tencent.mars.xlog.Log.e("FinderLiveQcPollActivityFeed", "init error: " + e17);
        }
        dk2.bc bcVar = this.f438925e;
        this.f438926f = bcVar != null ? new dk2.dc(bcVar, null, 2, null) : null;
    }

    public final void a(android.content.Context context, int i17) {
        dk2.bc bcVar;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            dk2.dc dcVar = this.f438926f;
            java.util.List a17 = dcVar != null ? dcVar.a(java.lang.Integer.valueOf(i17)) : kz5.p0.f313996d;
            if (a17.isEmpty()) {
                com.tencent.mars.xlog.Log.w("FinderLiveQcPollActivityFeed", "createExtStatsFeed empty");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commitActivity taskId: ");
            dk2.dc dcVar2 = this.f438926f;
            sb6.append((dcVar2 == null || (bcVar = dcVar2.f233327a) == null) ? null : bcVar.f233255b);
            com.tencent.mars.xlog.Log.i("FinderLiveQcPollActivityFeed", sb6.toString());
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Jj(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 18054, a17);
            dk2.bc bcVar2 = this.f438925e;
            this.f438926f = bcVar2 != null ? new dk2.dc(bcVar2, null, 2, null) : null;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.d(com.tencent.mm.R.string.ntl);
            e4Var.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveQcPollActivityFeed", "commitActivity error: " + e17);
        }
    }

    public final void b(android.content.Context context, java.lang.Iterable options) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(options, "options");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(rq2.w.class);
        java.lang.String string = V6.getString(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("select_options", kz5.n0.g0(options, "#", null, null, 0, null, vp2.f0.f438920d, 30, null));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        wVar.Q6(string, "square_nps_quest_unlike_half_screen", r26.i0.t(jSONObject2, ",", ";", false));
    }

    public final void c(android.content.Context context) {
        dk2.hc hcVar;
        java.util.List list;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(rq2.w.class);
        java.lang.String string = V6.getString(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        dk2.ic icVar = this.f438927g;
        jSONObject.putOpt("options_list", (icVar == null || (hcVar = icVar.f233624c) == null || (list = hcVar.f233583e) == null) ? null : kz5.n0.g0(list, "#", null, null, 0, null, vp2.g0.f438923d, 30, null));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        wVar.P6(null, string, "square_nps_quest_unlike_half_screen", r26.i0.t(jSONObject2, ",", ";", false));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }
}
