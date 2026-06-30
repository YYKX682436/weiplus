package hg2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg2.h f281339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vf f281340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hg2.h hVar, dk2.vf vfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281339e = hVar;
        this.f281340f = vfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hg2.c(this.f281339e, this.f281340f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f281338d
            jz5.f0 r2 = jz5.f0.f302826a
            dk2.vf r3 = r9.f281340f
            r4 = 1
            hg2.h r5 = r9.f281339e
            if (r1 == 0) goto L1b
            if (r1 != r4) goto L13
            kotlin.ResultKt.throwOnFailure(r10)
            goto L83
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.sdk.platformtools.b4 r10 = r5.f281356q
            r10.d()
            android.widget.ImageView r10 = r5.f281354o
            r45.mq1 r1 = r3.f234253d
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.getString(r4)
            if (r1 != 0) goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            r9.f281338d = r4
            r5.getClass()
            if (r10 != 0) goto L39
            goto L7f
        L39:
            oz5.n r4 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r9)
            r4.<init>(r6)
            pf5.u r6 = pf5.u.f353936a
            java.lang.Class<zy2.b6> r7 = zy2.b6.class
            pf5.v r6 = r6.e(r7)
            java.lang.Class<mn2.i4> r7 = mn2.i4.class
            pf5.c r6 = r6.c(r7)
            mn2.i4 r6 = (mn2.i4) r6
            mn2.g3 r6 = (mn2.g3) r6
            jz5.g r6 = r6.H
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            yo0.e r6 = (yo0.e) r6
            mn2.d1 r7 = new mn2.d1
            r7.<init>(r6)
            mn2.q3 r6 = new mn2.q3
            com.tencent.mm.plugin.finder.storage.y90 r8 = com.tencent.mm.plugin.finder.storage.y90.f128356f
            r6.<init>(r1, r8)
            wo0.c r6 = r7.a(r6)
            hg2.f r7 = new hg2.f
            r7.<init>(r10, r5, r1, r4)
            r6.f447873d = r7
            r6.f()
            java.lang.Object r10 = r4.a()
            if (r10 != r0) goto L7f
            goto L80
        L7f:
            r10 = r2
        L80:
            if (r10 != r0) goto L83
            return r0
        L83:
            int r10 = r3.f234251b
            r5.getClass()
            int r0 = c01.id.e()
            r1 = 0
            if (r0 <= r10) goto L91
            r3 = r1
            goto L93
        L91:
            int r3 = r10 - r0
        L93:
            r5.f281355p = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "server time = "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", expire time = "
            r3.append(r0)
            r3.append(r10)
            java.lang.String r10 = ", set remaining time to "
            r3.append(r10)
            int r10 = r5.f281355p
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            java.lang.String r0 = r5.f281352m
            com.tencent.mars.xlog.Log.i(r0, r10)
            android.view.ViewGroup r10 = r5.f281353n
            if (r10 != 0) goto Lbf
            goto Lc2
        Lbf:
            r10.setVisibility(r1)
        Lc2:
            com.tencent.mm.sdk.platformtools.b4 r10 = r5.f281356q
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.c(r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
