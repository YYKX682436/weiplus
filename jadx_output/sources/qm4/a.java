package qm4;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(boolean z17) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX);
            iDKey.SetValue(1L);
            iDKey.SetKey(0);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX);
            iDKey2.SetValue(1L);
            if (z17) {
                iDKey2.SetKey(1);
            } else {
                iDKey2.SetKey(1);
            }
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
        } catch (java.lang.Throwable unused) {
        }
    }
}
