package s74;

/* loaded from: classes4.dex */
public final class a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final s74.v3 f404208e = new s74.v3(null);

    /* renamed from: f, reason: collision with root package name */
    public static volatile s74.a4 f404209f;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f404210a = new com.tencent.mm.sdk.platformtools.r2(5);

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.y0 f404211b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f404212c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f404213d;

    public a4() {
        int i17 = kotlinx.coroutines.r0.N0;
        this.f404213d = new s74.z3(kotlinx.coroutines.q0.f310567d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(s74.a4 r10, com.tencent.mm.plugin.sns.storage.SnsInfo r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.a4.a(s74.a4, com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public final kotlinx.coroutines.y0 b() {
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreloaderScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        synchronized (this.f404210a) {
            try {
                if (this.f404211b == null) {
                    this.f404211b = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
                }
                y0Var = this.f404211b;
                kotlin.jvm.internal.o.d(y0Var);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreloaderScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreloaderScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        return y0Var;
    }

    public final s74.r4 c(java.lang.String snsId, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        s74.r4 r4Var = null;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("DynamicView.Preloader", "getViewById:" + snsId + " but verifyString is null! ");
            return null;
        }
        synchronized (this.f404210a) {
            try {
                s74.r4 r4Var2 = (s74.r4) this.f404210a.get(snsId);
                if (r4Var2 == null) {
                    com.tencent.mars.xlog.Log.i("DynamicView.Preloader", "getViewById:" + snsId + " but no cache");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                    if (r4Var2.f404530c == null) {
                        com.tencent.mars.xlog.Log.e("DynamicView.Preloader", "getViewById:" + snsId + " but node.verifyString is null! ");
                        this.f404210a.remove(snsId);
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                        if (r4Var2.f404528a.c().getParent() != null) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 11);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getViewById:");
                            sb6.append(snsId);
                            sb6.append(" but has parent! view = ");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            sb6.append(r4Var2.f404528a.c());
                            sb6.append(' ');
                            com.tencent.mars.xlog.Log.w("DynamicView.Preloader", sb6.toString());
                            this.f404210a.remove(snsId);
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            if (r4Var2.f404530c != str) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                                if (!kotlin.jvm.internal.o.b(r4Var2.f404530c, str)) {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 12);
                                    com.tencent.mars.xlog.Log.e("DynamicView.Preloader", "getViewById:" + snsId + " but verifyString may updated! ");
                                    this.f404210a.remove(snsId);
                                }
                            }
                            r4Var = r4Var2;
                        }
                    }
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
            }
        }
        return r4Var;
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        android.app.Activity activity = this.f404212c;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
            return false;
        }
        com.tencent.mars.xlog.Log.e("DynamicView.Preloader", "isFinishing=true, act=" + this.f404212c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        return true;
    }
}
