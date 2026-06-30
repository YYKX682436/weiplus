package com.tencent.mm.ui.chatting.search.multi.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FTSMultiImageResultFragment extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f202680n;

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bcr;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        pf5.u uVar = pf5.u.f353936a;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        if (((ee5.z) uVar.b(activity).a(ee5.z.class)).f252104n) {
            androidx.fragment.app.FragmentActivity activity2 = getActivity();
            kotlin.jvm.internal.o.d(activity2);
            int R6 = ((ee5.z) uVar.b(activity2).a(ee5.z.class)).R6();
            de5.a aVar = de5.a.f229396a;
            androidx.fragment.app.FragmentActivity activity3 = getActivity();
            kotlin.jvm.internal.o.d(activity3);
            aVar.h(R6, R6, ((ee5.z) uVar.b(activity3).a(ee5.z.class)).P6());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View view;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", "onCreateView");
        pf5.u uVar = pf5.u.f353936a;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        if (!((ee5.z) uVar.b(activity).a(ee5.z.class)).T6() && (view = this.f202680n) != null) {
            kotlin.jvm.internal.o.d(view);
            return view;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", "onCreateView >> inflate view");
        this.f202680n = super.onCreateView(inflater, viewGroup, bundle);
        androidx.fragment.app.FragmentActivity activity2 = getActivity();
        kotlin.jvm.internal.o.d(activity2);
        boolean T6 = ((ee5.z) uVar.b(activity2).a(ee5.z.class)).T6();
        com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", "initFirstTime >> " + T6);
        if (T6) {
            androidx.fragment.app.FragmentActivity activity3 = getActivity();
            kotlin.jvm.internal.o.d(activity3);
            ee5.z zVar = (ee5.z) uVar.b(activity3).a(ee5.z.class);
            android.view.View view2 = this.f202680n;
            kotlin.jvm.internal.o.d(view2);
            zVar.V6(view2);
        } else {
            androidx.fragment.app.FragmentActivity activity4 = getActivity();
            kotlin.jvm.internal.o.d(activity4);
            ee5.j jVar = (ee5.j) uVar.b(activity4).a(ee5.j.class);
            android.view.View view3 = this.f202680n;
            kotlin.jvm.internal.o.d(view3);
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageQueryOpenUIC", "showOpenItemView");
            jVar.f251931e = view3.findViewById(com.tencent.mm.R.id.f485074gg5);
            android.view.View findViewById = view3.findViewById(com.tencent.mm.R.id.gfw);
            jVar.f251930d = findViewById;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "showOpenItemView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "showOpenItemView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            jVar.f251932f = view3;
            android.view.View view4 = jVar.f251931e;
            if (view4 != null) {
                view4.setOnClickListener(new ee5.d(jVar));
            }
        }
        android.view.View view5 = this.f202680n;
        kotlin.jvm.internal.o.d(view5);
        return view5;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiImageResultFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }
}
