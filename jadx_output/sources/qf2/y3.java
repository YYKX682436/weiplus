package qf2;

/* loaded from: classes3.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.z3 f362662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(qf2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362662e = z3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.y3(this.f362662e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.y3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362661d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f362661d = 1;
            if (kotlinx.coroutines.k1.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qf2.z3 z3Var = this.f362662e;
        if (!((mm2.e1) z3Var.business(mm2.e1.class)).c7()) {
            return f0Var;
        }
        if (!z3Var.Z6()) {
            z3Var.a7(134217728, false, null);
        }
        if (((mm2.o4) z3Var.business(mm2.o4.class)).G) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f328345b2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", 1);
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            qf2.x3 x3Var = new qf2.x3(z3Var, null);
            this.f362661d = 2;
            if (kotlinx.coroutines.l.g(g3Var, x3Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
