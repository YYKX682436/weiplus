package zl2;

/* loaded from: classes.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f473814h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.zc4 zc4Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.zc4 zc4Var2, v65.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473811e = zc4Var;
        this.f473812f = appCompatActivity;
        this.f473813g = zc4Var2;
        this.f473814h = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.i0(this.f473811e, this.f473812f, this.f473813g, this.f473814h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473810d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.zc4 zc4Var = this.f473811e;
            int integer = zc4Var.getInteger(18);
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f473812f;
            if (integer == 1) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                this.f473810d = 1;
                ((c61.l7) b6Var).getClass();
                java.lang.Object w17 = com.tencent.mm.plugin.finder.assist.n7.f102406a.w(appCompatActivity, zc4Var, this);
                if (w17 != aVar) {
                    w17 = f0Var;
                }
                if (w17 == aVar) {
                    return aVar;
                }
            } else {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                this.f473810d = 2;
                if (((com.tencent.mm.feature.finder.live.v4) w0Var).nj(appCompatActivity, this.f473813g, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f473814h.a("");
        return f0Var;
    }
}
