package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class e implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f170989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f170990b;

    public e(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f170989a = v0Var;
        this.f170990b = snsInfo;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        boolean b17 = kotlin.jvm.internal.o.b(snsInfo != null ? snsInfo.getSnsId() : null, snsInfo2 != null ? snsInfo2.getSnsId() : null);
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f170989a;
        if (b17) {
            if (v0Var.D() != null && v0Var.C() != null && v0Var.M() != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                float q17 = i65.a.q(v0Var.f171051p);
                if (v0Var.H() <= 0) {
                    android.widget.TextView C = v0Var.C();
                    int measuredHeight = C != null ? C.getMeasuredHeight() : -2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f171053r = measuredHeight;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                if (v0Var.I() <= 0) {
                    android.widget.TextView D = v0Var.D();
                    int measuredHeight2 = D != null ? D.getMeasuredHeight() : -2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f171052q = measuredHeight2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                if (v0Var.H() <= 0) {
                    com.tencent.mars.xlog.Log.e(v0Var.j(), "get a error config!");
                    android.widget.TextView M = v0Var.M();
                    int measuredHeight3 = M != null ? M.getMeasuredHeight() : -2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f171053r = measuredHeight3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                com.tencent.mars.xlog.Log.i(v0Var.j(), "measureDescHeight = " + v0Var.H() + "  measureTitleHeight = " + v0Var.I());
                if (v0Var.H() <= 0) {
                    com.tencent.mars.xlog.Log.w(v0Var.j(), "a error measureDescHeight!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f171053r = -2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                if (v0Var.I() <= 0) {
                    com.tencent.mars.xlog.Log.w(v0Var.j(), "a error measureTitleHeight!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                    v0Var.f171052q = -2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
                }
                android.widget.TextView D2 = v0Var.D();
                android.view.ViewGroup.LayoutParams layoutParams = D2 != null ? D2.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = v0Var.I();
                }
                android.widget.TextView C2 = v0Var.C();
                android.view.ViewGroup.LayoutParams layoutParams2 = C2 != null ? C2.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.height = v0Var.H();
                }
                android.widget.TextView M2 = v0Var.M();
                android.view.ViewGroup.LayoutParams layoutParams3 = M2 != null ? M2.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.height = v0Var.H();
                }
                android.widget.TextView D3 = v0Var.D();
                kotlin.jvm.internal.o.d(D3);
                androidx.core.widget.a0.b(D3, 1, (int) (v0Var.E(14) * q17), 1, 0);
                android.widget.TextView C3 = v0Var.C();
                kotlin.jvm.internal.o.d(C3);
                androidx.core.widget.a0.b(C3, 1, (int) (v0Var.E(13) * q17), 1, 0);
                android.widget.TextView M3 = v0Var.M();
                kotlin.jvm.internal.o.d(M3);
                androidx.core.widget.a0.b(M3, 1, (int) (q17 * v0Var.E(13)), 1, 0);
            }
            com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout G = v0Var.G();
            if (G != null) {
                G.a(0.0f, 0.0f, v0Var.E(0), v0Var.E(6), v0Var.E(0), v0Var.E(8), v0Var.E(0), v0Var.E(6));
            }
            java.lang.String j17 = v0Var.j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try processAnim! ");
            sb6.append(v0Var.K());
            sb6.append(' ');
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f170990b;
            sb6.append(snsInfo3 != null ? snsInfo3.getSnsId() : null);
            com.tencent.mars.xlog.Log.i(j17, sb6.toString());
            int K = v0Var.K();
            if (K == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 0);
                com.tencent.mm.plugin.sns.ui.widget.ad.v0.y(v0Var);
            } else if (K == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 1);
                com.tencent.mm.plugin.sns.ui.widget.ad.v0.A(v0Var);
            } else if (K == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 2);
                com.tencent.mm.plugin.sns.ui.widget.ad.v0.z(v0Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        } else {
            com.tencent.mars.xlog.Log.e(v0Var.j(), "multiView on predraw snsId is not equals!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$bindComponentModel$1");
    }
}
