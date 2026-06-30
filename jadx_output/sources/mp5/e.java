package mp5;

/* loaded from: classes9.dex */
public class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp5.g f330478d;

    public e(mp5.g gVar) {
        this.f330478d = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "show keyboard anim end");
        mp5.g gVar = this.f330478d;
        if (!gVar.f330481d) {
            gVar.f330482e.f213814r.setVisibility(0);
            gVar.f330482e.f213820x.setVisibility(4);
        }
        if (gVar.f330482e.E != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "do nextAction");
            gVar.f330482e.E.run();
            gVar.f330482e.E = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        mp5.g gVar = this.f330478d;
        gVar.f330482e.f213819w.setVisibility(0);
        if (gVar.f330481d) {
            gVar.f330482e.f213814r.setVisibility(0);
        } else {
            gVar.f330482e.f213814r.setVisibility(4);
        }
    }
}
