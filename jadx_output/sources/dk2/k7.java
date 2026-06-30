package dk2;

/* loaded from: classes3.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233688d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(ce2.i iVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233690f = iVar;
        this.f233691g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dk2.k7 k7Var = new dk2.k7(this.f233690f, this.f233691g, continuation);
        k7Var.f233689e = obj;
        return k7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.k7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f233688d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r12)
            goto Laa
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            java.lang.Object r1 = r11.f233689e
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L67
        L21:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f233689e
            kotlinx.coroutines.y0 r12 = (kotlinx.coroutines.y0) r12
            ce2.i r1 = r11.f233690f
            boolean r4 = r1.Y0()
            r10 = 0
            r5 = 0
            if (r4 == 0) goto L7e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r45.zq4 r1 = r1.field_multiAnimationList
            if (r1 == 0) goto L63
            java.util.LinkedList r1 = r1.getList(r5)
            if (r1 == 0) goto L63
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r1.next()
            r45.yq4 r4 = (r45.yq4) r4
            r5 = 0
            r6 = 0
            dk2.j7 r7 = new dk2.j7
            r7.<init>(r4, r10)
            r8 = 3
            r9 = 0
            r4 = r12
            kotlinx.coroutines.f1 r4 = kotlinx.coroutines.l.b(r4, r5, r6, r7, r8, r9)
            r2.add(r4)
            goto L45
        L63:
            java.util.Iterator r1 = r2.iterator()
        L67:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto Lb0
            java.lang.Object r12 = r1.next()
            kotlinx.coroutines.f1 r12 = (kotlinx.coroutines.f1) r12
            r11.f233689e = r1
            r11.f233688d = r3
            java.lang.Object r12 = r12.k(r11)
            if (r12 != r0) goto L67
            return r0
        L7e:
            r45.zq4 r12 = r1.field_multiAnimationList
            if (r12 == 0) goto L87
            java.util.LinkedList r12 = r12.getList(r5)
            goto L88
        L87:
            r12 = r10
        L88:
            if (r12 == 0) goto Lb0
            boolean r4 = r12.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L93
            r4 = r12
            goto L94
        L93:
            r4 = r10
        L94:
            if (r4 == 0) goto Lb0
            dk2.u7 r3 = dk2.u7.f234181a
            r11.f233688d = r2
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310570c
            dk2.s7 r3 = new dk2.s7
            java.lang.String r4 = r11.f233691g
            r3.<init>(r12, r4, r1, r10)
            java.lang.Object r12 = kotlinx.coroutines.l.g(r2, r3, r11)
            if (r12 != r0) goto Laa
            return r0
        Laa:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r3 = r12.booleanValue()
        Lb0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.k7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
