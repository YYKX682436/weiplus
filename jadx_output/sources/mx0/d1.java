package mx0;

/* loaded from: classes5.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331905d;

    /* renamed from: e, reason: collision with root package name */
    public int f331906e;

    /* renamed from: f, reason: collision with root package name */
    public int f331907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f331908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f331909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(mx0.e1 e1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331908g = e1Var;
        this.f331909h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.d1(this.f331908g, this.f331909h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f331907f
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            mx0.e1 r6 = r9.f331908g
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lba
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            int r1 = r9.f331906e
            java.lang.Object r3 = r9.f331905d
            com.tencent.maas.camerafun.MJRecordingFinishInfo r3 = (com.tencent.maas.camerafun.MJRecordingFinishInfo) r3
            kotlin.ResultKt.throwOnFailure(r10)
            goto L97
        L2a:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L50
        L2e:
            kotlin.ResultKt.throwOnFailure(r10)
            r9.f331907f = r5
            r6.getClass()
            oz5.n r10 = new oz5.n
            kotlin.coroutines.Continuation r1 = pz5.f.b(r9)
            r10.<init>(r1)
            mx0.b1 r1 = new mx0.b1
            r1.<init>(r10)
            pp0.p0 r7 = r6.f331934a
            r7.y0(r4, r1)
            java.lang.Object r10 = r10.a()
            if (r10 != r0) goto L50
            return r0
        L50:
            com.tencent.maas.camerafun.MJRecordingFinishInfo r10 = (com.tencent.maas.camerafun.MJRecordingFinishInfo) r10
            mx0.c0 r1 = r6.f331939f
            if (r1 == 0) goto L61
            yx0.w5 r1 = (yx0.w5) r1
            yx0.w r7 = yx0.w.f467725d
            yx0.b8 r1 = r1.f467742a
            boolean r1 = r1.Y(r10, r7)
            goto L62
        L61:
            r1 = r4
        L62:
            boolean r7 = r9.f331909h
            if (r7 == 0) goto L69
            if (r1 != 0) goto L69
            r4 = r5
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "startExportingVideoForMaterialImport: shouldCloseSession:"
            r5.<init>(r8)
            r5.append(r7)
            java.lang.String r7 = " isConditionNotMet:"
            r5.append(r7)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "MicroMsg.MaterialImportHelper"
            com.tencent.mars.xlog.Log.i(r5, r1)
            if (r4 == 0) goto L99
            pp0.p0 r1 = r6.f331934a
            r9.f331905d = r10
            r9.f331906e = r4
            r9.f331907f = r3
            java.lang.Object r1 = r1.m0(r9)
            if (r1 != r0) goto L95
            return r0
        L95:
            r3 = r10
            r1 = r4
        L97:
            r4 = r1
            r10 = r3
        L99:
            if (r10 == 0) goto La0
            if (r4 == 0) goto La0
            mx0.d0 r1 = mx0.d0.f331893d
            goto La2
        La0:
            mx0.d0 r1 = mx0.d0.f331895f
        La2:
            r6.f(r1)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            mx0.c1 r3 = new mx0.c1
            r4 = 0
            r3.<init>(r10, r6, r4)
            r9.f331905d = r4
            r9.f331907f = r2
            java.lang.Object r10 = kotlinx.coroutines.l.g(r1, r3, r9)
            if (r10 != r0) goto Lba
            return r0
        Lba:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
