package sm3;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.RangeSliderView f409849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f409850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.mv.ui.widget.RangeSliderView rangeSliderView, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409849e = rangeSliderView;
        this.f409850f = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm3.d0(this.f409849e, this.f409850f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm3.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409848d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            com.tencent.mm.plugin.mv.ui.widget.RangeSliderView rangeSliderView = this.f409849e;
            float f17 = rangeSliderView.G;
            java.lang.Object upper = rangeSliderView.A.getUpper();
            kotlin.jvm.internal.o.f(upper, "getUpper(...)");
            if (f17 > ((java.lang.Number) upper).floatValue()) {
                float f18 = rangeSliderView.G;
                java.lang.Object upper2 = rangeSliderView.A.getUpper();
                kotlin.jvm.internal.o.f(upper2, "getUpper(...)");
                b17 = a06.d.b(f18 - ((java.lang.Number) upper2).floatValue());
            } else {
                float f19 = rangeSliderView.G;
                java.lang.Object lower = rangeSliderView.A.getLower();
                kotlin.jvm.internal.o.f(lower, "getLower(...)");
                b17 = a06.d.b(f19 - ((java.lang.Number) lower).floatValue());
            }
            kotlin.jvm.internal.f0 f0Var = this.f409850f;
            rangeSliderView.b(f0Var.f310116d + b17, true);
            f0Var.f310116d += b17;
            this.f409848d = 1;
        } while (kotlinx.coroutines.k1.b(100L, this) != aVar);
        return aVar;
    }
}
