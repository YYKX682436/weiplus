package g72;

/* loaded from: classes14.dex */
public class y implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectUI f269252a;

    public y(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI) {
        this.f269252a = faceDetectUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int i17 = com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.f100069z;
        this.f269252a.W6();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
