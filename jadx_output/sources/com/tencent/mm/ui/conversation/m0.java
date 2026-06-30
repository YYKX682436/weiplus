package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class m0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI f207857d;

    public m0(com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f207857d = convBoxServiceConversationFmUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f207857d;
            convBoxServiceConversationFmUI.hideVKB();
            convBoxServiceConversationFmUI.x_down = (int) motionEvent.getRawX();
            convBoxServiceConversationFmUI.y_down = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
