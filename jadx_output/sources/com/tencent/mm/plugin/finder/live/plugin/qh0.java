package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f114012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.aj f114013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh0(com.tencent.mm.plugin.finder.live.plugin.th0 th0Var, com.tencent.mm.plugin.finder.live.widget.aj ajVar) {
        super(0);
        this.f114012d = th0Var;
        this.f114013e = ajVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = this.f114012d;
        if (th0Var.f114406t == null) {
            android.content.Context context = th0Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.bh bhVar = new com.tencent.mm.plugin.finder.live.widget.bh(context);
            bhVar.a(th0Var);
            th0Var.f114406t = bhVar;
        }
        com.tencent.mm.plugin.finder.live.widget.bh bhVar2 = th0Var.f114406t;
        if (bhVar2 != null) {
            com.tencent.mm.ui.widget.dialog.y1 bottomSheet = this.f114013e.getBottomSheet();
            int i17 = com.tencent.mm.plugin.finder.live.widget.bh.U;
            bhVar2.h(bottomSheet, false);
        }
        return jz5.f0.f302826a;
    }
}
