package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.i1 f135109d = new com.tencent.mm.plugin.finder.viewmodel.component.i1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f135110e = kz5.c0.i(18, 20);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f135111f = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.h1.f134571d);

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.j1 f135113b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f135112a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f135114c = new java.util.LinkedHashSet();

    public m1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, java.lang.String str) {
        r45.cl2 cl2Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f135112a;
        for (java.util.Map.Entry entry : new java.util.HashMap(concurrentHashMap).entrySet()) {
            if (((com.tencent.mm.plugin.finder.viewmodel.component.k1) entry.getKey()).f134911b == i17) {
                com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) entry.getValue();
                if (j1Var.f134794f < 2) {
                    com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onFeedLoaderConsumeEnd unconsumed feed: " + j1Var + ", source: " + str);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("dispatchFeed", j1Var.a());
                    jSONObject.put("checkTime", java.lang.System.currentTimeMillis());
                    qc2.b bVar = qc2.b.f361509a;
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = j1Var.f134789a;
                    long id6 = finderObject.getId();
                    r45.dm2 object_extend = finderObject.getObject_extend();
                    long j17 = (object_extend == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null) ? 0L : cl2Var.getLong(1);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    qc2.b.a(bVar, 5, id6, i17, j17, false, "unconsume", 0, 0, false, jSONObject2, com.tencent.wcdb.FileUtils.S_IRWXU, null);
                    this.f135114c.remove(java.lang.Long.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.k1) entry.getKey()).f134910a));
                    concurrentHashMap.remove(entry.getKey());
                }
            }
        }
    }

    public final void b(com.tencent.mm.plugin.finder.viewmodel.component.j1 dispatchInfo) {
        r45.cl2 cl2Var;
        kotlin.jvm.internal.o.g(dispatchInfo, "dispatchInfo");
        int i17 = dispatchInfo.f134790b;
        if (f135110e.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onStreamCgiBack " + dispatchInfo);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = dispatchInfo.f134789a;
            com.tencent.mm.plugin.finder.viewmodel.component.k1 k1Var = new com.tencent.mm.plugin.finder.viewmodel.component.k1(finderObject.getId(), i17);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f135112a;
            com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) concurrentHashMap.get(k1Var);
            if (j1Var != null) {
                if (j1Var.f134794f < 2) {
                    com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onStreamCgiBack prev=" + j1Var + " new=" + dispatchInfo);
                }
                this.f135114c.remove(java.lang.Long.valueOf(j1Var.f134789a.getId()));
            }
            com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var2 = this.f135113b;
            long j17 = 0;
            long j18 = j1Var2 != null ? j1Var2.f134795g : 0L;
            if (j1Var2 != null && dispatchInfo.f134795g - j18 < 5000) {
                com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onStreamCgiBack dispatch time too similar, lastDispatch=" + this.f135113b + " nowDispatch=" + dispatchInfo);
                com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var3 = this.f135113b;
                kotlin.jvm.internal.o.d(j1Var3);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("new", dispatchInfo.a());
                jSONObject.put("old", j1Var3.a());
                qc2.b bVar = qc2.b.f361509a;
                long id6 = finderObject.getId();
                int i18 = dispatchInfo.f134790b;
                r45.dm2 object_extend = finderObject.getObject_extend();
                if (object_extend != null && (cl2Var = (r45.cl2) object_extend.getCustom(4)) != null) {
                    j17 = cl2Var.getLong(1);
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                qc2.b.a(bVar, 5, id6, i18, j17, false, "multidispatch", 0, 0, false, jSONObject2, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            }
            concurrentHashMap.put(k1Var, dispatchInfo);
            this.f135113b = dispatchInfo;
        }
    }
}
