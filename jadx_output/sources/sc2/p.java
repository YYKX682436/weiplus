package sc2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f406135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f406136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xa4 f406137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.r f406138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.view.MMPAGView mMPAGView, r45.xa4 xa4Var, sc2.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406136e = mMPAGView;
        this.f406137f = xa4Var;
        this.f406138g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sc2.p(this.f406136e, this.f406137f, this.f406138g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f406135d
            r2 = 2
            com.tencent.mm.view.MMPAGView r3 = r8.f406136e
            r4 = 1
            r45.xa4 r5 = r8.f406137f
            sc2.r r6 = r8.f406138g
            r7 = 0
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r2) goto L18
            kotlin.ResultKt.throwOnFailure(r9)
            goto L97
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L51
        L24:
            kotlin.ResultKt.throwOnFailure(r9)
            if (r3 == 0) goto L31
            boolean r9 = r3.getUseRfx()
            if (r9 != r4) goto L31
            r9 = r4
            goto L32
        L31:
            r9 = r7
        L32:
            java.lang.String r1 = ""
            if (r9 == 0) goto L7c
            nn2.d r9 = nn2.d.f338671a
            rj.j r9 = r9.a()
            java.lang.String r2 = r5.getString(r7)
            if (r2 != 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            java.lang.String r2 = r6.f406180z
            r8.f406135d = r4
            b51.m r9 = (b51.m) r9
            java.lang.Object r9 = r9.j(r1, r2, r8)
            if (r9 != r0) goto L51
            return r0
        L51:
            com.tencent.mm.rfx.RfxPagFile r9 = (com.tencent.mm.rfx.RfxPagFile) r9
            java.lang.String r0 = r6.f406180z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getString(r7)
            r1.append(r2)
            java.lang.String r2 = " loading finish. rfxPagFile: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            if (r9 == 0) goto Lc1
            java.lang.String r0 = r5.getString(r7)
            r6.A = r0
            r3.setComposition(r9)
            goto Lc1
        L7c:
            nn2.d r9 = nn2.d.f338671a
            rj.j r9 = r9.a()
            java.lang.String r4 = r5.getString(r7)
            if (r4 != 0) goto L89
            goto L8a
        L89:
            r1 = r4
        L8a:
            java.lang.String r4 = r6.f406180z
            r8.f406135d = r2
            b51.m r9 = (b51.m) r9
            java.lang.Object r9 = r9.h(r1, r4, r8)
            if (r9 != r0) goto L97
            return r0
        L97:
            org.libpag.PAGFile r9 = (org.libpag.PAGFile) r9
            java.lang.String r0 = r6.f406180z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getString(r7)
            r1.append(r2)
            java.lang.String r2 = " loading finish. pagFile: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            if (r9 == 0) goto Lc1
            java.lang.String r0 = r5.getString(r7)
            r6.A = r0
            r3.setComposition(r9)
        Lc1:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
