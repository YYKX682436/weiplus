package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.p f208527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f208529f;

    public n(com.tencent.mm.ui.feature.api.screenshot.p pVar, java.lang.String str, boolean z17) {
        this.f208527d = pVar;
        this.f208528e = str;
        this.f208529f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.feature.api.screenshot.p pVar = this.f208527d;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) pVar.f208541a;
        java.lang.String str = this.f208528e;
        java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
        boolean z17 = false;
        int intValue = num != null ? num.intValue() : 0;
        int i17 = this.f208529f ? 1 : -1;
        java.util.Map map = pVar.f208541a;
        int i18 = intValue + i17;
        if (i18 < 0) {
            i18 = 0;
        }
        map.put(str, java.lang.Integer.valueOf(i18));
        java.util.Collection values = ((java.util.LinkedHashMap) pVar.f208541a).values();
        if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
            java.util.Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((java.lang.Number) it.next()).intValue() > 0) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            if (pVar.f208542b == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl, setCallback, register notifyCallback");
                com.tencent.mm.ui.feature.api.screenshot.o oVar = new com.tencent.mm.ui.feature.api.screenshot.o(pVar);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.sdk.platformtools.m7.b(context, oVar);
                pVar.f208542b = oVar;
                return;
            }
            return;
        }
        com.tencent.mm.sdk.platformtools.f7 f7Var = pVar.f208542b;
        if (f7Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl, setCallback, unregister notifyCallback");
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.sdk.platformtools.m7.d(context2, f7Var);
        pVar.f208542b = null;
    }
}
