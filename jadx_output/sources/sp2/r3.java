package sp2;

/* loaded from: classes2.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f411198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f411200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f411201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(xg2.h hVar, kotlin.coroutines.Continuation continuation, sp2.x3 x3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        super(2, continuation);
        this.f411198e = hVar;
        this.f411199f = x3Var;
        this.f411200g = arrayList;
        this.f411201h = arrayList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.r3(this.f411198e, continuation, this.f411199f, this.f411200g, this.f411201h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411197d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.ja2 ja2Var = (r45.ja2) ((xg2.i) this.f411198e).f454393b;
            sp2.x3 x3Var = this.f411199f;
            com.tencent.mars.xlog.Log.e(x3Var.f411273d, "requestCgi success " + ((r45.ha2) ja2Var.getCustom(5)));
            x3Var.Z6((r45.ha2) ja2Var.getCustom(5));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            sp2.t3 t3Var = new sp2.t3(this.f411199f, this.f411200g, this.f411201h, ja2Var, null);
            this.f411197d = 1;
            if (kotlinx.coroutines.l.g(g3Var, t3Var, this) == aVar) {
                return aVar;
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
