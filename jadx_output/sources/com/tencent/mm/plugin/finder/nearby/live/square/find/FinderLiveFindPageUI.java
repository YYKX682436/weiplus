package com.tencent.mm.plugin.finder.nearby.live.square.find;

@db5.a(4096)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderLiveFindPageUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public boolean f121510w;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment f121509v = new com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment();

    /* renamed from: x, reason: collision with root package name */
    public final boolean f121511x = c92.g.f39738a.b();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "FinderLiveFindPageUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f121510w = true;
        rq2.x.f398914a.a();
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return this.f121511x ? com.tencent.mm.R.layout.ass : com.tencent.mm.R.layout.asr;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{wo2.n.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.rb.class)), xo2.b.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b8.class)), sp2.x3.class});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setNavigationBarColor(0);
        getWindow().addFlags(134217728);
        pf5.z zVar = pf5.z.f353948a;
        java.lang.String contextId = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        if ((contextId == null || contextId.length() == 0) == true) {
            com.tencent.mars.xlog.Log.i("FinderLiveFindPageUI", "New NearBy activity contextid is null");
        } else {
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            rq2.x xVar = rq2.x.f398914a;
            kotlin.jvm.internal.o.g(contextId, "contextId");
            com.tencent.mars.xlog.Log.i("NearbyTabLifecycleReporter", "Nearby setContextId:".concat(contextId));
            rq2.x.f398915b = contextId;
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        boolean z17 = this.f121511x;
        if (z17) {
            getController().p0(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
        }
        findViewById(com.tencent.mm.R.id.aae).setOnClickListener(new lp2.c(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.fnn)).setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(getContext()));
        ob2.a aVar = ae2.in.U3;
        int intValue = ((java.lang.Number) aVar.r()).intValue();
        if (intValue == 1) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.md6);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fnn);
            if (textView != null) {
                textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.h6z));
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f_h);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initNewUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.md6);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fnn);
            if (textView2 != null) {
                textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.dfa));
            }
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f_h);
            if (findViewById4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageUI", "initOldUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveFindPageUI", "useNewUI:" + intValue);
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment finderLiveFindPageFragment = this.f121509v;
        finderLiveFindPageFragment.setArguments(extras);
        android.os.Bundle arguments = finderLiveFindPageFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("key_use_dark_style", z17 ? 1 : 0);
        }
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.g7m, finderLiveFindPageFragment, null, 1);
        beginTransaction.n(finderLiveFindPageFragment);
        beginTransaction.e();
        finderLiveFindPageFragment.B0(this);
        ((wo2.n) zVar.a(this).a(wo2.n.class)).R6();
        if (((java.lang.Number) aVar.r()).intValue() == 0) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("FinderLiveEntrance");
        }
        this.f121510w = false;
        rq2.s sVar = rq2.s.f398879a;
        rq2.s.f398881c = c01.id.c();
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickActivityOnCreate");
        U6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyLiveSquareTabFragment);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderLiveFindPageUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new lp2.d(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f121509v.setArguments(intent != null ? intent.getExtras() : null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f121510w) {
            p52.c cVar = p52.h.f352016a;
            p52.h.f352017b = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        p52.c cVar = p52.h.f352016a;
        p52.h.f352017b = true;
        super.onResume();
    }
}
