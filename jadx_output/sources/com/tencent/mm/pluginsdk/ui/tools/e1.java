package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes10.dex */
public final class e1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.DropdownListView f191600a;

    public e1(com.tencent.mm.pluginsdk.ui.tools.DropdownListView dropdownListView) {
        this.f191600a = dropdownListView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.pluginsdk.ui.tools.DropdownListView dropdownListView = this.f191600a;
        android.widget.FrameLayout frameLayout = dropdownListView.f191356d;
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.setVisibility(8);
        dropdownListView.f191359g = false;
        dropdownListView.f191360h = false;
        if (dropdownListView.getMOnItemStateChanged() != null) {
            kotlin.jvm.internal.o.d(dropdownListView.getMOnItemStateChanged());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
