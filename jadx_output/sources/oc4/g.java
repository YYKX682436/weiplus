package oc4;

/* loaded from: classes4.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableUnreadDebug", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$Companion");
        boolean z17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_UNREAD_TIER_DEBUG_INT_SYNC, 0) == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableUnreadDebug", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$Companion");
        return z17;
    }

    public final oc4.v b() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDebugUnreadTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$Companion");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        xc4.p b76 = gVar.b7(4);
        xc4.p b77 = gVar.b7(43);
        xc4.p b78 = gVar.b7(44);
        xc4.p b79 = gVar.b7(45);
        xc4.p b710 = gVar.b7(46);
        xc4.p b711 = gVar.b7(47);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pos4Info:");
        sb6.append(b76 != null ? b76.a1() : null);
        sb6.append(" 43:");
        sb6.append(b77 != null ? b77.a1() : null);
        sb6.append(" 44:");
        sb6.append(b78 != null ? b78.a1() : null);
        sb6.append(" 45:");
        sb6.append(b79 != null ? b79.a1() : null);
        sb6.append(" 46:");
        sb6.append(b710 != null ? b710.a1() : null);
        sb6.append(" 47:");
        sb6.append(b711 != null ? b711.a1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadUIC", sb6.toString());
        java.lang.String a18 = b76 != null ? b76.a1() : "";
        java.lang.String[] strArr = new java.lang.String[5];
        strArr[0] = b77 != null ? b77.a1() : "";
        strArr[1] = b78 != null ? b78.a1() : "";
        strArr[2] = b79 != null ? b79.a1() : "";
        strArr[3] = b710 != null ? b710.a1() : "";
        strArr[4] = b711 != null ? b711.a1() : "";
        oc4.v vVar = new oc4.v(a18, kz5.c0.d(strArr), new java.util.ArrayList());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDebugUnreadTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$Companion");
        return vVar;
    }
}
