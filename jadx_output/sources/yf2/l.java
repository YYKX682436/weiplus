package yf2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461737d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461738e;

    /* renamed from: f, reason: collision with root package name */
    public int f461739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf2.o f461740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yf2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461740g = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.jvm.internal.g0 r8, mm2.n0 r9, yf2.o r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof yf2.j
            if (r0 == 0) goto L13
            r0 = r11
            yf2.j r0 = (yf2.j) r0
            int r1 = r0.f461726e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f461726e = r1
            goto L18
        L13:
            yf2.j r0 = new yf2.j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f461725d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f461726e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2b:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L94
        L2f:
            kotlin.ResultKt.throwOnFailure(r11)
            re2.e0 r11 = re2.j1.f394438b
            jz5.f0 r2 = jz5.f0.f302826a
            if (r11 != 0) goto L39
            return r2
        L39:
            long r4 = r11.f394390c
            long r6 = r8.f310121d
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            return r2
        L42:
            boolean r9 = r9.f329273r
            if (r9 != 0) goto L47
            return r2
        L47:
            long r4 = r11.f394390c
            r8.f310121d = r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "observeCoLiveTaskEventsForInvitee: subscribe invitationId="
            r8.<init>(r9)
            long r4 = r11.f394390c
            r8.append(r4)
            java.lang.String r9 = ", phase="
            r8.append(r9)
            re2.a0 r9 = r11.f394389b
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "Finder.CoLiveController"
            com.tencent.mars.xlog.Log.i(r9, r8)
            boolean r8 = r11.d()
            if (r8 != 0) goto L82
            long r8 = r11.f394395h
            r4 = 0
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L82
            long r6 = r11.f394396i
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            yf2.o.Z6(r10, r8, r6)
            return r2
        L82:
            kotlinx.coroutines.flow.n2 r8 = r11.f394398k
            yf2.k r9 = new yf2.k
            r9.<init>(r10)
            r0.f461726e = r3
            kotlinx.coroutines.flow.k2 r8 = (kotlinx.coroutines.flow.k2) r8
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L94
            return r1
        L94:
            jz5.d r8 = new jz5.d
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yf2.l.a(kotlin.jvm.internal.g0, mm2.n0, yf2.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.l(this.f461740g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.g0 g0Var;
        mm2.n0 n0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461739f;
        yf2.o oVar = this.f461740g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.n0 n0Var2 = (mm2.n0) oVar.business(mm2.n0.class);
            g0Var = new kotlin.jvm.internal.g0();
            this.f461737d = n0Var2;
            this.f461738e = g0Var;
            this.f461739f = 1;
            if (a(g0Var, n0Var2, oVar, this) == aVar) {
                return aVar;
            }
            n0Var = n0Var2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            g0Var = (kotlin.jvm.internal.g0) this.f461738e;
            n0Var = (mm2.n0) this.f461737d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.f3 f3Var = n0Var.f329265g;
        yf2.i iVar = new yf2.i(g0Var, n0Var, oVar);
        this.f461737d = null;
        this.f461738e = null;
        this.f461739f = 2;
        if (((kotlinx.coroutines.flow.l2) f3Var).a(iVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
