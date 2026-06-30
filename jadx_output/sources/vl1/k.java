package vl1;

/* loaded from: classes8.dex */
public class k extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView f437807a;

    public k(com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView) {
        this.f437807a = mRecyclerView;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = this.f437807a;
        android.view.View view = mRecyclerView.f92101e2;
        if (view != null) {
            int i17 = mRecyclerView.k1() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
