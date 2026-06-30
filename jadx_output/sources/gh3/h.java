package gh3;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gh3.i f271899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f271900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f271901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f271902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f271903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f271904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f271905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f271906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f271907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gh3.i iVar, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, boolean z17, com.tencent.mm.storage.f9 f9Var, int i17, int i18, kotlin.jvm.internal.h0 h0Var, android.content.Context context, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271899d = iVar;
        this.f271900e = lifecycleScope;
        this.f271901f = z17;
        this.f271902g = f9Var;
        this.f271903h = i17;
        this.f271904i = i18;
        this.f271905m = h0Var;
        this.f271906n = context;
        this.f271907o = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gh3.h(this.f271899d, this.f271900e, this.f271901f, this.f271902g, this.f271903h, this.f271904i, this.f271905m, this.f271906n, this.f271907o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gh3.h hVar = (gh3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        oz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.rz4 rz4Var = new r45.rz4();
        r45.v43 v43Var = new r45.v43();
        com.tencent.mm.storage.f9 f9Var = this.f271902g;
        v43Var.f387869d = (int) f9Var.getMsgId();
        java.lang.String y07 = f9Var.y0();
        if (y07 == null) {
            y07 = "";
        }
        v43Var.f387870e = x51.j1.i(y07);
        java.lang.String T0 = f9Var.T0();
        if (T0 == null) {
            T0 = "";
        }
        v43Var.f387871f = x51.j1.i(T0);
        v43Var.f387872g = this.f271903h;
        v43Var.f387873h = this.f271904i;
        v43Var.f387874i = (int) f9Var.getCreateTime();
        java.lang.String str = f9Var.G;
        v43Var.f387875m = str != null ? str : "";
        v43Var.f387876n = f9Var.I0();
        v43Var.f387877o = (int) f9Var.F0();
        rz4Var.f385317d = v43Var;
        this.f271899d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCgi, MsgInfo: ");
        r45.v43 v43Var2 = rz4Var.f385317d;
        sb6.append(v43Var2 != null ? v43Var2.toJSON() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecurityMsgIntercept", sb6.toString());
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 6999;
        lVar2.f70666c = "/cgi-bin/micromsg-bin/forwardmsgviewspam";
        lVar2.f70664a = rz4Var;
        lVar2.f70665b = new r45.sz4();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar2.a());
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f271900e;
        boolean z17 = this.f271901f;
        if (z17) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            lVar = kotlinx.coroutines.internal.b0.f310484a;
        } else {
            lVar = kotlinx.coroutines.q1.f310570c;
        }
        kotlinx.coroutines.l.d(lifecycleScope, lVar, null, new gh3.g(a17, this.f271905m, this.f271902g, z17, this.f271906n, this.f271907o, this.f271904i, this.f271899d, null), 2, null);
        return jz5.f0.f302826a;
    }
}
