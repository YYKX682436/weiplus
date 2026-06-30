package ky2;

/* loaded from: classes.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313510e;

    public b(ky2.w wVar, android.view.View view) {
        this.f313509d = wVar;
        this.f313510e = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ky2.w wVar = this.f313509d;
        int i17 = wVar.f313589i;
        android.view.View view = this.f313510e;
        g4Var.f(i17, view.getContext().getString(com.tencent.mm.R.string.ejt));
        g4Var.f(wVar.f313590m, view.getContext().getString(com.tencent.mm.R.string.ejr));
    }
}
