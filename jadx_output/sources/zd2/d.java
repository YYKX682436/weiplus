package zd2;

/* loaded from: classes10.dex */
public final class d implements yd2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd2.d f471600a = new zd2.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f471601b = new java.util.concurrent.ConcurrentHashMap();

    public static final java.lang.String d(zd2.d dVar, java.util.List list) {
        java.lang.String str;
        dVar.getClass();
        cl0.e eVar = new cl0.e();
        for (java.lang.Object obj : list) {
            if (obj instanceof java.util.Map) {
                cl0.g gVar = new cl0.g();
                java.util.Map map = (java.util.Map) obj;
                java.lang.Object obj2 = map.get("product_id");
                if (obj2 == null || (str = obj2.toString()) == null) {
                    str = "";
                }
                gVar.h("product_id", str);
                java.lang.Object obj3 = map.get("count");
                java.lang.Number number = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
                gVar.o("count", number != null ? number.intValue() : 1);
                eVar.q(gVar);
            }
        }
        java.lang.String eVar2 = eVar.toString();
        kotlin.jvm.internal.o.f(eVar2, "toString(...)");
        return eVar2;
    }

    @Override // yd2.a
    public long a() {
        return 30000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [android.app.Activity] */
    @Override // yd2.a
    public void b(yd2.l lVar, yd2.b context, yz5.q completion) {
        jz5.l lVar2;
        com.tencent.mm.plugin.finder.live.aiassistant.tools.LotteryCreateParams params = (com.tencent.mm.plugin.finder.live.aiassistant.tools.LotteryCreateParams) lVar;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(completion, "completion");
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: prizeType=" + params.prizeType + ", winnerCount=" + params.winnerCount + ", attendType=" + params.attendType);
        int i17 = params.prizeType;
        if (i17 != 0 && i17 != 2) {
            lVar2 = new jz5.l(2121, "invalid prizeType: " + params.prizeType);
        } else if (params.winnerCount <= 0) {
            lVar2 = new jz5.l(2122, "invalid winnerCount: " + params.winnerCount);
        } else {
            boolean z17 = true;
            if (kz5.c0.i(1, 2, 3, 4, 5).contains(java.lang.Integer.valueOf(params.attendType))) {
                if (params.attendType == 3) {
                    java.lang.String str = params.attendComment;
                    if (str == null || str.length() == 0) {
                        lVar2 = new jz5.l(2124, "attendType=3 requires attendComment");
                    }
                }
                if (params.prizeType == 0) {
                    java.lang.String str2 = params.lotteryDescription;
                    if (str2 == null || str2.length() == 0) {
                        lVar2 = new jz5.l(2125, "Custom prize requires lotteryDescription");
                    } else if (params.claimType == null || kz5.n0.O(kz5.c0.i(0, 1, 2), params.claimType)) {
                        java.lang.Integer num = params.claimType;
                        if (num != null && num.intValue() == 2) {
                            java.lang.String str3 = params.claimRemindWording;
                            if (str3 == null || str3.length() == 0) {
                                lVar2 = new jz5.l(2127, "claimType=2 requires claimRemindWording");
                            }
                        }
                    } else {
                        lVar2 = new jz5.l(2126, "invalid claimType: " + params.claimType);
                    }
                }
                if (params.prizeType == 2) {
                    if (params.giftDistributeType == null || !kz5.n0.O(kz5.c0.i(0, 1), params.giftDistributeType)) {
                        lVar2 = new jz5.l(2128, "PackageGift requires valid giftDistributeType(0/1)");
                    } else {
                        java.util.List<?> list = params.giftItems;
                        if (list != null && !list.isEmpty()) {
                            z17 = false;
                        }
                        if (z17) {
                            lVar2 = new jz5.l(2129, "PackageGift requires giftItems");
                        }
                    }
                }
                lVar2 = null;
            } else {
                lVar2 = new jz5.l(2123, "invalid attendType: " + params.attendType);
            }
        }
        if (lVar2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lotteryCreate: validation failed: ");
            java.lang.String str4 = (java.lang.String) lVar2.f302834e;
            sb6.append(str4);
            com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", sb6.toString());
            completion.invoke(java.lang.Boolean.FALSE, "{\"error\":\"" + str4 + "\"}", lVar2.f302833d);
            return;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        android.content.Context context2 = k0Var != null ? k0Var.getContext() : null;
        com.tencent.mm.ui.MMActivity mMActivity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        gk2.e liveRoomData = liveRoomControllerStore != null ? liveRoomControllerStore.getLiveRoomData() : null;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no activity");
            completion.invoke(java.lang.Boolean.FALSE, "{\"error\":\"no_vc\"}", 2101);
            return;
        }
        if (liveRoomData == null) {
            com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no buContext/liveTask");
            completion.invoke(java.lang.Boolean.FALSE, "{\"error\":\"no_live_task\"}", 2102);
            return;
        }
        long j17 = ((mm2.e1) liveRoomData.a(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) liveRoomData.a(mm2.e1.class)).f328983m;
        java.lang.String str5 = ((mm2.c1) liveRoomData.a(mm2.c1.class)).f328852o;
        byte[] bArr = ((mm2.e1) liveRoomData.a(mm2.e1.class)).f328985o;
        com.tencent.mm.ui.MMActivity mMActivity2 = mMActivity instanceof com.tencent.mm.ui.MMActivity ? mMActivity : null;
        if (mMActivity2 == null) {
            com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no lifecycleScope");
            completion.invoke(java.lang.Boolean.FALSE, "{\"error\":\"no_lifecycle_scope\"}", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT));
        } else {
            kotlinx.coroutines.y0 b17 = v65.m.b(mMActivity2);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new zd2.c(completion, mMActivity, j17, j18, bArr, str5, params, null), 2, null);
        }
    }

    @Override // yd2.a
    public boolean c(yd2.b context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (dk2.ef.f233372a.e() == null) {
            com.tencent.mars.xlog.Log.w("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: no anchorCore");
            return false;
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        gk2.e liveRoomData = liveRoomControllerStore != null ? liveRoomControllerStore.getLiveRoomData() : null;
        if (liveRoomData != null && ((on2.z2) liveRoomData.a(on2.z2.class)).f347096q) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: lottery not enabled");
        return false;
    }

    public final void e(java.lang.String requestId, boolean z17, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        yz5.q qVar = (yz5.q) f471601b.remove(requestId);
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("Finder.Live.AiAssistant.ToolLotteryCreate", "onPrefillComplete: no pending callback for requestId=".concat(requestId));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolLotteryCreate", "onPrefillComplete: requestId=" + requestId + ", success=" + z17 + ", errorCode=" + i17);
        if (z17) {
            qVar.invoke(java.lang.Boolean.TRUE, "{\"error_code\":0}", 0);
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"error_code\":");
        sb6.append(i17);
        sb6.append(",\"error\":\"");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\"}");
        qVar.invoke(bool, sb6.toString(), java.lang.Integer.valueOf(i17));
    }
}
