package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nv implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pv f135365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f135367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f135368e;

    public nv(java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar, java.lang.String str2, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f135364a = str;
        this.f135365b = pvVar;
        this.f135366c = str2;
        this.f135367d = gVar;
        this.f135368e = finderItem;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object next;
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            bu2.g0 g0Var = bu2.g0.f24511a;
            java.lang.String userName = this.f135364a;
            r45.s13 s13Var = (r45.s13) fVar.f70618d;
            kotlin.jvm.internal.o.g(userName, "userName");
            synchronized (g0Var) {
                java.util.Map map = bu2.g0.f24512b;
                if (map.containsKey(userName)) {
                    bu2.f0 f0Var = (bu2.f0) ((java.util.LinkedHashMap) map).get(userName);
                    if (f0Var != null) {
                        f0Var.f24506c = s13Var;
                    }
                } else {
                    if (map.size() >= bu2.g0.f24513c) {
                        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                long j17 = ((bu2.f0) ((java.util.Map.Entry) next).getValue()).f24504a;
                                do {
                                    java.lang.Object next2 = it.next();
                                    long j18 = ((bu2.f0) ((java.util.Map.Entry) next2).getValue()).f24504a;
                                    if (j17 > j18) {
                                        next = next2;
                                        j17 = j18;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) next;
                        if (entry != null && (str = (java.lang.String) entry.getKey()) != null) {
                        }
                    }
                    java.util.Map map2 = bu2.g0.f24512b;
                    bu2.f0 f0Var2 = new bu2.f0(0L, null, null, null, 15, null);
                    f0Var2.f24506c = s13Var;
                    map2.put(userName, f0Var2);
                }
            }
            kotlinx.coroutines.r2 r2Var = this.f135365b.f135631g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar = this.f135365b;
            pvVar.f135631g = pf5.e.launch$default(pvVar, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.mv(fVar, pvVar, this.f135364a, this.f135366c, this.f135367d, this.f135368e, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
