package fm;

/* loaded from: classes13.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f263982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm.h f263983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f263984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263985g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fm.h hVar, long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263983e = hVar;
        this.f263984f = j17;
        this.f263985g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fm.f(this.f263983e, this.f263984f, this.f263985g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fm.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f263982d
            jz5.f0 r2 = jz5.f0.f302826a
            java.lang.String r3 = "mm_base_string_resource_96b2c56e4056b923191227d71602c0ce"
            java.lang.String r4 = "ilinkres_9f0a6b36"
            java.lang.String r5 = "BaseStringResFeatureService"
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L26
            if (r1 == r7) goto L22
            if (r1 != r6) goto L1a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L95
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6a
        L26:
            kotlin.ResultKt.throwOnFailure(r11)
            long r8 = r10.f263984f
            fm.h r11 = r10.f263983e
            r11.f263993f = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "start check resource: "
            r1.<init>(r8)
            gm0.m r8 = gm0.j1.b()
            boolean r8 = r8.n()
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r5, r1)
            gm0.m r1 = gm0.j1.b()
            boolean r1 = r1.n()
            if (r1 == 0) goto L87
            java.lang.Class<com.tencent.mm.udr.d0> r11 = com.tencent.mm.udr.d0.class
            i95.m r11 = i95.n0.c(r11)
            com.tencent.mm.udr.d0 r11 = (com.tencent.mm.udr.d0) r11
            k65.l r1 = k65.l.f304617a
            k65.k[] r1 = k65.k.f304616d
            r10.f263982d = r7
            fa5.j r11 = (fa5.j) r11
            java.lang.Object r11 = r11.wi(r4, r3, r10)
            if (r11 != r0) goto L6a
            return r0
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L95
            java.lang.Class<com.tencent.mm.udr.e0> r11 = com.tencent.mm.udr.e0.class
            i95.m r11 = i95.n0.c(r11)
            com.tencent.mm.udr.e0 r11 = (com.tencent.mm.udr.e0) r11
            k65.l r0 = k65.l.f304617a
            k65.k[] r0 = k65.k.f304616d
            com.tencent.mm.udr.a1 r11 = (com.tencent.mm.udr.a1) r11
            com.tencent.wechat.aff.udr.x r11 = r11.Ui(r4, r3)
            if (r11 == 0) goto L95
            return r2
        L87:
            fm.a[] r1 = fm.a.f263961d
            r10.f263982d = r6
            java.lang.String r1 = r10.f263985g
            r3 = 4
            java.lang.Object r11 = r11.wi(r1, r3, r10)
            if (r11 != r0) goto L95
            return r0
        L95:
            java.lang.String r11 = "forceCheckBaseResource downloadRes null"
            com.tencent.mars.xlog.Log.i(r5, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fm.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
