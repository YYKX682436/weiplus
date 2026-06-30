package lr;

/* loaded from: classes12.dex */
public final class j0 extends lr.s0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f320533m = 0;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f320534f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f320535g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f320536h;

    /* renamed from: i, reason: collision with root package name */
    public final lr.i0 f320537i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f320534f = itemView.findViewById(com.tencent.mm.R.id.dcr);
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dcs);
        this.f320535g = findViewById;
        this.f320536h = itemView.findViewById(com.tencent.mm.R.id.dct);
        this.f320537i = new lr.i0(this);
        itemView.addOnAttachStateChangeListener(new lr.g0(this));
        itemView.setOnClickListener(null);
        findViewById.setOnClickListener(new lr.f0(this));
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        j();
    }

    public final void j() {
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        if (((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().f97616a.f97632c) {
            android.view.View view = this.f320534f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f320535g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f320536h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f320534f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f320535g;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f320536h;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
