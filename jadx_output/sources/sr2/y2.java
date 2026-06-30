package sr2;

/* loaded from: classes10.dex */
public final class y2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public ya2.p1 f411800d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f411801e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f411802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f411803g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f411804h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f411805i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f411806m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f411807n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f411808o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f411809p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f411810q;

    /* renamed from: r, reason: collision with root package name */
    public r45.gd1 f411811r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f411812s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f411813t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f411814u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f411815v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f411816w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cd1 f411817x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cd1 f411818y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411802f = new java.util.ArrayList();
        this.f411805i = jz5.h.b(new sr2.i2(activity));
        this.f411806m = jz5.h.b(sr2.v1.f411738d);
        this.f411807n = jz5.h.b(sr2.x2.f411795d);
        this.f411808o = jz5.h.b(new sr2.u1(this, activity));
        this.f411810q = jz5.h.b(sr2.t1.f411721d);
        this.f411813t = "";
        this.f411815v = jz5.h.a(jz5.i.f302831f, new sr2.r1(this));
    }

    public final void O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (!(activity instanceof androidx.lifecycle.y)) {
            activity = null;
        }
        if (activity == null) {
            return;
        }
        db2.r rVar = new db2.r(xy2.c.e(getActivity()), 1, 1, xy2.c.d(getActivity()));
        rVar.t(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.f490604zq), 500L);
        rVar.l().I(activity).K(new sr2.s1(this));
    }

    public final boolean P6() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            int checkSelfPermission = b3.l.checkSelfPermission(getContext(), "android.permission.ACCESS_MEDIA_LOCATION");
            com.tencent.mars.xlog.Log.i("PostLocationUIC", "checkMediaPermission selfPermission:" + checkSelfPermission);
            return checkSelfPermission == 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("PostLocationUIC", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final jz5.l Q6() {
        return (jz5.l) ((jz5.n) this.f411810q).getValue();
    }

    public final boolean R6() {
        return ((java.lang.Boolean) ((jz5.n) this.f411808o).getValue()).booleanValue();
    }

    public final void S6(boolean z17) {
        r45.gd1 gd1Var = new r45.gd1();
        gd1Var.set(0, java.lang.Float.valueOf(((java.lang.Number) Q6().f302833d).floatValue()));
        gd1Var.set(1, java.lang.Float.valueOf(((java.lang.Number) Q6().f302834e).floatValue()));
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderLbsList] disallow materialLocation, materialLocation:[");
            r45.gd1 gd1Var2 = this.f411811r;
            sb6.append(gd1Var2 != null ? java.lang.Float.valueOf(gd1Var2.getFloat(0)) : null);
            sb6.append(',');
            r45.gd1 gd1Var3 = this.f411811r;
            sb6.append(gd1Var3 != null ? java.lang.Float.valueOf(gd1Var3.getFloat(1)) : null);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("PostLocationUIC", sb6.toString());
            this.f411811r = null;
        }
        db2.i1.f228015t.a("", gd1Var, null, this.f411811r, null, false, 0, new sr2.x1(this, gd1Var));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[getFinderLbsList] useMaterialLocation:");
        sb7.append(z17);
        sb7.append(" curLocation:[");
        sb7.append(gd1Var.getFloat(0));
        sb7.append(',');
        sb7.append(gd1Var.getFloat(1));
        sb7.append("] materialLocation:[");
        r45.gd1 gd1Var4 = this.f411811r;
        sb7.append(gd1Var4 != null ? java.lang.Float.valueOf(gd1Var4.getFloat(0)) : null);
        sb7.append(',');
        r45.gd1 gd1Var5 = this.f411811r;
        sb7.append(gd1Var5 != null ? java.lang.Float.valueOf(gd1Var5.getFloat(1)) : null);
        sb7.append(']');
        com.tencent.mars.xlog.Log.i("PostLocationUIC", sb7.toString());
        pm0.v.X(new sr2.y1(this));
    }

    public final boolean T6() {
        ya2.p1 p1Var = this.f411800d;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
        r45.ze2 ze2Var = ((yv2.b) p1Var).f466202h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var != null ? ze2Var.getString(3) : null)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var != null ? ze2Var.getString(2) : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean U6() {
        if (!((java.lang.Boolean) ((jz5.n) this.f411806m).getValue()).booleanValue()) {
            return false;
        }
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(getActivity()), false, 2, null);
        return ((j37 != null ? j37.u0().getInteger(41) : 0) & 2) != 0;
    }

    public final boolean V6() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.W).getValue()).r()).booleanValue();
    }

    public final boolean W6() {
        return 1 == ((java.lang.Number) this.f411815v.getValue()).intValue();
    }

    public final boolean X6() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_STORE_PROMOTE_DIALOG_SHOW_COUNT_INT_SYNC, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isShowLimitOk] showCount:");
        sb6.append(r17);
        sb6.append(" showLimit:");
        jz5.g gVar = this.f411807n;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        com.tencent.mars.xlog.Log.i("PostLocationUIC", sb6.toString());
        return r17 < ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
    }

    public final void Y6(android.content.Intent intent) {
        if (intent != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f411801e;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("lbsRecyclerView");
                throw null;
            }
            wxRecyclerView.setVisibility(8);
            ya2.p1 p1Var = this.f411800d;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            yv2.b bVar = (yv2.b) p1Var;
            android.content.Intent intent2 = bVar.f466204m;
            if (intent2 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent2.putExtra("saveLocation", true);
            android.content.Intent intent3 = bVar.f466204m;
            if (intent3 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent3.putExtra("get_poi_name", stringExtra);
            android.content.Intent intent4 = bVar.f466204m;
            if (intent4 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            intent4.putExtra("get_city", stringExtra2);
            android.content.Intent intent5 = bVar.f466204m;
            if (intent5 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent5.putExtra("get_lat", intent.getFloatExtra("get_lat", 0.0f));
            android.content.Intent intent6 = bVar.f466204m;
            if (intent6 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent6.putExtra("get_lng", intent.getFloatExtra("get_lng", 0.0f));
            android.content.Intent intent7 = bVar.f466204m;
            if (intent7 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            intent7.putExtra("get_poi_address", stringExtra3);
            android.content.Intent intent8 = bVar.f466204m;
            if (intent8 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            intent8.putExtra("get_poi_classify_id", stringExtra4);
            android.content.Intent intent9 = bVar.f466204m;
            if (intent9 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent9.putExtra("key_is_multi_store_promotion", intent.getBooleanExtra("key_is_multi_store_promotion", false));
            android.content.Intent intent10 = bVar.f466204m;
            if (intent10 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String stringExtra5 = intent.getStringExtra("key_product_id");
            intent10.putExtra("key_product_id", stringExtra5 != null ? stringExtra5 : "");
            ya2.p1 p1Var2 = this.f411800d;
            if (p1Var2 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var2).d(false);
            if (W6()) {
                this.f411816w = true;
            }
            ya2.p1 p1Var3 = this.f411800d;
            if (p1Var3 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            r45.ze2 ze2Var = ((yv2.b) p1Var3).f466202h;
            if (ze2Var != null) {
                this.f411814u = intent.getBooleanExtra("key_is_from_media", false);
                if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(3)) && com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(2))) {
                    com.tencent.mm.plugin.finder.report.p2.X(com.tencent.mm.plugin.finder.report.p2.f125237a, 3, ze2Var, 0, 4, null);
                } else {
                    com.tencent.mm.plugin.finder.report.p2.X(com.tencent.mm.plugin.finder.report.p2.f125237a, intent.getBooleanExtra("get_poi_is_search", false) ? 4 : 2, ze2Var, 0, 4, null);
                }
            }
        }
    }

    public final void Z6() {
        android.content.Intent intent = new android.content.Intent();
        ya2.p1 p1Var = this.f411800d;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
        r45.ze2 ze2Var = ((yv2.b) p1Var).f466202h;
        if (ze2Var != null) {
            intent.putExtra("key_location", ze2Var.toByteArray());
        }
        r45.gd1 gd1Var = this.f411811r;
        if (gd1Var != null) {
            r45.ze2 ze2Var2 = new r45.ze2();
            ze2Var2.set(0, java.lang.Float.valueOf(gd1Var.getFloat(0)));
            ze2Var2.set(1, java.lang.Float.valueOf(gd1Var.getFloat(1)));
            intent.putExtra("key_material_location", ze2Var2.toByteArray());
        }
        intent.putExtra("key_enable_store_promotion", U6());
        intent.putExtra("key_is_from_media", this.f411814u);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        i0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = context;
        cVar.d(intent);
        cVar.a("com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI");
        cVar.h(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
    }

    public final void a7(android.view.View view, java.lang.String str, int i17) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        cy1.a aVar2 = (cy1.a) aVar.ik(view, i17, 25496);
        aVar2.Tj(view, i17, 1, false);
        aVar2.Ai(view, new sr2.j2(view, str, this));
    }

    public final void b7() {
        ya2.p1 p1Var = this.f411800d;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
        if (((yv2.b) p1Var).f466202h != null) {
            return;
        }
        boolean N6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).N6();
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227163n);
        java.util.ArrayList arrayList = this.f411802f;
        int i17 = 1;
        if (N6 && Ri) {
            i17 = true ^ arrayList.isEmpty() ? 2 : 0;
        }
        com.tencent.mars.xlog.Log.i("PostLocationUIC", "[updateSubLbsFlag] subLbsFlag:" + i17 + " hasPermission:" + N6 + " hasBusinessPermission:" + Ri + " lbsList.size:" + arrayList.size());
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null) {
            return;
        }
        finderFeedReportObject.setSubLbsFlag(i17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == 1001) {
            this.f411809p = P6();
            com.tencent.mars.xlog.Log.i("PostLocationUIC", "[onRequestPermissionsResult] hasMediaLocationPermission:" + this.f411809p);
        }
    }
}
