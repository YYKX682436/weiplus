package te2;

/* loaded from: classes3.dex */
public final class t7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418439d;

    public t7(te2.p8 p8Var) {
        this.f418439d = p8Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        te2.p8 p8Var = this.f418439d;
        boolean z17 = true;
        g4Var.d(1, p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0), p8Var.getContext().getResources().getString(com.tencent.mm.R.string.e0m));
        java.lang.String str = p8Var.f418333y1;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        g4Var.d(2, p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), p8Var.getContext().getResources().getString(com.tencent.mm.R.string.e0n));
    }
}
