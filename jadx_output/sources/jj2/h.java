package jj2;

/* loaded from: classes10.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jj2.a f299991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f299992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f299993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f299994g;

    public h(jj2.a aVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView, kotlin.jvm.internal.c0 c0Var, v65.n nVar) {
        this.f299991d = aVar;
        this.f299992e = ripperAnimateView;
        this.f299993f = c0Var;
        this.f299994g = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f299992e;
        jj2.d dVar = ripperAnimateView.f111720f;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("initData");
            throw null;
        }
        jj2.a aVar = this.f299991d;
        aVar.b(dVar);
        ripperAnimateView.f111718d.add(aVar);
        if (ripperAnimateView.f111723i) {
            return;
        }
        kotlin.jvm.internal.c0 c0Var = this.f299993f;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        this.f299994g.a(jz5.f0.f302826a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
