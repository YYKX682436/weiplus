package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlockListSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderBlockListSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements tj5.w, tj5.n {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f128521z = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f128522t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f128523u;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.uj0 f128526x;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f128524v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f128525w = "";

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f128527y = jz5.h.b(new com.tencent.mm.plugin.finder.ui.u1(this));

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            c7("");
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f128522t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = r26.n0.u0(totalQuery).toString()) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return true;
        }
        c7(str);
        return false;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final void c7(java.lang.String str) {
        android.database.Cursor U = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, str, this.f128525w, "", null);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (U.moveToNext()) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(U);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setUsername(z3Var.d1());
            linkedList.add(finderContact);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(new so2.i0((com.tencent.mm.protocal.protobuf.FinderContact) it.next()));
        }
        java.util.ArrayList arrayList2 = this.f128524v;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f128523u;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        ((vb2.d) ((jz5.n) this.f128527y).getValue()).f434531b.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aee;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        jz5.g gVar = this.f128527y;
        ((vb2.d) ((jz5.n) gVar).getValue()).f434531b.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        this.f128523u = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI$initView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == so2.i0.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.p();
                }
                kotlin.jvm.internal.o.d(null);
                throw new jz5.d();
            }
        }, this.f128524v, true);
        ((vb2.d) ((jz5.n) gVar).getValue()).f434531b.setAdapter(this.f128523u);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f128523u;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f293104n = new com.tencent.mm.plugin.finder.ui.s1(this);
        }
        if (wxRecyclerAdapter == null) {
            return;
        }
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.ui.t1(this);
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f128522t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f128522t = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f128522t;
        com.tencent.mm.plugin.finder.storage.uj0 uj0Var = null;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f128522t;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f128522t;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f128522t;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f128522t;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView6);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f128522t;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f128522t;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView8.getFtsEditText().t();
        initView();
        java.lang.String stringExtra = getIntent().getStringExtra("BLOCK_LIST_SEARCH_TYPE");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f128525w = stringExtra;
        if (kotlin.jvm.internal.o.b(stringExtra, "@finder.block.my.liked.android")) {
            uj0Var = new com.tencent.mm.plugin.finder.storage.za0();
        } else if (kotlin.jvm.internal.o.b(stringExtra, "@finder.block.his.liked.android")) {
            uj0Var = new com.tencent.mm.plugin.finder.storage.ua0();
        }
        this.f128526x = uj0Var;
        c7("");
    }
}
