package rc3;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f394117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(rc3.w0 w0Var, java.lang.String str, boolean z17, int i17) {
        super(0);
        this.f394115d = w0Var;
        this.f394116e = str;
        this.f394117f = z17;
        this.f394118g = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r15 = this;
            rc3.w0 r0 = r15.f394115d
            qc3.f r1 = r0.A
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 0
            if (r1 == 0) goto Lb3
            com.tencent.mm.sdk.platformtools.o4 r4 = ue3.b.f426891a
            int r4 = r15.f394118g
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r6 = r0.f394087e
            java.lang.String r7 = "instanceName"
            kotlin.jvm.internal.o.g(r6, r7)
            java.lang.String r7 = "metaInfo"
            kotlin.jvm.internal.o.g(r5, r7)
            java.lang.String r7 = r15.f394116e
            java.lang.String r8 = "data"
            kotlin.jvm.internal.o.g(r7, r8)
            boolean r8 = r15.f394117f
            if (r8 == 0) goto La6
            int r8 = r7.length()
            int r8 = r8 * 4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "isLargeData, data size: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MagicBrushJsApiMMKVUtil"
            com.tencent.mars.xlog.Log.i(r10, r9)
            r9 = 512000(0x7d000, float:7.17465E-40)
            if (r8 <= r9) goto L48
            r8 = 1
            goto L49
        L48:
            r8 = 0
        L49:
            if (r8 != 0) goto L4c
            goto La6
        L4c:
            com.tencent.mm.sdk.platformtools.o4 r8 = ue3.b.f426891a
            long r11 = r8.Y()
            r13 = 20971520(0x1400000, double:1.03613076E-316)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 < 0) goto L70
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "mmkv total size too large:"
            r5.<init>(r6)
            r5.append(r11)
            java.lang.String r6 = ", skip use mmkv"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.e(r10, r5)
            goto La6
        L70:
            java.lang.String[] r5 = new java.lang.String[]{r6, r5}
            java.lang.String r6 = "$"
            java.lang.String r5 = u46.l.k(r5, r6)
            boolean r6 = r8.D(r5, r7)
            java.lang.String r8 = "create key:"
            if (r6 == 0) goto L92
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r10, r6)
            goto La7
        L92:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            r6.append(r5)
            java.lang.String r5 = ", save kv failed"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.mars.xlog.Log.w(r10, r5)
        La6:
            r5 = r3
        La7:
            if (r5 == 0) goto Lad
            r1.fj(r4, r5)
            r3 = r2
        Lad:
            if (r3 != 0) goto Lb2
            r1.J5(r4, r7)
        Lb2:
            r3 = r2
        Lb3:
            if (r3 != 0) goto Lbc
            java.lang.String r0 = r0.f394105z
            java.lang.String r1 = "bug: onJsApiCallback without service !!!"
            com.tencent.mars.xlog.Log.e(r0, r1)
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc3.z.invoke():java.lang.Object");
    }
}
