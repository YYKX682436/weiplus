package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes8.dex */
public final class p0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158455d;

    public p0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158455d = v0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && i18 > 0) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            if (linearLayoutManager.y() >= linearLayoutManager.getItemCount()) {
                androidx.appcompat.app.AppCompatActivity activity = this.f158455d.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.ringtone.uic.b0 b0Var = (com.tencent.mm.plugin.ringtone.uic.b0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.b0.class);
                kotlinx.coroutines.l.d(b0Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.a0(b0Var, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
