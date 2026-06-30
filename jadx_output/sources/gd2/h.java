package gd2;

/* loaded from: classes3.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270531d;

    public h(gd2.i iVar) {
        this.f270531d = iVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        gd2.i iVar = this.f270531d;
        o25.y1 y1Var = iVar.f270540i;
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new gd2.g(iVar));
    }
}
