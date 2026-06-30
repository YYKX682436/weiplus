package yw;

/* loaded from: classes3.dex */
public final class i2 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f466353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f466354b;

    public i2(o25.y1 y1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f466353a = y1Var;
        this.f466354b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) this.f466353a).bj(this.f466354b, (db5.h4) menuItem);
    }
}
