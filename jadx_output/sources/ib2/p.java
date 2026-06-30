package ib2;

/* loaded from: classes2.dex */
public final class p implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f290149b;

    public p(ib2.w wVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f290148a = wVar;
        this.f290149b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        o25.y1 y1Var = this.f290148a.E;
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) y1Var).bj(this.f290149b, (db5.h4) menuItem);
    }
}
