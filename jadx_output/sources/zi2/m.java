package zi2;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473117d;

    /* renamed from: e, reason: collision with root package name */
    public int f473118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f473120g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f473121h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473122i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zi2.w wVar, int i17, int i18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473119f = wVar;
        this.f473120g = i17;
        this.f473121h = i18;
        this.f473122i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.m(this.f473119f, this.f473120g, this.f473121h, this.f473122i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zi2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f473118e
            yz5.l r3 = r0.f473122i
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L34
            if (r2 == r7) goto L2e
            if (r2 == r5) goto L25
            if (r2 != r4) goto L1d
            java.lang.Object r1 = r0.f473117d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r19)
            goto Le1
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f473117d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r19)
            goto Lbf
        L2e:
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r19
            goto L9b
        L34:
            kotlin.ResultKt.throwOnFailure(r19)
            r45.fi2 r2 = new r45.fi2
            r2.<init>()
            r45.q12 r8 = new r45.q12
            r8.<init>()
            int r9 = r0.f473120g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r8.set(r10, r9)
            int r9 = r0.f473121h
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.set(r7, r9)
            r2.set(r10, r8)
            r45.hx0 r8 = new r45.hx0
            r8.<init>()
            r9 = 18
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.set(r10, r9)
            byte[] r2 = r2.toByteArray()
            com.tencent.mm.protobuf.g r2 = com.tencent.mm.protobuf.g.b(r2)
            r8.set(r7, r2)
            ek2.r1 r2 = new ek2.r1
            zi2.w r9 = r0.f473119f
            java.lang.Class<mm2.e1> r11 = mm2.e1.class
            androidx.lifecycle.c1 r12 = r9.P0(r11)
            mm2.e1 r12 = (mm2.e1) r12
            r45.nw1 r12 = r12.f328988r
            long r12 = r12.getLong(r10)
            androidx.lifecycle.c1 r9 = r9.P0(r11)
            mm2.e1 r9 = (mm2.e1) r9
            long r14 = r9.f328983m
            r16 = 1
            r11 = r2
            r17 = r8
            r11.<init>(r12, r14, r16, r17)
            r0.f473118e = r7
            java.lang.Object r2 = xg2.g.d(r2, r6, r0, r7, r6)
            if (r2 != r1) goto L9b
            return r1
        L9b:
            xg2.h r2 = (xg2.h) r2
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r7 = kotlinx.coroutines.internal.b0.f310484a
            boolean r8 = r2 instanceof xg2.i
            if (r8 == 0) goto Lbf
            if (r7 != 0) goto Laf
            oz5.l r7 = r2.f454392a
            if (r7 != 0) goto Laf
            oz5.l r7 = r18.getContext()
        Laf:
            zi2.l r8 = new zi2.l
            r8.<init>(r2, r6, r3)
            r0.f473117d = r2
            r0.f473118e = r5
            java.lang.Object r5 = kotlinx.coroutines.l.g(r7, r8, r0)
            if (r5 != r1) goto Lbf
            return r1
        Lbf:
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            boolean r7 = r2 instanceof xg2.b
            if (r7 == 0) goto Le1
            if (r5 != 0) goto Ld1
            oz5.l r5 = r2.f454392a
            if (r5 != 0) goto Ld1
            oz5.l r5 = r18.getContext()
        Ld1:
            zi2.k r7 = new zi2.k
            r7.<init>(r2, r6, r3)
            r0.f473117d = r2
            r0.f473118e = r4
            java.lang.Object r2 = kotlinx.coroutines.l.g(r5, r7, r0)
            if (r2 != r1) goto Le1
            return r1
        Le1:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
