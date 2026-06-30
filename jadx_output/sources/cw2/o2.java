package cw2;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223895d;

    public o2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223895d = finderFullSeekBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$setFloatPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            this.f223895d.getOnResumePlayListener().invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$setFloatPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
