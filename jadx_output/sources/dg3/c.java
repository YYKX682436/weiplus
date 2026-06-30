package dg3;

/* loaded from: classes3.dex */
public final class c implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f232319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232320b;

    public c(o25.y1 y1Var, dg3.k kVar) {
        this.f232319a = y1Var;
        this.f232320b = kVar;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        if (menuItem instanceof db5.h4) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f232320b.f232332d;
            kotlin.jvm.internal.o.d(k0Var);
            ((com.tencent.mm.pluginsdk.forward.m) this.f232319a).bj(k0Var, (db5.h4) menuItem);
        }
    }
}
