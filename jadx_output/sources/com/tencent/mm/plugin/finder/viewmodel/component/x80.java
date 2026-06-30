package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x80 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f136419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.v80 f136420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136422g;

    public x80(com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f136419d = e90Var;
        this.f136420e = v80Var;
        this.f136421f = frameLayout;
        this.f136422g = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var = this.f136419d;
        com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar = e90Var.f134235h;
        if (rcVar != null) {
            rcVar.c(1.0f);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar2 = e90Var.f134235h;
        if (rcVar2 != null) {
            rcVar2.a(false);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.y80.a(this.f136420e, e90Var, this.f136421f, this.f136422g);
    }
}
