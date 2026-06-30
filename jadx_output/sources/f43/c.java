package f43;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.flow.FlowView f259539d;

    public c(com.tencent.mm.plugin.game.chatroom.view.flow.FlowView flowView, int i17) {
        this.f259539d = flowView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.game.chatroom.view.flow.FlowView.f139111r;
        this.f259539d.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
