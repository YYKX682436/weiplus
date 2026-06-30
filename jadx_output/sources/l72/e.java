package l72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.j f316843d;

    public e(l72.j jVar) {
        this.f316843d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316843d.f316853a;
        n72.q qVar = faceActionUI.f100193z;
        if (qVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "stopPreview ,isPreview %s camera:%s", java.lang.Boolean.valueOf(qVar.f335282q), qVar.f335275g);
            if (qVar.f335275g != null) {
                qVar.f335282q = false;
                qVar.f335275g.l();
                qVar.f335275g.g(null);
                qVar.f335271J.removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.facedetect.model.s.f100033d.c();
            }
        }
        faceActionUI.f100174d.setVisibility(8);
        faceActionUI.f100175e.setVisibility(0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, faceActionUI.f100183p.getHeight());
        translateAnimation.setDuration(2000L);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setRepeatCount(-1);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new l72.o(faceActionUI));
        animationSet.setRepeatCount(-1);
        faceActionUI.f100185r.startAnimation(animationSet);
    }
}
