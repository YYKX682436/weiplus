package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(0);
        this.f113187d = v3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113187d;
        if (v3Var.X == null) {
            android.content.Context context = v3Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            v3Var.X = new com.tencent.mm.plugin.finder.live.widget.xt(context, new com.tencent.mm.plugin.finder.live.plugin.m3(v3Var));
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "showReplayCancelWidget");
        com.tencent.mm.plugin.finder.live.widget.xt xtVar = v3Var.X;
        if (xtVar != null) {
            xtVar.w();
        }
        return jz5.f0.f302826a;
    }
}
