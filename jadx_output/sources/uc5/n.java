package uc5;

/* loaded from: classes10.dex */
public abstract class n extends in5.r {

    /* renamed from: n, reason: collision with root package name */
    public static final uc5.e f426527n = new uc5.e(null);

    /* renamed from: o, reason: collision with root package name */
    public static final androidx.transition.ChangeBounds f426528o = new androidx.transition.ChangeBounds();

    /* renamed from: e, reason: collision with root package name */
    public final ad5.l0[] f426529e;

    /* renamed from: f, reason: collision with root package name */
    public v65.i f426530f;

    /* renamed from: g, reason: collision with root package name */
    public uc5.r f426531g;

    /* renamed from: h, reason: collision with root package name */
    public uc5.f f426532h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f426533i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f426534m;

    public n(ad5.l0[] availableOperations) {
        kotlin.jvm.internal.o.g(availableOperations, "availableOperations");
        this.f426529e = availableOperations;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        java.lang.Object context = recyclerView.getContext();
        this.f426530f = new com.tencent.mm.sdk.coroutines.LifecycleScope(getClass().getSimpleName().concat("_Scope"), context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, 0, 4, null);
        java.lang.Object context2 = recyclerView.getContext();
        this.f426531g = context2 instanceof uc5.r ? (uc5.r) context2 : null;
        java.lang.Object tag = recyclerView.getTag(com.tencent.mm.R.id.uhs);
        this.f426532h = tag instanceof uc5.f ? (uc5.f) tag : null;
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        v65.i iVar = this.f426530f;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = iVar instanceof com.tencent.mm.sdk.coroutines.LifecycleScope ? (com.tencent.mm.sdk.coroutines.LifecycleScope) iVar : null;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
        this.f426530f = null;
        this.f426531g = null;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293124h;
        kotlinx.coroutines.r2 r2Var = obj instanceof kotlinx.coroutines.r2 ? (kotlinx.coroutines.r2) obj : null;
        if (r2Var != null && r2Var.a()) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        holder.itemView.setTag(com.tencent.mm.R.id.uhn, null);
    }

    public void n(android.content.Context context, java.lang.Object obj, java.lang.String query) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(query, "query");
    }

    public final void o(android.content.Context context, in5.s0 s0Var, uc5.d dVar, java.lang.Object obj, android.view.View view, android.widget.CheckBox checkBox, boolean z17) {
        uc5.c cVar = dVar.f426476d;
        if (!this.f426533i && !this.f426534m && z17) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            u4.g1.a((android.view.ViewGroup) view, f426528o);
        }
        boolean z18 = cVar instanceof uc5.b;
        boolean z19 = z18 && ((uc5.b) cVar).f426471a;
        if (checkBox.isChecked() != z19) {
            checkBox.setChecked(z19);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(checkBox, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(checkBox, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert", "bindClickListenersAndCheckBox", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItem;Ljava/lang/Object;Landroid/view/View;Landroid/widget/CheckBox;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        checkBox.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(checkBox, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert", "bindClickListenersAndCheckBox", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItem;Ljava/lang/Object;Landroid/view/View;Landroid/widget/CheckBox;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(checkBox, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, checkBox)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(checkBox, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(checkBox, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert", "bindClickListenersAndCheckBox", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItem;Ljava/lang/Object;Landroid/view/View;Landroid/widget/CheckBox;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(checkBox, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert", "bindClickListenersAndCheckBox", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItem;Ljava/lang/Object;Landroid/view/View;Landroid/widget/CheckBox;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(checkBox, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view.setOnClickListener(new uc5.g(dVar, this, context, obj, checkBox));
        view.setOnLongClickListener(new uc5.h(dVar, this, context, view, s0Var));
        view.setLongClickable(true);
    }

    public abstract java.lang.Object p(in5.s0 s0Var);

    public abstract android.widget.CheckBox q(java.lang.Object obj);

    public abstract android.view.View r(java.lang.Object obj);

    public abstract void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0053  */
    @Override // in5.r
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, uc5.d r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc5.n.h(in5.s0, uc5.d, int, int, boolean, java.util.List):void");
    }

    public abstract void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var);

    public void v(android.content.Context context, in5.s0 holder, uc5.d item, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    public abstract java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation);

    public abstract void x(java.lang.Object obj);
}
