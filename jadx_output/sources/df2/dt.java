package df2;

/* loaded from: classes3.dex */
public final class dt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(df2.lt ltVar, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230000d = ltVar;
        this.f230001e = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.dt(this.f230000d, this.f230001e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.dt dtVar = (df2.dt) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dtVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.lt ltVar = this.f230000d;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = ltVar.E;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        android.view.ViewGroup viewGroup = ltVar.f230704J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            int i17 = context.getResources().getDisplayMetrics().widthPixels;
            float b17 = i65.a.b(context, 414);
            float f17 = i17;
            float f18 = (b17 <= f17 || b17 <= 0.0f || f17 <= 0.0f) ? 1.0f : f17 / b17;
            java.lang.String str = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "scale " + f18 + ", " + i17 + ", " + b17);
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.5f, f18).setDuration(300L);
            duration.addUpdateListener(new df2.ct(this.f230001e));
            ltVar.R = duration;
            duration.setInterpolator(new android.view.animation.OvershootInterpolator());
            android.animation.ValueAnimator valueAnimator = ltVar.R;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
        return jz5.f0.f302826a;
    }
}
