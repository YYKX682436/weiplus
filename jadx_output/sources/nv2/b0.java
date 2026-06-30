package nv2;

/* loaded from: classes10.dex */
public final class b0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.d0 f340454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.r f340455b;

    public b0(nv2.d0 d0Var, nv2.r rVar) {
        this.f340454a = d0Var;
        this.f340455b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[SYNTHETIC] */
    @Override // fp0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(fp0.d r12, fp0.u r13) {
        /*
            r11 = this;
            nv2.f0 r12 = (nv2.f0) r12
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "status"
            kotlin.jvm.internal.o.g(r13, r0)
            nv2.d0 r0 = nv2.d0.f340470e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "task callback "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FollowActionMgr"
            com.tencent.mars.xlog.Log.i(r1, r0)
            fp0.u r0 = fp0.u.f265290f
            nv2.d0 r2 = r11.f340454a
            if (r13 != r0) goto Laa
            r2.getClass()
            nv2.r r12 = r11.f340455b
            boolean r13 = r12 instanceof nv2.a0
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.f340472b
            r3 = 0
            if (r13 == 0) goto L77
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r4 = r0.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r4.next()
            r6 = r5
            nv2.r r6 = (nv2.r) r6
            boolean r7 = r6 instanceof nv2.a0
            if (r7 == 0) goto L54
            r7 = r6
            nv2.a0 r7 = (nv2.a0) r7
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 != 0) goto L58
            goto L6f
        L58:
            r8 = r6
            nv2.a0 r8 = (nv2.a0) r8
            java.lang.String r8 = r8.f340432d
            java.lang.String r7 = r7.f340432d
            boolean r7 = kotlin.jvm.internal.o.b(r7, r8)
            if (r7 == 0) goto L6f
            long r7 = r12.f340575c
            long r9 = r6.f340575c
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L6f
            r6 = 1
            goto L70
        L6f:
            r6 = 0
        L70:
            if (r6 == 0) goto L3f
            r13.add(r5)
            goto L3f
        L76:
            r3 = r13
        L77:
            if (r3 == 0) goto La6
            java.util.Iterator r13 = r3.iterator()
        L7d:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r13.next()
            nv2.r r3 = (nv2.r) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "drop action now action "
            r4.<init>(r5)
            r4.append(r12)
            r5 = 32
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r1, r4)
            r0.remove(r3)
            goto L7d
        La6:
            r2.f()
            goto Lc1
        Laa:
            boolean r13 = r12.f340486g
            if (r13 == 0) goto Lb5
            java.util.concurrent.ConcurrentLinkedQueue r13 = r2.f340472b
            nv2.r r12 = r12.f340485f
            r13.add(r12)
        Lb5:
            java.lang.Runnable r12 = r2.f340474d
            com.tencent.mm.sdk.platformtools.u3.l(r12)
            java.lang.Runnable r12 = r2.f340474d
            long r0 = nv2.a.f340431a
            com.tencent.mm.sdk.platformtools.u3.i(r12, r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nv2.b0.a(fp0.d, fp0.u):void");
    }
}
