package dn2;

/* loaded from: classes3.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f241955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f241956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f241958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f241959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.pj1 f241960i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.coroutines.f1 f1Var, android.view.View view, com.tencent.mm.plugin.finder.live.view.k0 k0Var, dn2.s0 s0Var, r45.pj1 pj1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241956e = f1Var;
        this.f241957f = view;
        this.f241958g = k0Var;
        this.f241959h = s0Var;
        this.f241960i = pj1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dn2.p0(this.f241956e, this.f241957f, this.f241958g, this.f241959h, this.f241960i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f241955d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.throwOnFailure(r11)
            goto L25
        Ld:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L15:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.f1 r11 = r10.f241956e
            if (r11 == 0) goto L31
            r10.f241955d = r2
            java.lang.Object r11 = r11.k(r10)
            if (r11 != r0) goto L25
            return r0
        L25:
            r45.bv1 r11 = (r45.bv1) r11
            if (r11 == 0) goto L31
            r0 = 3
            com.tencent.mm.protobuf.f r11 = r11.getCustom(r0)
            r45.y23 r11 = (r45.y23) r11
            goto L32
        L31:
            r11 = 0
        L32:
            if (r11 == 0) goto L6e
            st2.c2 r3 = st2.c2.f412249a
            r5 = 1177(0x499, float:1.65E-42)
            r6 = 0
            java.lang.String r7 = ""
            r8 = 0
            r9 = 1
            r4 = r11
            l81.b1 r0 = r3.c(r4, r5, r6, r7, r8, r9)
            dk2.q4 r1 = dk2.q4.f233938a
            android.view.View r3 = r10.f241957f
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            com.tencent.mm.plugin.finder.live.view.k0 r4 = r10.f241958g
            gk2.e r5 = r4.getBuContext()
            r1.n(r3, r5, r0, r4)
            ml2.f4 r0 = ml2.f4.N
            r1 = 17
            java.lang.String r11 = r11.getString(r1)
            if (r11 != 0) goto L64
            java.lang.String r11 = ""
        L64:
            dn2.s0 r1 = r10.f241959h
            r45.pj1 r3 = r10.f241960i
            r1.g(r0, r3, r11)
            r1.f(r3, r2)
        L6e:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
