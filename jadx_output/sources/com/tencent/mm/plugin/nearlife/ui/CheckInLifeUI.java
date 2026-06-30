package com.tencent.mm.plugin.nearlife.ui;

@db5.a(8192)
/* loaded from: classes15.dex */
public class CheckInLifeUI extends com.tencent.mm.plugin.nearlife.ui.BaseLifeUI {
    public com.tencent.mm.plugin.nearlife.ui.k V;
    public com.tencent.mm.plugin.nearlife.ui.k W;
    public java.util.ArrayList X;

    /* renamed from: x0, reason: collision with root package name */
    public r45.c64 f152254x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f152256y0;
    public u60.f Y = null;
    public java.lang.String Z = "";

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f152252p0 = "";

    /* renamed from: l1, reason: collision with root package name */
    public boolean f152251l1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f152253p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f152255x1 = true;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f152257y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public final android.view.View.OnClickListener f152258z1 = new com.tencent.mm.plugin.nearlife.ui.m(this);
    public final android.view.View.OnClickListener A1 = new com.tencent.mm.plugin.nearlife.ui.n(this);
    public final u60.e B1 = new com.tencent.mm.plugin.nearlife.ui.o(this);

    public static void f7(com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI checkInLifeUI, android.view.View view, boolean z17) {
        com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData;
        int h17;
        checkInLifeUI.getClass();
        if (view.getTag() instanceof com.tencent.mm.plugin.nearlife.ui.l) {
            com.tencent.mm.plugin.nearlife.ui.l lVar = (com.tencent.mm.plugin.nearlife.ui.l) view.getTag();
            dn3.i iVar = lVar.f152332b;
            android.content.Intent intent = new android.content.Intent();
            try {
                intent.putExtra("get_poi_item_buf", iVar.f242014i.toByteArray());
                intent.putExtra("location_ctx", iVar.f242011f.f371841f.f192156a);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CheckInLifeUI", e17, "", new java.lang.Object[0]);
            }
            if (z17) {
                com.tencent.mm.plugin.nearlife.ui.k kVar = checkInLifeUI.W;
                java.lang.String str = lVar.f152338h;
                java.util.HashMap hashMap = (java.util.HashMap) kVar.f152307o;
                backwardSupportUtil$ExifHelper$LatLongData = hashMap.containsKey(str) ? (com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) hashMap.get(str) : null;
                h17 = checkInLifeUI.W.h(lVar.f152338h);
                checkInLifeUI.Z6(h17, true, lVar.f152338h, checkInLifeUI.f152251l1);
            } else {
                com.tencent.mm.plugin.nearlife.ui.k kVar2 = checkInLifeUI.V;
                java.lang.String str2 = lVar.f152338h;
                java.util.HashMap hashMap2 = (java.util.HashMap) kVar2.f152307o;
                backwardSupportUtil$ExifHelper$LatLongData = hashMap2.containsKey(str2) ? (com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) hashMap2.get(str2) : null;
                h17 = checkInLifeUI.V.h(lVar.f152338h);
                checkInLifeUI.Z6(h17, false, lVar.f152338h, checkInLifeUI.f152251l1);
            }
            intent.putExtra("report_index", h17);
            intent.putExtra("first_start_time", checkInLifeUI.f152250z);
            intent.putExtra("lastSuccStamp", checkInLifeUI.B);
            intent.putExtra("firstSuccStamp", checkInLifeUI.A);
            intent.putExtra("reqLoadCnt", checkInLifeUI.C);
            intent.putExtra("entry_time", checkInLifeUI.P);
            intent.putExtra("search_id", iVar.f242006a);
            intent.putExtra("request_id", iVar.f242013h);
            if (backwardSupportUtil$ExifHelper$LatLongData == null) {
                r45.d64 d64Var = checkInLifeUI.f152244t;
                backwardSupportUtil$ExifHelper$LatLongData = d64Var == null ? new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(-85.0f, -1000.0f) : new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(d64Var.f372175e, d64Var.f372174d);
            }
            int i17 = iVar.f242010e;
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckInLifeUI", "lbs.Type %d", java.lang.Integer.valueOf(i17));
            int i18 = lVar.f152331a;
            if (i18 == 0) {
                intent.putExtra("get_poi_data_type", 2);
                intent.putExtra("get_lat", backwardSupportUtil$ExifHelper$LatLongData.f192409d);
                intent.putExtra("get_lng", backwardSupportUtil$ExifHelper$LatLongData.f192410e);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(checkInLifeUI.Z)) {
                    intent.putExtra("get_city", checkInLifeUI.Z);
                }
                intent.putExtra("get_poi_classify_type", i17);
                intent.putExtra("get_poi_address", com.tencent.mm.plugin.nearlife.ui.a.f(iVar.f242009d));
                intent.putExtra("get_poi_classify_id", iVar.f242007b);
                intent.putExtra("get_poi_name", iVar.f242008c);
                intent.putExtra("get_poi_showflag", iVar.f242012g);
                intent.putExtra("get_poi_city", iVar.f242017l);
            } else if (i18 == 1) {
                intent.putExtra("get_poi_data_type", 1);
                intent.putExtra("get_lat", backwardSupportUtil$ExifHelper$LatLongData.f192409d);
                intent.putExtra("get_lng", backwardSupportUtil$ExifHelper$LatLongData.f192410e);
                intent.putExtra("get_city", iVar.f242008c);
                intent.putExtra("get_poi_city", iVar.f242008c);
                intent.putExtra("get_ad_code", iVar.f242019n);
            } else if (i18 == 2) {
                intent.putExtra("get_poi_data_type", 0);
            }
            intent.putExtra("get_cur_lat", checkInLifeUI.f152245u);
            intent.putExtra("get_cur_lng", checkInLifeUI.f152246v);
            intent.putExtra("get_accuracy", checkInLifeUI.f152248x);
            intent.putExtra("get_loctype", checkInLifeUI.f152247w);
            intent.putExtra("get_is_mars", checkInLifeUI.f152249y);
            intent.putExtra("get_poi_is_search", z17);
            checkInLifeUI.setResult(-1, intent);
            checkInLifeUI.finish();
        }
        checkInLifeUI.hideVKB();
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
    public boolean V6() {
        return getIntent().getBooleanExtra("can_show_create_poi_tips", true);
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
    public com.tencent.mm.plugin.nearlife.ui.a X6() {
        if (this.X == null) {
            this.X = g7(getIntent().getStringArrayListExtra("lat_long_list"));
        }
        if (getIntent().getStringExtra("select_radio_icon_color") != null) {
            this.f152256y0 = getIntent().getStringExtra("select_radio_icon_color");
        }
        if (getIntent().getStringExtra("select_radio_icon_color") != null && getIntent().getStringExtra("get_poi_from_scene").equals("story")) {
            this.f152251l1 = true;
            this.f152230J = true;
        }
        com.tencent.mm.plugin.nearlife.ui.k kVar = this.V;
        if (kVar != null) {
            return kVar;
        }
        this.V = new com.tencent.mm.plugin.nearlife.ui.k(this, this.f152258z1, "viewlist", this.Q, false, this.f152256y0, this.f152253p1);
        java.util.ArrayList arrayList = this.X;
        if (arrayList != null && arrayList.size() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = this.X;
            arrayList2.add((com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) arrayList3.get(arrayList3.size() - 1));
            com.tencent.mm.plugin.nearlife.ui.k kVar2 = this.V;
            kVar2.f152304i = arrayList2;
            kVar2.f152309q = false;
        }
        return this.V;
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
    public com.tencent.mm.plugin.nearlife.ui.a Y6() {
        if (this.X == null) {
            this.X = g7(getIntent().getStringArrayListExtra("lat_long_list"));
        }
        com.tencent.mm.plugin.nearlife.ui.k kVar = this.W;
        if (kVar != null) {
            return kVar;
        }
        com.tencent.mm.plugin.nearlife.ui.k kVar2 = new com.tencent.mm.plugin.nearlife.ui.k(this, this.A1, "searchlist", this.Q, true, this.f152256y0, this.f152253p1);
        this.W = kVar2;
        java.util.ArrayList arrayList = this.X;
        if (arrayList != null) {
            kVar2.f152304i = arrayList;
        }
        com.tencent.mm.plugin.nearlife.ui.k kVar3 = this.W;
        kVar3.f152309q = true;
        return kVar3;
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
    public void a7(double d17, double d18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckInLifeUI", "checkinLife got address %f %f", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18));
        if (this.Y == null || !com.tencent.mm.sdk.platformtools.t8.K0(this.Z)) {
            return;
        }
        u60.h hVar = new u60.h(d17, d18);
        ((i11.g) this.Y).b(hVar, this.B1);
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
    public void b7(double d17, double d18) {
        if (this.f152257y1) {
            double[] dArr = {d17, d18};
            double[] dArr2 = new double[2];
            com.tencent.map.geolocation.sapp.TencentLocationUtils.wgs84ToGcj02(dArr, dArr2);
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckInLifeUI", "onSelfLatLng: wgs[%f,%f] -> gcj[%f,%f]", java.lang.Double.valueOf(dArr[0]), java.lang.Double.valueOf(dArr[1]), java.lang.Double.valueOf(dArr2[0]), java.lang.Double.valueOf(dArr2[1]));
            double d19 = dArr2[0];
            double d27 = dArr2[1];
            this.V.m(d19, d27);
            this.W.m(d19, d27);
        }
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
    public void c7() {
        super.c7();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g7(java.util.ArrayList r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L60
            int r0 = r6.size()
            if (r0 != 0) goto L9
            goto L60
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "\n"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 2
            if (r3 == r2) goto L29
            goto L12
        L29:
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r2 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData     // Catch: java.lang.NumberFormatException -> L12
            r3 = 0
            r3 = r1[r3]     // Catch: java.lang.NumberFormatException -> L12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L12
            float r3 = r3.floatValue()     // Catch: java.lang.NumberFormatException -> L12
            r4 = 1
            r1 = r1[r4]     // Catch: java.lang.NumberFormatException -> L12
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L12
            float r1 = r1.floatValue()     // Catch: java.lang.NumberFormatException -> L12
            r2.<init>(r3, r1)     // Catch: java.lang.NumberFormatException -> L12
            r0.add(r2)     // Catch: java.lang.NumberFormatException -> L12
            goto L12
        L48:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "parse list end, size: "
            r6.<init>(r1)
            int r1 = r0.size()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "MicroMsg.CheckInLifeUI"
            com.tencent.mars.xlog.Log.i(r1, r6)
            return r0
        L60:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI.g7(java.util.ArrayList):java.util.ArrayList");
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c5y;
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f152253p1 = getIntent().getBooleanExtra("is_force_dark_mode", false);
        this.f152255x1 = getIntent().getBooleanExtra("show_city", true);
        this.f152257y1 = getIntent().getBooleanExtra("show_distance", false);
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.h5n);
        this.Y = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
        this.f152254x0 = new r45.c64();
        this.f152252p0 = getIntent().getStringExtra("get_poi_classify_id");
        try {
            r45.c64 c64Var = (r45.c64) this.f152254x0.parseFrom(getIntent().getByteArrayExtra("get_poi_item_buf"));
            this.f152254x0 = c64Var;
            if (c64Var != null) {
                this.f152252p0 = c64Var.f371310d;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CheckInLifeUI", e17, "", new java.lang.Object[0]);
            this.f152254x0 = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f152252p0)) {
            this.Z = getIntent().getStringExtra("get_city");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Z) && this.f152255x1) {
            this.f152252p0 = this.V.l(this.Z, "", "").f242007b;
        }
        this.V.f152325v = this.f152252p0;
        r45.c64 c64Var2 = this.f152254x0;
        if (c64Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(c64Var2.f371310d)) {
            com.tencent.mm.plugin.nearlife.ui.k kVar = this.V;
            dn3.i iVar = new dn3.i("", this.f152254x0);
            if (kVar.f152324u == null) {
                kVar.a(iVar, 1);
            } else {
                kVar.a(iVar, 2);
            }
        }
        if (this.f152253p1) {
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478861j7));
            setBackBtnColorFilter(com.tencent.mm.R.color.f478553an);
            setMMTitleColor(com.tencent.mm.R.color.f478553an);
            this.f152231d.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
            setIsDarkActionbarBg(true);
            this.H.f210327l = true;
        }
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u60.f fVar = this.Y;
        if (fVar != null) {
            ((i11.g) fVar).c(this.B1);
        }
        dx1.g.f244489a.j("SnsPublishProcess", "poiPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.nearlife.ui.BaseLifeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
