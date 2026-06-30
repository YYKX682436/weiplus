package zl2;

/* loaded from: classes.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f474048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f474049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ba4 f474050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(gk2.e eVar, r45.ba4 ba4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474049e = eVar;
        this.f474050f = ba4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.z3(this.f474049e, this.f474050f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f474048d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.xf k17 = dk2.ef.f233372a.k(this.f474049e);
            if (k17 == null) {
                return null;
            }
            this.f474048d = 1;
            dk2.r4 r4Var = (dk2.r4) k17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setAudioBg] liveRoomImg = ");
            r45.ba4 ba4Var = this.f474050f;
            sb6.append(pm0.b0.g(ba4Var));
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, sb6.toString());
            long j17 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328983m;
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 7);
            hx0Var.set(1, com.tencent.mm.protobuf.g.b(ba4Var.toByteArray()));
            obj = rm0.h.a(new ek2.r1(j17, j18, 1, hx0Var), 0L, null, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (r45.m02) obj;
    }
}
