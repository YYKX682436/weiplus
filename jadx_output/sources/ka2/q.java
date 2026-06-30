package ka2;

/* loaded from: classes10.dex */
public final class q implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.TextWatcher f306043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306045f;

    public q(android.view.View view, com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306044e = view;
        this.f306045f = finderPoiNormalLbsListUI;
        if (!android.text.TextWatcher.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.text.TextWatcher.class.getClassLoader(), new java.lang.Class[]{android.text.TextWatcher.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.text.TextWatcher");
        }
        this.f306043d = (android.text.TextWatcher) newProxyInstance;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f306043d.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f306043d.beforeTextChanged(charSequence, i17, i18, i19);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        androidx.recyclerview.widget.f2 adapter;
        java.lang.String obj = charSequence != null ? charSequence.toString() : null;
        boolean z17 = true;
        boolean z18 = obj == null || obj.length() == 0;
        android.view.View view = this.f306044e;
        if (z18) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z19 = !(obj == null || obj.length() == 0);
        int i27 = com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.P;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestSearch] keyWord:");
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306045f;
        sb6.append(finderPoiNormalLbsListUI.f101799z);
        sb6.append(" input:");
        sb6.append(obj);
        sb6.append(" isSearching:");
        sb6.append(z19);
        com.tencent.mars.xlog.Log.i("FinderPoiNormalLbsListUI", sb6.toString());
        finderPoiNormalLbsListUI.f101793t = z19;
        if (obj != null && obj.length() != 0) {
            z17 = false;
        }
        ka2.d dVar = finderPoiNormalLbsListUI.L;
        if (!z17) {
            if (kotlin.jvm.internal.o.b(obj, finderPoiNormalLbsListUI.f101799z)) {
                return;
            }
            finderPoiNormalLbsListUI.f101799z = obj;
            ka2.c cVar = z19 ? dVar.f306019d : dVar.f306018c;
            cVar.f306014a = null;
            cVar.f306015b = null;
            com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.n7(finderPoiNormalLbsListUI, obj, z19, false, false, finderPoiNormalLbsListUI.j7(), 0, 44, null);
            return;
        }
        finderPoiNormalLbsListUI.f101799z = "";
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = finderPoiNormalLbsListUI.f101797x;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(dVar.f306020e);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = finderPoiNormalLbsListUI.f101797x;
        if (wxRecyclerView2 == null || (adapter = wxRecyclerView2.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
