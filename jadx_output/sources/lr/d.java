package lr;

/* loaded from: classes12.dex */
public final class d extends lr.c0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f320503h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f320504i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f320505m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f484189da5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320503h = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f484187da3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f320504i = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.d_z);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f320505m = findViewById3;
    }

    @Override // lr.c0, lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f320581e;
        if (gVar != null) {
            qk.x6 m17 = gVar.f293836b.m1();
            int i17 = m17 == null ? -1 : lr.c.f320500a[m17.ordinal()];
            if (i17 == -1 || i17 == 1) {
                android.view.View view = this.f320503h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 2 || i17 == 3) {
                android.view.View view2 = this.f320503h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.f320504i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f320505m;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 4 || i17 == 5) {
                android.view.View view5 = this.f320503h;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.f320504i;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f320505m;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
