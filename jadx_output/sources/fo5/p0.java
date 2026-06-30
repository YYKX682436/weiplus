package fo5;

/* loaded from: classes14.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(fo5.r0 r0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265055d = r0Var;
        this.f265056e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.p0(this.f265055d, this.f265056e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.p0 p0Var = (fo5.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        lo5.h hVar = this.f265055d.f265095n;
        java.lang.String str = this.f265056e;
        if (str == null) {
            str = "";
        }
        hVar.getClass();
        if (!kotlin.jvm.internal.o.b(str, "")) {
            hVar.f320216c.A(str);
        }
        return jz5.f0.f302826a;
    }
}
