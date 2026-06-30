package qe5;

/* loaded from: classes12.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.b0 f362069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qe5.b0 b0Var) {
        super(1);
        this.f362069d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.n nVar = (kd5.n) state.a(kd5.n.class);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (nVar != null) {
            qe5.b0 b0Var = this.f362069d;
            j75.f Q6 = b0Var.Q6();
            jz5.f0 f0Var2 = null;
            kd5.e eVar = Q6 != null ? (kd5.e) Q6.getState() : null;
            if (eVar != null) {
                com.tencent.mm.storage.f9 f9Var = eVar.f306877e;
                if (f9Var != null) {
                    java.lang.String str = eVar.f306893x;
                    java.lang.String str2 = eVar.f306885p;
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(f9Var, str, str2, eVar.f306894y);
                    com.tencent.mm.ui.report.p pVar = nVar.f306903b;
                    switch (pVar.ordinal()) {
                        case 4:
                            if (!b0Var.f362075g || !nVar.f306904c) {
                                oVar.f209718m = nVar.f306904c;
                                b0Var.f362075g = true;
                                com.tencent.mm.ui.report.d0.f209626a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFilePreviewBtnExp");
                                break;
                            }
                            break;
                        case 5:
                            if (!b0Var.f362073e || !nVar.f306904c) {
                                oVar.f209718m = nVar.f306904c;
                                b0Var.f362073e = true;
                                com.tencent.mm.ui.report.d0.f209626a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFileOpenBtnExp");
                                break;
                            }
                            break;
                        case 6:
                            if (!b0Var.f362074f || !nVar.f306904c) {
                                oVar.f209718m = nVar.f306904c;
                                com.tencent.mm.ui.report.l lVar = nVar.f306905d;
                                kotlin.jvm.internal.o.g(lVar, "<set-?>");
                                oVar.f209712g = lVar;
                                b0Var.f362074f = true;
                                com.tencent.mm.ui.report.d0.f209626a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFileDownloadBtnExp");
                                break;
                            }
                            break;
                        case 7:
                            if (!b0Var.f362072d || !nVar.f306904c) {
                                oVar.f209718m = nVar.f306904c;
                                b0Var.f362072d = true;
                                com.tencent.mm.ui.report.d0.f209626a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedOpenByOtherAppExp");
                                break;
                            }
                            break;
                        case 8:
                            oVar.f209713h = nVar.f306906e ? com.tencent.mm.ui.report.n.f209702f : com.tencent.mm.ui.report.n.f209703g;
                            oVar.f209714i = nVar.f306907f ? com.tencent.mm.ui.report.h.f209644f : com.tencent.mm.ui.report.h.f209645g;
                            com.tencent.mm.ui.report.d0.f209626a.d(pVar, oVar);
                            f0Var2 = f0Var;
                            break;
                        case 9:
                        default:
                            com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: type is not support");
                            break;
                        case 10:
                            if (!b0Var.f362076h) {
                                com.tencent.mm.ui.report.m mVar = nVar.f306908g;
                                kotlin.jvm.internal.o.g(mVar, "<set-?>");
                                oVar.f209711f = mVar;
                                b0Var.f362076h = true;
                                com.tencent.mm.ui.report.d0.f209626a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFileClickedToMidPage");
                                break;
                            }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: msgInfo is null");
                }
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: state is null");
            }
        }
        return f0Var;
    }
}
