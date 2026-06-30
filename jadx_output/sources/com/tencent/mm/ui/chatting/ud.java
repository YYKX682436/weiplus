package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class ud implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f202743d;

    public ud(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f202743d = textPreviewUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f202743d;
        if (action == 0) {
            textPreviewUI.f198341w = true;
        } else if (action == 1) {
            textPreviewUI.f198341w = false;
            textPreviewUI.f198342x = false;
        } else if (action == 2 && !textPreviewUI.f198342x) {
            textPreviewUI.f198342x = true;
            textPreviewUI.f198341w = true;
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/TextPreviewUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
