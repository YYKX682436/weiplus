package ey2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.u f257470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ey2.u uVar) {
        super(1);
        this.f257470d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ey0 ey0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem item = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
        kotlin.jvm.internal.o.g(item, "item");
        r45.en2 en2Var = this.f257470d.f257526e;
        if (en2Var != null && (ey0Var = (r45.ey0) en2Var.getCustom(11)) != null) {
            item.setColumnId(ey0Var.getInteger(0));
        }
        com.tencent.mm.plugin.finder.search.l4.f125764d.put(java.lang.Long.valueOf(item.getId()), item);
        sc2.p2.f406143b.a().a(kz5.b0.c(item));
        return jz5.f0.f302826a;
    }
}
