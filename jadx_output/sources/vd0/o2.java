package vd0;

@j95.b
/* loaded from: classes8.dex */
public final class o2 extends i95.w implements wd0.s1 {

    /* renamed from: d, reason: collision with root package name */
    public long f435480d;

    public boolean Ai() {
        return (c01.z1.h() & 32) != 32;
    }

    public boolean Bi() {
        return (c01.z1.h() & 128) != 128;
    }

    public boolean Di() {
        return (c01.z1.h() & 2) != 2;
    }

    public void Ni(boolean z17) {
        if (!((c01.z1.h() & 1) == 1) || kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.global.RepairerConfigFindMoreReddotHasSetConfig()), 1)) {
            this.f435480d = c01.z1.h();
            java.lang.Object l17 = gm0.j1.u().c().l(68384, null);
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(l17 instanceof java.lang.Boolean ? (java.lang.Boolean) l17 : null, true);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "syncSnsReddot: " + m17);
            Ri(m17, 2L);
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, true);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "finderInitState = " + o17);
            boolean o18 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_NEAR_BY_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, true);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "initNearByState = " + o18);
            boolean o19 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, true);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "isEnableShowFinderLiveEntranceRedDot = " + o19);
            Ri(o17, 8L);
            Ri(o18, 8192L);
            Ri(o19, 32L);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "syncDefaultReddot");
            Ri(true, 128L);
            Ri(true, 512L);
            Ri(true, 2048L);
            Ri(true, 131072L);
            if (this.f435480d == 0) {
                com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "checkReddotSync but skip");
                return;
            }
            Ri(false, 1L);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "checkReddotSync sync = " + this.f435480d);
            gm0.j1.u().c().w(147458, java.lang.Long.valueOf(this.f435480d));
        }
        if (z17 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_app_event_monitor_type, 0) == 1) {
            java.lang.String j17 = gm0.j1.b().j();
            if (com.tencent.mm.sdk.platformtools.o4.M("MMKV_HAS_SYNC_FINDMORE").f(j17)) {
                com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "checkSyncOplog " + j17 + " already SyncOplog");
                return;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = kz5.c0.i(1L, 2L, 8L, 32L, 128L, 512L, 2048L, 8192L, 131072L).iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                linkedHashMap.put(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue & c01.z1.h()));
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue2 = ((java.lang.Number) entry.getKey()).longValue();
                long longValue3 = ((java.lang.Number) entry.getValue()).longValue();
                r45.io4 io4Var = new r45.io4();
                io4Var.f377216d = longValue2;
                io4Var.f377217e = longValue3;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(75, io4Var));
                com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "SyncOplog switch " + longValue2 + ' ' + longValue3);
            }
            com.tencent.mm.sdk.platformtools.o4.M("MMKV_HAS_SYNC_FINDMORE").putInt(j17, 1);
        }
    }

    public final void Ri(boolean z17, long j17) {
        long j18;
        com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", "switch ext change : open = " + z17 + " item value = " + j17);
        if (z17) {
            j18 = (~j17) & this.f435480d;
        } else {
            j18 = this.f435480d | j17;
        }
        this.f435480d = j18;
        gm0.j1.u().c().w(147458, java.lang.Long.valueOf(this.f435480d));
    }

    public boolean wi() {
        return (c01.z1.h() & 8) != 8;
    }
}
