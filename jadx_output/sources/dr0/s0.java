package dr0;

/* loaded from: classes12.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f242526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f242527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f242528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f242529g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f242530h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f242531i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(long j17, java.util.Map map, long j18, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, dr0.t0 t0Var, long j19, long j27) {
        super(1);
        this.f242526d = j17;
        this.f242527e = map;
        this.f242528f = j18;
        this.f242529g = accProcLifeStats;
        this.f242530h = j19;
        this.f242531i = j27;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long c17;
        long c18;
        long c19;
        long j17;
        long j18;
        long j19;
        long j27;
        int i17;
        long j28;
        long j29;
        long j37;
        long j38;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats it = (com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(this.f242526d);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(calendar.get(11));
        java.util.Map map = this.f242527e;
        map.put("report-fromHr", valueOf);
        map.put("report-periodHr", java.lang.Long.valueOf(this.f242528f));
        map.put("usr-id", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.c7.b()));
        java.lang.String c27 = com.tencent.mm.sdk.platformtools.c7.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(c27, "getAppUserInfo(...)");
        map.put("usr-info", c27);
        map.put("usr-profile", com.tencent.mm.sdk.platformtools.c7.a(com.tencent.mm.sdk.platformtools.x2.f193071a));
        java.lang.String Di = ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Di();
        kotlin.jvm.internal.o.f(Di, "getProcRecycleCfg(...)");
        map.put("report-cfg", Di);
        dr0.w1 w1Var = dr0.a3.f242403d;
        map.put("report-supported", java.lang.Boolean.valueOf(w1Var.a().m()));
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f242529g;
        map.put("report-aliveCount", java.lang.Long.valueOf(accProcLifeStats.getAccCheckAliveCount()));
        map.put("report-suicideMin", java.lang.Integer.valueOf(w1Var.a().e()));
        map.put("report-suicideMode", java.lang.Integer.valueOf(w1Var.a().n()));
        map.put("report-pullMainProc", java.lang.Boolean.FALSE);
        map.put("report-nonSplash", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.L().getInt("battery-accproclife-last-non-splash", 0) == android.os.Process.myPid()));
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats b17 = er0.f0.b(com.tencent.mm.sdk.platformtools.w9.f193054b);
        if (b17 == null) {
            b17 = new com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats();
        }
        map.put("standby-count", java.lang.Long.valueOf(b17.getAccMainProcStandByCount()));
        long accMainProcStandbyMs = b17.getAccMainProcStandbyMs();
        long j39 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        map.put("standby-minute", java.lang.Long.valueOf(accMainProcStandbyMs / j39));
        map.put("standby-dataPushCount", java.lang.Long.valueOf(b17.getAccMainProcStandByMsgCount()));
        map.put("all-voipCount", java.lang.Long.valueOf(b17.getAccAllVoipCount()));
        map.put("standby-voipCount", java.lang.Long.valueOf(b17.getAccMainProcStandByVoipCount()));
        long j47 = 0;
        while (b17.getAccMainProcStandByAddNsgGroup().values().iterator().hasNext()) {
            j47 += r7.next().size();
        }
        map.put("standby-addMsgGroupCount", java.lang.Integer.valueOf(b17.getAccMainProcStandByAddNsgGroup().keySet().size()));
        map.put("standby-addMsgCount", java.lang.Long.valueOf(j47));
        map.put("push-ready-cnt", java.lang.Long.valueOf(b17.getAccPushStartUpCount()));
        map.put("push-ready-avg", java.lang.Long.valueOf(b17.getAccPushStartUpAvgCostMs()));
        java.util.List<jz5.l> accProcSate = b17.getAccProcSate();
        long j48 = 0;
        for (jz5.l lVar : accProcSate) {
            j48 += ((java.lang.Number) lVar.f302834e).longValue() - ((java.lang.Number) lVar.f302833d).longValue();
        }
        float f17 = (float) j48;
        float f18 = (float) this.f242530h;
        map.put("push-port-0", java.lang.Long.valueOf(a06.d.c((f17 * 100.0f) / f18)));
        float f19 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        map.put("push-lost-min", java.lang.Long.valueOf(a06.d.c((f17 * 1.0f) / f19)));
        map.put("push-lost-cnt", java.lang.Integer.valueOf(accProcSate.size()));
        int size = accProcSate.size();
        if (5 <= size) {
            size = 5;
        }
        java.util.List<jz5.l> subList = accProcSate.subList(0, size);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        for (jz5.l lVar2 : subList) {
            arrayList.add(java.lang.Long.valueOf((((java.lang.Number) lVar2.f302834e).longValue() - ((java.lang.Number) lVar2.f302833d).longValue()) / j39));
        }
        map.put("push-lost-lst", kz5.n0.S0(arrayList));
        java.util.List<jz5.l> accHibernateList = b17.getAccHibernateList();
        long j49 = 0;
        for (jz5.l lVar3 : accHibernateList) {
            j49 += ((java.lang.Number) lVar3.f302834e).longValue() - ((java.lang.Number) lVar3.f302833d).longValue();
        }
        float f27 = (float) j49;
        map.put("doze-port-0", java.lang.Long.valueOf(a06.d.c((f27 * 100.0f) / f18)));
        map.put("doze-lost-min", java.lang.Long.valueOf(a06.d.c((f27 * 1.0f) / f19)));
        map.put("doze-lost-cnt", java.lang.Integer.valueOf(accHibernateList.size()));
        int size2 = accHibernateList.size();
        if (5 <= size2) {
            size2 = 5;
        }
        java.util.List<jz5.l> subList2 = accHibernateList.subList(0, size2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(subList2, 10));
        for (jz5.l lVar4 : subList2) {
            arrayList2.add(java.lang.Long.valueOf((((java.lang.Number) lVar4.f302834e).longValue() - ((java.lang.Number) lVar4.f302833d).longValue()) / j39));
        }
        map.put("doze-lost-lst", kz5.n0.S0(arrayList2));
        java.util.List V0 = kz5.n0.V0(b17.getAccNetworkState());
        boolean z17 = b17.getLastNetworkState() != null;
        long j57 = this.f242531i;
        if (z17) {
            jz5.l lastNetworkState = b17.getLastNetworkState();
            kotlin.jvm.internal.o.d(lastNetworkState);
            ((java.util.ArrayList) V0).add(new jz5.l(lastNetworkState.f302834e, java.lang.Long.valueOf(j57)));
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) V0;
        java.util.Iterator it6 = arrayList3.iterator();
        long j58 = 0;
        while (it6.hasNext()) {
            jz5.l lVar5 = (jz5.l) it6.next();
            j58 += ((java.lang.Number) lVar5.f302834e).longValue() - ((java.lang.Number) lVar5.f302833d).longValue();
        }
        float f28 = (float) j58;
        map.put("net-port-0", java.lang.Long.valueOf(a06.d.c((f28 * 100.0f) / f18)));
        map.put("net-lost-min", java.lang.Long.valueOf(a06.d.c((f28 * 1.0f) / f19)));
        map.put("net-lost-cnt", java.lang.Integer.valueOf(arrayList3.size()));
        int size3 = arrayList3.size();
        if (5 <= size3) {
            size3 = 5;
        }
        java.util.List<jz5.l> subList3 = arrayList3.subList(0, size3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(subList3, 10));
        for (jz5.l lVar6 : subList3) {
            arrayList4.add(java.lang.Long.valueOf((((java.lang.Number) lVar6.f302834e).longValue() - ((java.lang.Number) lVar6.f302833d).longValue()) / j39));
        }
        map.put("net-lost-lst", kz5.n0.S0(arrayList4));
        java.util.List V02 = kz5.n0.V0(b17.getAccMarsState());
        if (b17.getLastMarsState() != null) {
            jz5.l lastMarsState = b17.getLastMarsState();
            kotlin.jvm.internal.o.d(lastMarsState);
            ((java.util.ArrayList) V02).add(new jz5.l(lastMarsState.f302834e, java.lang.Long.valueOf(j57)));
        }
        java.util.ArrayList arrayList5 = (java.util.ArrayList) V02;
        java.util.Iterator it7 = arrayList5.iterator();
        long j59 = 0;
        while (it7.hasNext()) {
            jz5.l lVar7 = (jz5.l) it7.next();
            j59 += ((java.lang.Number) lVar7.f302834e).longValue() - ((java.lang.Number) lVar7.f302833d).longValue();
        }
        float f29 = (float) j59;
        map.put("mars-port-0", java.lang.Long.valueOf(a06.d.c((f29 * 100.0f) / f18)));
        map.put("mars-lost-min", java.lang.Long.valueOf(a06.d.c((f29 * 1.0f) / f19)));
        map.put("mars-lost-cnt", java.lang.Integer.valueOf(arrayList5.size()));
        int size4 = arrayList5.size();
        if (5 <= size4) {
            size4 = 5;
        }
        java.util.List<jz5.l> subList4 = arrayList5.subList(0, size4);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(subList4, 10));
        for (jz5.l lVar8 : subList4) {
            arrayList6.add(java.lang.Long.valueOf((((java.lang.Number) lVar8.f302834e).longValue() - ((java.lang.Number) lVar8.f302833d).longValue()) / j39));
        }
        map.put("mars-lost-lst", kz5.n0.S0(arrayList6));
        map.put("bg-during-cnt", java.lang.Long.valueOf(accProcLifeStats.getAccBgCount()));
        map.put("bg-during-avg", java.lang.Long.valueOf(accProcLifeStats.getAccBgAvgDuringMs()));
        map.put("notify-cost-cnt", java.lang.Long.valueOf(accProcLifeStats.getAccNotifyDispatchCount()));
        map.put("notify-cost-avg", java.lang.Long.valueOf(accProcLifeStats.getAccNotifyDispatchAvgCostMs()));
        if (accProcLifeStats.getAccVoipInviteCostList().isEmpty()) {
            c17 = 0;
        } else {
            java.util.List<jz5.l> accVoipInviteCostList = accProcLifeStats.getAccVoipInviteCostList();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(accVoipInviteCostList, 10));
            for (jz5.l lVar9 : accVoipInviteCostList) {
                arrayList7.add(java.lang.Long.valueOf(((java.lang.Number) lVar9.f302833d).longValue() + ((java.lang.Number) lVar9.f302834e).longValue()));
            }
            c17 = a06.d.c(kz5.n0.M(kz5.n0.S0(arrayList7)));
        }
        map.put("voip-cost-avg", java.lang.Long.valueOf(c17));
        if (accProcLifeStats.getAccVoipInviteCostList().isEmpty()) {
            c18 = 0;
        } else {
            java.util.List<jz5.l> accVoipInviteCostList2 = accProcLifeStats.getAccVoipInviteCostList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(accVoipInviteCostList2, 10));
            java.util.Iterator<T> it8 = accVoipInviteCostList2.iterator();
            while (it8.hasNext()) {
                arrayList8.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it8.next()).f302833d).longValue()));
            }
            c18 = a06.d.c(kz5.n0.M(kz5.n0.S0(arrayList8)));
        }
        map.put("voip-costDsp-avg", java.lang.Long.valueOf(c18));
        if (accProcLifeStats.getAccVoipInviteCostList().isEmpty()) {
            c19 = 0;
        } else {
            java.util.List<jz5.l> accVoipInviteCostList3 = accProcLifeStats.getAccVoipInviteCostList();
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(accVoipInviteCostList3, 10));
            java.util.Iterator<T> it9 = accVoipInviteCostList3.iterator();
            while (it9.hasNext()) {
                arrayList9.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it9.next()).f302834e).longValue()));
            }
            c19 = a06.d.c(kz5.n0.M(kz5.n0.S0(arrayList9)));
        }
        map.put("voip-costHdl-avg", java.lang.Long.valueOf(c19));
        map.put("notify-msg-cnt", accProcLifeStats.getAccMsgNotifyCost().f302833d);
        map.put("notify-msg-avg", accProcLifeStats.getAccMsgNotifyCost().f302834e);
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : accProcLifeStats.getAccMsgNotifyCostLevel().entrySet()) {
            map.put("notify-msg-l" + entry.getKey().intValue(), entry.getValue());
        }
        jz5.l lVar10 = new jz5.l("", 0);
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry2 : accProcLifeStats.getAccMsgNotifyAttrs().entrySet()) {
            map.put("notify-msgAttr-" + entry2.getKey(), entry2.getValue());
            if (entry2.getValue().intValue() > ((java.lang.Number) lVar10.f302834e).intValue()) {
                lVar10 = new jz5.l(entry2.getKey(), entry2.getValue());
            }
        }
        map.put("notify-msgAttr-top", lVar10.f302833d);
        java.util.List V03 = kz5.n0.V0(accProcLifeStats.getAccKernelStartUpCostList());
        java.util.ArrayList arrayList10 = (java.util.ArrayList) V03;
        int size5 = arrayList10.size();
        if (size5 > 0) {
            kz5.g0.t(V03, dr0.l0.f242458d);
            j17 = ((java.lang.Number) arrayList10.get(0)).longValue();
            long longValue = ((java.lang.Number) arrayList10.get(size5 / 2)).longValue();
            j19 = ((java.lang.Number) arrayList10.get(size5 - 1)).longValue();
            java.util.Iterator it10 = arrayList10.iterator();
            long j66 = 0;
            while (it10.hasNext()) {
                j66 += ((java.lang.Number) it10.next()).longValue();
            }
            j27 = j66 / size5;
            j18 = longValue;
        } else {
            j17 = 0;
            j18 = 0;
            j19 = 0;
            j27 = 0;
        }
        map.put("report-startUpCnt", java.lang.Integer.valueOf(size5));
        map.put("report-startUpAvg", java.lang.Long.valueOf(j27));
        map.put("report-startUpMax", java.lang.Long.valueOf(j19));
        map.put("report-startUpMid", java.lang.Long.valueOf(j18));
        map.put("report-startUpMin", java.lang.Long.valueOf(j17));
        java.util.List V04 = kz5.n0.V0(accProcLifeStats.getAccRecycleCostList());
        java.util.ArrayList arrayList11 = (java.util.ArrayList) V04;
        int size6 = arrayList11.size();
        if (size6 > 0) {
            kz5.g0.t(V04, dr0.m0.f242468d);
            i17 = 0;
            j28 = ((java.lang.Number) arrayList11.get(0)).longValue();
            j29 = ((java.lang.Number) arrayList11.get(size6 / 2)).longValue();
            j37 = ((java.lang.Number) arrayList11.get(size6 - 1)).longValue();
            java.util.Iterator it11 = arrayList11.iterator();
            long j67 = 0;
            while (it11.hasNext()) {
                j67 += ((java.lang.Number) it11.next()).longValue();
            }
            j38 = j67 / size6;
        } else {
            i17 = 0;
            j28 = 0;
            j29 = 0;
            j37 = 0;
            j38 = 0;
        }
        map.put("recycle-cost-cnt", java.lang.Integer.valueOf(size6));
        map.put("recycle-cost-avg", java.lang.Long.valueOf(j38));
        map.put("recycle-cost-max", java.lang.Long.valueOf(j37));
        map.put("recycle-cost-mid", java.lang.Long.valueOf(j29));
        map.put("recycle-cost-min", java.lang.Long.valueOf(j28));
        map.put("dead-main-count", java.lang.Long.valueOf(accProcLifeStats.getAccDeadCount()));
        map.put("dead-main-during", java.lang.Long.valueOf(accProcLifeStats.getAccDeadDuringMs()));
        map.put("dead-continuous-count", java.lang.Long.valueOf(accProcLifeStats.getAccContinuousRecycleCount()));
        for (java.util.Map.Entry entry3 : ((java.util.LinkedHashMap) wh.m.B(accProcLifeStats.getAccRecycleGroup(), dr0.n0.f242473d)).entrySet()) {
            int intValue = ((java.lang.Number) entry3.getKey()).intValue();
            map.put("recycle-from-" + intValue, java.lang.Long.valueOf(((java.lang.Number) entry3.getValue()).longValue()));
        }
        int i18 = i17;
        int i19 = i18;
        for (java.util.Map.Entry entry4 : ((java.util.LinkedHashMap) wh.m.B(accProcLifeStats.getAccPullUpGroup(), dr0.o0.f242480d)).entrySet()) {
            java.lang.String str = (java.lang.String) entry4.getKey();
            int intValue2 = ((java.lang.Number) entry4.getValue()).intValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pull-top-");
            i19++;
            sb6.append(i19);
            map.put(sb6.toString(), str);
            map.put("pull-of-" + str, java.lang.Integer.valueOf(intValue2));
            i18 += intValue2;
        }
        map.put("pull-total-count", java.lang.Integer.valueOf(i18));
        int i27 = i17;
        int i28 = i27;
        for (java.util.Map.Entry entry5 : ((java.util.LinkedHashMap) wh.m.B(accProcLifeStats.getAccRecycleAbortGroup(), dr0.p0.f242488d)).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry5.getKey();
            int intValue3 = ((java.lang.Number) entry5.getValue()).intValue();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("abort-top-");
            i28++;
            sb7.append(i28);
            map.put(sb7.toString(), str2);
            map.put("abort-of-" + str2, java.lang.Integer.valueOf(intValue3));
            i27 += intValue3;
        }
        map.put("abort-total-count", java.lang.Integer.valueOf(i27));
        java.util.List<jz5.l> accRecycleAbortCostList = accProcLifeStats.getAccRecycleAbortCostList();
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kz5.d0.q(accRecycleAbortCostList, 10));
        java.util.Iterator<T> it12 = accRecycleAbortCostList.iterator();
        while (it12.hasNext()) {
            arrayList12.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) it12.next()).f302833d).intValue()));
        }
        double L = kz5.n0.L(kz5.n0.S0(arrayList12));
        map.put("abortRetry-count-avg", java.lang.Integer.valueOf(java.lang.Double.isNaN(L) ? i17 : a06.d.a(L)));
        java.util.List<jz5.l> accRecycleAbortCostList2 = accProcLifeStats.getAccRecycleAbortCostList();
        java.util.ArrayList arrayList13 = new java.util.ArrayList(kz5.d0.q(accRecycleAbortCostList2, 10));
        java.util.Iterator<T> it13 = accRecycleAbortCostList2.iterator();
        while (it13.hasNext()) {
            arrayList13.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it13.next()).f302834e).longValue()));
        }
        double M = kz5.n0.M(kz5.n0.S0(arrayList13));
        map.put("abortRetry-cost-avg", java.lang.Long.valueOf(java.lang.Double.isNaN(M) ? 0L : a06.d.c(M)));
        int i29 = i17;
        int i37 = i29;
        for (java.util.Map.Entry entry6 : ((java.util.LinkedHashMap) wh.m.B(accProcLifeStats.getAccNetRunningGroup(), dr0.q0.f242499d)).entrySet()) {
            java.lang.String str3 = (java.lang.String) entry6.getKey();
            int intValue4 = ((java.lang.Number) entry6.getValue()).intValue();
            if (i37 < 5) {
                map.put("netRun-top-" + (i37 + 1), str3);
                map.put("netRun-of-" + str3, java.lang.Integer.valueOf(intValue4));
            }
            i29 += intValue4;
            i37++;
        }
        map.put("netRun-total-count", java.lang.Integer.valueOf(i29));
        int i38 = i17;
        for (java.util.Map.Entry entry7 : ((java.util.LinkedHashMap) wh.m.B(accProcLifeStats.getAccNetWaitingGroup(), dr0.r0.f242518d)).entrySet()) {
            java.lang.String str4 = (java.lang.String) entry7.getKey();
            int intValue5 = ((java.lang.Number) entry7.getValue()).intValue();
            if (i17 < 5) {
                map.put("netWait-top-" + (i17 + 1), str4);
                map.put("netWait-of-" + str4, java.lang.Integer.valueOf(intValue5));
            }
            i38 += intValue5;
            i17++;
        }
        return map.put("netWait-total-count", java.lang.Integer.valueOf(i38));
    }
}
