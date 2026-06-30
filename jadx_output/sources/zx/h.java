package zx;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView f476953d;

    public h(com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView) {
        this.f476953d = cBTBrandLiveQueryListView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f476953d.f65288f;
        if (recyclerView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "onClick", "(Landroid/view/View;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView$setView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
