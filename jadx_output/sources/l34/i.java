package l34;

/* loaded from: classes12.dex */
public final class i implements l34.b {

    /* renamed from: b, reason: collision with root package name */
    public static final l34.i f315436b = new l34.i();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l34.b f315437a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i() {
        /*
            r9 = this;
            r9.<init>()
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            wo.u r1 = wo.v1.f447821a
            java.lang.String r1 = "lm: getManufacturer is %s"
            java.lang.String r2 = "MicroMsg.SrvDeviceInfo"
            java.lang.String r3 = ".manufacturerName."
            java.lang.String r4 = "lm: getManufacturer CurrentLanguage is %s"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.m2.f(r0)     // Catch: java.lang.Exception -> L79
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r2, r4, r6)     // Catch: java.lang.Exception -> L79
            wo.h1 r4 = wo.v1.f447827g     // Catch: java.lang.Exception -> L79
            if (r4 == 0) goto L6c
            java.util.Map r6 = r4.f447717a     // Catch: java.lang.Exception -> L79
            if (r6 == 0) goto L6c
            int r6 = r6.size()     // Catch: java.lang.Exception -> L79
            if (r6 != 0) goto L2b
            goto L6c
        L2b:
            java.util.Map r5 = r4.f447717a     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79
            r6.<init>(r3)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.m2.f(r0)     // Catch: java.lang.Exception -> L79
            r6.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L79
            java.lang.Object[] r3 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r2, r1, r3)     // Catch: java.lang.Exception -> L79
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r0)     // Catch: java.lang.Exception -> L79
            if (r3 != 0) goto L51
            goto L7b
        L51:
            java.util.Map r0 = r4.f447717a     // Catch: java.lang.Exception -> L79
            java.lang.String r3 = ".manufacturerName.en"
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L79
            java.lang.Object[] r3 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r2, r1, r3)     // Catch: java.lang.Exception -> L79
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)     // Catch: java.lang.Exception -> L79
            if (r1 != 0) goto L69
            goto L7b
        L69:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L79
            goto L7b
        L6c:
            java.lang.String r0 = "lm: getManufacturer return is %s"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L79
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L79
            r1[r8] = r3     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r2, r0, r1)     // Catch: java.lang.Exception -> L79
            r0 = r3
            goto L7b
        L79:
            java.lang.String r0 = android.os.Build.MANUFACTURER
        L7b:
            java.lang.String r1 = "getManufacturer(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "getDefault(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r1 = "resolveManufacturer, manufacturer: "
            java.lang.String r1 = r1.concat(r0)
            java.lang.String r2 = "MicroMsg.ShortcutInstallAdapterV2"
            com.tencent.mars.xlog.Log.i(r2, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1206476313: goto Lce;
                case -759499589: goto Lc1;
                case 3418016: goto Lb4;
                case 3620012: goto La7;
                default: goto La6;
            }
        La6:
            goto Lda
        La7:
            java.lang.String r1 = "vivo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb1
            goto Lda
        Lb1:
            l34.k r0 = l34.k.f315439a
            goto Ldc
        Lb4:
            java.lang.String r1 = "oppo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbe
            goto Lda
        Lbe:
            l34.h r0 = l34.h.f315435a
            goto Ldc
        Lc1:
            java.lang.String r1 = "xiaomi"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lcb
            goto Lda
        Lcb:
            l34.m r0 = l34.m.f315441a
            goto Ldc
        Lce:
            java.lang.String r1 = "huawei"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld7
            goto Lda
        Ld7:
            l34.f r0 = l34.f.f315432a
            goto Ldc
        Lda:
            l34.b r0 = l34.d.f315430a
        Ldc:
            r9.f315437a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l34.i.<init>():void");
    }

    @Override // l34.b
    public int a() {
        return this.f315437a.a();
    }

    @Override // l34.b
    public boolean b() {
        return this.f315437a.b();
    }

    @Override // l34.b
    public void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f315437a.c(context);
    }
}
