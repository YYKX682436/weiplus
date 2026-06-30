package ix0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix0.g f295286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f295287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ix0.g gVar, com.tencent.maas.moviecomposing.segments.Segment segment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295286e = gVar;
        this.f295287f = segment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix0.c(this.f295286e, this.f295287f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r11 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r11 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r11 == r0) goto L21;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f295285d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r11)
            goto L79
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            kotlin.ResultKt.throwOnFailure(r11)
            ix0.g r11 = r10.f295286e
            ix0.a r11 = r11.f295310f
            com.tencent.maas.moviecomposing.segments.Segment r5 = r10.f295287f
            r10.f295285d = r3
            java.lang.String r1 = r11.f295276a
            int r4 = r1.length()
            if (r4 != 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            java.lang.String r4 = "ElementSegmentTextReadL"
            if (r3 == 0) goto L40
            java.lang.String r1 = "recover: clear"
            com.tencent.mars.xlog.Log.i(r4, r1)
            ix0.g r11 = r11.f295279d
            java.lang.String r1 = "recover"
            java.lang.Object r11 = r11.j(r5, r1, r10)
            if (r11 != r0) goto L75
            goto L76
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "recover: originAudioFilePath "
            r3.<init>(r6)
            r3.append(r1)
            java.lang.String r1 = " originRoleID "
            r3.append(r1)
            java.lang.String r1 = r11.f295277b
            r3.append(r1)
            java.lang.String r1 = " originRoleName "
            r3.append(r1)
            java.lang.String r1 = r11.f295278c
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.mars.xlog.Log.i(r4, r1)
            ix0.g r4 = r11.f295279d
            java.lang.String r6 = r11.f295277b
            java.lang.String r7 = r11.f295278c
            java.lang.String r8 = r11.f295276a
            r9 = r10
            java.lang.Object r11 = ix0.g.h(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L75
            goto L76
        L75:
            r11 = r2
        L76:
            if (r11 != r0) goto L79
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
