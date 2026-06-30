package qu2;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366758d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu2.f f366760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qu2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366760f = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qu2.c cVar = new qu2.c(this.f366760f, continuation);
        cVar.f366759e = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0067 -> B:5:0x006a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f366758d
            r2 = 0
            java.lang.String r3 = "AvgPowerConsumeCollector"
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 != r4) goto L15
            java.lang.Object r1 = r10.f366759e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            goto L6a
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f366759e
            kotlinx.coroutines.y0 r11 = (kotlinx.coroutines.y0) r11
            r1 = r11
            r11 = r10
        L26:
            boolean r5 = kotlinx.coroutines.z0.h(r1)
            if (r5 == 0) goto La0
            nh.c r5 = new nh.c
            java.lang.String r6 = "Live"
            r5.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "new, profiler"
            r6.<init>(r7)
            qu2.f r7 = r11.f366760f
            nh.c r8 = r7.f366769d
            if (r8 == 0) goto L49
            java.lang.Integer r9 = new java.lang.Integer
            int r8 = r8.f337069b
            r9.<init>(r8)
            goto L4a
        L49:
            r9 = r2
        L4a:
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r3, r6)
            r5.d()
            r7.f366769d = r5
            int r5 = r7.f366780o
            long r5 = (long) r5
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r11.f366759e = r1
            r11.f366758d = r4
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r11)
            if (r5 != r0) goto L6a
            return r0
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "finish, profiler"
            r5.<init>(r6)
            qu2.f r6 = r11.f366760f
            nh.c r7 = r6.f366769d
            if (r7 == 0) goto L7f
            java.lang.Integer r8 = new java.lang.Integer
            int r7 = r7.f337069b
            r8.<init>(r7)
            goto L80
        L7f:
            r8 = r2
        L80:
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r3, r5)
            nh.c r5 = r6.f366769d
            if (r5 == 0) goto L26
            rh.c1 r5 = r5.c()
            if (r5 == 0) goto L26
            java.lang.Class<uh.g> r7 = uh.g.class
            rh.o2 r7 = r5.t(r7)
            if (r7 == 0) goto L26
            qu2.f.c(r6, r5, r7)
            goto L26
        La0:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qu2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
