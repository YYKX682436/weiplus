package mm2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f328949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f328950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, mm2.e0 e0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f328948e = str;
        this.f328949f = e0Var;
        this.f328950g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.d0(this.f328948e, this.f328949f, this.f328950g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        lm2.j0 c17;
        r45.qn qnVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f328947d;
        mm2.e0 e0Var = this.f328949f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveBoxSlice prepareBox, groupId:");
            java.lang.String str = this.f328948e;
            sb6.append(str);
            java.lang.String str2 = sb6.toString();
            kotlin.jvm.internal.o.g(str2, "str");
            com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str2));
            lm2.h0 h0Var = e0Var.f328976s;
            if (h0Var != null) {
                this.f328947d = 1;
                if (h0Var.f(str, this.f328950g, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lm2.h0 h0Var2 = e0Var.f328976s;
        if (h0Var2 == null || (c17 = h0Var2.c()) == null || (qnVar = c17.f319411d) == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.assist.o0 o0Var = com.tencent.mm.plugin.finder.assist.o0.f102420a;
        o0Var.c("Finder.LiveBoxSlice", "LiveBoxSlice startPollingRedDot, boxContext:" + o0Var.b(qnVar));
        lm2.h0 h0Var3 = e0Var.f328976s;
        if (h0Var3 == null) {
            return null;
        }
        r45.qt2 qt2Var = e0Var.f328977t;
        com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "startPollingRedDot");
        com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "stopPollingRedDot");
        km2.m0 m0Var = h0Var3.f319401h;
        if (m0Var != null) {
            kotlinx.coroutines.r2 r2Var = m0Var.f309146d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            m0Var.f309146d = null;
        }
        km2.m0 m0Var2 = new km2.m0(new lm2.x(h0Var3, qnVar, qt2Var), kotlinx.coroutines.q1.f310570c, 1000L);
        h0Var3.f319401h = m0Var2;
        m0Var2.f309146d = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(m0Var2.f309144b), null, null, new km2.l0(m0Var2, null), 3, null);
        return jz5.f0.f302826a;
    }
}
