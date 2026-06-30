package j85;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a */
    public static final j85.h f298258a = new j85.h();

    public static /* synthetic */ void b(j85.h hVar, long j17, java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        java.lang.Long l19 = (i17 & 2) != 0 ? -1L : l17;
        java.lang.Long l27 = (i17 & 4) != 0 ? -1L : l18;
        if ((i17 & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        hVar.a(j17, l19, l27, bool);
    }

    public final void a(long j17, java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        com.tencent.mm.autogen.mmdata.rpt.SystemAutorizationPopupWindowStruct systemAutorizationPopupWindowStruct = new com.tencent.mm.autogen.mmdata.rpt.SystemAutorizationPopupWindowStruct();
        systemAutorizationPopupWindowStruct.f61023d = j17;
        if (l17 != null) {
            long longValue = l17.longValue();
            if (longValue != -1) {
                systemAutorizationPopupWindowStruct.f61024e = longValue;
            }
        }
        if (l18 != null) {
            long longValue2 = l18.longValue();
            if (longValue2 != -1) {
                systemAutorizationPopupWindowStruct.f61025f = longValue2;
            }
        }
        systemAutorizationPopupWindowStruct.f61026g = systemAutorizationPopupWindowStruct.b("DeviceID", wo.w0.c(), true);
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            systemAutorizationPopupWindowStruct.f61027h = systemAutorizationPopupWindowStruct.b("CurrentPrivacyFullStatus", ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ui(), true);
        }
        systemAutorizationPopupWindowStruct.k();
        com.tencent.mars.xlog.Log.i("Micro.SettingPermissionReporter", "[reportDialogAction] action = " + j17 + ", bizType = " + l18 + "， privacyType = " + l17);
    }
}
