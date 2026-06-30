package hw0;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw0.z f285490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f285492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(hw0.z zVar, java.lang.String str, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285490e = zVar;
        this.f285491f = str;
        this.f285492g = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hw0.y(this.f285490e, this.f285491f, this.f285492g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hw0.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285489d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f285489d = 1;
            if (this.f285490e.D7(this.f285491f, this.f285492g, this) == aVar) {
                return aVar;
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
