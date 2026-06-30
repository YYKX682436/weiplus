package zv0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zv0.r f476159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f476160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ex0.j0 f476161h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rv0.n1 n1Var, zv0.r rVar, ex0.a0 a0Var, ex0.j0 j0Var, zv0.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476158e = n1Var;
        this.f476159f = rVar;
        this.f476160g = a0Var;
        this.f476161h = j0Var;
        this.f476162i = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zv0.c(this.f476158e, this.f476159f, this.f476160g, this.f476161h, this.f476162i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zv0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f476157d
            rv0.n1 r2 = r6.f476158e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L30
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            gx0.bf r7 = r2.p7()
            r6.f476157d = r4
            r1 = 0
            r5 = 0
            java.lang.Object r7 = gx0.bf.t7(r7, r1, r6, r4, r5)
            if (r7 != r0) goto L30
            return r0
        L30:
            jz5.g r7 = r2.f400136x
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            zv0.y r7 = (zv0.y) r7
            r6.f476157d = r3
            ex0.a0 r1 = r6.f476160g
            ex0.j0 r2 = r6.f476161h
            zv0.r r3 = r6.f476159f
            java.lang.Object r7 = r7.e(r3, r1, r2, r6)
            if (r7 != r0) goto L49
            return r0
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            jz5.f0 r0 = jz5.f0.f302826a
            if (r7 != 0) goto L70
            zv0.f0 r7 = r6.f476162i
            android.content.Context r1 = r7.getContext()
            int r2 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r2 = new com.tencent.mm.ui.widget.dialog.e4
            r2.<init>(r1)
            android.content.Context r7 = r7.getContext()
            r1 = 2131771497(0x7f104069, float:1.9174327E38)
            java.lang.String r7 = r7.getString(r1)
            r2.f211776c = r7
            r2.c()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zv0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
