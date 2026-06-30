package nq1;

/* loaded from: classes11.dex */
public class z implements ak0.i {
    public z(nq1.v vVar) {
    }

    @Override // ak0.i
    public void a(java.io.File file, java.io.File file2, java.lang.String str, int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 130L, 1L, false);
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 114L, 1L, false);
            return;
        }
        if (i17 == 5) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 115L, 1L, false);
        } else if (i17 == 6) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 132L, 1L, false);
        } else {
            if (i17 != 7) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 136L, 1L, false);
        }
    }

    @Override // ak0.i
    public void b(java.io.File file, java.util.List list, java.lang.Throwable th6) {
        if (th6.getMessage().contains(com.tencent.tinker.loader.shareutil.ShareConstants.CHECK_DEX_OAT_EXIST_FAIL)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 134L, 1L, false);
        } else if (th6.getMessage().contains(com.tencent.tinker.loader.shareutil.ShareConstants.CHECK_DEX_OAT_FORMAT_FAIL)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(338L, 135L, 1L, false);
            g0Var.i("Tinker", "Tinker Exception:apply tinker occur dexOpt format exception " + com.tencent.mm.sdk.platformtools.t8.H(th6, true), null);
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(338L, 105L, 1L, false);
            g0Var2.i("Tinker", "Tinker Exception:apply tinker occur dexOpt exception " + com.tencent.mm.sdk.platformtools.t8.H(th6, true), null);
        }
        com.tencent.mm.sdk.platformtools.g2.a(bm5.f1.a(), com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE, android.util.Log.getStackTraceString(th6));
    }

    @Override // ak0.i
    public void c(java.io.File file, int i17) {
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case -8:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 131, false);
                return;
            case -7:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 113, false);
                return;
            case -6:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 112, false);
                return;
            case -5:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 111, false);
                return;
            case -4:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 110, false);
                return;
            case -3:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 109, false);
                return;
            case -2:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 129, false);
                return;
            case -1:
                com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 107, 108, false);
                return;
            default:
                return;
        }
    }

    @Override // ak0.i
    public void d(java.io.File file, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 106L, 1L, false);
    }

    @Override // ak0.i
    public void e(java.io.File file, java.lang.Throwable th6) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(338L, 104L, 1L, false);
        g0Var.i("Tinker", "Tinker Exception:apply tinker occur unknown exception " + com.tencent.mm.sdk.platformtools.t8.H(th6, true), null);
    }

    @Override // ak0.i
    public void f(java.io.File file, boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchReporter", "onPatchResult start");
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 3L, 1L, true);
        }
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 101L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 103L, 1L, false);
        }
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report report apply cost = %d", java.lang.Long.valueOf(j17));
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("Tinker.HotPatchReportHelper", "hp_report report apply cost failed, invalid cost");
        } else if (j17 <= 5000) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 117L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 122L, 1L, false);
            }
        } else if (j17 <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 118L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 123L, 1L, false);
            }
        } else if (j17 <= 30000) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 119L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 124L, 1L, false);
            }
        } else if (j17 > 60000) {
            if (j17 >= 3600000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 133L, 1L, false);
            }
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 121L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 126L, 1L, false);
            }
        } else if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 120L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 125L, 1L, false);
        }
        com.tencent.mars.xlog.Log.appenderFlushSync();
    }

    @Override // ak0.i
    public void g(android.content.Intent intent) {
        com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158126c = 100L;
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report try to apply patch service start");
        if (intent == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 6, 127, false);
        } else if (com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(intent, "patch_path_extra") == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 6, 128, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 6L, 1L, true);
        }
    }

    @Override // ak0.i
    public void h(java.io.File file) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 116L, 1L, false);
    }
}
