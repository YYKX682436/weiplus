package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class e4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f207646d;

    public e4(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI, android.graphics.Point point) {
        this.f207646d = point;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            android.graphics.Point point = this.f207646d;
            point.x = rawX;
            point.y = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
