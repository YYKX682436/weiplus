package com.tencent.mm.plugin.game.chatroom.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/PanelGridView;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "", "Lcom/tencent/mm/plugin/game/autogen/chatroom/Panel;", "panel_list", "Ljz5/f0;", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/game/chatroom/view/z3", "com/tencent/mm/plugin/game/chatroom/view/a4", "com/tencent/mm/plugin/game/chatroom/view/c4", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class PanelGridView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: f2, reason: collision with root package name */
    public long f139016f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f139017g2;

    /* renamed from: h2, reason: collision with root package name */
    public yz5.a f139018h2;

    /* renamed from: i2, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.chatroom.view.z3 f139019i2;

    public PanelGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f139019i2 = new com.tencent.mm.plugin.game.chatroom.view.z3(this, context2);
        l1();
    }

    public final void l1() {
        setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 4));
        N(new com.tencent.mm.plugin.game.chatroom.view.a4((com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().widthPixels - (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479807fs) * 4)) / 5));
        setAdapter(this.f139019i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479806fr), Integer.MIN_VALUE) * 2);
    }

    public final void setData(java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Panel> list) {
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                com.tencent.mm.plugin.game.chatroom.view.z3 z3Var = this.f139019i2;
                z3Var.getClass();
                list.isEmpty();
                z3Var.f139373e.addAll(list);
                z3Var.notifyDataSetChanged();
            }
        }
    }

    public PanelGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f139019i2 = new com.tencent.mm.plugin.game.chatroom.view.z3(this, context2);
        l1();
    }
}
