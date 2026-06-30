package com.tencent.mm.plugin.story.ui.album;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lcf4/b;", "<init>", "()V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryAlbumUI extends com.tencent.mm.ui.MMFragment implements cf4.b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f171867m = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f171868d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f171869e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f171870f;

    /* renamed from: g, reason: collision with root package name */
    public qf4.f f171871g;

    /* renamed from: h, reason: collision with root package name */
    public cf4.a f171872h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f171873i = "";

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View v17) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(v17, "v");
        super.dealContentView(v17);
        this.f171872h = new lf4.g(this);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        java.lang.String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra(dm.i4.COL_USERNAME);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f171873i = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAlbumUI", "initViews username=" + this.f171873i);
        android.view.View findViewById = v17.findViewById(com.tencent.mm.R.id.f482911rk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f171868d = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = v17.findViewById(com.tencent.mm.R.id.f482914rn);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = v17.findViewById(com.tencent.mm.R.id.f482814ol);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = v17.findViewById(com.tencent.mm.R.id.f482915ro);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = v17.findViewById(com.tencent.mm.R.id.f482815om);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = v17.findViewById(com.tencent.mm.R.id.f482910rj);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f171869e = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = v17.findViewById(com.tencent.mm.R.id.f482909ri);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f171870f = findViewById7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/album/StoryAlbumUI", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/plugin/story/ui/album/StoryAlbumUI", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qf4.f fVar = new qf4.f();
        this.f171871g = fVar;
        fVar.f362699o = new qf4.n(this);
        fVar.f362700p = qf4.o.f362712d;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f171868d;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        recyclerView.setAdapter(fVar);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f171868d;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f171868d;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        recyclerView3.i(new qf4.p(this));
        cf4.a aVar = this.f171872h;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("mPresenter");
            throw null;
        }
        java.lang.String userName = this.f171873i;
        lf4.g gVar = (lf4.g) aVar;
        kotlin.jvm.internal.o.g(userName, "userName");
        gVar.f318395e = userName;
        gVar.a(gVar.f318398h);
        gm0.j1.n().f273288b.a(191, gVar);
        gm0.j1.n().f273288b.a(3926, gVar);
        gm0.j1.n().f273288b.a(764, gVar);
        cf4.a aVar2 = this.f171872h;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("mPresenter");
            throw null;
        }
        ef4.v vVar = ef4.w.f252468t;
        vVar.l().post(new lf4.b((lf4.g) aVar2));
        cf4.a aVar3 = this.f171872h;
        if (aVar3 != null) {
            vVar.l().post(new lf4.c((lf4.g) aVar3));
        } else {
            kotlin.jvm.internal.o.o("mPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.f489543cw5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            cf4.a aVar = this.f171872h;
            if (aVar != null) {
                ef4.w.f252468t.l().post(new lf4.b((lf4.g) aVar));
            } else {
                kotlin.jvm.internal.o.o("mPresenter");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f489984hg);
        setBackBtn(new qf4.m(this));
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        cf4.a aVar = this.f171872h;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("mPresenter");
            throw null;
        }
        lf4.g gVar = (lf4.g) aVar;
        gm0.j1.n().f273288b.q(191, gVar);
        gm0.j1.n().f273288b.q(3926, gVar);
        gm0.j1.n().f273288b.q(764, gVar);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
