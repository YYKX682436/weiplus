package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlockListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderBlockListUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f128528z = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f128529t = "Finder.FinderBlockListUI";

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter f128530u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.uj0 f128531v;

    /* renamed from: w, reason: collision with root package name */
    public int f128532w;

    /* renamed from: x, reason: collision with root package name */
    public long f128533x;

    /* renamed from: y, reason: collision with root package name */
    public int f128534y;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aed;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.finder.storage.uj0 ua0Var;
        this.f128532w = getIntent().getIntExtra("BLOCK_LIST_TYPE", 0);
        this.f128533x = getIntent().getLongExtra("FEED_ID", 0L);
        int intExtra = getIntent().getIntExtra("FROM_SOURCE", 0);
        this.f128534y = intExtra;
        int i17 = this.f128532w;
        if (i17 != 1) {
            ua0Var = i17 != 2 ? i17 != 3 ? null : new com.tencent.mm.plugin.finder.storage.q() : new com.tencent.mm.plugin.finder.storage.za0();
        } else {
            hc2.v0.c(this, iy1.c.FinderDontShowHisLikesPage, "page_in", false, kz5.c1.k(new jz5.l("dont_show_his_likes_page_source_page", java.lang.Integer.valueOf(intExtra)), new jz5.l("feed_id", pm0.v.u(this.f128533x))), 4, null);
            ua0Var = new com.tencent.mm.plugin.finder.storage.ua0();
        }
        this.f128531v = ua0Var;
        if (ua0Var == null) {
            finish();
        }
        com.tencent.mm.plugin.finder.storage.uj0 uj0Var = this.f128531v;
        kotlin.jvm.internal.o.d(uj0Var);
        setMMTitle(uj0Var.i());
        setBackBtn(new com.tencent.mm.plugin.finder.ui.v1(this));
        com.tencent.mm.plugin.finder.storage.uj0 uj0Var2 = this.f128531v;
        kotlin.jvm.internal.o.d(uj0Var2);
        this.f128530u = new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter(uj0Var2);
        android.view.View contentView = getContentView();
        kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f128530u;
        kotlin.jvm.internal.o.d(blockListPresenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback blockListViewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListViewCallback(this, contentView, blockListPresenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter2 = this.f128530u;
        kotlin.jvm.internal.o.d(blockListPresenter2);
        blockListPresenter2.f122566e = blockListViewCallback;
        blockListViewCallback.b();
        com.tencent.mm.plugin.finder.storage.uj0 uj0Var3 = this.f128531v;
        kotlin.jvm.internal.o.d(uj0Var3);
        if (uj0Var3.a()) {
            addIconOptionMenu(0, getString(com.tencent.mm.R.string.eol), com.tencent.mm.R.raw.icons_outlined_add_friends, new com.tencent.mm.plugin.finder.ui.w1(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.O1(intent != null ? intent.getStringExtra("Select_Contact") : null, ",");
            kotlin.jvm.internal.o.d(O1);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(O1, 10));
            for (java.lang.String str : O1) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                finderContact.setUsername(str);
                arrayList.add(finderContact);
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f128530u;
            if (blockListPresenter != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderContact) it.next()).getUsername();
                    if (username == null) {
                        username = "";
                    }
                    arrayList2.add(username);
                }
                blockListPresenter.f122565d.b(arrayList2);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f128530u;
        if (blockListPresenter != null) {
            blockListPresenter.onDetach();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract.BlockListPresenter blockListPresenter = this.f128530u;
        if (blockListPresenter != null) {
            blockListPresenter.f();
        }
    }
}
