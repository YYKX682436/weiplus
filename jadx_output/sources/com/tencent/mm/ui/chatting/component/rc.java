package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public class rc extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.qc f199826d;

    public rc(com.tencent.mm.ui.chatting.component.qc qcVar) {
        this.f199826d = qcVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        recyclerView.canScrollHorizontally(-1);
        com.tencent.mm.ui.chatting.component.qc qcVar = this.f199826d;
        if (i17 != 0 || recyclerView.canScrollHorizontally(-1)) {
            qcVar.f199766h.setVisibility(0);
            qcVar.f199765g.setVisibility(0);
        } else {
            qcVar.f199766h.setVisibility(8);
            qcVar.f199765g.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
