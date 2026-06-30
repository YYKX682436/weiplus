package yn1;

/* loaded from: classes11.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String str, yn1.a4 a4Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463957d = str;
        this.f463958e = a4Var;
        this.f463959f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.z3(this.f463957d, this.f463958e, this.f463959f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Class<mv.v> r14 = mv.v.class
            i95.m r14 = i95.n0.c(r14)
            mv.v r14 = (mv.v) r14
            yn1.s r14 = (yn1.s) r14
            java.lang.String r0 = r13.f463957d
            r45.ol4 r14 = r14.Ai(r0)
            jz5.f0 r1 = jz5.f0.f302826a
            long r2 = r13.f463959f
            r4 = 0
            yn1.a4 r5 = r13.f463958e
            if (r14 != 0) goto L39
            java.lang.String r14 = r5.f463606a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[VerifyUserDB] failed to get account info for hash="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.mars.xlog.Log.e(r14, r0)
            com.tencent.wechat.aff.migration.a r14 = r5.f463609d
            if (r14 == 0) goto L38
            r14.Q0(r2, r4)
        L38:
            return r1
        L39:
            r6 = 0
            gm0.b0 r7 = gm0.j1.u()     // Catch: java.lang.Exception -> L47
            l75.k0 r7 = r7.f273153f     // Catch: java.lang.Exception -> L47
            if (r7 == 0) goto L5b
            java.lang.String r6 = r7.getPath()     // Catch: java.lang.Exception -> L47
            goto L5b
        L47:
            r7 = move-exception
            java.lang.String r8 = r5.f463606a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[VerifyUserDB] get current db path error: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.tencent.mars.xlog.Log.e(r8, r7)
        L5b:
            int r7 = r14.f382345e
            java.lang.String r7 = gm0.b0.e(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.mm.storage.v3.f196273a
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "/EnMicroMsg.db"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r8 = r8.getPackageName()
            if (r6 == 0) goto L9d
            if (r7 == 0) goto L9d
            kotlin.jvm.internal.o.d(r8)
            boolean r9 = r26.n0.B(r6, r8, r4)
            if (r9 == 0) goto L9d
            boolean r4 = r26.n0.B(r7, r8, r4)
            if (r4 == 0) goto L9d
            java.lang.String r4 = r26.n0.m0(r6, r8, r6)
            java.lang.String r8 = r26.n0.m0(r7, r8, r7)
            boolean r4 = kotlin.jvm.internal.o.b(r4, r8)
            goto La1
        L9d:
            boolean r4 = kotlin.jvm.internal.o.b(r6, r7)
        La1:
            java.lang.String r8 = ", expectedUsername="
            java.lang.String r9 = ", hash="
            if (r4 != 0) goto Ld1
            java.lang.String r10 = r5.f463606a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "[VerifyUserDB] path mismatch. current="
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r6 = ", expected="
            r11.append(r6)
            r11.append(r7)
            r11.append(r9)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r14 = r14.f382344d
            r11.append(r14)
            java.lang.String r14 = r11.toString()
            com.tencent.mars.xlog.Log.e(r10, r14)
            goto Lf2
        Ld1:
            java.lang.String r7 = r5.f463606a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "[VerifyUserDB] passed. path="
            r10.<init>(r11)
            r10.append(r6)
            r10.append(r9)
            r10.append(r0)
            r10.append(r8)
            java.lang.String r14 = r14.f382344d
            r10.append(r14)
            java.lang.String r14 = r10.toString()
            com.tencent.mars.xlog.Log.i(r7, r14)
        Lf2:
            com.tencent.wechat.aff.migration.a r14 = r5.f463609d
            if (r14 == 0) goto Lf9
            r14.Q0(r2, r4)
        Lf9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
