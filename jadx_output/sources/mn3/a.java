package mn3;

/* loaded from: classes8.dex */
public final class a implements com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase {
    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo findShowInfoByPath(java.lang.String str) {
        try {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            if (str == null) {
                str = "";
            }
            r45.f03 I0 = nk6.I0(str);
            if (I0 != null) {
                com.tencent.wechat.aff.newlife.FinderTipsShowInfo parseFrom = new com.tencent.wechat.aff.newlife.FinderTipsShowInfo().parseFrom(I0.toByteArray());
                kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
                return parseFrom;
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.wechat.aff.newlife.FinderTipsShowInfo build = com.tencent.wechat.aff.newlife.FinderTipsShowInfo.newBuilder().build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        return build;
    }

    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.FinderBaseRequest getFinderBaseReq(int i17, int i18, int i19) {
        com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest = new com.tencent.wechat.aff.newlife.FinderBaseRequest();
        ((en3.b0) ((ra0.w) i95.n0.c(ra0.w.class))).getClass();
        r45.kv0 a17 = db2.t4.f228171a.a(i19);
        a17.set(1, java.lang.Integer.valueOf(i18));
        a17.set(4, new r45.g40());
        r45.g40 g40Var = (r45.g40) a17.getCustom(4);
        if (g40Var != null) {
            ra0.a0 a0Var = ra0.a0.f393458a;
            java.lang.String debugInfo = "genNewLifeFinderBaseRequest[" + i18 + '-' + i19 + ']';
            kotlin.jvm.internal.o.g(debugInfo, "debugInfo");
            com.tencent.mars.xlog.Log.isDebug();
            java.lang.String str = (java.lang.String) ((java.util.HashMap) ra0.a0.f393461d).get(java.lang.Integer.valueOf(i17));
            if (str == null) {
                str = ra0.a0.f393459b;
            }
            g40Var.set(0, str);
        }
        com.tencent.wechat.aff.newlife.FinderBaseRequest parseFrom = finderBaseRequest.parseFrom(a17.toByteArray());
        kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
        return parseFrom;
    }

    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo getFinderCtrlInfoByKeyPath(java.lang.String str) {
        try {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0(str);
            if (L0 != null) {
                com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo parseFrom = new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo().parseFrom(L0.field_ctrInfo.toByteArray());
                kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
                return parseFrom;
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo build = com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo.newBuilder().build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        return build;
    }

    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo getFinderSyncClientInfo(com.tencent.wechat.aff.newlife.SourceInfo sourceInfo) {
        java.lang.Integer valueOf = sourceInfo != null ? java.lang.Integer.valueOf(sourceInfo.getSourceType()) : null;
        int b17 = com.tencent.mm.plugin.finder.assist.h4.f102221a.b((valueOf != null && valueOf.intValue() == 0) ? zy2.t.NewLife : (valueOf != null && valueOf.intValue() == 1) ? zy2.t.Search : zy2.t.Finder, null);
        boolean k17 = vn2.u0.f438387a.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.AffFinderSyncCppToNativeManagerImpl", "getFinderSyncClientInfo, singleMaxWords: " + b17 + ", " + k17);
        com.tencent.wechat.aff.newlife.LongVideoClientInfo newBuilder = com.tencent.wechat.aff.newlife.LongVideoClientInfo.newBuilder();
        newBuilder.setIsChannelUi(k17);
        com.tencent.wechat.aff.newlife.LongVideoClientInfo build = newBuilder.build();
        com.tencent.wechat.aff.newlife.FinderSyncClientInfo newBuilder2 = com.tencent.wechat.aff.newlife.FinderSyncClientInfo.newBuilder();
        newBuilder2.setFinderEntranceTitleLengthLimit(b17 * 2);
        newBuilder2.setFinderEntranceSingleTitleLengthLimit(b17);
        newBuilder2.setLongvideoClientInfo(build);
        return newBuilder2.build();
    }

    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public java.lang.String getFinderUserName() {
        return g92.b.f269769e.T0();
    }

    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public com.tencent.wechat.aff.newlife.SyncLocation getLocation(int i17) {
        r45.vm5 vm5Var;
        com.tencent.wechat.aff.newlife.SyncLocation newBuilder = com.tencent.wechat.aff.newlife.SyncLocation.newBuilder();
        d85.g0 g0Var = d85.g0.LOCAION;
        boolean Ri = i17 == 9 ? ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(g0Var, d85.f0.f227168s) : ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(g0Var, d85.f0.f227163n);
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.k0 k0Var = (ey2.k0) a17;
        boolean N6 = k0Var.N6();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.AffFinderSyncCppToNativeManagerImpl", "getLocation businessType=" + i17 + " switchOpen=" + Ri + " locationPermissionGranted=" + N6);
        if (N6 && Ri) {
            newBuilder.longitude = ((java.lang.Number) k0Var.P6().f302833d).floatValue();
            newBuilder.latitude = ((java.lang.Number) k0Var.P6().f302834e).floatValue();
            long c17 = (c01.id.c() / 1000) - k0Var.Q6();
            double d17 = c17;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
            if (d17 < timeUnit.toSeconds(1L) * 0.5d) {
                vm5Var = r45.vm5.CACHE_TIME_HALF_HOUR;
            } else if (c17 < timeUnit.toSeconds(1L)) {
                vm5Var = r45.vm5.CACHE_TIME_ONE_HOUR;
            } else if (c17 < 6 * timeUnit.toSeconds(1L)) {
                vm5Var = r45.vm5.CACHE_TIME_SIX_HOUR;
            } else {
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.DAYS;
                vm5Var = c17 < timeUnit2.toSeconds(1L) ? r45.vm5.CACHE_TIME_ONE_DAY : c17 < ((long) 3) * timeUnit2.toSeconds(1L) ? r45.vm5.CACHE_TIME_THREE_DAY : c17 < ((long) 7) * timeUnit2.toSeconds(1L) ? r45.vm5.CACHE_TIME_SEVEN_DAY : c17 < ((long) 30) * timeUnit2.toSeconds(1L) ? r45.vm5.CACHE_TIME_THIRTY_DAY : r45.vm5.CACHE_TIME_MORE_THAN_THIRTY_DAY;
            }
            newBuilder.setLbsCacheTime(vm5Var.f388371d);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.AffFinderSyncCppToNativeManagerImpl", "getLocation longitude=" + newBuilder + ".longitude latitude=" + newBuilder + ".latitude");
        }
        com.tencent.wechat.aff.newlife.SyncLocation build = newBuilder.build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        return build;
    }

    @Override // com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase
    public java.util.ArrayList getMultiFinderUserNames() {
        return new java.util.ArrayList(g92.b.f269769e.I6(true));
    }
}
