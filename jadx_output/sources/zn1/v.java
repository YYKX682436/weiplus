package zn1;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f474479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474480e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zn1.v vVar = new zn1.v(this.f474480e, continuation);
        vVar.f474479d = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zn1.v) create((zn1.m0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(((zn1.m0) this.f474479d).f474454a, this.f474480e));
    }
}
