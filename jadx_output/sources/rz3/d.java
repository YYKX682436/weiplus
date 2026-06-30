package rz3;

/* loaded from: classes15.dex */
public class d extends rz3.g implements rz3.e, com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401803g;

    /* renamed from: h, reason: collision with root package name */
    public final int f401804h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f401805i;

    /* renamed from: m, reason: collision with root package name */
    public e04.p f401806m;

    /* renamed from: n, reason: collision with root package name */
    public final rz3.c f401807n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.view.s f401808o;

    public d(java.lang.String str, int i17, int i18, boolean z17, com.tencent.scanlib.ui.ScanView scanView, rz3.c cVar, com.tencent.mm.plugin.scanner.view.s sVar) {
        this.f401804h = 0;
        this.f401803g = str;
        this.f401804h = i18;
        this.f401809d = scanView;
        this.f401807n = cVar;
        this.f401811f = scanView.getContext();
        this.f401808o = sVar;
        this.f401805i = z17;
        gm0.j1.d().a(971, this);
    }

    @Override // rz3.e
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeHandler", "notify Event: %d", java.lang.Integer.valueOf(i17));
        rz3.c cVar = this.f401807n;
        switch (i17) {
            case 1:
                this.f401809d.f();
                return;
            case 2:
                this.f401809d.f();
                return;
            case 3:
                if (cVar != null) {
                    ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) cVar).x();
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                this.f401809d.e();
                return;
            case 6:
                if (cVar != null) {
                    ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) cVar).t7(1, bundle);
                    return;
                }
                return;
            case 7:
                if (cVar != null) {
                    ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) cVar).t7(2, bundle);
                    return;
                }
                return;
            case 8:
                if (cVar != null) {
                    ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) cVar).t7(3, bundle);
                    return;
                }
                return;
            case 9:
                if (cVar != null) {
                    ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) cVar).t7(4, bundle);
                    return;
                }
                return;
        }
    }

    @Override // rz3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(long j17, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("result_content", "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = bundle.getString("result_code_name", "");
        int a17 = com.tencent.mm.plugin.scanner.j1.a(string2);
        int i17 = bundle.getInt("result_code_version", 0);
        int i18 = bundle.getInt("qbar_string_scan_source", 0);
        boolean z18 = bundle.getBoolean("key_disable_bar_code_jump_scan_goods", false);
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("key_scan_tab_bar_type_list");
        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = (com.tencent.qbar.ScanIdentifyReportInfo) bundle.getParcelable("ScanIdentifyReportInfo.DecodeKey");
        com.tencent.mm.plugin.scanner.CodePointRect codePointRect = (com.tencent.mm.plugin.scanner.CodePointRect) bundle.getParcelable("result_normalize_rect");
        if (scanIdentifyReportInfo != null && codePointRect != null) {
            scanIdentifyReportInfo.b(codePointRect, bundle.getInt("result_image_width"), bundle.getInt("result_image_height"));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeHandler", "handleResult content %s, codeType %d, codeName %s, codeVersion %d, disableJumpScanGoods: %s, codeRect: %s", str, java.lang.Integer.valueOf(a17), string2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18), codePointRect);
        com.tencent.mm.autogen.events.PublishScanCodeResultEvent publishScanCodeResultEvent = new com.tencent.mm.autogen.events.PublishScanCodeResultEvent();
        am.yo yoVar = publishScanCodeResultEvent.f54631g;
        yoVar.f8471b = string2;
        yoVar.f8472c = str;
        yoVar.f8470a = 1;
        publishScanCodeResultEvent.e();
        publishScanCodeResultEvent.f54632h.getClass();
        e04.p pVar = this.f401806m;
        if (pVar != null) {
            pVar.d();
        }
        boolean b17 = com.tencent.mm.plugin.scanner.j1.b(a17);
        java.lang.String str2 = this.f401803g;
        if (!b17) {
            new e04.f(str2, scanIdentifyReportInfo).b((android.app.Activity) this.f401809d.getContext(), this, this.f401808o, str, i18 == 1, i17, string2, null, this.f401804h, false, -1, this.f401805i, z18, i18 == 1 ? 1 : 0, integerArrayList);
            return;
        }
        e04.p pVar2 = new e04.p(str2);
        this.f401806m = pVar2;
        pVar2.g((android.app.Activity) this.f401809d.getContext(), str, this.f401804h, i18, i18 == 0 ? 4 : 34, string2, a17, i17, this, this.f401808o, null, false, -1, this.f401805i, scanIdentifyReportInfo, null);
    }

    @Override // rz3.a
    public void destroy() {
        gm0.j1.d().q(971, this);
        e04.p pVar = this.f401806m;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeHandler", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 != 2) {
                z17 = false;
            } else {
                android.content.Context context = this.f401811f;
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490500wu), 1).show();
            }
        } else if (gm0.j1.d().m()) {
            gm0.j1.d().l();
        } else if (com.tencent.mm.network.y2.a(this.f401811f)) {
            com.tencent.mm.pluginsdk.ui.tools.l5.a(this.f401811f);
        } else {
            android.content.Context context2 = this.f401811f;
            dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.fcf, 1, java.lang.Integer.valueOf(i18)), 1).show();
        }
        if (z17) {
            a(0, null);
            return;
        }
        if (i17 == 4 && i18 == -2004) {
            db5.e1.i(this.f401811f, com.tencent.mm.R.string.hpn, com.tencent.mm.R.string.f490573yv);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() == 971) {
                a(3, null);
            }
        } else {
            java.lang.String G = com.tencent.mm.sdk.platformtools.t8.G(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(G)) {
                G = this.f401811f.getString(com.tencent.mm.R.string.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            dp.a.makeText(this.f401811f, G, 0).show();
        }
    }
}
