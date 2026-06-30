package gc0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f270327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f270328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270330i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Context context2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270326e = context;
        this.f270327f = f9Var;
        this.f270328g = intent;
        this.f270329h = str;
        this.f270330i = str2;
        this.f270331m = context2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.w(this.f270326e, this.f270327f, this.f270328g, this.f270329h, this.f270330i, this.f270331m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3 == false) goto L29;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f270325d
            android.content.Intent r2 = r5.f270328g
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.HandleRecommendRemarkSendTipClickListener"
            java.lang.String r1 = "onClickImp() called launch have img"
            com.tencent.mars.xlog.Log.i(r6, r1)
            java.lang.Class<xs.y0> r6 = xs.y0.class
            i95.m r6 = i95.n0.c(r6)
            xs.y0 r6 = (xs.y0) r6
            java.lang.String r1 = "$ctx"
            android.content.Context r4 = r5.f270326e
            kotlin.jvm.internal.o.f(r4, r1)
            r5.f270325d = r3
            te5.o r6 = (te5.o) r6
            com.tencent.mm.storage.f9 r1 = r5.f270327f
            java.lang.Object r6 = r6.Ai(r4, r1, r2, r5)
            if (r6 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L97
            r6 = 0
            java.lang.String r0 = r5.f270329h
            if (r0 == 0) goto L53
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L51
            goto L53
        L51:
            r0 = r6
            goto L54
        L53:
            r0 = r3
        L54:
            android.content.Context r1 = r5.f270331m
            if (r0 == 0) goto L66
            java.lang.String r0 = r5.f270330i
            if (r0 == 0) goto L64
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L63
            goto L64
        L63:
            r3 = r6
        L64:
            if (r3 != 0) goto L85
        L66:
            java.lang.Class<ct.u2> r0 = ct.u2.class
            i95.m r0 = i95.n0.c(r0)
            ct.u2 r0 = (ct.u2) r0
            bt.d r0 = (bt.d) r0
            com.tencent.mm.app.y7 r0 = r0.f24068d
            r0.m(r2, r1)
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L85
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = 2130772152(0x7f0100b8, float:1.7147414E38)
            r3 = 2130771992(0x7f010018, float:1.714709E38)
            r0.overridePendingTransition(r2, r3)
        L85:
            int r0 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r0 = new com.tencent.mm.ui.widget.dialog.e4
            r0.<init>(r1)
            r1 = 2131773847(0x7f104997, float:1.9179093E38)
            r0.d(r1)
            r0.f211779f = r6
            r0.c()
        L97:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
