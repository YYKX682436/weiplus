package k13;

/* loaded from: classes10.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k13.l1 l1Var) {
        super(2);
        this.f303276d = l1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r14 == r13.G) goto L26;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StackLayoutManager.onItemChanged from="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = " to="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ForceNotify.MsgWindow"
            com.tencent.mars.xlog.Log.i(r1, r0)
            k13.l1 r0 = r12.f303276d     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r0 = r0.f303239q     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = kz5.n0.a0(r0, r13)     // Catch: java.lang.Throwable -> L69
            i13.c r0 = (i13.c) r0     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L3f
            k13.l1 r1 = r12.f303276d     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.E     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L3b
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            r0.l(r1)     // Catch: java.lang.Throwable -> L69
        L3f:
            k13.l1 r0 = r12.f303276d     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r0 = r0.f303239q     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = kz5.n0.a0(r0, r14)     // Catch: java.lang.Throwable -> L69
            i13.c r0 = (i13.c) r0     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L4e
            r0.j()     // Catch: java.lang.Throwable -> L69
        L4e:
            if (r14 <= r13) goto L5e
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Throwable -> L69
            k13.u0 r1 = new k13.u0     // Catch: java.lang.Throwable -> L69
            k13.l1 r2 = r12.f303276d     // Catch: java.lang.Throwable -> L69
            r1.<init>(r13, r14, r2)     // Catch: java.lang.Throwable -> L69
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> L69
            r0.B(r1)     // Catch: java.lang.Throwable -> L69
        L5e:
            k13.l1 r13 = r12.f303276d
            boolean r0 = r13.E
            if (r0 == 0) goto L98
            int r0 = r13.G
            if (r14 != r0) goto L98
            goto L95
        L69:
            r13 = move-exception
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L9b
            r0.<init>()     // Catch: java.lang.Throwable -> L9b
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            r13.printStackTrace(r1)     // Catch: java.lang.Throwable -> L9b
            xy2.b r2 = xy2.b.f458155b     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = "finderForceNotifyCrash"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            k13.v0 r9 = new k13.v0     // Catch: java.lang.Throwable -> L9b
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            r10 = 60
            r11 = 0
            pm0.z.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9b
            k13.l1 r13 = r12.f303276d
            boolean r0 = r13.E
            if (r0 == 0) goto L98
            int r0 = r13.G
            if (r14 != r0) goto L98
        L95:
            k13.l1.e(r13)
        L98:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        L9b:
            r13 = move-exception
            k13.l1 r0 = r12.f303276d
            boolean r1 = r0.E
            if (r1 == 0) goto La9
            int r1 = r0.G
            if (r14 != r1) goto La9
            k13.l1.e(r0)
        La9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k13.w0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
