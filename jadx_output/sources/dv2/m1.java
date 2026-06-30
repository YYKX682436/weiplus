package dv2;

/* loaded from: classes8.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f243899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f243900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db2.c4 f243901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f243902h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.m8 f243903i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(long j17, kotlin.jvm.internal.c0 c0Var, db2.c4 c4Var, dv2.o1 o1Var, com.tencent.mm.plugin.finder.assist.m8 m8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243899e = j17;
        this.f243900f = c0Var;
        this.f243901g = c4Var;
        this.f243902h = o1Var;
        this.f243903i = m8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dv2.m1(this.f243899e, this.f243900f, this.f243901g, this.f243902h, this.f243903i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dv2.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243898d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f243898d = 1;
            if (kotlinx.coroutines.k1.b(this.f243899e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preCheckInner] endCheck:");
        kotlin.jvm.internal.c0 c0Var = this.f243900f;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", sb6.toString());
        if (!c0Var.f310112d) {
            this.f243901g.j();
            com.tencent.mm.plugin.finder.assist.h9 h9Var = new com.tencent.mm.plugin.finder.assist.h9(true, false, null, 4, null);
            this.f243902h.f243922i = h9Var;
            this.f243903i.c(h9Var);
        }
        return jz5.f0.f302826a;
    }
}
