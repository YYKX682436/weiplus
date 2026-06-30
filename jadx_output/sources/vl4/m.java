package vl4;

/* loaded from: classes4.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView f437895d;

    public m(com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView tingChatRoomFloatBallView) {
        this.f437895d = tingChatRoomFloatBallView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/playapp/chatroom/TingChatRoomFloatBallView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f437895d.f174714e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/playapp/chatroom/TingChatRoomFloatBallView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
