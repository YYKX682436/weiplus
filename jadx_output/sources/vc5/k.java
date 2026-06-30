package vc5;

/* loaded from: classes5.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView f435328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc5.j f435330f;

    public k(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView msgHistoryGalleryFilterBarView, int i17, vc5.j jVar) {
        this.f435328d = msgHistoryGalleryFilterBarView;
        this.f435329e = i17;
        this.f435330f = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildFilterChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView msgHistoryGalleryFilterBarView = this.f435328d;
        int i17 = msgHistoryGalleryFilterBarView.f201727n;
        int i18 = this.f435329e;
        if (i17 == i18) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildFilterChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        msgHistoryGalleryFilterBarView.f201727n = i18;
        android.widget.LinearLayout linearLayout = msgHistoryGalleryFilterBarView.f201725i;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            android.widget.LinearLayout linearLayout2 = msgHistoryGalleryFilterBarView.f201725i;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            android.view.View childAt = linearLayout2.getChildAt(i19);
            if (childAt != null) {
                int i27 = i19 == msgHistoryGalleryFilterBarView.f201727n ? 1 : 0;
                android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.tencent.mm.R.id.srz);
                if (textView != null) {
                    textView.setTypeface(null, i27);
                    textView.setTextColor(msgHistoryGalleryFilterBarView.getContext().getResources().getColor(i27 != 0 ? com.tencent.mm.R.color.abw : com.tencent.mm.R.color.adg, null));
                }
            }
            i19++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filter selected: ");
        vc5.j jVar = this.f435330f;
        sb6.append(jVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryFilterBarView", sb6.toString());
        yz5.l onFilterSelectedListener = msgHistoryGalleryFilterBarView.getOnFilterSelectedListener();
        if (onFilterSelectedListener != null) {
            onFilterSelectedListener.invoke(jVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildFilterChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
