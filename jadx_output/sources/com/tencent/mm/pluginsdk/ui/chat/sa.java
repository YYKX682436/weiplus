package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class sa implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190658d;

    public sa(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190658d = ibVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean b17 = com.tencent.mm.pluginsdk.ui.chat.ib.b(this.f190658d, view, motionEvent);
        yj0.a.i(b17, this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return b17;
    }
}
