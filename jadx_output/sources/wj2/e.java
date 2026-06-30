package wj2;

/* loaded from: classes9.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446667d;

    public e(wj2.w wVar) {
        this.f446667d = wVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        wj2.w wVar = this.f446667d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = wVar.f446722o;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        g4Var.d(1, wVar.getContext().getResources().getColor(com.tencent.mm.R.color.f479323wd), wVar.getContext().getResources().getString(com.tencent.mm.R.string.f491605dn1));
    }
}
