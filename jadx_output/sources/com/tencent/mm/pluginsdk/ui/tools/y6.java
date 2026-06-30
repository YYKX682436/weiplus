package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation f192011d;

    public y6(com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation) {
        this.f192011d = redesignVideoPlayerSeekBarWithAnimation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation.f191427l1;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = this.f192011d;
        redesignVideoPlayerSeekBarWithAnimation.getClass();
        java.util.List list2 = com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation.f191427l1;
        int size = list2.size();
        if (size <= 0) {
            com.tencent.mm.pluginsdk.ui.tools.o5 playerUIReporter = redesignVideoPlayerSeekBarWithAnimation.getPlayerUIReporter();
            if (playerUIReporter != null) {
                float f17 = redesignVideoPlayerSeekBarWithAnimation.M;
                playerUIReporter.b(f17, f17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RedesignVideoPlayerSeekBarWithAnimation", "on speedRatioTextView click, speed range is empty");
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        float floatValue = ((java.lang.Number) list2.get((list2.indexOf(java.lang.Float.valueOf(redesignVideoPlayerSeekBarWithAnimation.M)) + 1) % size)).floatValue();
        com.tencent.mm.pluginsdk.ui.tools.o5 playerUIReporter2 = redesignVideoPlayerSeekBarWithAnimation.getPlayerUIReporter();
        if (playerUIReporter2 != null) {
            playerUIReporter2.b(redesignVideoPlayerSeekBarWithAnimation.M, floatValue);
        }
        com.tencent.mm.pluginsdk.ui.tools.w6 w6Var = redesignVideoPlayerSeekBarWithAnimation.N;
        if (w6Var != null) {
            w6Var.a(floatValue);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
