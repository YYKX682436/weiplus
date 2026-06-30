package ka4;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static ka4.f f306137b;

    /* renamed from: f, reason: collision with root package name */
    public static int f306141f;

    /* renamed from: g, reason: collision with root package name */
    public static int f306142g;

    /* renamed from: h, reason: collision with root package name */
    public static int f306143h;

    /* renamed from: i, reason: collision with root package name */
    public static int f306144i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f306145j;

    /* renamed from: a, reason: collision with root package name */
    public static final ka4.m f306136a = new ka4.m();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f306138c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f306139d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f306140e = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final gl0.a f306146k = new ka4.i();

    public static final /* synthetic */ int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        int i17 = f306141f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return i17;
    }

    public static final /* synthetic */ int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        int i17 = f306142g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return i17;
    }

    public static final void c(ka4.m mVar, java.util.ArrayList arrayList, boolean z17, ka4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        mVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + arrayList.size());
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_small_win_video_enable_v2, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + fj6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + arrayList2.size() + ", " + fj6 + ", " + z17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("after check ");
            sb6.append(arrayList2.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                boolean z18 = false;
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f306138c;
                if (z17 && concurrentHashMap.containsKey(snsInfo.getSnsId())) {
                    z18 = true;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "isPredicted >> " + snsInfo.getSnsId());
                } else {
                    ka4.m mVar2 = f306136a;
                    kotlin.jvm.internal.o.d(snsInfo);
                    if (mVar2.d(snsInfo, fj6)) {
                        java.lang.String snsId = snsInfo.getSnsId();
                        kotlin.jvm.internal.o.f(snsId, "getSnsId(...)");
                        concurrentHashMap.put(snsId, new ka4.a(ka4.b.f306116e, 0L, 0L));
                        arrayList3.add(snsInfo);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> after deal targetList size : " + arrayList3.size());
            ka4.f fVar = f306137b;
            if (fVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> but callback is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            } else {
                java.util.ArrayList a17 = ((rl0.a) fVar).a(arrayList3);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + java.lang.Integer.valueOf(a17.size()));
                if (!arrayList3.isEmpty()) {
                    int type = cVar.getType();
                    if (type == ka4.c.f306122e.getType()) {
                        f306143h = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.X(arrayList3)).getCreateTime();
                        f306144i = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(arrayList3)).getCreateTime();
                    } else if (type == ka4.c.f306123f.getType()) {
                        f306141f = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.X(arrayList3)).getCreateTime();
                    } else if (type == ka4.c.f306124g.getType()) {
                        f306142g = ((com.tencent.mm.plugin.sns.storage.SnsInfo) kz5.n0.i0(arrayList3)).getCreateTime();
                    }
                }
                if (!(a17.isEmpty())) {
                    gl0.c.a(a17, f306146k);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }

    public final boolean d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> " + snsInfo.getSnsId() + ", wsConfig: " + z17);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        r45.a90 a90Var = timeLine.ContentObj;
        java.util.LinkedList linkedList = a90Var != null ? a90Var.f369840h : null;
        r45.jj4 jj4Var = linkedList == null || linkedList.isEmpty() ? null : (r45.jj4) linkedList.get(0);
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        if (snsInfo.isAd() || jj4Var.N) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " is ad");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        if (jj4Var.R * 1000 <= ck4.a.f42533g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " is toLow");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        if (snsInfo.getUserName().equals(com.tencent.mm.plugin.sns.model.l4.sj())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " is self");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
        if (((com.tencent.mm.protocal.protobuf.SnsObject) parseFrom).WeiShangVideoSourceType == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_small_win_video_enable_v2, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + fj6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            if (fj6) {
                jj4Var.U = "V4";
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.getSnsId() + " mediaId:" + jj4Var.f377855d + " no to predict for weiShang");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                return false;
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f306139d;
        java.lang.String Id = jj4Var.f377855d;
        kotlin.jvm.internal.o.f(Id, "Id");
        java.lang.String snsId = snsInfo.getSnsId();
        kotlin.jvm.internal.o.f(snsId, "getSnsId(...)");
        concurrentHashMap.put(Id, snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return true;
    }

    public final ka4.a e(java.lang.String snsId) {
        ka4.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPredictTypeBySnsId", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        ka4.a aVar = (ka4.a) f306138c.get(snsId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPredictTypeBySnsId >> ");
        sb6.append(snsId);
        sb6.append(", ");
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            bVar = aVar.f306113a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        } else {
            bVar = null;
        }
        sb6.append(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPredictTypeBySnsId", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return aVar;
    }

    public final void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        ka4.o oVar = ka4.o.f306149a;
        if (oVar.a()) {
            boolean z17 = true;
            if (oVar.c() == 1) {
                boolean d17 = oVar.d();
                boolean d18 = d(snsInfo, d17);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setPreSnsInfoToPredict >> " + d17 + ", " + snsInfo.getSnsId() + ", " + d18);
                if (d18) {
                    ka4.f fVar = f306137b;
                    if (fVar == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> but callback is null");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                        return;
                    }
                    if (fVar != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(snsInfo);
                        arrayList = ((rl0.a) fVar).a(arrayList2);
                    } else {
                        arrayList = null;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSnsInfoToPredict >> ");
                    sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z17 = false;
                    }
                    if (!z17) {
                        gl0.c.a(arrayList, f306146k);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setPreSnsInfoToPredict >> is no to predict");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }
}
