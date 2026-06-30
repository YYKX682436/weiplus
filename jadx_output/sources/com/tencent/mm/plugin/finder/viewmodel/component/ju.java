package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ju implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nu f134897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f134898b;

    public ju(com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        this.f134897a = nuVar;
        this.f134898b = jbVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = this.f134897a;
        nuVar.f135356g = 0L;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && fVar.f70618d != null) {
            androidx.appcompat.app.AppCompatActivity activity = nuVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            int S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6();
            int integer = this.f134898b.N.getInteger(9);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadRedDotFeed: preload successfully.display tabType=");
            sb6.append(S6);
            sb6.append(",extInfo tabType=");
            sb6.append(integer);
            sb6.append(", feedId=");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
            com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb6.toString());
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(integer), null);
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127983v7).getValue()).r()).intValue();
        }
        return jz5.f0.f302826a;
    }
}
