package yf5;

/* loaded from: classes9.dex */
public final class p0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.w0 f461941d;

    public p0(yf5.w0 w0Var) {
        this.f461941d = w0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View v17) {
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        yf5.w0 w0Var = this.f461941d;
        android.widget.ListView listView = w0Var.f461979h;
        boolean z17 = false;
        if ((listView != null ? listView.getOnItemLongClickListener() : null) == null) {
            com.tencent.mars.xlog.Log.e(w0Var.f461978g, "[onLongClick] pass this click");
            yj0.a.i(false, this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (v17.getTag() == null) {
            com.tencent.mars.xlog.Log.e(w0Var.f461978g, "[onLongClick] getTag is null");
            yj0.a.i(false, this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (!w0Var.f461991w) {
            com.tencent.mars.xlog.Log.w(w0Var.f461978g, "[onLongClick] unResume");
            yj0.a.i(false, this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
        int i17 = ((yf5.n) tag).f461928o;
        android.widget.ListView listView2 = w0Var.f461979h;
        int headerViewsCount = i17 + (listView2 != null ? listView2.getHeaderViewsCount() : 0);
        com.tencent.mars.xlog.Log.i(w0Var.f461978g, "onLongClick, position: " + headerViewsCount);
        android.widget.ListView listView3 = w0Var.f461979h;
        if (listView3 != null && (onItemLongClickListener = listView3.getOnItemLongClickListener()) != null) {
            android.widget.ListView listView4 = w0Var.f461979h;
            w0Var.getClass();
            z17 = onItemLongClickListener.onItemLongClick(listView4, v17, headerViewsCount, 0L);
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
