package df2;

/* loaded from: classes3.dex */
public final class mw extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f230813m;

    /* renamed from: n, reason: collision with root package name */
    public int f230814n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230813m = jz5.h.b(df2.lw.f230723d);
        this.f230814n = -1;
    }

    public final boolean Z6() {
        return ((java.lang.Boolean) ((jz5.n) this.f230813m).getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        hn0.r rVar;
        kn0.g gVar;
        java.lang.Object obj;
        kn0.g gVar2;
        kn0.g gVar3;
        r45.ka4 ka4Var;
        kn0.p pVar;
        super.onFloatMode();
        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, enableMiniWindowLowBitrate=" + Z6());
        if (Z6()) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (r4Var.y1(getStore().getLiveRoomData())) {
                com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for is anchor or assistant, isAnchor=" + r4Var.w1());
                return;
            }
            tn0.w0 Q6 = Q6();
            if (((Q6 == null || (pVar = Q6.D) == null || !pVar.e()) ? false : true) == true) {
                com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for audio mode");
                return;
            }
            if (((mm2.c1) business(mm2.c1.class)).f8()) {
                com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for visitor only audio");
                return;
            }
            kn0.i iVar = ((mm2.e1) business(mm2.e1.class)).f328990t;
            jz5.f0 f0Var = null;
            r7 = null;
            r7 = null;
            java.lang.Integer num = null;
            f0Var = null;
            java.util.LinkedList linkedList = (iVar == null || (gVar3 = iVar.f309558b) == null || (ka4Var = gVar3.f309548o) == null) ? null : ka4Var.f378560z1;
            if ((linkedList != null && linkedList.contains(1)) != true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSwitchToLowBitrateStream: source=onFloatMode, return for server switch close, svrSwitchList=");
                sb6.append(linkedList != null ? kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null) : null);
                com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", sb6.toString());
                return;
            }
            if (((mm2.e1) business(mm2.e1.class)).g7() || ((mm2.e1) business(mm2.e1.class)).b7()) {
                com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for voice room live");
                return;
            }
            if (!((mm2.o4) business(mm2.o4.class)).E7()) {
                tn0.w0 Q62 = Q6();
                if ((Q62 != null && Q62.X()) == false) {
                    if (((mm2.c1) business(mm2.c1.class)).P6() != 1) {
                        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for audienceMode=" + ((mm2.c1) business(mm2.c1.class)).P6());
                        return;
                    }
                    if (com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a) == -1) {
                        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for no network");
                        return;
                    }
                    xn0.i.f455424d.getClass();
                    xn0.e eVar = xn0.i.f455425e;
                    if (eVar.compareTo(xn0.e.f455415i) >= 0) {
                        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for poor network, netQuality=" + eVar);
                        return;
                    }
                    tn0.w0 Q63 = Q6();
                    co0.s sVar = Q63 instanceof co0.s ? (co0.s) Q63 : null;
                    if (sVar != null && (rVar = sVar.R1) != null) {
                        if (!rVar.h()) {
                            com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for is not playing");
                            return;
                        }
                        int i17 = rVar.f282413e;
                        kn0.i iVar2 = ((mm2.e1) business(mm2.e1.class)).f328990t;
                        int d17 = (iVar2 == null || (gVar2 = iVar2.f309558b) == null) ? 0 : gVar2.d(i17);
                        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, current qualityCfg=" + i17 + ", videoQualityLevel=" + d17 + ", netQuality=" + eVar);
                        if (d17 > 3) {
                            kn0.i iVar3 = ((mm2.e1) business(mm2.e1.class)).f328990t;
                            if (iVar3 != null && (gVar = iVar3.f309558b) != null) {
                                java.util.Set entrySet = gVar.f309544k.entrySet();
                                kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                                java.util.Iterator it = entrySet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it.next();
                                        if ((((kn0.r) ((java.util.Map.Entry) obj).getValue()).f309597b == 3) != false) {
                                            break;
                                        }
                                    }
                                }
                                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                                if (entry != null) {
                                    num = (java.lang.Integer) entry.getKey();
                                }
                            }
                            if (num == null) {
                                com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, can not get HD quality url");
                                return;
                            }
                            boolean m17 = hn0.r.m(rVar, num.intValue(), null, false, ((je2.z) business(je2.z.class)).P6(), 6, null);
                            com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, switchSuccess=" + m17);
                            if (m17) {
                                this.f230814n = i17;
                            }
                        }
                        f0Var = jz5.f0.f302826a;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.w("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: error, live core is null, source=onFloatMode");
                        return;
                    }
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for link mic");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        hn0.r rVar;
        super.onLiveStartFromWindow();
        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "onLiveStartFromWindow: enableMiniWindowLowBitrate=" + Z6() + ", qualityCfgBeforeMiniWindow=" + this.f230814n);
        if (!Z6() || this.f230814n <= -1) {
            return;
        }
        tn0.w0 Q6 = Q6();
        java.lang.Boolean bool = null;
        co0.s sVar = Q6 instanceof co0.s ? (co0.s) Q6 : null;
        if (sVar != null && (rVar = sVar.R1) != null) {
            bool = java.lang.Boolean.valueOf(hn0.r.m(rVar, this.f230814n, null, false, ((je2.z) business(je2.z.class)).P6(), 6, null));
        }
        this.f230814n = -1;
        com.tencent.mars.xlog.Log.i("LiveVisitorLowBitrateController", "onLiveStartFromWindow: switch back quality, switchSuccess=" + bool);
    }
}
