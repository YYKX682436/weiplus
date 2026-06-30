package zl2;

/* loaded from: classes3.dex */
public final class i2 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473820b;

    public i2(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f473819a = h0Var;
        this.f473820b = h0Var2;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj = this.f473819a.f310123d;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = c1Var != null ? c1Var.f328846n : null;
        if (obj == null || finderObject == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) obj;
        o25.y1 y1Var = (o25.y1) this.f473820b.f310123d;
        if (y1Var != null) {
            kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).bj(k0Var, (db5.h4) menuItem);
        }
    }
}
