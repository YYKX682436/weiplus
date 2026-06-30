package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class v6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation f191956d;

    public v6(com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation redesignVideoPlayerSeekBarWithAlphaAnimation) {
        this.f191956d = redesignVideoPlayerSeekBarWithAlphaAnimation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ImageView playBtn = this.f191956d.getPlayBtn();
        if (playBtn != null) {
            playBtn.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
