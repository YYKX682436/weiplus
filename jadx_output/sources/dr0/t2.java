package dr0;

/* loaded from: classes12.dex */
public final class t2 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f242551f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final int f242552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f242553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f242554c;

    /* renamed from: d, reason: collision with root package name */
    public long f242555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f242556e;

    public t2(int i17) {
        this.f242552a = i17;
        boolean z17 = true;
        if (i17 == 1) {
            z17 = dr0.a3.a(dr0.a3.f242403d.a());
        } else if (i17 == 2) {
            z17 = dr0.a3.a(dr0.a3.f242403d.a());
        } else if (i17 != 8) {
            z17 = false;
        }
        this.f242553b = z17;
        this.f242554c = f242551f.incrementAndGet();
        this.f242556e = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f242556e
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r3 = "MicroMsg.proc.Recycler"
            if (r0 != 0) goto L2e
            dr0.w1 r0 = dr0.a3.f242403d
            dr0.a3 r0 = r0.a()
            boolean r0 = r0.p()
            if (r0 != 0) goto L1e
            goto L27
        L1e:
            boolean r0 = com.tencent.mm.sdk.platformtools.x2.f193077g
            if (r0 != 0) goto L29
            java.lang.String r0 = "abort: not-standby"
            com.tencent.mars.xlog.Log.w(r3, r0)
        L27:
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L2d
            goto L2e
        L2d:
            return r2
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "abort: interrupted, from="
            r0.<init>(r2)
            int r2 = r4.f242552a
            r0.append(r2)
            java.lang.String r2 = ", id="
            r0.append(r2)
            int r2 = r4.f242554c
            r0.append(r2)
            java.lang.String r2 = ", interrupted="
            r0.append(r2)
            java.lang.String r2 = r4.f242556e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.w(r3, r0)
            boolean r0 = r4.f242553b
            if (r0 == 0) goto L65
            dr0.w1 r0 = dr0.a3.f242403d
            dr0.a3 r0 = r0.a()
            java.lang.String r2 = "取消回收"
            r0.q(r2)
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.t2.a():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0417 A[LOOP:2: B:99:0x0397->B:218:0x0417, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x040f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0896  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 2249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.t2.b():void");
    }

    public final void c() {
        dr0.w1 w1Var = dr0.a3.f242403d;
        if ((w1Var.a().f242408a == null || kotlin.jvm.internal.o.b(w1Var.a().f242408a, this)) ? false : true) {
            return;
        }
        boolean z17 = this.f242552a != 40;
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#retryOnAbort: resetLoop=" + z17);
        dr0.a3 a17 = w1Var.a();
        a17.getClass();
        if (dr0.j2.f242440b.a()) {
            ((ku5.t0) ku5.t0.f312615d).g(new dr0.x2(a17, z17));
        }
    }

    public java.lang.String toString() {
        return "RecycleTask(from=" + this.f242552a + ", id=" + this.f242554c + ", interrupted='" + this.f242556e + "')";
    }
}
