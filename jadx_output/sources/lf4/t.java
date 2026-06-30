package lf4;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318483d;

    public t(lf4.b0 b0Var) {
        this.f318483d = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            lf4.b0 r0 = r8.f318483d
            int r1 = r0.f318364q
            r2 = -1
            if (r1 < 0) goto L19
            java.util.List r3 = r0.f318361n
            int r3 = r3.size()
            if (r1 >= r3) goto L19
            int r1 = r0.f318364q
            int r3 = r0.f318367t
            if (r1 == r3) goto L17
            if (r3 != r2) goto L19
        L17:
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L86
            java.util.List r1 = r0.f318361n
            int r3 = r0.f318364q
            java.lang.Object r1 = r1.get(r3)
            lf4.m r1 = (lf4.m) r1
            java.util.ArrayList r1 = r1.f318440c
            int r3 = r0.f318365r
            java.lang.Object r1 = kz5.n0.a0(r1, r3)
            if4.f r1 = (if4.f) r1
            r3 = 0
            if (r1 == 0) goto L36
            if4.a r1 = r1.f291248f
            goto L37
        L36:
            r1 = r3
        L37:
            java.lang.String r4 = r0.f318358h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "setSelectedRead "
            r5.<init>(r6)
            int r6 = r0.f318365r
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            if (r1 == 0) goto L53
            boolean r3 = r1.f291238f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L53:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.mars.xlog.Log.i(r4, r3)
            if (r1 == 0) goto L84
            java.util.LinkedList r3 = r1.f291240h
            int r4 = r3.size()
            if (r4 <= 0) goto L84
            gf4.l r4 = gf4.l.f271354d
            long r5 = r1.f291234b
            java.lang.Object r3 = r3.getLast()
            java.lang.String r7 = "getLast(...)"
            kotlin.jvm.internal.o.f(r3, r7)
            gf4.a r3 = (gf4.a) r3
            boolean r3 = r4.l(r5, r3)
            if (r3 == 0) goto L84
            lf4.s r3 = new lf4.s
            r3.<init>(r1, r0)
            pm0.v.X(r3)
        L84:
            r0.f318367t = r2
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf4.t.run():void");
    }
}
