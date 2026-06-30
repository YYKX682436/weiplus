package ze5;

/* loaded from: classes9.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f472335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f472337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472338g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.k4 f472339h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f472340i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var, c00.k4 k4Var, ze5.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472336e = dVar;
        this.f472337f = view;
        this.f472338g = f9Var;
        this.f472339h = k4Var;
        this.f472340i = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ze5.z0(this.f472336e, this.f472337f, this.f472338g, this.f472339h, this.f472340i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472335d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.chatting.component.w wVar = com.tencent.mm.ui.chatting.component.c0.f198856r;
            android.view.View view = this.f472337f;
            yb5.d dVar = this.f472336e;
            com.tencent.mm.storage.f9 f9Var = this.f472338g;
            wVar.b(dVar, view, f9Var);
            vd2.d3 d3Var = vd2.d3.f435703a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            w05.a aVar2 = this.f472340i.f471833t;
            if (aVar2 == null || (str = aVar2.getFinderUsername()) == null) {
                str = "";
            }
            jSONObject.put("finderusername", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            d3Var.a("click_shopwindow_shard_card", jSONObject2);
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_shop");
            int i18 = c00.z2.f37041f0;
            i95.m c17 = i95.n0.c(c00.z2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.app.Activity g17 = dVar.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            this.f472335d = 1;
            if (((b00.r) ((c00.z2) c17)).nj(g17, this.f472339h, this) == aVar) {
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
