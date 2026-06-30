package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ep implements com.tencent.mm.plugin.finder.live.util.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f112443a;

    public ep(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        this.f112443a = dqVar;
    }

    public boolean c(android.view.View view, int i17, int i18, com.tencent.mm.plugin.finder.live.util.n state, dk2.g comboData, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(comboData, "comboData");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback on " + state + ", clickCnt:" + i17 + ", diffCnt is " + i18 + ", comboId is " + comboData.f233467b + ", needCheckBalance:" + z17 + ", networkEnable:" + this.f112443a.V + " isFromPatchSend: " + z18);
        if (com.tencent.mm.plugin.finder.live.plugin.cp.f112183a[state.ordinal()] == 1) {
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f112443a;
            if (dqVar.X) {
                qo0.b bVar = qo0.b.f365344e2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_MEMBER_LIST_AUTOREFRESH_VALUE", dqVar.Y);
                dqVar.f112321p.statusChange(bVar, bundle);
            }
            this.f112443a.C1();
            return true;
        }
        java.lang.String str = this.f112443a.f112325r;
        dk2.u7 u7Var = dk2.u7.f234181a;
        u7Var.h(str, false);
        ce2.i e17 = u7Var.e(str);
        if (str == null || e17 == null) {
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar2 = this.f112443a;
            dqVar2.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.up(null, dqVar2));
            this.f112443a.F1();
            return false;
        }
        if (!z17 || z18) {
            int i19 = z18 ? i18 : 1;
            int P0 = ((int) e17.P0()) * i19;
            com.tencent.mm.plugin.finder.live.util.t tVar = this.f112443a.N;
            boolean z19 = tVar != null ? tVar.f115691m : true;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback quota batchCount: " + i19 + ", totalPrice: " + P0 + "  curBalance: " + ((mm2.c1) this.f112443a.P0(mm2.c1.class)).f328880s3 + "isCurrentSingleClickEnable: " + z19);
            if (z19) {
                com.tencent.mm.plugin.finder.live.plugin.dq.D1(this.f112443a, str, i18, comboData, false, z18, 8, null);
            }
        } else {
            int P02 = (int) e17.P0();
            long j17 = ((mm2.c1) this.f112443a.P0(mm2.c1.class)).f328880s3;
            if (j17 < 0 && P02 > 0) {
                i18 -= (int) java.lang.Math.ceil(((-j17) * 1.0d) / P02);
            }
            if (!this.f112443a.x1(P02, false)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback quota disable, safeDiffCnt - 1");
                i18--;
            }
            int i27 = i18;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback price = " + P02 + ", realTimeBalance = " + j17 + ", safeDiffCnt = " + i27);
            if (i27 > 0) {
                com.tencent.mm.plugin.finder.live.plugin.dq.D1(this.f112443a, str, i27, comboData, false, false, 24, null);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0149, code lost:
    
        if ((r9 != null ? r9.longValue() : 0) >= r33) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x056f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.view.View r29, int r30, com.tencent.mm.plugin.finder.live.util.n r31, dk2.g r32, int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ep.d(android.view.View, int, com.tencent.mm.plugin.finder.live.util.n, dk2.g, int, boolean):boolean");
    }
}
