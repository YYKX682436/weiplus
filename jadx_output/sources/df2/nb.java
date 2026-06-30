package df2;

/* loaded from: classes5.dex */
public final class nb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230844d;

    /* renamed from: e, reason: collision with root package name */
    public int f230845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f230846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(java.util.List list, df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230846f = list;
        this.f230847g = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.nb(this.f230846f, this.f230847g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.nb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f230845e
            jz5.f0 r2 = jz5.f0.f302826a
            java.util.List r3 = r13.f230846f
            r4 = 3
            df2.zb r5 = r13.f230847g
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L34
            if (r1 == r8) goto L30
            if (r1 == r6) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r0 = r13.f230844d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lcb
        L1f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L27:
            java.lang.Object r1 = r13.f230844d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto Laf
        L30:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L90
        L34:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            r45.we1 r1 = new r45.we1
            r1.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 0
            r1.set(r10, r9)
            r45.ef1 r9 = new r45.ef1
            r9.<init>()
            java.util.Iterator r11 = r3.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L62
            java.lang.Object r12 = r11.next()
            r45.lf1 r12 = (r45.lf1) r12
            r9.addElement(r10, r12)
            goto L52
        L62:
            byte[] r9 = r9.toByteArray()     // Catch: java.lang.Exception -> Lcc
            com.tencent.mm.protobuf.g r9 = com.tencent.mm.protobuf.g.b(r9)     // Catch: java.lang.Exception -> Lcc
            r1.set(r8, r9)
            r14.add(r1)
            r45.xe1 r1 = new r45.xe1
            r1.<init>()
            db2.t4 r9 = db2.t4.f228171a
            r10 = 12627(0x3153, float:1.7694E-41)
            r45.kv0 r9 = r9.a(r10)
            r1.set(r8, r9)
            r1.set(r6, r14)
            com.tencent.mm.modelbase.i r14 = r1.d()
            r13.f230845e = r8
            java.lang.Object r14 = xg2.g.d(r14, r7, r13, r8, r7)
            if (r14 != r0) goto L90
            return r0
        L90:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto Laf
            oz5.l r14 = r1.f454392a
            if (r14 != 0) goto L9f
            oz5.l r14 = r13.getContext()
        L9f:
            df2.mb r8 = new df2.mb
            r8.<init>(r1, r7, r5, r3)
            r13.f230844d = r1
            r13.f230845e = r6
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r8, r13)
            if (r14 != r0) goto Laf
            return r0
        Laf:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto Lcb
            oz5.l r14 = r1.f454392a
            if (r14 != 0) goto Lbb
            oz5.l r14 = r13.getContext()
        Lbb:
            df2.lb r3 = new df2.lb
            r3.<init>(r1, r7, r5)
            r13.f230844d = r1
            r13.f230845e = r4
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r3, r13)
            if (r14 != r0) goto Lcb
            return r0
        Lcb:
            return r2
        Lcc:
            r14 = move-exception
            java.lang.String r0 = r5.f231939m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[aiAssistant] reportInitToolList: serialize action data failed: "
            r1.<init>(r3)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            com.tencent.mars.xlog.Log.e(r0, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.nb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
