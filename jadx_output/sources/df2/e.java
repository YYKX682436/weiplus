package df2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230010d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.g f230012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(df2.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230012f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.e eVar = new df2.e(this.f230012f, continuation);
        eVar.f230011e = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f230010d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            df2.g r7 = r0.f230012f
            if (r2 == 0) goto L38
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f230011e
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r25)
            goto Lcb
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f230011e
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r25)
            goto Lad
        L2e:
            java.lang.Object r2 = r0.f230011e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            kotlin.ResultKt.throwOnFailure(r25)
            r5 = r25
            goto L8e
        L38:
            kotlin.ResultKt.throwOnFailure(r25)
            java.lang.Object r2 = r0.f230011e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            ek2.c2 r14 = new ek2.c2
            db2.t4 r8 = db2.t4.f228171a
            r9 = 5874(0x16f2, float:8.231E-42)
            r45.kv0 r9 = r8.a(r9)
            android.content.Context r8 = r7.O6()
            java.lang.String r10 = xy2.c.e(r8)
            r11 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 2
            r21 = 0
            r22 = 120(0x78, float:1.68E-43)
            r23 = 0
            r8 = r14
            r25 = r14
            r14 = r15
            r16 = r17
            r17 = r18
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r8.<init>(r9, r10, r11, r12, r14, r16, r17, r19, r20, r21, r22)
            android.content.Context r9 = r7.O6()
            r10 = 0
            r11 = 0
            r13 = 6
            r14 = 0
            r8 = r25
            az2.j.u(r8, r9, r10, r11, r13, r14)
            r0.f230011e = r2
            r0.f230010d = r5
            java.lang.Object r5 = xg2.g.d(r8, r6, r0, r5, r6)
            if (r5 != r1) goto L8e
            return r1
        L8e:
            xg2.h r5 = (xg2.h) r5
            boolean r8 = r5 instanceof xg2.i
            if (r8 == 0) goto Lae
            oz5.l r8 = r5.f454392a
            if (r8 != 0) goto L9c
            oz5.l r8 = r24.getContext()
        L9c:
            df2.d r9 = new df2.d
            r9.<init>(r5, r6, r7, r2)
            r0.f230011e = r5
            r0.f230010d = r4
            java.lang.Object r2 = kotlinx.coroutines.l.g(r8, r9, r0)
            if (r2 != r1) goto Lac
            return r1
        Lac:
            r2 = r5
        Lad:
            r5 = r2
        Lae:
            boolean r2 = r5 instanceof xg2.b
            if (r2 == 0) goto Lcb
            oz5.l r2 = r5.f454392a
            if (r2 != 0) goto Lbb
            oz5.l r2 = r24.getContext()
        Lbb:
            df2.c r4 = new df2.c
            r4.<init>(r5, r6, r7)
            r0.f230011e = r5
            r0.f230010d = r3
            java.lang.Object r2 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r2 != r1) goto Lcb
            return r1
        Lcb:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
