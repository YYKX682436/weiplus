package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(0);
        this.f113344d = v3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113344d;
        km2.b bVar = v3Var.S;
        java.lang.Integer num = null;
        if ((bVar != null ? bVar.f309070t : null) == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "showReplayCancelWidget:finishInfo.liveInfo is null");
        } else {
            java.lang.Integer valueOf = (bVar == null || (nw1Var2 = bVar.f309070t) == null) ? null : java.lang.Integer.valueOf(nw1Var2.getInteger(31));
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "Current replay status: " + valueOf);
            if (valueOf != null && valueOf.intValue() == 3) {
                com.tencent.mm.plugin.finder.live.plugin.t1 t1Var = new com.tencent.mm.plugin.finder.live.plugin.t1(v3Var);
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "[cancelLongFeedGen]");
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 0);
                r45.r02 r02Var = new r45.r02();
                r02Var.set(0, 0);
                r02Var.set(1, 0);
                r02Var.set(2, 0);
                r02Var.set(3, 0);
                r02Var.set(4, 0);
                r02Var.set(5, 1);
                r02Var.set(6, 0);
                hx0Var.set(1, com.tencent.mm.protobuf.g.b(r02Var.toByteArray()));
                v3Var.t1(hx0Var, t1Var);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                android.view.ViewGroup viewGroup = v3Var.f365323d;
                java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.nv7);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.content.Context context = viewGroup.getContext();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = string;
                e4Var.c();
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showReplayCancelWidget Unexpected replay status: ");
                km2.b bVar2 = v3Var.S;
                if (bVar2 != null && (nw1Var = bVar2.f309070t) != null) {
                    num = java.lang.Integer.valueOf(nw1Var.getInteger(31));
                }
                sb6.append(num);
                com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", sb6.toString());
            }
        }
        return jz5.f0.f302826a;
    }
}
