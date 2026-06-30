package qn2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f365136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s71.b f365137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f365138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qn2.v0 v0Var, s71.b bVar, r45.cz1 cz1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365136e = v0Var;
        this.f365137f = bVar;
        this.f365138g = cz1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn2.q0(this.f365136e, this.f365137f, this.f365138g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object h17;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f365135d;
        s71.b bVar = this.f365137f;
        qn2.v0 v0Var = this.f365136e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            on2.l3 l3Var = on2.l3.f346966a;
            long j17 = ((mm2.e1) v0Var.f365176a.P0(mm2.e1.class)).f328983m;
            byte[] bArr = ((mm2.e1) v0Var.f365176a.P0(mm2.e1.class)).f328985o;
            android.content.Context context = v0Var.f365177b.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = "claim addr:" + bVar.f403976m;
            r45.p30 p30Var = new r45.p30();
            p30Var.set(0, bVar.f403977n);
            p30Var.set(1, bVar.f403978o);
            p30Var.set(2, l3Var.d(bVar));
            r45.cz1 cz1Var = this.f365138g;
            this.f365135d = 1;
            h17 = l3Var.h(j17, bArr, context, str, p30Var, cz1Var, this);
            if (h17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            h17 = obj;
        }
        r45.yy1 yy1Var = (r45.yy1) h17;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (yy1Var != null) {
            pm0.v.X(new qn2.p0(v0Var, yy1Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("VisitorLotteryCardDoneWidget", "claim addr:" + bVar.f403976m + " but resp is null!");
        }
        return f0Var2;
    }
}
