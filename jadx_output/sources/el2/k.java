package el2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f253836d;

    /* renamed from: e, reason: collision with root package name */
    public int f253837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f253839g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(el2.i0 i0Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f253838f = i0Var;
        this.f253839g = finderContact;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.k(this.f253838f, this.f253839g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((el2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f253837e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            el2.i0 r7 = r0.f253838f
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2d
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f253836d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r24)
            goto Lab
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f253836d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r24)
            goto L8f
        L2d:
            kotlin.ResultKt.throwOnFailure(r24)
            r2 = r24
            goto L6f
        L33:
            kotlin.ResultKt.throwOnFailure(r24)
            ek2.c2 r2 = new ek2.c2
            db2.t4 r8 = db2.t4.f228171a
            r9 = 5874(0x16f2, float:8.231E-42)
            r45.kv0 r9 = r8.a(r9)
            android.content.Context r8 = r7.f118183e
            java.lang.String r10 = xy2.c.e(r8)
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 2
            r20 = 0
            r21 = 120(0x78, float:1.68E-43)
            r22 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r14, r16, r17, r19, r20, r21, r22)
            android.content.Context r9 = r7.f118183e
            r10 = 0
            r11 = 0
            r13 = 6
            r14 = 0
            r8 = r2
            az2.j.u(r8, r9, r10, r11, r13, r14)
            r0.f253837e = r5
            java.lang.Object r2 = xg2.g.d(r2, r6, r0, r5, r6)
            if (r2 != r1) goto L6f
            return r1
        L6f:
            xg2.h r2 = (xg2.h) r2
            boolean r5 = r2 instanceof xg2.i
            if (r5 == 0) goto L8f
            oz5.l r5 = r2.f454392a
            if (r5 != 0) goto L7d
            oz5.l r5 = r23.getContext()
        L7d:
            el2.j r8 = new el2.j
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r0.f253839g
            r8.<init>(r2, r6, r7, r9)
            r0.f253836d = r2
            r0.f253837e = r4
            java.lang.Object r4 = kotlinx.coroutines.l.g(r5, r8, r0)
            if (r4 != r1) goto L8f
            return r1
        L8f:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lab
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto L9b
            oz5.l r4 = r23.getContext()
        L9b:
            el2.i r5 = new el2.i
            r5.<init>(r2, r6, r7)
            r0.f253836d = r2
            r0.f253837e = r3
            java.lang.Object r2 = kotlinx.coroutines.l.g(r4, r5, r0)
            if (r2 != r1) goto Lab
            return r1
        Lab:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
