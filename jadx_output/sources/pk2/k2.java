package pk2;

/* loaded from: classes3.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355899d;

    /* renamed from: e, reason: collision with root package name */
    public int f355900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.l2 f355901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(pk2.l2 l2Var, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355901f = l2Var;
        this.f355902g = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.k2(this.f355901f, this.f355902g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f355900e
            pk2.o9 r2 = r8.f355902g
            pk2.i2 r3 = pk2.l2.f355938m
            r4 = 2
            r5 = 0
            r6 = 1
            pk2.l2 r7 = r8.f355901f
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 != r4) goto L1b
            java.lang.Object r0 = r8.f355899d
            pk2.l2 r0 = (pk2.l2) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5f
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L45
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.r2 r9 = r7.f355941i
            r1 = 0
            if (r9 == 0) goto L36
            boolean r9 = r9.a()
            if (r9 != r6) goto L36
            r1 = r6
        L36:
            if (r1 == 0) goto L47
            kotlinx.coroutines.r2 r9 = r7.f355941i
            if (r9 == 0) goto L45
            r8.f355900e = r6
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L45
            return r0
        L45:
            r7.f355941i = r5
        L47:
            r45.v71 r9 = r7.f355940h
            if (r9 != 0) goto L63
            com.tencent.mm.ui.MMActivity r9 = r2.f356078d
            java.lang.String r1 = xy2.c.e(r9)
            r8.f355899d = r7
            r8.f355900e = r4
            java.lang.String r4 = "onItemClicked"
            java.lang.Object r9 = r3.b(r9, r4, r1, r8)
            if (r9 != r0) goto L5e
            return r0
        L5e:
            r0 = r7
        L5f:
            r45.v71 r9 = (r45.v71) r9
            r0.f355940h = r9
        L63:
            com.tencent.mm.ui.MMActivity r9 = r2.f356078d
            r45.v71 r0 = r7.f355940h
            if (r0 == 0) goto L71
            r1 = 4
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.j32 r0 = (r45.j32) r0
            goto L72
        L71:
            r0 = r5
        L72:
            boolean r1 = r7.n()
            r3.e(r9, r0, r5, r1)
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
