package com.tencent.mm.ui.bizchat;

/* loaded from: classes8.dex */
public class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197971d;

    public o(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197971d = bizChatConversationFmUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197971d;
            bizChatConversationFmUI.f197909s = rawX;
            bizChatConversationFmUI.f197910t = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
