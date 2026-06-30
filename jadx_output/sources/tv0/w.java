package tv0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f422248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tv0.j0 j0Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422247e = j0Var;
        this.f422248f = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tv0.w(this.f422247e, this.f422248f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422246d;
        tv0.j0 j0Var = this.f422247e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = j0Var.F;
            if (r2Var != null) {
                this.f422246d = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                j0Var.l7(j0Var.s7());
                float f17 = j0Var.B;
                android.view.ViewGroup w76 = j0Var.w7();
                long v76 = j0Var.v7();
                float f18 = 1;
                float f19 = f17 * f18;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f422248f;
                float f27 = f19 / clipSegment.q1().getSize().f47799x;
                float f28 = f19 / clipSegment.q1().getSize().f47800y;
                float f29 = 2;
                float f37 = ((f18 - clipSegment.q1().getSize().f47799x) / f29) - clipSegment.q1().getOrigin().f47799x;
                float f38 = ((f18 - clipSegment.q1().getSize().f47800y) / f29) - clipSegment.q1().getOrigin().f47800y;
                w76.setScaleX(f27);
                w76.setScaleY(f28);
                w76.setTranslationX(d1.k.d(v76) * f27 * f37);
                w76.setTranslationY(d1.k.b(v76) * f28 * f38);
                j0Var.z7();
                j0Var.k7();
                yw0.p m76 = j0Var.m7();
                m76.f466580c = yw0.o.f466576d;
                ((yw0.l) m76.f466587a).a();
                yw0.b n76 = j0Var.n7();
                n76.f466531i = yw0.a.f466521d;
                ((yw0.l) n76.f466587a).a();
                com.tencent.mars.xlog.Log.i("CropMaterialReferenceDrawer", "beginTrackingCropArea: ");
                j0Var.o7().u7().setText(j65.q.a(j0Var.getContext()).getString(com.tencent.mm.R.string.mtn));
                j0Var.o7().u7().setVisibility(0);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f422246d = 2;
        if (kotlinx.coroutines.k1.b(200L, this) == aVar) {
            return aVar;
        }
        j0Var.l7(j0Var.s7());
        float f172 = j0Var.B;
        android.view.ViewGroup w762 = j0Var.w7();
        long v762 = j0Var.v7();
        float f182 = 1;
        float f192 = f172 * f182;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = this.f422248f;
        float f272 = f192 / clipSegment2.q1().getSize().f47799x;
        float f282 = f192 / clipSegment2.q1().getSize().f47800y;
        float f292 = 2;
        float f372 = ((f182 - clipSegment2.q1().getSize().f47799x) / f292) - clipSegment2.q1().getOrigin().f47799x;
        float f382 = ((f182 - clipSegment2.q1().getSize().f47800y) / f292) - clipSegment2.q1().getOrigin().f47800y;
        w762.setScaleX(f272);
        w762.setScaleY(f282);
        w762.setTranslationX(d1.k.d(v762) * f272 * f372);
        w762.setTranslationY(d1.k.b(v762) * f282 * f382);
        j0Var.z7();
        j0Var.k7();
        yw0.p m762 = j0Var.m7();
        m762.f466580c = yw0.o.f466576d;
        ((yw0.l) m762.f466587a).a();
        yw0.b n762 = j0Var.n7();
        n762.f466531i = yw0.a.f466521d;
        ((yw0.l) n762.f466587a).a();
        com.tencent.mars.xlog.Log.i("CropMaterialReferenceDrawer", "beginTrackingCropArea: ");
        j0Var.o7().u7().setText(j65.q.a(j0Var.getContext()).getString(com.tencent.mm.R.string.mtn));
        j0Var.o7().u7().setVisibility(0);
        return jz5.f0.f302826a;
    }
}
