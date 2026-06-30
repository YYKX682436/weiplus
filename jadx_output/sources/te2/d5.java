package te2;

/* loaded from: classes3.dex */
public final class d5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417949d;

    /* renamed from: e, reason: collision with root package name */
    public int f417950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417951f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f417952g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f417953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(te2.p8 p8Var, kotlin.coroutines.Continuation continuation, int i17, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f417951f = p8Var;
        this.f417952g = continuation;
        this.f417953h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.d5(this.f417951f, this.f417952g, this.f417953h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.d5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        kotlin.coroutines.Continuation continuation;
        java.lang.Object a18;
        kotlin.coroutines.Continuation continuation2;
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417950e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te2.p8 p8Var = this.f417951f;
            boolean z17 = p8Var.A1.f418390a;
            kotlin.coroutines.Continuation continuation3 = this.f417952g;
            if (z17) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f417949d = continuation3;
                this.f417950e = 1;
                p8Var.getClass();
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
                long j17 = (e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0);
                r45.f92 f92Var = p8Var.A1.f418392c;
                long j18 = f92Var != null ? f92Var.getLong(4) : 0L;
                java.lang.String str = p8Var.f418333y1;
                if (str == null) {
                    str = "";
                }
                int i18 = p8Var.f418329x0;
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 11);
                r45.f92 f92Var2 = new r45.f92();
                f92Var2.set(4, java.lang.Long.valueOf(j18));
                f92Var2.set(3, str);
                f92Var2.set(7, java.lang.Integer.valueOf(i18));
                hx0Var.set(1, com.tencent.mm.protobuf.g.b(f92Var2.toByteArray()));
                pq5.g l17 = new ek2.r1(j17, j18, 11, hx0Var).l();
                l17.K(new te2.b5(p8Var, nVar));
                android.app.Activity context = p8Var.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) context);
                a18 = nVar.a();
                if (a18 == aVar) {
                    return aVar;
                }
                continuation2 = continuation3;
                continuation2.resumeWith(kotlin.Result.m521constructorimpl(a18));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                this.f417949d = continuation3;
                this.f417950e = 2;
                p8Var.getClass();
                oz5.n nVar2 = new oz5.n(pz5.f.b(this));
                r45.hx0 hx0Var2 = new r45.hx0();
                r45.t02 t02Var = new r45.t02();
                te2.rc rcVar = p8Var.A1;
                r45.h32 h32Var = rcVar.f418391b;
                t02Var.set(0, h32Var != null ? h32Var.getString(4) : null);
                t02Var.set(2, java.lang.Integer.valueOf(p8Var.f418329x0));
                if (!kotlin.jvm.internal.o.b(p8Var.f418314l1, p8Var.f418333y1)) {
                    r45.cz3 cz3Var = new r45.cz3();
                    cz3Var.set(0, p8Var.f418333y1);
                    java.lang.String str2 = p8Var.f418333y1;
                    cz3Var.set(1, java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 2 : 1));
                    t02Var.set(1, cz3Var);
                }
                t02Var.set(3, java.lang.Integer.valueOf(this.f417953h));
                r45.h32 h32Var2 = rcVar.f418391b;
                t02Var.set(4, java.lang.Integer.valueOf(h32Var2 != null ? h32Var2.getInteger(18) : 0));
                hx0Var2.set(0, 10);
                hx0Var2.set(1, com.tencent.mm.protobuf.g.b(t02Var.toByteArray()));
                pq5.g l18 = new ek2.r1(0L, 0L, 7, hx0Var2).l();
                l18.K(new te2.c5(nVar2));
                android.app.Activity context2 = p8Var.getContext();
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l18.f((com.tencent.mm.ui.MMActivity) context2);
                a17 = nVar2.a();
                if (a17 == aVar) {
                    return aVar;
                }
                continuation = continuation3;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(a17));
            }
        } else if (i17 == 1) {
            continuation2 = (kotlin.coroutines.Continuation) this.f417949d;
            kotlin.ResultKt.throwOnFailure(obj);
            a18 = obj;
            continuation2.resumeWith(kotlin.Result.m521constructorimpl(a18));
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            continuation = (kotlin.coroutines.Continuation) this.f417949d;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(a17));
        }
        return jz5.f0.f302826a;
    }
}
