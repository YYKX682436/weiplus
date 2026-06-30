package ql2;

/* loaded from: classes10.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj4.e0 f364554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ql2.v f364555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ql2.u f364556c;

    public t(pj4.e0 e0Var, ql2.v vVar, ql2.u uVar) {
        this.f364554a = e0Var;
        this.f364555b = vVar;
        this.f364556c = uVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish get info:");
        pj4.e0 e0Var = this.f364554a;
        sb6.append(e0Var.f355030g);
        sb6.append(" result:");
        sb6.append(fVar.f70616b);
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder3rdLiveStatusService", sb6.toString());
        if (fVar.b() && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            r45.g92 finderLive = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0).getFinderLive();
            ql2.v vVar = this.f364555b;
            java.util.Map map = vVar.f364563e;
            kotlin.jvm.internal.o.f(map, "access$getLiveShareCache$p(...)");
            map.put(e0Var.f355030g, finderLive);
            ql2.u uVar = this.f364556c;
            uVar.f364559e = finderLive;
            java.util.Iterator it = vVar.f364564f.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                jz5.l lVar = (jz5.l) next;
                if (kotlin.jvm.internal.o.b(lVar.f302833d, e0Var.f355030g)) {
                    ql2.r rVar = (ql2.r) ((java.lang.ref.WeakReference) lVar.f302834e).get();
                    if (rVar != null) {
                        rVar.p(finderLive);
                    }
                    it.remove();
                }
            }
            uVar.r();
        }
        return jz5.f0.f302826a;
    }
}
