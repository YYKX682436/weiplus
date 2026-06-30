package e04;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.modelbase.u0, e04.k {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f245897d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f245898e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f245899f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f245900g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f245901h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f245902i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f245903m;

    /* renamed from: n, reason: collision with root package name */
    public int f245904n;

    /* renamed from: o, reason: collision with root package name */
    public int f245905o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f245906p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f245907q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f245908r;

    /* renamed from: s, reason: collision with root package name */
    public rz3.e f245909s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.s f245910t;

    /* renamed from: u, reason: collision with root package name */
    public wu5.c f245911u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.TimerTask f245912v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f245913w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.qbar.ScanIdentifyReportInfo f245914x;

    public f(com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo) {
        this.f245905o = -1;
        this.f245906p = false;
        this.f245907q = false;
        this.f245908r = null;
        this.f245911u = null;
        this.f245912v = null;
        this.f245914x = scanIdentifyReportInfo;
    }

    public final void a() {
        com.tencent.mm.plugin.scanner.view.s sVar = this.f245910t;
        if (sVar != null) {
            ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) sVar).u7(false, false, null);
        }
        android.app.ProgressDialog progressDialog = this.f245897d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        wu5.c cVar = this.f245911u;
        if (cVar != null) {
            cVar.cancel(false);
        }
        java.util.TimerTask timerTask = this.f245912v;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.app.Activity r25, rz3.e r26, com.tencent.mm.plugin.scanner.view.s r27, java.lang.String r28, boolean r29, int r30, java.lang.String r31, android.os.Bundle r32, int r33, boolean r34, int r35, boolean r36, boolean r37, int r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.f.b(android.app.Activity, rz3.e, com.tencent.mm.plugin.scanner.view.s, java.lang.String, boolean, int, java.lang.String, android.os.Bundle, int, boolean, int, boolean, boolean, int, java.util.ArrayList):void");
    }

    public final void c(android.os.Bundle extra) {
        com.tencent.mm.protobuf.g gVar;
        android.app.Activity activity = this.f245898e;
        java.lang.String str = null;
        sz3.l0 l0Var = activity instanceof com.tencent.mm.plugin.scanner.ui.BaseScanUI ? ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) activity).R1 : null;
        kotlin.jvm.internal.o.g(extra, "extra");
        byte[] byteArray = extra.getByteArray("key_scan_bar_code_circle_search_image_data");
        int i17 = extra.getInt("key_scan_bar_code_circle_search_image_format");
        int i18 = extra.getInt("key_scan_bar_code_circle_search_image_width");
        int i19 = extra.getInt("key_scan_bar_code_circle_search_image_height");
        int i27 = extra.getInt("key_scan_bar_code_circle_search_image_source");
        com.tencent.mm.plugin.scanner.CodePointRect codePointRect = (com.tencent.mm.plugin.scanner.CodePointRect) extra.getParcelable("key_scan_bar_code_circle_search_normal_rect");
        android.graphics.RectF rectF = codePointRect != null ? new android.graphics.RectF(codePointRect.f158611d, codePointRect.f158612e, codePointRect.f158613f, codePointRect.f158614g) : null;
        java.lang.String string = extra.getString("key_scan_bar_code_circle_search_query");
        java.lang.String string2 = extra.getString("key_scan_bar_code_circle_search_ext");
        if (string2 != null) {
            byte[] bytes = string2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            gVar = com.tencent.mm.protobuf.g.b(bytes);
        } else {
            gVar = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BarcodeStringHandler", "69Scene ScanProductDistributeResult, link " + string + " ,code " + this.f245903m + " ,to action MM_SCAN_GOODS_DISTRIBUTE_TO_CIRCLE_SEARCH");
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        android.app.Activity context = this.f245898e;
        int i28 = i27 == 1 ? 6 : 7;
        android.graphics.Point point = new android.graphics.Point(i18, i19);
        e04.e eVar = new e04.e(this, l0Var);
        sg0.e eVar2 = (sg0.e) f1Var;
        eVar2.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        eVar2.Ri(13, i28, tg0.e1.f419062e);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 13);
        intent.putExtra("entrance", i28);
        if (byteArray != null) {
            zv4.f fVar = zv4.f.f476460a;
            if (i17 != 1) {
                if (i17 == 2) {
                    str = fVar.f(byteArray, point);
                } else if (i17 != 3) {
                    str = i17 != 4 ? i17 != 5 ? "" : fVar.e(byteArray, point, true) : fVar.g(byteArray, point, true);
                }
            }
            android.graphics.Bitmap a17 = com.tencent.mm.graphics.e.a(byteArray, 0, byteArray.length);
            if (a17 != null) {
                str = fVar.d(a17, true);
            }
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigCircleSearchEmptyImageMock()) == 1) {
            intent.putExtra("image_url", "");
        } else {
            intent.putExtra("image_url", str != null ? str : "");
        }
        intent.putExtra("image_rect", rectF);
        intent.putExtra("scan_query", string);
        ok5.d.b(intent, "ui_status", new sg0.a(eVar), new ok5.h());
        if (gVar != null) {
            intent.putExtra("ext_info", gVar.i());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUIFromScanBarCode", "(Landroid/content/Context;I[BLandroid/graphics/Point;ILandroid/graphics/RectF;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;Lcom/tencent/mm/feature/websearch/api/ICircleToSearchUIStatusListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUIFromScanBarCode", "(Landroid/content/Context;I[BLandroid/graphics/Point;ILandroid/graphics/RectF;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;Lcom/tencent/mm/feature/websearch/api/ICircleToSearchUIStatusListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void d(java.lang.String str, com.tencent.mm.plugin.scanner.view.r rVar) {
        if (this.f245910t == null || !this.f245906p) {
            android.app.ProgressDialog progressDialog = this.f245897d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f245897d = db5.e1.Q(this.f245898e, "", str, true, true, new e04.b(this, rVar));
            return;
        }
        a();
        this.f245912v = new e04.o2(this.f245910t, new e04.a(this), rVar);
        this.f245911u = ((ku5.t0) ku5.t0.f312615d).k(this.f245912v, 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ba  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r35, int r36, java.lang.String r37, com.tencent.mm.modelbase.m1 r38) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.f.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public f(java.lang.String str, com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo) {
        this(scanIdentifyReportInfo);
        this.f245913w = str;
    }
}
