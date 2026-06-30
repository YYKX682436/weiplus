package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l8 f113068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(com.tencent.mm.plugin.finder.live.plugin.l8 l8Var) {
        super(0);
        this.f113068d = l8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = this.f113068d;
        l8Var.t1(false);
        yz5.a aVar = l8Var.f113361s;
        if (aVar != null) {
            aVar.invoke();
        }
        if (!((mm2.c1) l8Var.P0(mm2.c1.class)).a8()) {
            qo0.c.a(l8Var.f113358p, qo0.b.f365394o4, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
