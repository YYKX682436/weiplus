package vz5;

/* loaded from: classes14.dex */
public final class i extends vz5.f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f441790b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.File[] f441791c;

    /* renamed from: d, reason: collision with root package name */
    public int f441792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz5.j f441793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vz5.j jVar, java.io.File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.o.g(rootDir, "rootDir");
        this.f441793e = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0.length == 0) goto L22;
     */
    @Override // vz5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File a() {
        /*
            r5 = this;
            boolean r0 = r5.f441790b
            java.io.File r1 = r5.f441796a
            vz5.j r2 = r5.f441793e
            if (r0 != 0) goto L11
            vz5.l r0 = r2.f441795g
            r0.getClass()
            r0 = 1
            r5.f441790b = r0
            return r1
        L11:
            java.io.File[] r0 = r5.f441791c
            r3 = 0
            if (r0 == 0) goto L25
            int r4 = r5.f441792d
            kotlin.jvm.internal.o.d(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L1f
            goto L25
        L1f:
            vz5.l r0 = r2.f441795g
            r0.getClass()
            return r3
        L25:
            java.io.File[] r0 = r5.f441791c
            if (r0 != 0) goto L46
            java.io.File[] r0 = r1.listFiles()
            r5.f441791c = r0
            if (r0 != 0) goto L36
            vz5.l r0 = r2.f441795g
            r0.getClass()
        L36:
            java.io.File[] r0 = r5.f441791c
            if (r0 == 0) goto L40
            kotlin.jvm.internal.o.d(r0)
            int r0 = r0.length
            if (r0 != 0) goto L46
        L40:
            vz5.l r0 = r2.f441795g
            r0.getClass()
            return r3
        L46:
            java.io.File[] r0 = r5.f441791c
            kotlin.jvm.internal.o.d(r0)
            int r1 = r5.f441792d
            int r2 = r1 + 1
            r5.f441792d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vz5.i.a():java.io.File");
    }
}
