package xm2;

/* loaded from: classes14.dex */
public final class v extends androidx.recyclerview.widget.k3 implements lo0.h {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f455265d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f455266e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f455267f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f455268g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f455269h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f455270i;

    /* renamed from: m, reason: collision with root package name */
    public zm2.d f455271m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.l itemSelectionHandler) {
        super(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488860e90, (android.view.ViewGroup) null));
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f455265d = itemSelectionHandler;
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.v2v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f455266e = findViewById;
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.veu);
        findViewById2.setOnClickListener(new xm2.u(this));
        this.f455267f = findViewById2;
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.hrz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f455268g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = this.itemView.findViewById(com.tencent.mm.R.id.sgs);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f455269h = findViewById4;
    }

    @Override // lo0.h
    public void c(lo0.b badge) {
        kotlin.jvm.internal.o.g(badge, "badge");
        badge.c(this);
        android.view.View view = this.f455269h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(boolean z17) {
        android.view.View view = this.f455266e;
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautySingleLevelControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
