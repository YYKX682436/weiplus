package sm2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(sm2.o4 o4Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409596e = o4Var;
        this.f409597f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm2.o(this.f409596e, this.f409597f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        sf2.d3 d3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409595d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fm2.a aVar2 = this.f409596e.f19595c;
            if (aVar2 != null && (data = aVar2.getData()) != null && (liveRoomControllerStore = data.f309131f) != null && (d3Var = (sf2.d3) liveRoomControllerStore.controller(sf2.d3.class)) != null) {
                r45.nx1 nx1Var = new r45.nx1();
                nx1Var.f381721d = this.f409597f;
                this.f409595d = 1;
                obj = d3Var.a7(12, nx1Var, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
