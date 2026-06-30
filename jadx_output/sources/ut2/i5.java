package ut2;

/* loaded from: classes3.dex */
public final class i5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f430925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f430926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.sdk.platformtools.o4 o4Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430925d = o4Var;
        this.f430926e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.i5(this.f430925d, this.f430926e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ut2.i5 i5Var = (ut2.i5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f430925d;
        java.lang.String[] b17 = o4Var.b();
        kotlin.jvm.internal.o.f(b17, "allKeys(...)");
        for (java.lang.String str : b17) {
            if (!com.tencent.mm.sdk.platformtools.t8.T0(this.f430926e, o4Var.getLong(str, -1L))) {
                o4Var.remove(str);
            }
        }
        return jz5.f0.f302826a;
    }
}
