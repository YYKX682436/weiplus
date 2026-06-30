package zl2;

/* loaded from: classes.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473666d;

    /* renamed from: e, reason: collision with root package name */
    public int f473667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f473669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f473670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f473671i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473673n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context, int i17, int i18, com.tencent.mm.storage.u3 u3Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473668f = context;
        this.f473669g = i17;
        this.f473670h = i18;
        this.f473671i = u3Var;
        this.f473672m = c0Var;
        this.f473673n = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.b1(this.f473668f, this.f473669g, this.f473670h, this.f473671i, this.f473672m, this.f473673n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f473667e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r12.f473666d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lc5
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f473666d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L9c
        L29:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L70
        L2d:
            kotlin.ResultKt.throwOnFailure(r13)
            r45.my1 r13 = new r45.my1
            r13.<init>()
            db2.t4 r1 = db2.t4.f228171a
            r5 = 8334(0x208e, float:1.1678E-41)
            r45.kv0 r1 = r1.a(r5)
            r13.set(r4, r1)
            int r1 = r12.f473669g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.set(r3, r1)
            int r1 = r12.f473670h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.set(r2, r1)
            com.tencent.mm.modelbase.i r13 = r13.d()
            az2.j r13 = (az2.j) r13
            android.content.Context r6 = r12.f473668f
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            r5 = r13
            az2.j.u(r5, r6, r7, r8, r10, r11)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            r12.f473667e = r4
            java.lang.Object r13 = xg2.g.b(r13, r1, r12)
            if (r13 != r0) goto L70
            return r0
        L70:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            if (r1 == 0) goto Lc5
            com.tencent.mm.storage.u3 r7 = r12.f473671i
            int r8 = r12.f473670h
            kotlin.jvm.internal.c0 r9 = r12.f473672m
            com.tencent.mm.ui.widget.dialog.k0 r10 = r12.f473673n
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto L9c
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto L89
            oz5.l r13 = r12.getContext()
        L89:
            zl2.a1 r11 = new zl2.a1
            r6 = 0
            r4 = r11
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.f473666d = r1
            r12.f473667e = r3
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r11, r12)
            if (r13 != r0) goto L9c
            return r0
        L9c:
            if (r1 == 0) goto Lc5
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r13 = kotlinx.coroutines.internal.b0.f310484a
            boolean r3 = r1 instanceof xg2.b
            if (r3 == 0) goto Lc5
            if (r13 != 0) goto Lb0
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto Lb0
            oz5.l r13 = r12.getContext()
        Lb0:
            zl2.z0 r3 = new zl2.z0
            r4 = 0
            android.content.Context r5 = r12.f473668f
            com.tencent.mm.ui.widget.dialog.k0 r6 = r12.f473673n
            r3.<init>(r1, r4, r5, r6)
            r12.f473666d = r1
            r12.f473667e = r2
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r3, r12)
            if (r13 != r0) goto Lc5
            return r0
        Lc5:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
