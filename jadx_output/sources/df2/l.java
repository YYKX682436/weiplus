package df2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.o f230614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f230615f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(df2.o oVar, r45.ze2 ze2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230614e = oVar;
        this.f230615f = ze2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.l(this.f230614e, this.f230615f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230613d;
        df2.o oVar = this.f230614e;
        r45.ze2 loc = this.f230615f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = ((mm2.e1) oVar.getStore().business(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) oVar.getStore().business(mm2.e1.class)).f328983m;
            ek2.q1 q1Var = ek2.r1.f253524u;
            kotlin.jvm.internal.o.g(loc, "loc");
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 22);
            r45.u02 u02Var = new r45.u02();
            u02Var.set(0, loc);
            hx0Var.set(1, com.tencent.mm.protobuf.g.b(u02Var.toByteArray()));
            ek2.r1 r1Var = new ek2.r1(j17, j18, 22, hx0Var);
            az2.j.u(r1Var, oVar.O6(), null, 0L, 6, null);
            this.f230613d = 1;
            obj = rm0.h.b(r1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("longitude", new java.lang.Float(loc.getFloat(0)));
            jSONObject.put("latitude", new java.lang.Float(loc.getFloat(1)));
            jSONObject.put("city", loc.getString(2));
            jSONObject.put("poiName", loc.getString(3));
            jSONObject.put("poiAddress", loc.getString(4));
            jSONObject.put("poiClassifyId", loc.getString(5));
            jSONObject.put("poiClassifyType", loc.getInteger(6));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328355h2, jSONObject.toString(), null, 4, null);
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) oVar.business(mm2.g1.class)).f329074o).k(loc);
        }
        com.tencent.mars.xlog.Log.i(oVar.f230899p, "[onLocPickResult] errCode = " + fVar.f70616b + ", errType = " + fVar.f70615a);
        return jz5.f0.f302826a;
    }
}
