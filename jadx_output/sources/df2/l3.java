package df2;

/* loaded from: classes3.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f230627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.p3 f230628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(android.graphics.RectF rectF, df2.p3 p3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230627e = rectF;
        this.f230628f = p3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.l3 l3Var = new df2.l3(this.f230627e, this.f230628f, continuation);
        l3Var.f230626d = obj;
        return l3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.l3 l3Var = (df2.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.z0.g((kotlinx.coroutines.y0) this.f230626d);
        float centerY = this.f230627e.centerY();
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        int a17 = e8Var.a();
        df2.p3 p3Var = this.f230628f;
        int i17 = (a17 - p3Var.f231032p) / 2;
        com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "start Anim centerY: " + centerY + " targetCenterY: " + i17);
        float f17 = (float) i17;
        if (centerY > f17) {
            p3Var.f231031o = f17 - centerY;
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "resetanimTranslationY animTranslationY: " + p3Var.f231031o + " target: " + (e8Var.a() - p3Var.f231032p));
            float abs = java.lang.Math.abs(p3Var.f231031o);
            int i18 = p3Var.f231032p;
            if (abs > i18) {
                p3Var.f231031o = -i18;
            }
            android.view.View a76 = p3Var.a7();
            if (a76 != null && (animate = a76.animate()) != null && (translationY = animate.translationY(p3Var.f231031o)) != null && (duration = translationY.setDuration(240L)) != null) {
                duration.start();
            }
        }
        return jz5.f0.f302826a;
    }
}
