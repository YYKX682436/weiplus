package dk2;

/* loaded from: classes.dex */
public final class ue extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f234212d;

    /* renamed from: e, reason: collision with root package name */
    public int f234213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f234214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f234215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234216h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(kotlin.jvm.internal.h0 h0Var, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f234214f = h0Var;
        this.f234215g = j17;
        this.f234216h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.ue(this.f234214f, this.f234215g, this.f234216h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.ue) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f234213e
            int r2 = r11.f234216h
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r11.f234212d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto Le9
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r1 = r11.f234212d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lcd
        L2c:
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lae
        L31:
            kotlin.ResultKt.throwOnFailure(r12)
            r45.l72 r12 = new r45.l72
            r12.<init>()
            db2.t4 r1 = db2.t4.f228171a
            r7 = 16416(0x4020, float:2.3004E-41)
            r45.kv0 r1 = r1.a(r7)
            r12.set(r6, r1)
            kotlin.jvm.internal.h0 r1 = r11.f234214f
            java.lang.Object r1 = r1.f310123d
            r45.qt2 r1 = (r45.qt2) r1
            java.lang.String r1 = xy2.c.f(r1)
            r7 = 4
            r12.set(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r7 = r11.f234215g
            r1.append(r7)
            r9 = 95
            r1.append(r9)
            long r9 = java.lang.System.currentTimeMillis()
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r12.set(r3, r1)
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.set(r5, r1)
            r1 = 6
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.set(r1, r10)
            r1 = 5
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r12.set(r1, r7)
            r45.oz6 r1 = new r45.oz6
            r1.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r1.set(r9, r7)
            byte[] r1 = r1.toByteArray()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)
            r7 = 7
            r12.set(r7, r1)
            com.tencent.mm.modelbase.i r12 = r12.d()
            r11.f234213e = r6
            java.lang.Object r12 = xg2.g.d(r12, r4, r11, r6, r4)
            if (r12 != r0) goto Lae
            return r0
        Lae:
            r1 = r12
            xg2.h r1 = (xg2.h) r1
            boolean r12 = r1 instanceof xg2.i
            if (r12 == 0) goto Lcd
            oz5.l r12 = r1.f454392a
            if (r12 != 0) goto Lbd
            oz5.l r12 = r11.getContext()
        Lbd:
            dk2.te r6 = new dk2.te
            r6.<init>(r1, r4, r2)
            r11.f234212d = r1
            r11.f234213e = r5
            java.lang.Object r12 = kotlinx.coroutines.l.g(r12, r6, r11)
            if (r12 != r0) goto Lcd
            return r0
        Lcd:
            boolean r12 = r1 instanceof xg2.b
            if (r12 == 0) goto Le9
            oz5.l r12 = r1.f454392a
            if (r12 != 0) goto Ld9
            oz5.l r12 = r11.getContext()
        Ld9:
            dk2.se r5 = new dk2.se
            r5.<init>(r1, r4, r2)
            r11.f234212d = r1
            r11.f234213e = r3
            java.lang.Object r12 = kotlinx.coroutines.l.g(r12, r5, r11)
            if (r12 != r0) goto Le9
            return r0
        Le9:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ue.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
