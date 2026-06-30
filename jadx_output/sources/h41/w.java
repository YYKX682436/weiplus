package h41;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f278877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h41.x f278878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f278879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f278880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h41.x xVar, byte[] bArr, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278878e = xVar;
        this.f278879f = bArr;
        this.f278880g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.w(this.f278878e, this.f278879f, this.f278880g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278877d;
        h41.x xVar = this.f278878e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h41.j jVar = xVar.f278885b;
            this.f278877d = 1;
            obj = jVar.d(this.f278879f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.wechat.aff.ovc.a aVar2 = xVar.f278884a;
        if (aVar2 != null) {
            aVar2.I1(this.f278880g, booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
