package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class LocationWidget extends android.widget.LinearLayout {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f166329J = 0;
    public float A;
    public float B;
    public float C;
    public int D;
    public final i11.e E;
    public com.tencent.mm.plugin.sns.ui.f5 F;
    public java.lang.String G;
    public final i11.c H;
    public com.tencent.mm.plugin.sns.ui.g5 I;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f166330d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f166331e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f166332f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f166333g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView[] f166334h;

    /* renamed from: i, reason: collision with root package name */
    public int f166335i;

    /* renamed from: m, reason: collision with root package name */
    public int f166336m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f166337n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f166338o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f166339p;

    /* renamed from: q, reason: collision with root package name */
    public float f166340q;

    /* renamed from: r, reason: collision with root package name */
    public float f166341r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f166342s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f166343t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f166344u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f166345v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f166346w;

    /* renamed from: x, reason: collision with root package name */
    public int f166347x;

    /* renamed from: y, reason: collision with root package name */
    public r45.c64 f166348y;

    /* renamed from: z, reason: collision with root package name */
    public int f166349z;

    public LocationWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166333g = new int[]{com.tencent.mm.R.id.mav, com.tencent.mm.R.id.maw, com.tencent.mm.R.id.max, com.tencent.mm.R.id.maz, com.tencent.mm.R.id.f486736mb0};
        this.f166334h = new android.widget.ImageView[5];
        this.f166340q = -1000.0f;
        this.f166341r = -1000.0f;
        this.f166347x = 0;
        this.f166348y = null;
        this.f166349z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = -1;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.E = i11.h.e();
        this.F = null;
        this.H = new com.tencent.mm.plugin.sns.ui.e5(this);
        this.I = null;
        c((com.tencent.mm.ui.MMActivity) context);
    }

    public static /* synthetic */ android.app.Activity a(com.tencent.mm.plugin.sns.ui.LocationWidget locationWidget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        android.app.Activity activity = locationWidget.f166330d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return activity;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickAfterPermission", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("near_life_scene", 1);
        try {
            r45.c64 c64Var = this.f166348y;
            if (c64Var != null) {
                intent.putExtra("get_poi_item_buf", c64Var.toByteArray());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LocationWidget", e17, "", new java.lang.Object[0]);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166346w)) {
            intent.putExtra("get_poi_classify_id", this.f166346w);
        }
        intent.putExtra("get_lat", this.f166340q);
        intent.putExtra("get_lng", this.f166341r);
        intent.putExtra("request_id", this.G);
        intent.putExtra("show_distance", true);
        com.tencent.mm.plugin.sns.ui.f5 f5Var = this.F;
        if (f5Var != null) {
            com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = (com.tencent.mm.plugin.sns.ui.SnsUploadUI) f5Var;
            snsUploadUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.tencent.mm.plugin.sns.ui.z4 z4Var = snsUploadUI.f167536u;
            if (z4Var instanceof com.tencent.mm.plugin.sns.ui.p7) {
                com.tencent.mm.plugin.sns.ui.p7 p7Var = (com.tencent.mm.plugin.sns.ui.p7) z4Var;
                p7Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.PicWidget");
                java.util.ArrayList d17 = p7Var.f170164g.d();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = d17.iterator();
                while (it.hasNext()) {
                    fp.n nVar = (fp.n) ((java.util.HashMap) p7Var.f170167j).get((java.lang.String) it.next());
                    if (nVar != null) {
                        arrayList.add(nVar);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.PicWidget");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else if (z4Var instanceof de4.a) {
                de4.a aVar = (de4.a) z4Var;
                aVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
                ee4.b1 b1Var = (ee4.b1) aVar.k(ee4.b1.class);
                b1Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                java.util.List d18 = b1Var.f251678n.d();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) d18).iterator();
                while (it6.hasNext()) {
                    fp.n nVar2 = (fp.n) b1Var.f251679o.get((java.lang.String) it6.next());
                    if (nVar2 != null) {
                        arrayList2.add(nVar2);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            }
        }
        j45.l.n(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 10);
        com.tencent.mm.plugin.report.service.b1.f(12, 10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickAfterPermission", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public final void c(com.tencent.mm.ui.MMActivity mMActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.f166330d = mMActivity;
        android.view.View inflate = android.view.View.inflate(mMActivity, getLayoutResource(), this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485690in5);
        this.f166331e = findViewById;
        this.f166337n = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.inx);
        this.f166338o = (android.widget.TextView) this.f166331e.findViewById(com.tencent.mm.R.id.inm);
        this.f166339p = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f166331e.findViewById(com.tencent.mm.R.id.inc);
        this.f166332f = inflate.findViewById(com.tencent.mm.R.id.mat);
        for (int i17 = 0; i17 < 5; i17++) {
            android.widget.ImageView imageView = (android.widget.ImageView) this.f166332f.findViewById(this.f166333g[i17]);
            android.widget.ImageView[] imageViewArr = this.f166334h;
            imageViewArr[i17] = imageView;
            imageViewArr[i17].setOnClickListener(new com.tencent.mm.plugin.sns.ui.c5(this, i17));
        }
        inflate.setOnClickListener(new com.tencent.mm.plugin.sns.ui.d5(this));
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("kpoi_id");
        this.f166346w = stringExtra;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f166340q = mMActivity.getIntent().getFloatExtra("k_lat", -1000.0f);
            this.f166341r = mMActivity.getIntent().getFloatExtra("k_lng", -1000.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationWidget", "init: classifyId:%s, lat:%f, lng:%f", this.f166346w, java.lang.Float.valueOf(this.f166340q), java.lang.Float.valueOf(this.f166341r));
            this.f166344u = mMActivity.getIntent().getStringExtra("kpoi_name");
            this.f166343t = mMActivity.getIntent().getStringExtra("Kpoi_address");
            e();
        }
        if (gm0.j1.b().m()) {
            this.f166336m = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPostPOICommentSwitch"), 0);
        } else {
            this.f166336m = 0;
        }
        f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public boolean d(int i17, int i18, android.content.Intent intent) {
        ox.e0 e0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (intent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            return true;
        }
        this.f166347x = intent.getIntExtra("get_poi_classify_type", 0);
        this.f166349z = intent.getIntExtra("get_poi_showflag", 0);
        java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!stringExtra.isEmpty()) {
            this.f166344u = stringExtra;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("get_poi_city");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f166345v = stringExtra2;
        float floatExtra = intent.getFloatExtra("get_lat", -1000.0f);
        if (floatExtra != -1000.0f) {
            this.f166340q = floatExtra;
        }
        float floatExtra2 = intent.getFloatExtra("get_lng", -1000.0f);
        if (floatExtra2 != -1000.0f) {
            this.f166341r = floatExtra2;
        }
        this.A = intent.getFloatExtra("get_cur_lat", 0.0f);
        this.B = intent.getFloatExtra("get_cur_lng", 0.0f);
        this.D = intent.getIntExtra("get_loctype", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationWidget", "onActivityResult: lat:%f lng:%f curlat:%f curlng:%f", java.lang.Float.valueOf(this.f166340q), java.lang.Float.valueOf(this.f166341r), java.lang.Float.valueOf(this.A), java.lang.Float.valueOf(this.B));
        this.C = intent.getFloatExtra("get_accuracy", 0.0f);
        intent.getBooleanExtra("get_is_mars", true);
        this.G = intent.getStringExtra("request_id");
        this.f166342s = intent.getByteArrayExtra("location_ctx");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166344u)) {
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            if (!stringExtra3.isEmpty()) {
                this.f166343t = stringExtra3;
            }
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            if (!stringExtra4.isEmpty()) {
                this.f166346w = stringExtra4;
            }
            r45.c64 c64Var = new r45.c64();
            this.f166348y = c64Var;
            double d17 = this.f166340q;
            double d18 = this.f166341r;
            try {
                r45.c64 c64Var2 = (r45.c64) c64Var.parseFrom(intent.getByteArrayExtra("get_poi_item_buf"));
                this.f166348y = c64Var2;
                d17 = c64Var2.f371329z;
                d18 = c64Var2.f371328y;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LocationWidget", e17, "", new java.lang.Object[0]);
                this.f166348y = null;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166346w)) {
                r45.c64 c64Var3 = new r45.c64();
                this.f166348y = c64Var3;
                c64Var3.f371310d = this.f166346w;
                c64Var3.f371319p = this.f166347x;
                c64Var3.f371311e = this.f166344u;
                c64Var3.A = this.f166345v;
                c64Var3.f371329z = d17;
                c64Var3.f371328y = d18;
                java.util.LinkedList linkedList = c64Var3.f371316m;
                r45.du5 du5Var = new r45.du5();
                du5Var.f372756d = this.f166343t;
                du5Var.f372757e = true;
                linkedList.add(du5Var);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166345v)) {
            this.f166340q = -1000.0f;
            this.f166341r = -1000.0f;
            this.f166344u = "";
            this.f166343t = "";
            this.f166345v = "";
            this.f166346w = "";
            this.f166348y = null;
        } else {
            this.f166344u = "";
            this.f166343t = "";
            this.f166346w = "";
            this.f166348y = null;
        }
        java.lang.String str = this.f166344u;
        wa4.l lVar = wa4.l.f444255a;
        java.lang.String str2 = this.f166346w;
        float f17 = this.f166340q;
        float f18 = this.f166341r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToPreloadPoiBizSource", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPoiPostBizToFeedPageExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPoiPostBizToFeedPageExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        if (wa4.l.f444256b && lVar.a(str2, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsBizPostManager", "checkIsNeedToPreloadPoiBizSource >> isPoiValid");
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            kotlin.jvm.internal.o.d(str2);
            kotlin.jvm.internal.o.d(str);
            ((ox.g) oVar).getClass();
            i95.m c17 = i95.n0.c(ox.e0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ox.e0 e0Var2 = (ox.e0) c17;
            e0Var2.f349466g = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo, poiId=" + str2 + ", poiName=" + str + ", poiLatitude=" + f17 + ", poiLongitude=" + f18 + ", mpPublished=false");
            if (str2.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo, poiId is empty");
            } else {
                ox.h0 h0Var = (ox.h0) i95.n0.c(ox.h0.class);
                h0Var.getClass();
                if (str2.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizSnsPublishMonitor", "recordRequestStart: poiId is empty");
                    e0Var = e0Var2;
                } else {
                    e0Var = e0Var2;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    h0Var.f349483d.put(str2, java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishMonitor", "recordRequestStart: poiId=" + str2 + ", startTime=" + currentTimeMillis);
                }
                r45.aj3 aj3Var = new r45.aj3();
                r45.zp4 zp4Var = new r45.zp4();
                zp4Var.f392273d = str2;
                zp4Var.f392274e = str;
                zp4Var.f392275f = f17;
                zp4Var.f392276g = f18;
                aj3Var.f370050d = zp4Var;
                aj3Var.f370051e = false;
                com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
                lVar2.f70667d = 26723;
                lVar2.f70666c = "/cgi-bin/mmbiz-bin/appmsg/getmomentpoiinfo";
                lVar2.f70664a = aj3Var;
                lVar2.f70665b = new r45.bj3();
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar2.a(), new ox.c0(e0Var, str2));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPoiPreload", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej("sns_location_request_svr", new java.util.LinkedHashMap(), 36244);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPoiPreload", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToPreloadPoiBizSource", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        e();
        f();
        com.tencent.mm.plugin.sns.ui.g5 g5Var = new com.tencent.mm.plugin.sns.ui.g5(this);
        this.I = g5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feed", "com.tencent.mm.plugin.sns.ui.LocationWidget$ReportInfo");
        g5Var.f168401a = intent.getIntExtra("report_index", -1);
        g5Var.f168402b = intent.getLongExtra("first_start_time", 0L);
        g5Var.f168403c = intent.getLongExtra("lastSuccStamp", 0L);
        g5Var.f168404d = intent.getLongExtra("firstSuccStamp", 0L);
        g5Var.f168405e = intent.getIntExtra("reqLoadCnt", 0);
        g5Var.f168406f = intent.getIntExtra("entry_time", 0);
        g5Var.f168407g = intent.getStringExtra("search_id");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.ui.LocationWidget$ReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return true;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePoiName", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (this.f166337n != null && this.f166338o != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166344u)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166345v)) {
                    this.f166337n.setText(this.f166344u);
                } else {
                    this.f166337n.setText(this.f166345v + "\u2006·\u2006" + this.f166344u);
                }
                this.f166337n.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
                this.f166338o.setVisibility(8);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166345v)) {
                this.f166337n.setText(com.tencent.mm.R.string.jce);
                this.f166337n.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                this.f166338o.setVisibility(8);
            } else {
                this.f166337n.setText(this.f166345v);
                this.f166337n.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
                this.f166338o.setVisibility(8);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166344u) && com.tencent.mm.sdk.platformtools.t8.K0(this.f166345v)) {
            this.f166339p.s(com.tencent.mm.R.raw.album_location_icon_normal, com.tencent.mm.R.color.f479265ui);
        } else {
            this.f166339p.s(com.tencent.mm.R.raw.album_location_icon_pressed, com.tencent.mm.R.color.aaq);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePoiName", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public final void f() {
        int i17;
        android.widget.ImageView[] imageViewArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationWidget", "updateScoreItem scoreSwtich:%d, classifyId:%s, poiClassifyType:%d, showFlag:%d, isOverSea:%b", java.lang.Integer.valueOf(this.f166336m), this.f166346w, java.lang.Integer.valueOf(this.f166347x), java.lang.Integer.valueOf(this.f166349z), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.u9.a()));
        int i18 = 0;
        if (com.tencent.mm.sdk.platformtools.u9.a() || this.f166336m == 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f166346w) || this.f166347x == 1 || (this.f166349z & 1) == 0) {
            android.view.View view = this.f166332f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            return;
        }
        android.view.View view2 = this.f166332f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        while (true) {
            i17 = this.f166335i;
            imageViewArr = this.f166334h;
            if (i18 >= i17) {
                break;
            }
            imageViewArr[i18].setImageResource(getSelectedStarImageResource());
            i18++;
        }
        while (i17 < 5) {
            imageViewArr[i17].setImageResource(getNormalStarImageResource());
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public r45.ed4 getCurLocation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        r45.ed4 ed4Var = new r45.ed4();
        ed4Var.f373312e = this.A;
        ed4Var.f373311d = this.B;
        ed4Var.f373322r = this.C;
        ed4Var.f373321q = this.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return ed4Var;
    }

    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.tencent.mm.R.layout.bss;
    }

    public r45.ed4 getLocation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        r45.ed4 ed4Var = new r45.ed4();
        ed4Var.f373312e = this.f166340q;
        ed4Var.f373311d = this.f166341r;
        ed4Var.f373320p = 0;
        ed4Var.f373324t = this.f166335i;
        if (this.f166342s != null) {
            ed4Var.f373323s = new com.tencent.mm.protobuf.g(this.f166342s);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166344u)) {
            ed4Var.f373315h = this.f166343t;
            ed4Var.f373314g = this.f166344u;
            ed4Var.f373316i = this.f166346w;
            ed4Var.f373313f = this.f166345v;
            int i17 = this.f166347x;
            if (i17 == 0) {
                ed4Var.f373317m = 1;
            } else if (i17 == 1) {
                ed4Var.f373317m = 2;
            } else {
                ed4Var.f373317m = 1;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166345v)) {
            ed4Var.f373313f = this.f166345v;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (this.I == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        } else {
            java.lang.String format = java.lang.String.format("%f/%f", java.lang.Float.valueOf(ed4Var.f373312e), java.lang.Float.valueOf(ed4Var.f373311d));
            new java.lang.StringBuilder("index ").append(this.I.f168401a);
            new java.lang.StringBuilder("firstStartStamp ").append(this.I.f168402b);
            new java.lang.StringBuilder("lastSuccStamp ").append(this.I.f168404d);
            new java.lang.StringBuilder("firstSuccStamp ").append(this.I.f168403c);
            new java.lang.StringBuilder("reqLoadCnt ").append(this.I.f168405e);
            new java.lang.StringBuilder("classifyId ").append(this.f166346w);
            new java.lang.StringBuilder("entryTime ").append(this.I.f168406f);
            new java.lang.StringBuilder("searchId").append(this.I.f168407g);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11135, 5, java.lang.Integer.valueOf(this.I.f168401a + 1), java.lang.Long.valueOf(this.I.f168402b), java.lang.Long.valueOf(this.I.f168404d), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(this.I.f168403c), java.lang.Integer.valueOf(this.I.f168405e), format, this.f166346w, java.lang.Integer.valueOf(this.I.f168406f), this.I.f168407g, wo.w0.g(true));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationWidget", "getLocation: lat:%f lng:%f", java.lang.Float.valueOf(this.f166340q), java.lang.Float.valueOf(this.f166341r));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return ed4Var;
    }

    public int getNormalStarImageResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.tencent.mm.R.raw.sns_shoot_star_normal;
    }

    public int getNormalStateImageResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.tencent.mm.R.raw.album_location_icon_normal;
    }

    public int getSelectedStarImageResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.tencent.mm.R.raw.sns_shoot_star_selected;
    }

    public int getSelectedStateImageResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.tencent.mm.R.raw.album_location_icon_pressed;
    }

    public int getShowFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowFlag", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        int i17 = this.f166349z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowFlag", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return i17;
    }

    public void setLocationWidgetListener(com.tencent.mm.plugin.sns.ui.f5 f5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocationWidgetListener", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.F = f5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocationWidgetListener", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public LocationWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166333g = new int[]{com.tencent.mm.R.id.mav, com.tencent.mm.R.id.maw, com.tencent.mm.R.id.max, com.tencent.mm.R.id.maz, com.tencent.mm.R.id.f486736mb0};
        this.f166334h = new android.widget.ImageView[5];
        this.f166340q = -1000.0f;
        this.f166341r = -1000.0f;
        this.f166347x = 0;
        this.f166348y = null;
        this.f166349z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = -1;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.E = i11.h.e();
        this.F = null;
        this.H = new com.tencent.mm.plugin.sns.ui.e5(this);
        this.I = null;
        c((com.tencent.mm.ui.MMActivity) context);
    }
}
