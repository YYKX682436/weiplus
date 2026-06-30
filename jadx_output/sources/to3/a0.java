package to3;

/* loaded from: classes9.dex */
public class a0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public to3.y f420946g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f420943d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f420944e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f420945f = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: h, reason: collision with root package name */
    public final to3.z f420947h = new to3.z(this, null);

    /* renamed from: i, reason: collision with root package name */
    public final int f420948i = 14400000;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f420949m = new com.tencent.mm.sdk.platformtools.b4(new to3.w(this), false);

    public a0() {
        long j17;
        try {
            com.tencent.mm.wallet_core.model.g.c().f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineTokensMgr", "NO MPERMISSION for READ_PHONE_STATE:%s.", e17);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        java.lang.String Ni = to3.c0.Ai().Ni(196649);
        if (android.text.TextUtils.isEmpty(Ni) || !yo3.m.j(Ni)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval: update_interval is empty or is not number,update token");
        } else {
            java.lang.String Ni2 = to3.c0.Ai().Ni(196632);
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval: token is not over update interval,lastUpdate is " + Ni2);
            long longValue = java.lang.Long.valueOf(Ni).longValue();
            if (!android.text.TextUtils.isEmpty(Ni2)) {
                long longValue2 = java.lang.Long.valueOf(Ni2).longValue();
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval token is not over update interval,curTime = " + currentTimeMillis + ";");
                j17 = longValue - (currentTimeMillis - longValue2);
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + j17);
                long j18 = j17 * 1000;
                this.f420949m.c(j18, j18);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval lastUpdate is empty, update token");
        }
        j17 = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + j17);
        long j182 = j17 * 1000;
        this.f420949m.c(j182, j182);
    }

    public void a(int i17, int i18) {
        if (yo3.m.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "offline kinda enable, update offline token in kinda");
            ((h45.q) i95.n0.c(h45.q.class)).updateOfflinePayTokenFromScene(i17);
        } else if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && yo3.m.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "onNotify return false, token is invalid, do doNetSceneToken");
            b(i17, i18);
        }
    }

    public void b(int i17, int i18) {
        if (this.f420943d) {
            return;
        }
        if (wo3.b.f448141n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflineTokensMgr", "is doing setofflinepayment");
            return;
        }
        this.f420943d = true;
        wo3.l lVar = new wo3.l("" + (java.lang.System.currentTimeMillis() / 1000), i17, i18);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(lVar);
        boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
        boolean isNetworkConnected = com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14163, 4, java.lang.Integer.valueOf(!z17 ? 1 : 0), java.lang.Integer.valueOf(isNetworkConnected ? 1 : 0), 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(to3.c0.f420951i ? 1 : 0));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(135);
        iDKey.SetValue(1L);
        iDKey.SetKey(isNetworkConnected ? 36 : 37);
        arrayList.add(iDKey);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(135);
        iDKey2.SetValue(1L);
        iDKey2.SetKey(z17 ? 38 : 39);
        arrayList.add(iDKey2);
        com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
        iDKey3.SetID(135);
        iDKey3.SetValue(1L);
        iDKey3.SetKey(to3.c0.f420951i ? 40 : 41);
        arrayList.add(iDKey3);
        if (i17 == 2) {
            com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
            iDKey4.SetID(135);
            iDKey4.SetValue(1L);
            iDKey4.SetKey(to3.c0.f420951i ? 42 : 43);
            arrayList.add(iDKey4);
            com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
            iDKey5.SetID(135);
            iDKey5.SetValue(1L);
            iDKey5.SetKey(z17 ? 44 : 45);
            arrayList.add(iDKey5);
            com.tencent.mars.smc.IDKey iDKey6 = new com.tencent.mars.smc.IDKey();
            iDKey6.SetID(135);
            iDKey6.SetValue(1L);
            iDKey6.SetKey(isNetworkConnected ? 46 : 47);
            arrayList.add(iDKey6);
        } else if (i17 == 6) {
            com.tencent.mars.smc.IDKey iDKey7 = new com.tencent.mars.smc.IDKey();
            iDKey7.SetID(135);
            iDKey7.SetValue(1L);
            iDKey7.SetKey(to3.c0.f420951i ? 48 : 49);
            arrayList.add(iDKey7);
            com.tencent.mars.smc.IDKey iDKey8 = new com.tencent.mars.smc.IDKey();
            iDKey8.SetID(135);
            iDKey8.SetValue(1L);
            iDKey8.SetKey(z17 ? 50 : 51);
            arrayList.add(iDKey8);
            com.tencent.mars.smc.IDKey iDKey9 = new com.tencent.mars.smc.IDKey();
            iDKey9.SetID(135);
            iDKey9.SetValue(1L);
            iDKey9.SetKey(isNetworkConnected ? 52 : 53);
            arrayList.add(iDKey9);
        } else if (i17 == 6) {
            com.tencent.mars.smc.IDKey iDKey10 = new com.tencent.mars.smc.IDKey();
            iDKey10.SetID(135);
            iDKey10.SetValue(1L);
            iDKey10.SetKey(z17 ? 54 : 55);
            arrayList.add(iDKey10);
        }
        g0Var.j(arrayList, true, false);
    }

    public void c(int i17, int i18) {
        if (d(true) > 2) {
            this.f420945f.postDelayed(new to3.x(this, i17, i18), 3000L);
        } else {
            b(i17, i18);
        }
    }

    public int d(boolean z17) {
        java.lang.String Ni = to3.c0.Ai().Ni(196617);
        com.tencent.mm.wallet_core.model.g.c().getClass();
        int tokenCount = com.tenpay.ndk.CertUtil.getInstance().getTokenCount(Ni);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "offline tokens count:" + tokenCount);
        return tokenCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(boolean r15) {
        /*
            r14 = this;
            boolean r0 = yo3.m.i()
            r1 = 1
            java.lang.String r2 = "MicroMsg.OfflineTokensMgr"
            if (r0 == 0) goto L1a
            java.lang.String r15 = "enable kinda, check ifneed update token in kinda"
            com.tencent.mars.xlog.Log.i(r2, r15)
            java.lang.Class<h45.q> r15 = h45.q.class
            i95.m r15 = i95.n0.c(r15)
            h45.q r15 = (h45.q) r15
            r15.checkIfNeedUpdateOfflinePayToken()
            return r1
        L1a:
            boolean r0 = yo3.m.k()
            r3 = 0
            if (r0 != 0) goto L27
            java.lang.String r15 = "offline is not create!"
            com.tencent.mars.xlog.Log.e(r2, r15)
            return r3
        L27:
            int r0 = r14.d(r1)
            int r4 = to3.c0.Bi()
            r5 = 9
            if (r0 >= r4) goto L75
            int r0 = to3.c0.Bi()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "getTokenCount < %s, do doNetSceneToken"
            com.tencent.mars.xlog.Log.i(r2, r4, r0)
            com.tencent.mm.wallet_core.model.g r0 = com.tencent.mm.wallet_core.model.g.c()
            int r0 = r0.d()
            if (r0 == 0) goto L65
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "getTokenCount occurs error, the error is "
            r15.<init>(r1)
            r15.append(r0)
            java.lang.String r0 = ", don't  doNetSceneToken"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.mars.xlog.Log.e(r2, r15)
            return r3
        L65:
            java.lang.String r0 = "getTokenCount is success! do doNetSceneToken"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r0 = 2
            if (r15 == 0) goto L71
            r14.c(r0, r5)
            goto L74
        L71:
            r14.c(r0, r0)
        L74:
            return r1
        L75:
            to3.c0 r0 = to3.c0.Ai()
            r4 = 196632(0x30018, float:2.7554E-40)
            java.lang.String r0 = r0.Ni(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L87
            goto La2
        L87:
            int r4 = yo3.m.g()
            long r6 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r8 = r0.longValue()
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            long r10 = r10 - r8
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto La2
            r0 = r1
            goto La3
        La2:
            r0 = r3
        La3:
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "WalletOfflineUtil.isTokenOverUpdateInterval() return false, token is over update_interval, do doNetSceneToken"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r0 = 5
            if (r15 == 0) goto Lb1
            r14.b(r0, r5)
            goto Lb4
        Lb1:
            r14.b(r0, r0)
        Lb4:
            return r1
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: to3.a0.e(boolean):boolean");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        to3.y yVar;
        to3.f fVar;
        if (m1Var instanceof wo3.h) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z17 = m1Var instanceof wo3.l;
            if (z17) {
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(135);
                iDKey.SetValue(1L);
                iDKey.SetKey(2);
                arrayList.add(iDKey);
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                    iDKey2.SetID(135);
                    iDKey2.SetValue(1L);
                    iDKey2.SetKey(3);
                    arrayList.add(iDKey2);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f420945f;
            to3.z zVar = this.f420947h;
            if (i17 != 0 || i18 != 0) {
                if (z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OfflineTokensMgr", "gettoken is failed!");
                    int i19 = this.f420944e + 1;
                    this.f420944e = i19;
                    this.f420943d = false;
                    if (i18 == 411) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "errcode is  411, do clearAllOfflineData");
                        yo3.m.a();
                        return;
                    } else {
                        if (i18 != 268465326 && i19 < 10) {
                            n3Var.removeCallbacks(zVar);
                            int i27 = this.f420944e - 1;
                            if (i27 > 6) {
                                i27 = 6;
                            }
                            n3Var.postDelayed(zVar, ((int) java.lang.Math.pow(2.0d, i27)) * 60 * 1000);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (z17) {
                this.f420944e = 0;
                this.f420943d = false;
                n3Var.removeCallbacks(zVar);
                if (!((wo3.l) m1Var).J() || (yVar = this.f420946g) == null) {
                    return;
                }
                to3.n nVar = ((to3.m) yVar).f420969a;
                if (nVar.f420942a == null) {
                    return;
                }
                for (int i28 = 0; i28 < ((java.util.ArrayList) nVar.f420942a).size(); i28++) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) nVar.f420942a).get(i28);
                    if (weakReference != null && (fVar = (to3.f) weakReference.get()) != null) {
                        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = (com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) fVar;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "token update, check if need refresh code");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(walletOfflineCoinPurseUI.f152516l1) && !com.tencent.mm.sdk.platformtools.t8.K0(walletOfflineCoinPurseUI.f152526p1)) {
                            r45.ak0 ak0Var = ((com.tencent.mm.plugin.offline.ui.h4) walletOfflineCoinPurseUI.component(com.tencent.mm.plugin.offline.ui.h4.class)).f152638d;
                            if (ak0Var == null || ak0Var.f370061d == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "has code showing, ignore code update");
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 75L, 1L, false);
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_offline_code_update_from_gettoken, false)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "abtest update code from get token is true, update code");
                                    walletOfflineCoinPurseUI.r7(0, false);
                                    walletOfflineCoinPurseUI.Z6(true);
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "code is null or has disable block need update code");
                        walletOfflineCoinPurseUI.r7(0, false);
                        walletOfflineCoinPurseUI.Z6(true);
                    }
                }
            }
        }
    }
}
