package nr2;

/* loaded from: classes2.dex */
public final class h0 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f339203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f339204b;

    public h0(o25.y1 y1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f339203a = y1Var;
        this.f339204b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) this.f339203a).bj(this.f339204b, (db5.h4) menuItem);
    }
}
