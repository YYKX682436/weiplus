package e54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e54.a f249638a = new e54.a();

    public static final void a(android.content.Context context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, ab4.n0 n0Var, java.lang.String str) {
        v64.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        if (str != null) {
            dVar = new v64.d();
            dVar.b("componentId", str);
        } else {
            dVar = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        if (context == null || adClickActionInfo == null || n0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.CompActionHandler", "the context, action info or page is null, when do component post action!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        } else {
            try {
                com.tencent.mars.xlog.Log.i("SnsAd.CompActionHandler", "it is going to do action, action type is " + adClickActionInfo.f162571b);
                f249638a.b(context, adClickActionInfo, n0Var, dVar);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("doPostAction", th6);
            }
            com.tencent.mars.xlog.Log.i("SnsAd.CompActionHandler", "the action is done, action type is " + adClickActionInfo.f162571b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if ((r8.length() > 0) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        if ((r3.length() > 0) == true) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r15, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r16, ab4.n0 r17, v64.d r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e54.a.b(android.content.Context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, ab4.n0, v64.d):void");
    }
}
