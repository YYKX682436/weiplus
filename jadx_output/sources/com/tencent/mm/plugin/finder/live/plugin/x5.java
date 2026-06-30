package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x5 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f115030p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.gj f115031q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        this.f115030p = (android.app.Activity) context;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 123) {
            com.tencent.mm.plugin.finder.live.widget.gj gjVar = this.f115031q;
            if (gjVar != null) {
                r45.o92 o92Var = ((mm2.u0) gjVar.f118447h.a(mm2.u0.class)).f329448n;
                if ((o92Var != null ? o92Var.getInteger(1) : 0) != 0) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.fj(o92Var != null ? o92Var.getString(2) : null, gjVar));
                    if (o92Var == null) {
                        return;
                    }
                    o92Var.set(1, 0);
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal != 220) {
            return;
        }
        if (this.f115031q == null) {
            com.tencent.mm.plugin.finder.live.widget.gj gjVar2 = new com.tencent.mm.plugin.finder.live.widget.gj(this.f115030p, S0());
            this.f115031q = gjVar2;
            this.f365323d.addView(gjVar2);
            com.tencent.mm.plugin.finder.live.widget.gj gjVar3 = this.f115031q;
            if (gjVar3 != null) {
                gjVar3.a(this);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.gj gjVar4 = this.f115031q;
        if (gjVar4 != null) {
            gjVar4.c();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mm.plugin.finder.live.widget.gj gjVar = this.f115031q;
        if (gjVar != null) {
            gjVar.f119168f = null;
            gjVar.b();
            gjVar.f118450n.setOnVisibilityListener(null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.widget.gj gjVar = this.f115031q;
        if (gjVar != null) {
            gjVar.a(this);
        }
    }
}
