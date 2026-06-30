package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tr extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136056e;

    public tr(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, android.widget.FrameLayout frameLayout) {
        this.f136055d = hsVar;
        this.f136056e = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar = this.f136055d.f134656i;
        if (lqVar != null) {
            lqVar.b(false);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey Animation ended, flutter visible = " + this.f136056e.getVisibility() + ' ');
    }
}
