package dd5;

/* loaded from: classes.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229234d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dd5.o0(this.f229234d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        v05.b bVar = new v05.b();
        bVar.fromXml(this.f229234d);
        return bVar;
    }
}
