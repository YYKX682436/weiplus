package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class ln extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f118955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f118956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(com.tencent.mm.plugin.finder.live.widget.mn mnVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        super(0);
        this.f118954d = mnVar;
        this.f118955e = f0Var;
        this.f118956f = f0Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118954d;
        boolean isEmpty = mnVar.f119099w.isEmpty();
        android.view.ViewGroup viewGroup = mnVar.f119094r;
        android.widget.TextView textView = mnVar.f119091o;
        if (isEmpty) {
            textView.setVisibility(0);
            android.view.View view = mnVar.f119092p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(8);
        } else {
            textView.setVisibility(8);
            android.view.View view2 = mnVar.f119092p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget$updateSearchData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(0);
        }
        java.util.ArrayList arrayList3 = mnVar.f119099w;
        bm2.i4 i4Var = mnVar.f119095s;
        i4Var.x(arrayList3);
        i4Var.notifyDataSetChanged();
        int i17 = this.f118955e.f310116d;
        if (i17 == 0) {
            i4Var.notifyDataSetChanged();
        } else {
            int i18 = this.f118956f.f310116d;
            if (i17 < i18) {
                i4Var.notifyItemRangeInserted(i17, i18 - i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
