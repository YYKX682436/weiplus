package com.tencent.mm.plugin.finder.member.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/widget/AbsListView$OnScrollListener;", "<init>", "()V", "lo2/g", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMemberFanListUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements android.widget.AbsListView.OnScrollListener {
    public static final /* synthetic */ int B = 0;
    public com.tencent.mm.protobuf.g A;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ListView f121392v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f121393w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f121396z;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f121390t = kotlinx.coroutines.z0.b();

    /* renamed from: u, reason: collision with root package name */
    public final bu2.a0 f121391u = new bu2.a0("MemberFansList.fp");

    /* renamed from: x, reason: collision with root package name */
    public final lo2.g f121394x = new lo2.g(this);

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f121395y = new java.util.ArrayList();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afn;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(eo2.b.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new lo2.m(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ceg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f121392v = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f121393w = textView;
        textView.setTextSize(0, getResources().getDimension(com.tencent.mm.R.dimen.a9x));
        new rl5.r(this);
        android.widget.ListView listView = this.f121392v;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        lo2.g gVar = this.f121394x;
        listView.setAdapter((android.widget.ListAdapter) gVar);
        android.widget.ListView listView2 = this.f121392v;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setSelector(new android.graphics.drawable.ColorDrawable(0));
        android.widget.ListView listView3 = this.f121392v;
        if (listView3 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView3.setOnScrollListener(this);
        gVar.f320124f = new lo2.n(this);
        pm0.v.T(pm0.v.J(km5.u.d(), new lo2.o(this)), new lo2.p(this));
        kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new lo2.l(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kotlinx.coroutines.z0.e(this.f121390t, null, 1, null);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 != 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (absListView == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (!absListView.canScrollVertically(1)) {
            if (this.f121396z) {
                kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new lo2.l(this, null), 3, null);
            } else {
                android.widget.ListView listView = this.f121392v;
                if (listView == null) {
                    kotlin.jvm.internal.o.o("listView");
                    throw null;
                }
                if (listView.getFooterViewsCount() == 0) {
                    android.widget.ListView listView2 = this.f121392v;
                    if (listView2 == null) {
                        kotlin.jvm.internal.o.o("listView");
                        throw null;
                    }
                    listView2.addFooterView(android.view.View.inflate(this, com.tencent.mm.R.layout.agu, null));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
