package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class kc implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ResourcesExceedUI f201906d;

    public kc(com.tencent.mm.ui.chatting.ResourcesExceedUI resourcesExceedUI) {
        this.f201906d = resourcesExceedUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ResourcesExceedUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f201906d.finish();
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ResourcesExceedUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
