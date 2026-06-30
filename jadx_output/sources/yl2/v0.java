package yl2;

/* loaded from: classes3.dex */
public final class v0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463079d;

    public v0(int i17, yl2.g1 g1Var, int i18) {
        this.f463079d = g1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        yl2.g1 g1Var = this.f463079d;
        g4Var.p(1, g1Var.f463008a.getString(com.tencent.mm.R.string.oyn), "", 0);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = g1Var.f463008a;
        g4Var.p(2, mMFragmentActivity.getString(com.tencent.mm.R.string.oyg), mMFragmentActivity.getString(com.tencent.mm.R.string.oyh), 0);
    }
}
