package pn4;

/* loaded from: classes14.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f357161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jy3 f357162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.iy3 f357163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(pn4.q0 q0Var, r45.jy3 jy3Var, r45.iy3 iy3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357161e = q0Var;
        this.f357162f = jy3Var;
        this.f357163g = iy3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.o0(this.f357161e, this.f357162f, this.f357163g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357160d;
        pn4.q0 q0Var = this.f357161e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f357160d = 1;
            obj = pn4.q0.d(q0Var, this.f357162f, this.f357163g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.ly3 ly3Var = (r45.ly3) obj;
        if (ly3Var != null) {
            if (ly3Var.getBoolean(1)) {
                q0Var.j("has_unknow_character");
            } else {
                com.tencent.mm.vfs.w6.h(q0Var.g());
                com.tencent.mm.vfs.w6.f(q0Var.g());
                this.f357160d = 2;
                if (pn4.q0.c(q0Var, ly3Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
