package rc5;

/* loaded from: classes11.dex */
public final class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394156d;

    public f(rc5.m mVar) {
        this.f394156d = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        rc5.m mVar = this.f394156d;
        mVar.a();
        jz5.g gVar = rc5.x.D;
        android.view.Window window = mVar.f394170f.getActivity().getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        window.clearFlags(2);
        rc5.n nVar = mVar.f394177p;
        if (nVar != null) {
            rc5.x xVar = ((rc5.q) nVar).f394188a;
            xVar.getIntent().putExtra("KIsHalfScreen", false);
            xVar.W6().setArguments(xVar.getIntent().getExtras());
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) xVar.W6().f198152f.f460708c.a(sb5.z0.class))).E0();
            com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) xVar.W6().f198152f.f460708c.a(sb5.z0.class));
            peVar.x0(peVar.D);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f394156d.f394182u = true;
    }
}
