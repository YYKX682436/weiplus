package t03;

/* loaded from: classes15.dex */
public final class r0 extends kk4.v {

    /* renamed from: g0, reason: collision with root package name */
    public static final java.util.Map f414504g0;

    /* renamed from: b0, reason: collision with root package name */
    public final java.lang.String f414505b0;

    /* renamed from: c0, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f414506c0;

    /* renamed from: d0, reason: collision with root package name */
    public kotlinx.coroutines.r2 f414507d0;

    /* renamed from: e0, reason: collision with root package name */
    public u03.a f414508e0;

    /* renamed from: f0, reason: collision with root package name */
    public byte[] f414509f0;

    static {
        t03.l0 l0Var = new t03.l0(null);
        f414504g0 = new java.util.LinkedHashMap();
        l0Var.a(new u03.c());
        l0Var.a(new u03.h());
        l0Var.a(new u03.j());
        l0Var.a(new u03.k());
        l0Var.a(new u03.f());
        l0Var.a(new u03.e());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f414505b0 = "MicroMsg.Flutter.MMVoipStatusCdnTPPlayer@" + hashCode();
        this.f414506c0 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(t03.r0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof t03.n0
            if (r0 == 0) goto L16
            r0 = r7
            t03.n0 r0 = (t03.n0) r0
            int r1 = r0.f414492g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f414492g = r1
            goto L1b
        L16:
            t03.n0 r0 = new t03.n0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f414490e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f414492g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r6 = r0.f414489d
            t03.r0 r6 = (t03.r0) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            byte[] r7 = r6.f414509f0
            if (r7 == 0) goto L93
            java.lang.String r2 = r6.f414505b0
            java.lang.String r5 = "prepareLoader"
            com.tencent.mars.xlog.Log.i(r2, r5)
            java.util.Map r2 = t03.r0.f414504g0
            u03.a r5 = r6.f414508e0
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r5)
            u03.d r2 = (u03.d) r2
            if (r2 == 0) goto L93
            r0.f414489d = r6
            r0.f414492g = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L5f
            goto L94
        L5f:
            dn.o r7 = (dn.o) r7
            if (r7 == 0) goto L93
            java.lang.String r0 = r6.f414505b0
            java.lang.String r1 = "prepareLoader parse finished"
            com.tencent.mars.xlog.Log.i(r0, r1)
            kk4.h r0 = r6.f308580e
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.f308545d
            goto L72
        L71:
            r0 = 0
        L72:
            java.lang.String r1 = r7.field_mediaId
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 != 0) goto L93
            kk4.h r0 = new kk4.h
            java.lang.String r1 = r7.field_mediaId
            java.lang.String r2 = "field_mediaId"
            kotlin.jvm.internal.o.f(r1, r2)
            java.lang.String r2 = r7.field_fullpath
            java.lang.String r4 = "field_fullpath"
            kotlin.jvm.internal.o.f(r2, r4)
            r0.<init>(r6, r1, r2)
            r6.f308580e = r0
            r7.f241815c2 = r0
            r6.f308581f = r7
        L93:
            r1 = r3
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t03.r0.T(t03.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kk4.v
    public void L() {
        if (this.f414509f0 == null) {
            super.L();
            return;
        }
        boolean z17 = this.f308582g;
        java.lang.String str = this.f414505b0;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startCdnDownload() already start cdn " + w());
            return;
        }
        kk4.h hVar = this.f308580e;
        if (hVar != null) {
            if (hVar.f308548g) {
                com.tencent.mars.xlog.Log.i(str, "local file or complete or fromExternResourceLoader");
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "startCdnDownload");
            ek4.s Di = ((cf0.z) i95.n0.c(cf0.z.class)).Di();
            dn.o oVar = this.f308581f;
            java.lang.String str2 = oVar != null ? oVar.field_mediaId : null;
            if (str2 == null) {
                str2 = "";
            }
            Di.h(str2, new t03.o0(this), new t03.p0(this, hVar));
            this.f308582g = true;
        }
    }

    @Override // kk4.v, kk4.b
    public void b(boolean z17, boolean z18) {
        nk4.s sVar;
        kk4.c cVar;
        if (this.f414509f0 == null) {
            super.b(z17, z18);
            return;
        }
        Q();
        if (u() && s()) {
            kk4.c cVar2 = this.f308577b;
            if (cVar2 != null) {
                ((kk4.f0) cVar2).pause();
            }
            if (z17 && (cVar = this.f308577b) != null) {
                ((kk4.f0) cVar).pauseDownload();
            }
            dn.o oVar = this.f308581f;
            boolean z19 = oVar instanceof ck4.b;
            if (z19) {
                nk4.s sVar2 = this.f308588m;
                if (sVar2 != null) {
                    ck4.b bVar = z19 ? (ck4.b) oVar : null;
                    ((kw2.m0) sVar2).t(new nk4.m(bVar != null ? bVar.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), null, null, 8, null));
                }
                if (z18 && (sVar = this.f308588m) != null) {
                    dn.o oVar2 = this.f308581f;
                    ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                    long j17 = bVar2 != null ? bVar2.f42534d2 : 0L;
                    android.os.SystemClock.uptimeMillis();
                    kw2.d0 d0Var = (kw2.d0) ((kw2.m0) sVar).f313059d.get(java.lang.Long.valueOf(j17));
                    if (d0Var != null) {
                        d0Var.f312937r0 = 1;
                    }
                }
            }
        }
        if (z17) {
            kk4.b.e(this, null, 1, null);
        }
    }

    @Override // kk4.v, kk4.b
    public void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f414505b0, "prepare mediaProto:" + this.f414509f0 + ", prepareJob:" + this.f414507d0);
        if (this.f414509f0 == null) {
            super.c(str);
        } else if (this.f414507d0 == null) {
            this.f414507d0 = kotlinx.coroutines.l.d(this.f414506c0, null, null, new t03.m0(this, null), 3, null);
        }
    }

    @Override // kk4.v, kk4.b
    public void d(yz5.a finish) {
        kotlin.jvm.internal.o.g(finish, "finish");
        if (this.f414509f0 == null) {
            super.d(finish);
            return;
        }
        boolean z17 = this.f308582g;
        java.lang.String str = this.f414505b0;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "stopCdnDownload() not start cdn " + w());
            finish.invoke();
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "stopCdnDownload");
        ek4.s Di = ((cf0.z) i95.n0.c(cf0.z.class)).Di();
        dn.o oVar = this.f308581f;
        java.lang.String str2 = oVar != null ? oVar.field_mediaId : null;
        if (str2 == null) {
            str2 = "";
        }
        Di.k(str2, new t03.q0(this, finish));
        this.f308582g = false;
        kk4.h hVar = this.f308580e;
        if (hVar != null) {
            hVar.f308549h = false;
        }
    }

    @Override // kk4.v
    public dn.o n() {
        dn.o oVar = this.f308581f;
        return oVar == null ? super.n() : oVar;
    }

    @Override // kk4.v, kk4.b
    public void recycle() {
        kotlinx.coroutines.z0.e(this.f414506c0, null, 1, null);
        super.recycle();
    }

    @Override // kk4.v, kk4.b
    public void stop() {
        kotlinx.coroutines.r2 r2Var;
        kotlinx.coroutines.r2 r2Var2 = this.f414507d0;
        boolean z17 = false;
        if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
            z17 = true;
        }
        if (z17 && (r2Var = this.f414507d0) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kk4.b.e(this, null, 1, null);
        super.stop();
    }
}
