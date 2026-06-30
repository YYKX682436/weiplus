package ku3;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312414d = professionalCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.t0(this.f312414d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.t0 t0Var = (ku3.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout = this.f312414d;
        ku3.s sVar = professionalCameraKitPluginLayout.I;
        if (sVar.d().getVisibility() == 0) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(sVar.d(), "scaleX", 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(sVar.d(), "alpha", 1.0f, 0.0f);
            sVar.d().setPivotX(sVar.f312402y);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.addListener(new ku3.b(sVar));
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
        if (professionalCameraKitPluginLayout.getKitContext().N6(10) == 0) {
            zt3.a.U6(professionalCameraKitPluginLayout.getKitContext(), 10, 4, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
