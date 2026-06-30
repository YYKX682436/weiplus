package nr2;

/* loaded from: classes2.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f339170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f339172f;

    public d0(o25.y1 y1Var, nr2.j0 j0Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f339170d = y1Var;
        this.f339171e = j0Var;
        this.f339172f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.app.Activity context = this.f339171e.getContext();
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f339170d).wi(context, g4Var, this.f339172f);
    }
}
