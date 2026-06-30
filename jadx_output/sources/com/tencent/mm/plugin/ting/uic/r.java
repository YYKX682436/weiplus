package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class r extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al4.b f174787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.z f174788e;

    public r(al4.b bVar, com.tencent.mm.plugin.ting.uic.z zVar) {
        this.f174787d = bVar;
        this.f174788e = zVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.tencent.mm.plugin.ting.uic.z zVar = this.f174788e;
        zVar.f174812o = false;
        al4.b bVar = this.f174787d;
        if (bVar != null) {
            bVar.a();
        }
        al4.b bVar2 = zVar.f174810m;
        if (bVar2 != null) {
            bVar2.a();
        }
        zVar.U6();
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        com.tencent.mm.plugin.ting.uic.z zVar = this.f174788e;
        zVar.f174812o = false;
        al4.b bVar = this.f174787d;
        if (bVar != null) {
            bVar.onAnimationEnd();
        }
        al4.b bVar2 = zVar.f174810m;
        if (bVar2 != null) {
            bVar2.onAnimationEnd();
        }
        zVar.U6();
        zVar.R6(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        al4.b bVar = this.f174787d;
        if (bVar != null) {
            bVar.onAnimationStart();
        }
        com.tencent.mm.plugin.ting.uic.z zVar = this.f174788e;
        al4.b bVar2 = zVar.f174810m;
        if (bVar2 != null) {
            bVar2.onAnimationStart();
        }
        zVar.f174812o = true;
    }
}
