package v14;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.g f432542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v14.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432542e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v14.f(this.f432542e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432541d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg3.o0 fj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
            kotlin.jvm.internal.o.f(fj6, "getOpLogService(...)");
            kotlinx.coroutines.flow.n2 b17 = e21.a1.b(fj6);
            if (b17 != null) {
                kotlinx.coroutines.flow.j r17 = kotlinx.coroutines.flow.l.r(new v14.e(b17), 1);
                v14.b bVar = new v14.b(this.f432542e);
                this.f432541d = 1;
                if (((kotlinx.coroutines.flow.x0) r17).a(bVar, this) == aVar) {
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
