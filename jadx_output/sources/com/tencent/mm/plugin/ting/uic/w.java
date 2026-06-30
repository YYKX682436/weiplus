package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class w extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.z f174801d;

    public w(com.tencent.mm.plugin.ting.uic.z zVar) {
        this.f174801d = zVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.tencent.mm.plugin.ting.uic.z zVar = this.f174801d;
        zVar.f174811n = false;
        zVar.T6();
        al4.b bVar = zVar.f174809i;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        com.tencent.mm.plugin.ting.uic.z zVar = this.f174801d;
        zVar.f174811n = false;
        zVar.T6();
        al4.b bVar = zVar.f174809i;
        if (bVar != null) {
            bVar.onAnimationEnd();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.plugin.ting.uic.z zVar = this.f174801d;
        zVar.f174811n = true;
        b66.g b17 = b66.i.f18167d.b(bw5.eq0.TingMusic);
        if (b17 != null) {
            ((b66.i) b17).e();
        }
        al4.b bVar = zVar.f174809i;
        if (bVar != null) {
            bVar.onAnimationStart();
        }
    }
}
