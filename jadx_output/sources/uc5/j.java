package uc5;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426502d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uc5.n f426506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426507i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f426508m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ uc5.d f426509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f426510o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View view, java.lang.String str, uc5.n nVar, android.content.Context context, com.tencent.mm.storage.f9 f9Var, uc5.d dVar, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426504f = view;
        this.f426505g = str;
        this.f426506h = nVar;
        this.f426507i = context;
        this.f426508m = f9Var;
        this.f426509n = dVar;
        this.f426510o = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uc5.j jVar = new uc5.j(this.f426504f, this.f426505g, this.f426506h, this.f426507i, this.f426508m, this.f426509n, this.f426510o, continuation);
        jVar.f426503e = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uc5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f426502d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L27
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            kotlin.ResultKt.throwOnFailure(r14)
            goto L9f
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            java.lang.Object r1 = r13.f426503e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L75
        L27:
            java.lang.Object r1 = r13.f426503e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L42
        L2f:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f426503e
            kotlinx.coroutines.y0 r14 = (kotlinx.coroutines.y0) r14
            r13.f426503e = r14
            r13.f426502d = r6
            java.lang.Object r1 = kotlinx.coroutines.g4.a(r13)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r14
        L42:
            android.view.View r14 = r13.f426504f
            r6 = 2131314814(0x7f09487e, float:1.8248064E38)
            java.lang.Object r14 = r14.getTag(r6)
            boolean r6 = r14 instanceof java.lang.String
            if (r6 == 0) goto L52
            java.lang.String r14 = (java.lang.String) r14
            goto L53
        L52:
            r14 = r3
        L53:
            java.lang.String r6 = r13.f426505g
            boolean r14 = kotlin.jvm.internal.o.b(r14, r6)
            if (r14 != 0) goto L5c
            return r2
        L5c:
            kotlinx.coroutines.z0.g(r1)
            java.lang.String r14 = "$context"
            android.content.Context r6 = r13.f426507i
            kotlin.jvm.internal.o.f(r6, r14)
            r13.f426503e = r1
            r13.f426502d = r5
            uc5.n r14 = r13.f426506h
            com.tencent.mm.storage.f9 r5 = r13.f426508m
            java.lang.Object r14 = r14.w(r6, r5, r13)
            if (r14 != r0) goto L75
            return r0
        L75:
            r11 = r14
            uc5.r0 r11 = (uc5.r0) r11
            uc5.d r14 = r13.f426509n
            r14.f426477e = r11
            kotlinx.coroutines.z0.g(r1)
            kotlinx.coroutines.p0 r14 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r14 = kotlinx.coroutines.internal.b0.f310484a
            uc5.i r1 = new uc5.i
            android.view.View r6 = r13.f426504f
            java.lang.String r7 = r13.f426505g
            uc5.n r8 = r13.f426506h
            android.content.Context r9 = r13.f426507i
            java.lang.Object r10 = r13.f426510o
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.f426503e = r3
            r13.f426502d = r4
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r1, r13)
            if (r14 != r0) goto L9f
            return r0
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uc5.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
