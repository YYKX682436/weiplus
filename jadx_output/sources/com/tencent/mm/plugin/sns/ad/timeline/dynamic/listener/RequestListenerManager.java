package com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener;

/* loaded from: classes4.dex */
public class RequestListenerManager implements androidx.lifecycle.x {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f163188e = new android.util.ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public final g74.b f163189d = new g74.b();

    private RequestListenerManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager a(android.app.Activity r6) {
        /*
            java.lang.String r0 = "getInstance"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r6 instanceof androidx.lifecycle.y
            r3 = 0
            if (r2 == 0) goto L55
            java.util.Map r2 = com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager.f163188e
            int r4 = r6.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r2
            android.util.ArrayMap r5 = (android.util.ArrayMap) r5
            java.lang.Object r4 = r5.get(r4)
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r4 = (com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager) r4
            if (r4 != 0) goto L51
            java.lang.String r4 = "newInstance"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            boolean r5 = r6 instanceof androidx.lifecycle.y     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            r5 = r6
            androidx.lifecycle.y r5 = (androidx.lifecycle.y) r5     // Catch: java.lang.Throwable -> L36
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r3 = b(r5)     // Catch: java.lang.Throwable -> L36
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L39
        L36:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L39:
            if (r3 == 0) goto L50
            java.lang.String r4 = "RequestListenerManager"
            java.lang.String r5 = "new one RequestListenerManager instance!!!"
            com.tencent.mars.xlog.Log.i(r4, r5)
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2
            r2.put(r6, r3)
        L50:
            r4 = r3
        L51:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L55:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager.a(android.app.Activity):com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }

    public static com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager b(androidx.lifecycle.y yVar) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        try {
            if (yVar == null) {
                com.tencent.mars.xlog.Log.w("RequestListenerManager", "the input life cycle owner is null!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                return null;
            }
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager requestListenerManager = new com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            try {
                yVar.mo133getLifecycle().a(requestListenerManager);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                z17 = true;
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("RequestListenerManager", "RequestListenerManager attachToOwner failed!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                return requestListenerManager;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            return null;
        } catch (java.lang.Throwable unused2) {
            com.tencent.mars.xlog.Log.e("RequestListenerManager", "new one instance of RequestListenerManager failed!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            return null;
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void doDestroy(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            g74.b bVar = this.f163189d;
            if (bVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                ((java.util.HashMap) bVar.f269345a).clear();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }
}
