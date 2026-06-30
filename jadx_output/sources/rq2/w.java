package rq2;

/* loaded from: classes2.dex */
public final class w extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f398902d;

    /* renamed from: e, reason: collision with root package name */
    public int f398903e;

    /* renamed from: f, reason: collision with root package name */
    public int f398904f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f398905g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f398906h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f398907i;

    /* renamed from: m, reason: collision with root package name */
    public long f398908m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f398909n;

    /* renamed from: o, reason: collision with root package name */
    public long f398910o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f398911p;

    /* renamed from: q, reason: collision with root package name */
    public int f398912q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f398913r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f398902d = -1;
        this.f398903e = -1;
        this.f398904f = -1;
        this.f398905g = new java.util.HashMap();
        this.f398907i = "";
        this.f398909n = true;
        this.f398911p = "";
        ws5.j[] jVarArr = ws5.j.f449218d;
        this.f398912q = 4;
        this.f398913r = true;
        this.f398912q = getIntent().getIntExtra("nearby_live_enter_source_params_key", 4);
        com.tencent.mars.xlog.Log.i("NearbySquareEntranceReporterUIC", "on create, set enterSource to " + this.f398912q);
    }

    public final void O6(ml2.i5 action, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct finderLiveNoticeLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct();
        if (str == null) {
            str = "";
        }
        finderLiveNoticeLogStruct.f57186d = finderLiveNoticeLogStruct.b("FinderUsrName", str, true);
        finderLiveNoticeLogStruct.f57188f = java.lang.System.currentTimeMillis();
        finderLiveNoticeLogStruct.f57189g = action.f327581d;
        java.lang.String str5 = this.f398906h;
        if (str5 == null) {
            str5 = "";
        }
        finderLiveNoticeLogStruct.f57192j = finderLiveNoticeLogStruct.b("commentscene", str5, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderLiveNoticeLogStruct.f57193k = finderLiveNoticeLogStruct.b("contextid", b17, true);
        if (str2 == null) {
            str2 = "";
        }
        finderLiveNoticeLogStruct.f57199q = finderLiveNoticeLogStruct.b("NotificationId", str2, true);
        finderLiveNoticeLogStruct.f57205w = finderLiveNoticeLogStruct.b("chnlExtra", str3, true);
        finderLiveNoticeLogStruct.f57206x = finderLiveNoticeLogStruct.b("NoticeID", str4, true);
        finderLiveNoticeLogStruct.k();
    }

    public final void P6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("NearbySquareEntranceReporterUIC", "report23057 chnlExtra: " + str + " contextId: " + str2 + " eidStr: " + str3 + " eidUdfKv: " + str4);
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidExposeStruct.f56537d = java.lang.System.currentTimeMillis();
        finderBroadcastEidExposeStruct.u("");
        if (str == null) {
            str = "";
        }
        finderBroadcastEidExposeStruct.p(str);
        finderBroadcastEidExposeStruct.A("");
        finderBroadcastEidExposeStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidExposeStruct.w(Ri);
        if (str2 == null) {
            str2 = "";
        }
        finderBroadcastEidExposeStruct.r(str2);
        java.lang.String str5 = this.f398906h;
        if (str5 == null) {
            str5 = "";
        }
        finderBroadcastEidExposeStruct.q(str5);
        finderBroadcastEidExposeStruct.x("");
        finderBroadcastEidExposeStruct.v("");
        finderBroadcastEidExposeStruct.f56548o = finderBroadcastEidExposeStruct.b("ref_commentscene", "", true);
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidExposeStruct.s(str3);
        if (str4 == null) {
            str4 = "";
        }
        finderBroadcastEidExposeStruct.t(str4);
        finderBroadcastEidExposeStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidExposeStruct.k();
    }

    public final void Q6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("NearbySquareEntranceReporterUIC", "report23059 contextId: " + str + " eidStr: " + str2 + " eidUdfKv: " + str3);
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        finderBroadcastEidClickStruct.u("");
        finderBroadcastEidClickStruct.p("");
        finderBroadcastEidClickStruct.B("");
        finderBroadcastEidClickStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidClickStruct.w(Ri);
        if (str == null) {
            str = "";
        }
        finderBroadcastEidClickStruct.r(str);
        java.lang.String str4 = this.f398906h;
        if (str4 == null) {
            str4 = "";
        }
        finderBroadcastEidClickStruct.q(str4);
        finderBroadcastEidClickStruct.A("");
        finderBroadcastEidClickStruct.x("");
        finderBroadcastEidClickStruct.v("");
        if (str2 == null) {
            str2 = "";
        }
        finderBroadcastEidClickStruct.s(str2);
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidClickStruct.t(str3);
        finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidClickStruct.k();
    }

    public final void R6(int i17) {
        this.f398904f = i17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(getActivity().hashCode()), null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (kotlin.jvm.internal.o.b(this.f398906h, "182") && this.f398913r) {
            this.f398913r = false;
            return;
        }
        cl0.g gVar = new cl0.g();
        gVar.s("is_new_square", 1);
        gVar.s(ya.b.SOURCE, java.lang.Integer.valueOf(this.f398912q));
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct finderBroadcastPageInStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct();
        finderBroadcastPageInStruct.f56553d = c01.id.c();
        finderBroadcastPageInStruct.r(kotlin.jvm.internal.o.b(this.f398906h, "182") ? "182" : "1001");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastPageInStruct.f56557h = finderBroadcastPageInStruct.b("sessionid", Ri, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderBroadcastPageInStruct.q(b17);
        java.lang.String str = this.f398906h;
        finderBroadcastPageInStruct.p(str != null ? str : "");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderBroadcastPageInStruct.s(r26.i0.t(gVar2, ",", ";", false));
        finderBroadcastPageInStruct.f56564o = finderBroadcastPageInStruct.b("switch_extra", ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
        ml2.b1.f327211a.b(new ml2.a1(java.lang.String.valueOf(getActivity().hashCode()), finderBroadcastPageInStruct));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f398902d = -1;
        this.f398903e = -1;
        this.f398904f = -1;
        this.f398905g = new java.util.HashMap();
        this.f398907i = "";
        this.f398909n = true;
        this.f398911p = "";
        ws5.j[] jVarArr = ws5.j.f449218d;
        this.f398912q = 4;
        this.f398913r = true;
        this.f398912q = getIntent().getIntExtra("nearby_live_enter_source_params_key", 4);
        com.tencent.mars.xlog.Log.i("NearbySquareEntranceReporterUIC", "on create, set enterSource to " + this.f398912q);
    }
}
