package u61;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f424908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f424909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData f424911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.gn4 f424912h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.LinkedList linkedList, java.lang.String str, com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData getMobileReqData, r45.gn4 gn4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424909e = linkedList;
        this.f424910f = str;
        this.f424911g = getMobileReqData;
        this.f424912h = gn4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u61.l(this.f424909e, this.f424910f, this.f424911g, this.f424912h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u61.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f424908d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u61.d dVar = u61.d.f424884a;
            java.util.LinkedList linkedList = this.f424909e;
            java.lang.String str = this.f424910f;
            com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData getMobileReqData = this.f424911g;
            r45.gn4 gn4Var = this.f424912h;
            this.f424908d = 1;
            obj = dVar.a(linkedList, str, getMobileReqData, gn4Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
