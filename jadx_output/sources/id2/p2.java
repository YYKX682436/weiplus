package id2;

/* loaded from: classes3.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f290729d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f290730e;

    /* renamed from: f, reason: collision with root package name */
    public int f290731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f290733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290734i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.content.Context context, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290732g = context;
        this.f290733h = j17;
        this.f290734i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.p2(this.f290732g, this.f290733h, this.f290734i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f290731f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L2f
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            java.lang.Object r1 = r0.f290729d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r18)
            goto Lb4
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.Object r2 = r0.f290730e
            xg2.h r2 = (xg2.h) r2
            java.lang.Object r4 = r0.f290729d
            az2.f r4 = (az2.f) r4
            kotlin.ResultKt.throwOnFailure(r18)
            goto L93
        L2f:
            java.lang.Object r2 = r0.f290729d
            az2.f r2 = (az2.f) r2
            kotlin.ResultKt.throwOnFailure(r18)
            r3 = r18
            goto L6f
        L39:
            kotlin.ResultKt.throwOnFailure(r18)
            az2.c r7 = az2.f.f16125d
            android.content.Context r8 = r0.f290732g
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 14
            r14 = 0
            az2.f r2 = az2.c.a(r7, r8, r9, r10, r12, r13, r14)
            r2.a()
            ek2.b0 r15 = new ek2.b0
            long r8 = r0.f290733h
            qs5.d r7 = qs5.d.f366426e
            r10 = 8
            java.lang.String r11 = ""
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r7 = r15
            r3 = r15
            r15 = r16
            r7.<init>(r8, r10, r11, r12, r13, r14, r15)
            r0.f290729d = r2
            r0.f290731f = r5
            java.lang.Object r3 = xg2.g.d(r3, r6, r0, r5, r6)
            if (r3 != r1) goto L6f
            return r1
        L6f:
            xg2.h r3 = (xg2.h) r3
            boolean r5 = r3 instanceof xg2.i
            if (r5 == 0) goto L95
            oz5.l r5 = r3.f454392a
            if (r5 != 0) goto L7d
            oz5.l r5 = r17.getContext()
        L7d:
            id2.o2 r7 = new id2.o2
            yz5.l r8 = r0.f290734i
            r7.<init>(r3, r6, r2, r8)
            r0.f290729d = r2
            r0.f290730e = r3
            r0.f290731f = r4
            java.lang.Object r4 = kotlinx.coroutines.l.g(r5, r7, r0)
            if (r4 != r1) goto L91
            return r1
        L91:
            r4 = r2
            r2 = r3
        L93:
            r3 = r2
            r2 = r4
        L95:
            boolean r4 = r3 instanceof xg2.b
            if (r4 == 0) goto Lb4
            oz5.l r4 = r3.f454392a
            if (r4 != 0) goto La1
            oz5.l r4 = r17.getContext()
        La1:
            id2.n2 r5 = new id2.n2
            r5.<init>(r3, r6, r2)
            r0.f290729d = r3
            r0.f290730e = r6
            r2 = 3
            r0.f290731f = r2
            java.lang.Object r2 = kotlinx.coroutines.l.g(r4, r5, r0)
            if (r2 != r1) goto Lb4
            return r1
        Lb4:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.p2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
