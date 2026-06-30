package ib2;

/* loaded from: classes2.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f290147e;

    public o(ib2.w wVar, r45.ev2 ev2Var) {
        this.f290146d = wVar;
        this.f290147e = ev2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ib2.w wVar = this.f290146d;
        o25.y1 y1Var = wVar.E;
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new ib2.n(wVar, this.f290147e));
    }
}
