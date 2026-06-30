package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class x6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation f192000d;

    public x6(com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation) {
        this.f192000d = redesignVideoPlayerSeekBarWithAnimation;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.d(motionEvent);
        boolean B = this.f192000d.B(motionEvent);
        yj0.a.i(B, this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return B;
    }
}
