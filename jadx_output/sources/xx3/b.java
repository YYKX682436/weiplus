package xx3;

/* loaded from: classes9.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f457995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457995d = j17;
        this.f457996e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx3.b(this.f457995d, this.f457996e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long j17 = this.f457995d;
        if (j17 == 0) {
            return null;
        }
        jz5.l ol6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ol(j17, this.f457996e, 2);
        return new xx3.a((com.tencent.mm.protocal.protobuf.FinderObject) ol6.f302834e, ((java.lang.Boolean) ol6.f302833d).booleanValue());
    }
}
