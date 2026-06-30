package hf2;

/* loaded from: classes.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f281215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.lang.String str, hf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281214e = str;
        this.f281215f = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.z0(this.f281214e, this.f281215f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281213d;
        hf2.e1 e1Var = this.f281215f;
        java.lang.String str = this.f281214e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(str.length() > 0)) {
                com.tencent.mars.xlog.Log.e(e1Var.f281052b, "delete stickerId:" + str + '!');
                return jz5.f0.f302826a;
            }
            r45.so1 so1Var = new r45.so1();
            so1Var.set(4, java.lang.Long.valueOf(((mm2.e1) e1Var.f281051a.business(mm2.e1.class)).f328988r.getLong(0)));
            hf2.x xVar = e1Var.f281051a;
            so1Var.set(3, java.lang.Long.valueOf(((mm2.e1) xVar.business(mm2.e1.class)).f328983m));
            so1Var.set(2, ((mm2.c1) xVar.business(mm2.c1.class)).f328852o);
            so1Var.set(5, str);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 9852;
            lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivedeletesticker";
            lVar.f70664a = so1Var;
            lVar.f70665b = new r45.to1();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
            wi6.p(a17);
            this.f281213d = 1;
            obj = xg2.g.d(wi6, null, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(e1Var.f281052b, "deleteSticker " + str + " result is suc:" + (obj instanceof xg2.i));
        return jz5.f0.f302826a;
    }
}
