package xt2;

/* loaded from: classes3.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f457007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f457008g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xt2.e3 e3Var, java.util.LinkedList linkedList, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457006e = e3Var;
        this.f457007f = linkedList;
        this.f457008g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.s2(this.f457006e, this.f457007f, this.f457008g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457005d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xt2.e3 e3Var = this.f457006e;
            xt2.k1 showBox = e3Var.getShowBox();
            if (showBox != null) {
                java.lang.String str = e3Var.f456706h;
                java.util.LinkedList linkedList = this.f457007f;
                android.widget.LinearLayout linearLayout = e3Var.f456723z;
                int i18 = this.f457008g;
                xt2.r2 r2Var = new xt2.r2(e3Var);
                this.f457005d = 1;
                if (showBox.c(str, linkedList, false, linearLayout, i18, r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
