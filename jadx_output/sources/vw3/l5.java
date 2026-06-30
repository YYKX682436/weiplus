package vw3;

/* loaded from: classes3.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSearchUI f441025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.plugin.repairer.ui.RepairerSearchUI repairerSearchUI) {
        super(1);
        this.f441025d = repairerSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText2;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText3;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText4;
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText5;
        hx3.b state = (hx3.b) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof hx3.a)) {
            com.tencent.mm.plugin.repairer.ui.RepairerSearchUI repairerSearchUI = this.f441025d;
            repairerSearchUI.getClass();
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) repairerSearchUI, false);
            repairerSearchUI.d = fTSSearchView;
            fTSSearchView.setSearchViewListener(repairerSearchUI);
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = repairerSearchUI.d;
            if (fTSSearchView2 != null && (ftsEditText5 = fTSSearchView2.getFtsEditText()) != null) {
                ftsEditText5.setHint("搜索配置");
            }
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = repairerSearchUI.d;
            if (fTSSearchView3 != null && (ftsEditText4 = fTSSearchView3.getFtsEditText()) != null) {
                ftsEditText4.g();
            }
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = repairerSearchUI.d;
            if (fTSSearchView4 != null && (ftsEditText3 = fTSSearchView4.getFtsEditText()) != null) {
                ftsEditText3.setFtsEditTextListener(repairerSearchUI);
            }
            androidx.appcompat.app.b supportActionBar = repairerSearchUI.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.y(repairerSearchUI.d);
            }
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = repairerSearchUI.d;
            if (fTSSearchView5 != null && (ftsEditText2 = fTSSearchView5.getFtsEditText()) != null) {
                ftsEditText2.m();
            }
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = repairerSearchUI.d;
            if (fTSSearchView6 != null && (ftsEditText = fTSSearchView6.getFtsEditText()) != null) {
                ftsEditText.t();
            }
        }
        return jz5.f0.f302826a;
    }
}
