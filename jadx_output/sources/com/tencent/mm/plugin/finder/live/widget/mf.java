package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f119068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f119069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.of f119071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f119072h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(az2.f fVar, jz5.l lVar, android.content.Context context, com.tencent.mm.plugin.finder.live.widget.of ofVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119068d = fVar;
        this.f119069e = lVar;
        this.f119070f = context;
        this.f119071g = ofVar;
        this.f119072h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.mf(this.f119068d, this.f119069e, this.f119070f, this.f119071g, this.f119072h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.mf mfVar = (com.tencent.mm.plugin.finder.live.widget.mf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r1 != null) goto L26;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r8)
            az2.f r8 = r7.f119068d
            r8.b()
            jz5.l r8 = r7.f119069e
            java.lang.Object r0 = r8.f302833d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            android.content.Context r2 = r7.f119070f
            if (r0 == 0) goto L35
            android.content.res.Resources r8 = r2.getResources()
            r0 = 2131763530(0x7f10214a, float:1.9158168E38)
            java.lang.String r8 = r8.getString(r0)
            db5.t7.h(r2, r8)
            com.tencent.mm.plugin.finder.live.widget.of r8 = r7.f119071g
            r8.f119298v = r1
            r8.f119299w = r1
            r8.getClass()
            r8.A()
            goto L9d
        L35:
            java.lang.Object r0 = r8.f302834e
            rm0.j r0 = (rm0.j) r0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L46
            r5 = -200201(0xfffffffffffcf1f7, float:NaN)
            int r0 = r0.f397425f
            if (r0 != r5) goto L46
            r0 = r3
            goto L47
        L46:
            r0 = r4
        L47:
            r5 = 2131763528(0x7f102148, float:1.9158164E38)
            if (r0 == 0) goto L92
            com.tencent.mm.ui.widget.dialog.u1 r0 = new com.tencent.mm.ui.widget.dialog.u1
            r0.<init>(r2)
            java.lang.Object r8 = r8.f302834e
            rm0.j r8 = (rm0.j) r8
            if (r8 == 0) goto L6a
            java.lang.String r8 = r8.f397426g
            if (r8 == 0) goto L6a
            int r6 = r8.length()
            if (r6 <= 0) goto L63
            r6 = r3
            goto L64
        L63:
            r6 = r4
        L64:
            if (r6 == 0) goto L67
            r1 = r8
        L67:
            if (r1 == 0) goto L6a
            goto L77
        L6a:
            android.content.res.Resources r8 = r2.getResources()
            java.lang.String r1 = r8.getString(r5)
            java.lang.String r8 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r8)
        L77:
            r0.g(r1)
            r0.a(r3)
            android.content.res.Resources r8 = r2.getResources()
            r1 = 2131763529(0x7f102149, float:1.9158166E38)
            java.lang.String r8 = r8.getString(r1)
            r0.n(r8)
            r0.r(r3)
            r0.q(r4)
            goto L9d
        L92:
            android.content.res.Resources r8 = r2.getResources()
            java.lang.String r8 = r8.getString(r5)
            db5.t7.g(r2, r8)
        L9d:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
