package id2;

/* loaded from: classes.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f290516d;

    /* renamed from: e, reason: collision with root package name */
    public int f290517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f290520h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(id2.f5 f5Var, long j17, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290518f = f5Var;
        this.f290519g = j17;
        this.f290520h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.c5(this.f290518f, this.f290519g, this.f290520h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.c5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f290517e
            r3 = 3
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L31
            if (r2 == r6) goto L2b
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1a
            java.lang.Object r1 = r0.f290516d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r24)
            goto Ld5
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Object r2 = r0.f290516d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r24)
            goto Lb7
        L2b:
            kotlin.ResultKt.throwOnFailure(r24)
            r2 = r24
            goto L95
        L31:
            kotlin.ResultKt.throwOnFailure(r24)
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r12 = 0
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            r45.gn3 r2 = new r45.gn3
            r2.<init>()
            r7 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15 = 0
            r2.set(r15, r7)
            r45.gs1 r7 = new r45.gs1
            r7.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r7.set(r15, r3)
            long r4 = r0.f290519g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7.set(r6, r4)
            byte[] r4 = r7.toByteArray()
            com.tencent.mm.protobuf.g r5 = new com.tencent.mm.protobuf.g
            r5.<init>(r4)
            r2.set(r6, r5)
            r14.add(r2)
            ek2.x0 r2 = new ek2.x0
            r7 = r2
            r7.<init>(r8, r9, r10, r12, r14)
            id2.f5 r4 = r0.f290518f
            android.app.Activity r17 = r4.getContext()
            r18 = 0
            r19 = 0
            r21 = 6
            r22 = 0
            r16 = r2
            az2.j.u(r16, r17, r18, r19, r21, r22)
            r0.f290517e = r6
            r3 = 0
            java.lang.Object r2 = xg2.g.d(r2, r3, r0, r6, r3)
            if (r2 != r1) goto L95
            return r1
        L95:
            xg2.h r2 = (xg2.h) r2
            boolean r4 = r2 instanceof xg2.i
            if (r4 == 0) goto Lb7
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto La3
            oz5.l r4 = r23.getContext()
        La3:
            id2.b5 r5 = new id2.b5
            yz5.q r6 = r0.f290520h
            r3 = 0
            r5.<init>(r2, r3, r6)
            r0.f290516d = r2
            r6 = 2
            r0.f290517e = r6
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r5, r0)
            if (r4 != r1) goto Lb7
            return r1
        Lb7:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Ld5
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto Lc3
            oz5.l r4 = r23.getContext()
        Lc3:
            id2.a5 r5 = new id2.a5
            r3 = 0
            r5.<init>(r2, r3)
            r0.f290516d = r2
            r2 = 3
            r0.f290517e = r2
            java.lang.Object r2 = kotlinx.coroutines.l.g(r4, r5, r0)
            if (r2 != r1) goto Ld5
            return r1
        Ld5:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.c5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
