package ib2;

/* loaded from: classes2.dex */
public final class l implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f290132e;

    public l(ib2.w wVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f290131d = wVar;
        this.f290132e = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ib2.w wVar = this.f290131d;
        o25.y1 y1Var = wVar.E;
        android.app.Activity context = wVar.getContext();
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) y1Var).wi(context, g4Var, this.f290132e);
    }
}
