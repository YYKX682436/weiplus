package yf5;

/* loaded from: classes9.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.w0 f461939d;

    public o0(yf5.w0 w0Var) {
        this.f461939d = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        android.widget.AdapterView.OnItemClickListener onItemClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        yf5.w0 w0Var = this.f461939d;
        android.widget.ListView listView = w0Var.f461979h;
        if ((listView != null ? listView.getOnItemClickListener() : null) == null) {
            com.tencent.mars.xlog.Log.e(w0Var.f461978g, "[onClick] pass this click");
            yj0.a.h(this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (v17.getTag() == null) {
            com.tencent.mars.xlog.Log.e(w0Var.f461978g, "[onClick] getTag is null");
            yj0.a.h(this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!w0Var.f461991w && !com.tencent.mm.ui.bk.y()) {
            com.tencent.mars.xlog.Log.w(w0Var.f461978g, "[onClick] unResume");
            yj0.a.h(this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
        int i17 = ((yf5.n) tag).f461928o;
        android.widget.ListView listView2 = w0Var.f461979h;
        int headerViewsCount = i17 + (listView2 != null ? listView2.getHeaderViewsCount() : 0);
        com.tencent.mars.xlog.Log.i(w0Var.f461978g, "onClick, position: " + headerViewsCount);
        android.widget.ListView listView3 = w0Var.f461979h;
        if (listView3 != null && (onItemClickListener = listView3.getOnItemClickListener()) != null) {
            android.widget.ListView listView4 = w0Var.f461979h;
            w0Var.getClass();
            onItemClickListener.onItemClick(listView4, v17, headerViewsCount, 0L);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/adapter/MvvmConversationAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
