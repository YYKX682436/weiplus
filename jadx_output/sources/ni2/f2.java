package ni2;

/* loaded from: classes10.dex */
public final class f2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.k2 f337297d;

    public f2(ni2.k2 k2Var) {
        this.f337297d = k2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        ni2.k2 k2Var = this.f337297d;
        g4Var.f(1, k2Var.f337359a.getResources().getString(com.tencent.mm.R.string.jz6));
        g4Var.f(4, k2Var.f337359a.getResources().getString(com.tencent.mm.R.string.lmr));
    }
}
