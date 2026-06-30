package gq4;

/* loaded from: classes11.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f274594d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f274595e;

    /* renamed from: f, reason: collision with root package name */
    public int f274596f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f274597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274598h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f274599i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f274600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f274601n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274602o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, long j17, boolean z17, yz5.p pVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274598h = str;
        this.f274599i = j17;
        this.f274600m = z17;
        this.f274601n = pVar;
        this.f274602o = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gq4.o oVar = new gq4.o(this.f274598h, this.f274599i, this.f274600m, this.f274601n, this.f274602o, continuation);
        oVar.f274597g = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq4.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        kotlinx.coroutines.f1 f1Var;
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f274596f;
        java.lang.String str = this.f274598h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f274597g;
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            h0Var = new kotlin.jvm.internal.h0();
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, null, null, new gq4.n(c0Var2, h0Var, this.f274602o, null), 3, null);
            jp5.n nVar = (jp5.n) i95.n0.c(jp5.n.class);
            this.f274597g = c0Var2;
            this.f274594d = h0Var;
            this.f274595e = b17;
            this.f274596f = 1;
            java.lang.Object Ai = ((co5.p) nVar).Ai(str, this);
            if (Ai == aVar) {
                return aVar;
            }
            f1Var = b17;
            c0Var = c0Var2;
            obj = Ai;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f1Var = (kotlinx.coroutines.f1) this.f274595e;
            h0Var = (kotlin.jvm.internal.h0) this.f274594d;
            c0Var = (kotlin.jvm.internal.c0) this.f274597g;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c0Var.f310112d = true;
        kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUseNew: getILinkModeRet ");
        sb6.append(booleanValue);
        sb6.append(", cost ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f274599i);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.ILinkSdkKtHelper", sb6.toString());
        if (booleanValue) {
            ((jp5.o) i95.n0.c(jp5.o.class)).u4(str, kz5.c0.d(str), this.f274600m);
        } else {
            this.f274601n.invoke(java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(gq4.v.Bi().f176558a.f176433w));
        }
        return jz5.f0.f302826a;
    }
}
