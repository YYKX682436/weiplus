package dn2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f241969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f241970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f241971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f241972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f241973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.pj1 f241974i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(dn2.s0 s0Var, android.widget.TextView textView, long j17, com.tencent.mm.plugin.finder.live.view.k0 k0Var, r45.pj1 pj1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241970e = s0Var;
        this.f241971f = textView;
        this.f241972g = j17;
        this.f241973h = k0Var;
        this.f241974i = pj1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dn2.r0(this.f241970e, this.f241971f, this.f241972g, this.f241973h, this.f241974i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f241969d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dn2.s0 s0Var = this.f241970e;
            android.widget.TextView textView = this.f241971f;
            long j17 = this.f241972g;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f241973h;
            java.lang.String string = this.f241974i.getString(7);
            if (string == null) {
                string = "";
            }
            this.f241969d = 1;
            obj = dn2.s0.e(s0Var, textView, j17, k0Var, string, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
