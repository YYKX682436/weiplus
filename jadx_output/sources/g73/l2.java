package g73;

/* loaded from: classes15.dex */
public final class l2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g73.m2 f269287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(android.os.Looper looper, g73.m2 m2Var) {
        super(looper);
        this.f269287a = m2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        g73.m2 m2Var = this.f269287a;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "handle retry message");
            m2Var.g();
            return;
        }
        com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "handle commit message");
        m2Var.getClass();
        try {
            java.lang.String k17 = wo.w0.k();
            java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.util.Collection collection = m2Var.f269302s;
            m2Var.f269302s = null;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = m2Var.f269291e;
            if (collection != null) {
                e73.k kVar = new e73.k(4, collection, 0L, 4, null);
                kotlin.jvm.internal.o.d(formatedNetType);
                java.lang.String a17 = kVar.a(k17, formatedNetType, 1000, 57344);
                if (a17.length() > 0) {
                    concurrentLinkedQueue.add(a17);
                    m2Var.f();
                }
            }
            java.lang.String str = "";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) m2Var.f269300q).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                boolean booleanValue = ((java.lang.Boolean) entry.getValue()).booleanValue();
                java.util.Map map = m2Var.f269298o;
                java.util.Map map2 = m2Var.f269297n;
                if (booleanValue) {
                    boolean containsKey = map2.containsKey(str2);
                    java.util.Map map3 = m2Var.f269301r;
                    if (containsKey) {
                        java.lang.Object obj = ((java.util.LinkedHashMap) map2).get(str2);
                        kotlin.jvm.internal.o.d(obj);
                        java.lang.Object obj2 = ((java.util.LinkedHashMap) map3).get(str2);
                        kotlin.jvm.internal.o.d(obj2);
                        ((com.tencent.mm.plugin.handoff.model.HandOff) obj).setId((java.lang.String) obj2);
                        arrayList2.add(obj);
                    } else if (map.containsKey(str2)) {
                        java.lang.Object obj3 = ((java.util.LinkedHashMap) map).get(str2);
                        kotlin.jvm.internal.o.d(obj3);
                        java.lang.Object obj4 = ((java.util.LinkedHashMap) map3).get(str2);
                        kotlin.jvm.internal.o.d(obj4);
                        ((com.tencent.mm.plugin.handoff.model.HandOff) obj3).setId((java.lang.String) obj4);
                        arrayList2.add(obj3);
                    } else {
                        java.util.Map map4 = m2Var.f269299p;
                        if (map4.containsKey(str2)) {
                            java.lang.Object obj5 = ((java.util.LinkedHashMap) map4).get(str2);
                            kotlin.jvm.internal.o.d(obj5);
                            java.lang.Object obj6 = ((java.util.LinkedHashMap) map3).get(str2);
                            kotlin.jvm.internal.o.d(obj6);
                            ((com.tencent.mm.plugin.handoff.model.HandOff) obj5).setId((java.lang.String) obj6);
                            arrayList3.add(obj5);
                        }
                    }
                } else if (map2.containsKey(str2)) {
                    java.lang.Object obj7 = ((java.util.LinkedHashMap) map2).get(str2);
                    kotlin.jvm.internal.o.d(obj7);
                    arrayList.add(obj7);
                } else if (map.containsKey(str2)) {
                    java.lang.Object obj8 = ((java.util.LinkedHashMap) map).get(str2);
                    kotlin.jvm.internal.o.d(obj8);
                    arrayList.add(obj8);
                }
            }
            if (!arrayList3.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("");
                e73.k kVar2 = new e73.k(2, arrayList3, 0L, 4, null);
                kotlin.jvm.internal.o.d(formatedNetType);
                sb6.append(kVar2.a(k17, formatedNetType, 1000, 57344));
                str = sb6.toString();
            }
            if (!arrayList2.isEmpty()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str);
                e73.k kVar3 = new e73.k(3, arrayList2, 0L, 4, null);
                kotlin.jvm.internal.o.d(formatedNetType);
                sb7.append(kVar3.a(k17, formatedNetType, 1000, 57344));
                str = sb7.toString();
            }
            if (!arrayList.isEmpty()) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(str);
                e73.k kVar4 = new e73.k(1, arrayList, 0L, 4, null);
                kotlin.jvm.internal.o.d(formatedNetType);
                sb8.append(kVar4.a(k17, formatedNetType, 1000, 57344));
                str = sb8.toString();
            }
            if (str.length() > 0) {
                concurrentLinkedQueue.add(str);
                m2Var.f();
            }
            m2Var.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HandOff.StatusManager", "commit fail:", e17);
        }
    }
}
