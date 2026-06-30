package ou4;

@j95.b
/* loaded from: classes8.dex */
public final class z extends i95.w implements ou4.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f349040d = jz5.h.b(ou4.y.f349039d);

    public void Ai(java.lang.String containerId) {
        kotlin.jvm.internal.o.g(containerId, "containerId");
        com.tencent.mars.xlog.Log.i("FlutterContainerService", "destroyContainer: containerId=".concat(containerId));
        ou4.x xVar = (ou4.x) ((jz5.n) this.f349040d).getValue();
        xVar.getClass();
        ou4.s sVar = (ou4.s) xVar.f349037b.remove(containerId);
        if (sVar != null) {
            java.util.Set set = (java.util.Set) xVar.f349038c.get(sVar.f349018b);
            if (set != null) {
                set.remove(containerId);
            }
            if (sVar.f349027k) {
                return;
            }
            com.tencent.mars.xlog.Log.i("FlutterContainer", "destroy: containerId=" + sVar.f349017a);
            try {
                sVar.f349024h.a();
                ((java.util.ArrayList) sVar.f349025i).clear();
                pi0.n1 n1Var = sVar.f349023g;
                if (n1Var != null) {
                    n1Var.a();
                }
                sVar.f349023g = null;
                sVar.f349022f = null;
                sVar.f349027k = true;
                ou4.x xVar2 = sVar.f349021e;
                java.lang.String containerId2 = sVar.f349017a;
                java.lang.String businessId = sVar.f349018b;
                xVar2.getClass();
                kotlin.jvm.internal.o.g(containerId2, "containerId");
                kotlin.jvm.internal.o.g(businessId, "businessId");
                xVar2.f349037b.remove(containerId2);
                java.util.Set set2 = (java.util.Set) xVar2.f349038c.get(businessId);
                if (set2 != null) {
                    set2.remove(containerId2);
                }
                com.tencent.mars.xlog.Log.i("FlutterContainer", "destroy: success, containerId=" + sVar.f349017a);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FlutterContainer", "destroy: failed, containerId=" + sVar.f349017a, e17);
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("FlutterContainerService", "onCreate");
    }

    public ou4.d0 wi(java.lang.String businessId, ou4.t config) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(businessId, "businessId");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i("FlutterContainerService", "createContainer: businessId=" + businessId + ", route=" + config.f349028a);
        ou4.x xVar = (ou4.x) ((jz5.n) this.f349040d).getValue();
        xVar.getClass();
        ou4.o oVar = (ou4.o) xVar.f349036a.get(businessId);
        if (oVar == null) {
            throw new ou4.u(businessId);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(businessId);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('_');
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String substring = uuid.substring(0, 8);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        java.lang.String sb7 = sb6.toString();
        ou4.s sVar = new ou4.s(sb7, businessId, oVar, config, xVar);
        xVar.f349037b.put(sb7, sVar);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = xVar.f349038c;
        java.lang.Object obj = concurrentHashMap.get(businessId);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(businessId, (obj = new java.util.LinkedHashSet()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.Set) obj).add(sb7);
        com.tencent.mars.xlog.Log.i("FlutterContainerManager", "createContainer: containerId=".concat(sb7));
        return sVar;
    }
}
