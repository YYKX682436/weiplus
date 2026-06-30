package um2;

/* loaded from: classes3.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f429102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(um2.x5 x5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429103e = x5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.z(this.f429103e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        sf2.d3 d3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429102d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um2.x5 x5Var = this.f429103e;
            fm2.c cVar = x5Var.f19606c;
            if (cVar != null && (data = cVar.getData()) != null && (liveRoomControllerStore = data.f309131f) != null && (d3Var = (sf2.d3) liveRoomControllerStore.controller(sf2.d3.class)) != null) {
                r45.nx1 nx1Var = new r45.nx1();
                nx1Var.f381721d = ((mm2.c1) x5Var.c(mm2.c1.class)).m8();
                this.f429102d = 1;
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
