package df2;

/* loaded from: classes5.dex */
public final class qb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231150d;

    /* renamed from: e, reason: collision with root package name */
    public int f231151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f231152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f231153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231154h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231155i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(long j17, long j18, java.lang.String str, df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231152f = j17;
        this.f231153g = j18;
        this.f231154h = str;
        this.f231155i = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qb(this.f231152f, this.f231153g, this.f231154h, this.f231155i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f231151e
            df2.zb r2 = r14.f231155i
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2c
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r14.f231150d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto Le5
        L1b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L23:
            java.lang.Object r1 = r14.f231150d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lc9
        L2c:
            kotlin.ResultKt.throwOnFailure(r15)
            goto Laa
        L31:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            r45.we1 r1 = new r45.we1
            r1.<init>()
            long r7 = r14.f231152f
            long r9 = r14.f231153g
            java.lang.String r11 = r14.f231154h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r13 = 0
            r1.set(r13, r12)
            r45.af1 r12 = new r45.af1
            r12.<init>()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L6b
            r12.set(r13, r7)     // Catch: java.lang.Exception -> L6b
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L6b
            r12.set(r6, r7)     // Catch: java.lang.Exception -> L6b
            r12.set(r4, r11)     // Catch: java.lang.Exception -> L6b
            byte[] r7 = r12.toByteArray()     // Catch: java.lang.Exception -> L6b
            com.tencent.mm.protobuf.g r7 = com.tencent.mm.protobuf.g.b(r7)     // Catch: java.lang.Exception -> L6b
            goto L84
        L6b:
            r7 = move-exception
            java.lang.String r8 = r2.f231939m
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[aiAssistant sendAiAssistantCloseDialogAction] serialize action data failed: "
            r9.<init>(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.tencent.mars.xlog.Log.e(r8, r7)
            r7 = r5
        L84:
            r1.set(r6, r7)
            r15.add(r1)
            r45.xe1 r1 = new r45.xe1
            r1.<init>()
            db2.t4 r7 = db2.t4.f228171a
            r8 = 12627(0x3153, float:1.7694E-41)
            r45.kv0 r7 = r7.a(r8)
            r1.set(r6, r7)
            r1.set(r4, r15)
            com.tencent.mm.modelbase.i r15 = r1.d()
            r14.f231151e = r6
            java.lang.Object r15 = xg2.g.d(r15, r5, r14, r6, r5)
            if (r15 != r0) goto Laa
            return r0
        Laa:
            r1 = r15
            xg2.h r1 = (xg2.h) r1
            boolean r15 = r1 instanceof xg2.i
            if (r15 == 0) goto Lc9
            oz5.l r15 = r1.f454392a
            if (r15 != 0) goto Lb9
            oz5.l r15 = r14.getContext()
        Lb9:
            df2.pb r6 = new df2.pb
            r6.<init>(r1, r5, r2)
            r14.f231150d = r1
            r14.f231151e = r4
            java.lang.Object r15 = kotlinx.coroutines.l.g(r15, r6, r14)
            if (r15 != r0) goto Lc9
            return r0
        Lc9:
            boolean r15 = r1 instanceof xg2.b
            if (r15 == 0) goto Le5
            oz5.l r15 = r1.f454392a
            if (r15 != 0) goto Ld5
            oz5.l r15 = r14.getContext()
        Ld5:
            df2.ob r4 = new df2.ob
            r4.<init>(r1, r5, r2)
            r14.f231150d = r1
            r14.f231151e = r3
            java.lang.Object r15 = kotlinx.coroutines.l.g(r15, r4, r14)
            if (r15 != r0) goto Le5
            return r0
        Le5:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
