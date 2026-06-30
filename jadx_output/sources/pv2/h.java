package pv2;

/* loaded from: classes10.dex */
public abstract class h implements pv2.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f358579a = new java.util.HashMap();

    @Override // pv2.j
    public void a(java.lang.String taskId, pv2.g from, pv2.g to6) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        long c17 = c01.id.c();
        java.util.HashMap hashMap = this.f358579a;
        java.lang.Object obj = hashMap.get(taskId);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(taskId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(from);
        if (obj2 == null) {
            obj2 = new pv2.k();
            map.put(from, obj2);
        }
        pv2.k kVar = (pv2.k) obj2;
        kVar.f358581b = c17;
        if (!(to6 instanceof pv2.m)) {
            boolean z17 = to6 instanceof pv2.l;
        }
        long j17 = c17 - kVar.f358580a;
        com.tencent.mars.xlog.Log.i(((vv2.a) this).f440427b, "stageFinish, stage:" + pv2.i.a(from) + ", enterTime:" + kVar.f358580a + ", exitTime:" + kVar.f358581b);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = from instanceof tv2.p ? ((tv2.p) from).f422325h : from instanceof tv2.f ? ((tv2.f) from).f422300h : from instanceof tv2.v ? ((tv2.v) from).f422331h : null;
        if (finderItem != null && (finderFeedReportObject = finderItem.field_reportObject) != null) {
            int i17 = (int) j17;
            finderFeedReportObject.setPostTaskCost(finderFeedReportObject.getPostTaskCost() + i17);
            if (from instanceof tv2.f) {
                finderFeedReportObject.setMediaProcessCost(finderFeedReportObject.getMediaProcessCost() + i17);
            }
            if (from instanceof tv2.v) {
                finderFeedReportObject.setUploadCost(finderFeedReportObject.getUploadCost() + i17);
            }
        }
        java.lang.Object obj3 = hashMap.get(taskId);
        if (obj3 == null) {
            obj3 = new java.util.HashMap();
            hashMap.put(taskId, obj3);
        }
        java.util.Map map2 = (java.util.Map) obj3;
        java.lang.Object obj4 = map2.get(to6);
        if (obj4 == null) {
            obj4 = new pv2.k();
            map2.put(to6, obj4);
        }
        ((pv2.k) obj4).f358580a = c17;
    }

    @Override // pv2.j
    public void b(java.lang.String taskId, pv2.g endStage) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(endStage, "endStage");
        java.util.HashMap hashMap = this.f358579a;
        java.lang.Object obj = hashMap.get(taskId);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(taskId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(endStage);
        if (obj2 == null) {
            obj2 = new pv2.k();
            map.put(endStage, obj2);
        }
        ((pv2.k) obj2).f358581b = c01.id.c();
    }

    @Override // pv2.j
    public void c(java.lang.String taskId, pv2.g beginStage) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(beginStage, "beginStage");
        java.util.HashMap hashMap = this.f358579a;
        hashMap.remove(taskId);
        java.lang.Object obj = hashMap.get(taskId);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(taskId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(beginStage);
        if (obj2 == null) {
            obj2 = new pv2.k();
            map.put(beginStage, obj2);
        }
        ((pv2.k) obj2).f358580a = c01.id.c();
    }
}
