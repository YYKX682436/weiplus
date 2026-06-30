package f43;

/* loaded from: classes4.dex */
public class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.flow.FlowView f259540d;

    public d(com.tencent.mm.plugin.game.chatroom.view.flow.FlowView flowView, int i17) {
        this.f259540d = flowView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.plugin.game.chatroom.view.flow.FlowView.f139111r;
        this.f259540d.getClass();
        yj0.a.i(false, this, "com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
