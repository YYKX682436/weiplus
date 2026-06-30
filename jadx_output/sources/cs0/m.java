package cs0;

/* loaded from: classes4.dex */
public final class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.ImproveCameraFocusView f222055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cs0.h f222056e;

    public m(com.tencent.mm.media.camera.view.control.ImproveCameraFocusView improveCameraFocusView, cs0.h hVar) {
        this.f222055d = improveCameraFocusView;
        this.f222056e = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        cs0.h hVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraFocusView", "move ani is finish " + java.lang.Thread.currentThread().getName());
        com.tencent.mm.media.camera.view.control.ImproveCameraFocusView improveCameraFocusView = this.f222055d;
        if (improveCameraFocusView.A != null && (hVar = this.f222056e) != null) {
            ((cs0.c) hVar).a(true);
        }
        improveCameraFocusView.f68928w = false;
    }
}
