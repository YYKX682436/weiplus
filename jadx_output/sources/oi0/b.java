package oi0;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {
    public final /* synthetic */ java.lang.String L;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345573d;

    /* renamed from: e, reason: collision with root package name */
    public int f345574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f345575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.nk0 f345576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f345577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f345578i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345579m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ si0.s1 f345580n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, bw5.nk0 nk0Var, int i17, java.lang.String str, java.lang.Long l17, android.content.Context context, si0.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f345575f = snsInfo;
        this.f345576g = nk0Var;
        this.f345577h = i17;
        this.L = str;
        this.f345578i = l17;
        this.f345579m = context;
        this.f345580n = s1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oi0.b(this.f345575f, this.f345576g, this.f345577h, this.L, this.f345578i, this.f345579m, this.f345580n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oi0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f345574e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            si0.v0 v0Var = new si0.v0();
            v0Var.f408204d = this.f345580n;
            l1Var.a(kz5.c0.i(new si0.n1(), new si0.t0(), new si0.s0(this.f345575f), new si0.m1(), v0Var));
            java.util.Map l17 = kz5.c1.l(new jz5.l("user_name", c01.z1.r()), new jz5.l("client_version", new java.lang.Integer(com.tencent.mm.sdk.platformtools.z.f193112h)), new jz5.l("current_select_data", this.f345576g.toByteArray()), new jz5.l("page_result_type", new java.lang.Integer(this.f345577h)), new jz5.l("post_session_id", this.L));
            java.lang.Long l18 = this.f345578i;
            if (l18 != null) {
                l17.put("sns_id", l18);
            }
            this.f345573d = l1Var;
            this.f345574e = 1;
            if (l1Var.o("visibilitySetting", l17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            l1Var = (pi0.l1) this.f345573d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f345579m;
        this.f345573d = null;
        this.f345574e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
