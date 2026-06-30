package fw1;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw1.h f267076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jw1.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f267076d = hVar;
        this.f267077e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fw1.f(this.f267076d, this.f267077e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fw1.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qw1.j jVar = this.f267076d.f302305g;
        jVar.getClass();
        java.lang.String username = this.f267077e;
        kotlin.jvm.internal.o.g(username, "username");
        qw1.c cVar = jVar.f367112h;
        if (cVar == null) {
            is0.c b17 = is0.b.b(false, 19L);
            jVar.f367110f.add(b17);
            qw1.c cVar2 = new qw1.c(jVar, username, b17);
            jVar.f367112h = cVar2;
            cVar = cVar2;
        }
        is0.c cVar3 = cVar.f367078b;
        return new jz5.l(cVar3, new android.graphics.SurfaceTexture(cVar3.f294395e));
    }
}
