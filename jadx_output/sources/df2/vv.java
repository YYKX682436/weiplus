package df2;

/* loaded from: classes3.dex */
public final class vv extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231632m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f231633n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231632m = "LiveVipTagController";
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        android.view.View T6 = T6(com.tencent.mm.R.id.fod, com.tencent.mm.R.id.fob);
        this.f231633n = T6;
        if (T6 != null) {
            boolean z17 = ((je2.a0) business(je2.a0.class)).f299197i;
            boolean z18 = ((je2.a0) business(je2.a0.class)).f299195g;
            com.tencent.mars.xlog.Log.i(this.f231632m, "[onLiveActivate] isVipLive:" + z17 + ", isVisitorVip:" + z18);
            android.view.View findViewById = T6.findViewById(com.tencent.mm.R.id.foc);
            ae2.in inVar = ae2.in.f3688a;
            if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3715c6).getValue()).r()).booleanValue() && (!z17 || !z18)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(T6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + com.tencent.mm.ui.bl.c(T6.getContext()));
            }
            T6.setOnTouchListener(new df2.tv(T6));
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.uv(T6, null), 3, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f231633n = null;
    }
}
