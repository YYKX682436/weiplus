package gd2;

/* loaded from: classes3.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270527d;

    public e(gd2.i iVar) {
        this.f270527d = iVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        gd2.i iVar = this.f270527d;
        o25.y1 y1Var = iVar.f270540i;
        com.tencent.mm.ui.MMActivity mMActivity = iVar.f270532a;
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = iVar.f270538g;
        if (k0Var != null) {
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).wi(mMActivity, g4Var, k0Var);
        } else {
            kotlin.jvm.internal.o.o("menu");
            throw null;
        }
    }
}
