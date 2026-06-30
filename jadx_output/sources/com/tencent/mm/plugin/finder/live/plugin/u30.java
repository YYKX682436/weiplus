package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f114515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f114516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f114517g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(kotlin.jvm.internal.h0 h0Var, k91.v5 v5Var, android.content.Context context, cm2.b0 b0Var) {
        super(0);
        this.f114514d = h0Var;
        this.f114515e = v5Var;
        this.f114516f = context;
        this.f114517g = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        ((az2.f) this.f114514d.f310123d).b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        cm2.b0 b0Var = this.f114517g;
        android.content.Context context = this.f114516f;
        jz5.f0 f0Var2 = null;
        k91.v5 v5Var = this.f114515e;
        if (v5Var != null && (str = v5Var.field_nickname) != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211729s = context.getString(com.tencent.mm.R.string.m3r, str);
                aVar.A = false;
                aVar.f211732v = context.getString(com.tencent.mm.R.string.m3p);
                aVar.f211733w = context.getString(com.tencent.mm.R.string.m3q);
                aVar.E = new com.tencent.mm.plugin.finder.live.plugin.s30(context, b0Var);
                aVar.F = com.tencent.mm.plugin.finder.live.plugin.t30.f114337d;
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.show();
                f0Var2 = f0Var;
            }
        }
        if (f0Var2 == null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.protocal.protobuf.FinderJumpInfo info = b0Var.f43331v;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        return f0Var;
    }
}
