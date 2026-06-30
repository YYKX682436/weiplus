package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class je implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f201875d;

    public je(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f201875d = textPreviewUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f201875d;
        if (action == 0) {
            textPreviewUI.D = true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
            textPreviewUI.D = false;
            if (textPreviewUI.f198325d.getMovementMethod() == null) {
                textPreviewUI.f198325d.post(new com.tencent.mm.ui.chatting.ie(this));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/TextPreviewUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
