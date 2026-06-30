package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class z6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation f192023d;

    public z6(com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation) {
        this.f192023d = redesignVideoPlayerSeekBarWithAnimation;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.d(motionEvent);
        java.util.List list = com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation.f191427l1;
        boolean z17 = this.f192023d.z(motionEvent);
        yj0.a.i(z17, this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
