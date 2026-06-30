package oi0;

/* loaded from: classes4.dex */
public final class e implements oi0.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oi0.e f345591d = new oi0.e();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f345592e = new java.lang.ref.WeakReference(null);

    @Override // oi0.a
    public void a(java.lang.String imgPath, float f17) {
        oi0.a aVar;
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17 && (aVar = (oi0.a) f345592e.get()) != null) {
            aVar.a(imgPath, f17);
        }
    }

    @Override // oi0.a
    public void b(java.lang.String thumbPath, java.lang.String videoPath) {
        oi0.a aVar;
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17 && (aVar = (oi0.a) f345592e.get()) != null) {
            aVar.b(thumbPath, videoPath);
        }
    }

    @Override // oi0.a
    public void c(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        oi0.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17 && (aVar = (oi0.a) f345592e.get()) != null) {
            aVar.c(i17, snsInfo);
        }
    }

    @Override // oi0.a
    public void d(com.tencent.mm.protocal.protobuf.FinderObject finderObj) {
        oi0.a aVar;
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17 && (aVar = (oi0.a) f345592e.get()) != null) {
            aVar.d(finderObj);
        }
    }

    @Override // oi0.a
    public void e(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        oi0.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17 && (aVar = (oi0.a) f345592e.get()) != null) {
            aVar.e(snsObject);
        }
    }

    @Override // oi0.a
    public void f(long j17, r45.p96 opChangeVisibility) {
        oi0.a aVar;
        kotlin.jvm.internal.o.g(opChangeVisibility, "opChangeVisibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17 && (aVar = (oi0.a) f345592e.get()) != null) {
            aVar.f(j17, opChangeVisibility);
        }
    }
}
