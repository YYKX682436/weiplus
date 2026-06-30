package e10;

/* loaded from: classes7.dex */
public final class k extends lc3.q implements jc3.z {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f246337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f246337i = "mbpkgs/MagicEcsPublicService.wspkg";
    }

    @Override // jc3.x
    public java.lang.String g() {
        return "MagicEcsPublicService";
    }

    @Override // lc3.o
    public lc3.a k() {
        return new lc3.a(this.f246337i, 0L, "d9dd8d6d2f13a7f1e67e7f678837f4dc", 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    @Override // jc3.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lc3.g0 k0(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "version"
            kotlin.jvm.internal.o.g(r10, r0)
            monitor-enter(r9)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L67
            lc3.f r10 = r9.t()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            com.tencent.mm.plugin.appbrand.appstorage.u1 r10 = r10.b()     // Catch: java.lang.Throwable -> L67
            r0 = 0
            if (r10 == 0) goto L1b
            java.lang.String r1 = "/plugin.js"
            com.tencent.mm.plugin.appbrand.appstorage.j1 r10 = r10.access(r1)     // Catch: java.lang.Throwable -> L67
            goto L1c
        L1b:
            r10 = r0
        L1c:
            monitor-exit(r9)
            if (r10 == 0) goto L3b
            com.tencent.mm.plugin.appbrand.appstorage.j1 r1 = com.tencent.mm.plugin.appbrand.appstorage.j1.OK
            if (r10 != r1) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L29
            r0 = r10
        L29:
            if (r0 == 0) goto L3b
            monitor-enter(r9)
            lc3.f r10 = r9.t()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r9)
            java.lang.String r0 = "/plugin.js"
            lc3.g0 r10 = r10.c(r0)
            return r10
        L38:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L3b:
            java.lang.String r10 = "MagicEcsPublicServicePkgManager"
            java.lang.String r0 = "plugin not found"
            com.tencent.mars.xlog.Log.e(r10, r0)
            java.lang.Class<je3.i> r10 = je3.i.class
            i95.m r10 = i95.n0.c(r10)
            java.lang.String r0 = "getService(...)"
            kotlin.jvm.internal.o.f(r10, r0)
            r1 = r10
            je3.i r1 = (je3.i) r1
            java.lang.String r2 = "MagicEcsPublicService"
            java.lang.String r3 = "plugin not found"
            java.lang.String r4 = ""
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 8
            r8 = 0
            je3.i.t8(r1, r2, r3, r4, r5, r6, r7, r8)
            lc3.j0 r10 = new lc3.j0
            java.lang.String r0 = ""
            r10.<init>(r0)
            return r10
        L67:
            r10 = move-exception
            goto L6c
        L69:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            throw r10     // Catch: java.lang.Throwable -> L67
        L6c:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e10.k.k0(java.lang.String):lc3.g0");
    }

    @Override // lc3.o
    public lc3.c n() {
        return new lc3.c(this.f246337i, lc3.b.f317882d);
    }

    @Override // lc3.o
    public java.lang.String s() {
        return "/index.js";
    }

    @Override // lc3.o
    public java.lang.String u() {
        return "ilinkres_b516b52d";
    }

    @Override // lc3.o
    public java.lang.String v() {
        return "MagicEcsPublicService";
    }

    @Override // lc3.q
    public java.util.Collection y() {
        return kz5.c0.i("MagicEcsTimeline", "MagicEcsTimelineSubscribe");
    }
}
