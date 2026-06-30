package gl4;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f272890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr4.e f272891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl4.a f272892g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272893h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.ArrayList arrayList, pr4.e eVar, gl4.a aVar, qk.y8 y8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272890e = arrayList;
        this.f272891f = eVar;
        this.f272892g = aVar;
        this.f272893h = y8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gl4.x(this.f272890e, this.f272891f, this.f272892g, this.f272893h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl4.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272889d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "showWeCoinSubscribeView startSubscribeMemberLogic priceTierList: " + this.f272890e.size());
            js4.f fVar = (js4.f) i95.n0.c(js4.f.class);
            this.f272889d = 1;
            ((ls4.e) fVar).getClass();
            obj = new ls4.n0(this.f272891f).e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int ordinal = ((pr4.f) obj).f357995a.ordinal();
        qk.ga gaVar = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? qk.ga.f364134d : qk.ga.f364135e : qk.ga.f364137g : qk.ga.f364136f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWeCoinSubscribeView startSubscribeMemberLogic result status: ");
        sb6.append(gaVar);
        sb6.append(", selectedInfo: ");
        gl4.a aVar2 = this.f272892g;
        bw5.u80 u80Var = aVar2.f272842a;
        sb6.append(u80Var != null ? u80Var.f33807q[1] ? u80Var.f33797d : "" : null);
        sb6.append(", succHalfPanel != null: ");
        sb6.append(aVar2.f272843b != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        qk.ea eaVar = new qk.ea(gaVar, qk.da.f364083e);
        eaVar.f364096c = aVar2.f272843b;
        bw5.u80 u80Var2 = aVar2.f272842a;
        eaVar.f364097d = u80Var2;
        eaVar.f364098e = u80Var2 != null ? u80Var2.f33800g : false;
        qk.y8 y8Var = this.f272893h;
        if (y8Var != null) {
            y8Var.a(eaVar);
        }
        return jz5.f0.f302826a;
    }
}
