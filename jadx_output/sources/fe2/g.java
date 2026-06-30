package fe2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f261511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe2.h f261512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fe2.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f261512e = hVar;
        this.f261513f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fe2.g(this.f261512e, this.f261513f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fe2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f261511d;
        fe2.h hVar = this.f261512e;
        java.lang.String boxId = this.f261513f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.e0 e0Var = (mm2.e0) hVar.P0(mm2.e0.class);
            this.f261511d = 1;
            if (e0Var.T6(boxId, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mm2.e0 e0Var2 = (mm2.e0) hVar.P0(mm2.e0.class);
        kotlin.jvm.internal.o.g(boxId, "boxId");
        r45.qm1 qm1Var = new r45.qm1();
        int i18 = qs5.v.f366472a;
        qm1Var.set(0, 1);
        qm1Var.set(1, boxId);
        e0Var2.N6(qm1Var);
        kotlin.jvm.internal.o.g(boxId, "boxId");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("event_type", 1);
            jSONObject.put("group_box_number", boxId);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).wj(jSONObject);
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f302826a;
    }
}
