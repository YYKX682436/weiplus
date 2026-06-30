package ee5;

/* loaded from: classes9.dex */
public final class e3 extends com.tencent.mm.ui.component.UIComponent implements tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f251868d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f251869e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f251870f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f251871g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f251872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251869e = "";
        this.f251870f = "";
        this.f251871g = true;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onEditTextChange: " + str2 + ", " + str + ", " + oVar);
        if (!(str == null || str.length() == 0)) {
            if (oVar == tj5.o.UserInput) {
                java.lang.String p17 = o13.n.p(str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f251870f) && kotlin.jvm.internal.o.b(this.f251870f, p17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "Same query %s %s", this.f251870f, p17);
                    return;
                }
                kotlin.jvm.internal.o.d(p17);
                this.f251870f = p17;
                kotlinx.coroutines.r2 r2Var = this.f251872h;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                this.f251872h = pf5.e.launch$default(this, null, null, new ee5.c3(p17, this, null), 3, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "dealClearText");
        kotlinx.coroutines.r2 r2Var2 = this.f251872h;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f251870f = "";
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((ee5.a3) zVar.a(activity).a(ee5.a3.class)).P6(0);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((ee5.q3) zVar.a(activity2).a(ee5.q3.class)).T6(8);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        ((ee5.z) zVar.a(activity3).a(ee5.z.class)).X6("");
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.g(activity4, "activity");
        ee5.h0 h0Var = (ee5.h0) zVar.a(activity4).a(ee5.h0.class);
        h0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "clear text");
        h0Var.Q6();
        if (h0Var.f251896e != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(h0Var.f251896e);
        }
        kotlinx.coroutines.r2 r2Var3 = h0Var.f251909u;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var4 = h0Var.F;
        if (r2Var4 != null) {
            kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var5 = h0Var.f251912x;
        if (r2Var5 != null) {
            kotlinx.coroutines.p2.a(r2Var5, null, 1, null);
        }
        ce5.d dVar = h0Var.f251911w;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadMoreImageDataModel", "reset");
        dVar.f40812a = null;
        kotlinx.coroutines.r2 r2Var6 = dVar.f40814c;
        if (r2Var6 != null) {
            kotlinx.coroutines.p2.a(r2Var6, null, 1, null);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onSearchKeyDown");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f251868d;
        if (fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null) {
            return false;
        }
        ftsEditText.d();
        return false;
    }

    public final void O6() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "hideKB");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f251868d;
        if (fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null) {
            return;
        }
        ftsEditText.d();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onEditTextFocusChange");
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onTagClick");
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onClickBackBtn");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
        getActivity().finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "onClickClearTextBtn");
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f251868d;
        if (fTSSearchView != null && (ftsEditText = fTSSearchView.getFtsEditText()) != null) {
            ftsEditText.m();
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).showVKB();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f251869e = getString(com.tencent.mm.R.string.f490549y8);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchViewUIC", "initSearchView");
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) getActivity(), false);
        this.f251868d = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f251868d;
        kotlin.jvm.internal.o.d(fTSSearchView2);
        fTSSearchView2.getFtsEditText().setHint(this.f251869e);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f251868d;
        kotlin.jvm.internal.o.d(fTSSearchView3);
        fTSSearchView3.getFtsEditText().g();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f251868d;
        kotlin.jvm.internal.o.d(fTSSearchView4);
        fTSSearchView4.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f251868d;
        kotlin.jvm.internal.o.d(fTSSearchView5);
        fTSSearchView5.getFtsEditText().setCanDeleteTag(false);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.appcompat.app.b supportActionBar = ((com.tencent.mm.ui.MMActivity) activity).getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.y(this.f251868d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f251871g) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f251868d;
            if (fTSSearchView != null) {
                fTSSearchView.postDelayed(new ee5.d3(this), 128L);
            }
            this.f251871g = false;
        }
    }
}
