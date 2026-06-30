package ee5;

/* loaded from: classes9.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.e3 f251857d;

    public d3(ee5.e3 e3Var) {
        this.f251857d = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        ee5.e3 e3Var = this.f251857d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = e3Var.f251868d;
        if (fTSSearchView != null && (ftsEditText2 = fTSSearchView.getFtsEditText()) != null) {
            ftsEditText2.m();
        }
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = e3Var.f251868d;
        if (fTSSearchView2 == null || (ftsEditText = fTSSearchView2.getFtsEditText()) == null) {
            return;
        }
        ftsEditText.t();
    }
}
