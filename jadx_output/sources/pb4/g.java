package pb4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final pb4.g f353198a = new pb4.g();

    public final l75.k0 a() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        jm0.i iVar = jm0.k.f300269h;
        l75.k0 Q4 = ((pb4.f) iVar.a(pb4.f.class)).Q4();
        if (Q4 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
            return Q4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        java.lang.String str = gm0.j1.u().h() + "sns_show_teach.db";
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(pb4.f.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(pb4.f.class);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarTeachStorage", "init >> " + str + ' ' + ((pb4.f) a17).O6(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        l75.k0 Q42 = ((pb4.f) iVar.a(pb4.f.class)).Q4();
        kotlin.jvm.internal.o.d(Q42);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        return Q42;
    }

    public final boolean b(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectIsShow", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        l75.k0 a17 = a();
        p75.i0 i18 = dm.ia.f237658f.i();
        i18.f352657d = dm.ia.f237659g.i(java.lang.Long.valueOf(j17)).c(dm.ia.f237660h.i(java.lang.Integer.valueOf(i17)));
        dm.ia iaVar = (dm.ia) i18.a().o(a17, dm.ia.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarTeachStorage", "selectIsShow >> " + iaVar + ", " + ca4.z0.t0(j17));
        boolean z17 = iaVar != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectIsShow", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachStorage");
        return z17;
    }
}
