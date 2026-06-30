package com.tencent.mm.udr;

@j95.b
/* loaded from: classes5.dex */
public final class e1 extends i95.w implements com.tencent.mm.udr.c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f196480e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f196481f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f196482d = jz5.h.b(com.tencent.mm.udr.d1.f196479d);

    static {
        java.lang.Iterable all = ((fs.c) fs.g.f(ea5.l.class)).all();
        kotlin.jvm.internal.o.f(all, "all(...)");
        java.util.ArrayList<ea5.l> arrayList = new java.util.ArrayList();
        java.util.Iterator it = all.iterator();
        while (it.hasNext()) {
            ea5.l lVar = (ea5.l) ((fs.q) it.next()).get();
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        for (ea5.l lVar2 : arrayList) {
            java.lang.String projectId = lVar2.getProjectId();
            if (projectId != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "build class:%s for project:%s", lVar2.getClass().getName(), projectId);
                f196480e.put(projectId, lVar2);
                f196481f.add(projectId);
            }
            java.util.ArrayList<java.lang.String> projectIdList = lVar2.getProjectIdList();
            java.util.List<java.lang.String> S0 = projectIdList != null ? kz5.n0.S0(projectIdList) : null;
            if (S0 != null) {
                for (java.lang.String str : S0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "build class:%s for projectId:%s", lVar2.getClass().getName(), str);
                    f196480e.put(str, lVar2);
                    f196481f.add(str);
                }
            }
        }
    }

    public e1() {
        jz5.h.b(com.tencent.mm.udr.c1.f196476d);
    }

    public ea5.l wi(java.lang.String projectId) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f196480e;
        if (concurrentHashMap.containsKey(projectId)) {
            return (ea5.l) concurrentHashMap.get(projectId);
        }
        if (r26.i0.y(projectId, "wxalite", false)) {
            return (ea5.l) concurrentHashMap.get("wxalite");
        }
        return null;
    }
}
