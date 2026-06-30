package l41;

/* loaded from: classes15.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315826d;

    /* renamed from: e, reason: collision with root package name */
    public int f315827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f315828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j41.j0 f315829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest f315830h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315831i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f315832m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j41.h0 h0Var, j41.j0 j0Var, com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest, l41.j1 j1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315828f = h0Var;
        this.f315829g = j0Var;
        this.f315830h = openIMKefuStartConversationRequest;
        this.f315831i = j1Var;
        this.f315832m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.h1(this.f315828f, this.f315829g, this.f315830h, this.f315831i, this.f315832m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        m41.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f315827e;
        int i18 = 1;
        l41.j1 j1Var = this.f315831i;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                j41.h0 h0Var = this.f315828f;
                j41.j0 j0Var = this.f315829g;
                r45.s4 s4Var = this.f315830h.f72277i;
                if (s4Var == null) {
                    s4Var = new r45.s4();
                }
                m41.d dVar2 = new m41.d(h0Var, j0Var, s4Var);
                this.f315826d = dVar2;
                this.f315827e = 1;
                if (dVar2.d(this) == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (m41.d) this.f315826d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            l41.j1.b(j1Var, dVar);
            l41.k0 k0Var = l41.j1.f315841t;
            java.lang.Long l17 = ((r45.iq6) dVar.f68421b).f377275h != null ? new java.lang.Long(r2.f378272e) : null;
            e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            int i19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, pInt, pInt2) ? pInt2.value : 0;
            e42.d0 d0Var2 = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
            com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
            int i27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var2, pInt3, pInt4) ? pInt4.value : 0;
            if (!this.f315832m) {
                i18 = 0;
            }
            int k17 = j1Var.k();
            j41.u uVar = j1Var.f315845d;
            java.lang.String a17 = l41.k0.a(k0Var, l17, new java.lang.Integer(k17), new java.lang.Integer(uVar != null ? ((k41.g0) uVar).field_kefuType : 0), new java.lang.Integer(i19), new java.lang.Integer(i27), null, null, new java.lang.Integer(i18), null, null, td1.i.CTRL_INDEX, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "EcsOpenImKfLoadResult report value=0 (tryAdd success), extra=%s", a17);
            y02.v0 a18 = y02.x0.f458634d.a();
            if (a18 != null) {
                a18.p1(bw5.d5.EcsOpenImKfLoadResult, 0, a17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConfirmController", "tryAddKefuConversation exception: " + e17.getMessage());
            j1Var.n();
        }
        return jz5.f0.f302826a;
    }
}
