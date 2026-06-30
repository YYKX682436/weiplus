package kd2;

/* loaded from: classes10.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f306823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f306824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f306826g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f306827h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f306828i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f306829m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.ea f306830n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f306831o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.app.Activity activity, kd2.p1 p1Var, boolean z17, kotlin.jvm.internal.c0 c0Var, boolean z18, boolean z19, com.tencent.mm.plugin.finder.feed.model.ea eaVar, boolean z27, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f306824e = activity;
        this.f306825f = p1Var;
        this.f306826g = z17;
        this.f306827h = c0Var;
        this.f306828i = z18;
        this.f306829m = z19;
        this.f306830n = eaVar;
        this.f306831o = z27;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kd2.s0(this.f306824e, this.f306825f, this.f306826g, this.f306827h, this.f306828i, this.f306829m, this.f306830n, this.f306831o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kd2.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f306823d;
        kd2.p1 p1Var = this.f306825f;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                zl2.f fVar = zl2.f.f473753a;
                android.app.Activity activity = this.f306824e;
                java.lang.String string = activity.getString(com.tencent.mm.R.string.gu_);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String a17 = n25.a.a();
                kotlin.jvm.internal.o.f(a17, "getMessageChannelIdUse(...)");
                this.f306823d = 1;
                b17 = fVar.b(activity, 32, string, false, true, a17, 20000L, "finderfloatpermission", this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                b17 = obj;
            }
            com.tencent.mm.plugin.finder.assist.v0 v0Var = (com.tencent.mm.plugin.finder.assist.v0) b17;
            if (v0Var instanceof com.tencent.mm.plugin.finder.assist.t0) {
                kd2.p1 p1Var2 = this.f306825f;
                kd2.q0 q0Var = p1Var2.f306787x;
                if (q0Var != null) {
                    q0Var.f306817r = true;
                }
                p1Var2.I0(this.f306826g, this.f306827h.f310112d, this.f306828i, this.f306829m, this.f306830n, this.f306831o);
            } else {
                if (!(v0Var instanceof com.tencent.mm.plugin.finder.assist.s0)) {
                    z17 = v0Var instanceof com.tencent.mm.plugin.finder.assist.r0;
                }
                if (z17) {
                    kd2.o0 o0Var = kd2.p1.N;
                    p1Var.S0();
                } else if (v0Var instanceof com.tencent.mm.plugin.finder.assist.u0) {
                    com.tencent.mars.xlog.Log.i("FinderVideoPassive", "ShowWarningAlert timeout");
                    kd2.o0 o0Var2 = kd2.p1.N;
                    p1Var.S0();
                }
            }
        } catch (java.lang.Throwable th6) {
            kd2.o0 o0Var3 = kd2.p1.N;
            p1Var.S0();
            com.tencent.mars.xlog.Log.i("FinderVideoPassive", "coroutine cancel throw: " + th6.getMessage(), th6);
        }
        return jz5.f0.f302826a;
    }
}
