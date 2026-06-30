package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.i f203054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f203055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f203056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f203057h;

    public q(java.lang.String str, com.tencent.mm.ui.chatting.view.i iVar, com.tencent.mm.ui.chatting.view.r rVar, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, int i17) {
        this.f203053d = str;
        this.f203054e = iVar;
        this.f203055f = rVar;
        this.f203056g = mMNeat7extView;
        this.f203057h = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.String str = this.f203053d;
        int length = str.length();
        if (length < 1) {
            length = 1;
        }
        int f17 = e06.p.f((int) (anim.getAnimatedFraction() * (length + 1)), 0, length);
        com.tencent.mm.ui.chatting.view.i iVar = this.f203054e;
        if (f17 != iVar.f202958c) {
            iVar.f202958c = f17;
            this.f203055f.D(this.f203056g, str, f17, this.f203057h);
        }
    }
}
