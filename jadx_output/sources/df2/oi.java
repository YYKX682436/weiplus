package df2;

/* loaded from: classes3.dex */
public final class oi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wi f230969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMedia f230970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(df2.wi wiVar, com.tencent.mm.protocal.protobuf.FinderMedia finderMedia, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230969e = wiVar;
        this.f230970f = finderMedia;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.oi(this.f230969e, this.f230970f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.oi) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230968d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.wi wiVar = this.f230969e;
            com.tencent.mars.xlog.Log.i(wiVar.f231690m, "[continuePost] mainjob step2");
            zl2.r4 r4Var = zl2.r4.f473950a;
            gk2.e liveRoomData = wiVar.getStore().getLiveRoomData();
            df2.ni niVar = new df2.ni(wiVar, this.f230970f);
            this.f230968d = 1;
            if (r4Var.s2(liveRoomData, niVar, this) == aVar) {
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
