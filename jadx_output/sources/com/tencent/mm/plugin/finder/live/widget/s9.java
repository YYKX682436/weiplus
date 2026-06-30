package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class s9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f119743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(int i17, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        super(0);
        this.f119743d = i17;
        this.f119744e = x9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zl2.r4.f473950a.W2(com.tencent.mm.plugin.finder.live.util.n2.f115640a.a(), this.f119743d, g92.b.f269769e.k2().getLong(5));
        com.tencent.mm.plugin.finder.live.widget.x9 x9Var = this.f119744e;
        jz5.l lVar = x9Var.T;
        if (lVar != null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Cj((ml2.g5) lVar.f302833d, (java.lang.Integer) lVar.f302834e);
        }
        android.content.Context context = x9Var.f118183e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var = (com.tencent.mm.plugin.finder.live.viewmodel.s8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.live.viewmodel.s8.class);
        if (s8Var != null) {
            s8Var.P6();
            s8Var.O6();
        }
        return jz5.f0.f302826a;
    }
}
