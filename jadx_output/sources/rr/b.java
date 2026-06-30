package rr;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final rr.b f399123d = new rr.b();

    public b() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomEmojiWetypeHelper", "null or empty text");
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: Exception -> 0x00bb, TryCatch #0 {Exception -> 0x00bb, blocks: (B:9:0x003a, B:13:0x0063, B:15:0x0069, B:20:0x0073, B:23:0x007a, B:25:0x0087, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a9, B:34:0x00af, B:35:0x00b3, B:40:0x004d, B:43:0x0057), top: B:8:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: Exception -> 0x00bb, TryCatch #0 {Exception -> 0x00bb, blocks: (B:9:0x003a, B:13:0x0063, B:15:0x0069, B:20:0x0073, B:23:0x007a, B:25:0x0087, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a9, B:34:0x00af, B:35:0x00b3, B:40:0x004d, B:43:0x0057), top: B:8:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: Exception -> 0x00bb, TryCatch #0 {Exception -> 0x00bb, blocks: (B:9:0x003a, B:13:0x0063, B:15:0x0069, B:20:0x0073, B:23:0x007a, B:25:0x0087, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a9, B:34:0x00af, B:35:0x00b3, B:40:0x004d, B:43:0x0057), top: B:8:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: Exception -> 0x00bb, TryCatch #0 {Exception -> 0x00bb, blocks: (B:9:0x003a, B:13:0x0063, B:15:0x0069, B:20:0x0073, B:23:0x007a, B:25:0x0087, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a9, B:34:0x00af, B:35:0x00b3, B:40:0x004d, B:43:0x0057), top: B:8:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r18 = this;
            jz5.g r0 = rr.c.f399124a
            java.lang.String r0 = "dismiss_after_clicked"
            java.lang.String r1 = "max_show_count"
            java.lang.String r2 = "max_show_duration_ms"
            java.lang.String r3 = "show_interval_ms"
            java.lang.Class<e42.e0> r4 = e42.e0.class
            i95.m r4 = i95.n0.c(r4)
            e42.e0 r4 = (e42.e0) r4
            e42.c0 r5 = e42.c0.clicfg_custom_emoji_wetype_ad
            h62.d r4 = (h62.d) r4
            java.lang.String r6 = "{}"
            r7 = 1
            java.lang.String r4 = r4.Zi(r5, r6, r7)
            java.lang.String r5 = "getExpt(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            int r5 = r4.length()
            r8 = 0
            if (r5 != 0) goto L2d
            r5 = r7
            goto L2e
        L2d:
            r5 = r8
        L2e:
            java.lang.String r9 = "MicroMsg.CustomEmojiWetypeHelper"
            if (r5 != 0) goto Ld2
            boolean r5 = kotlin.jvm.internal.o.b(r4, r6)
            if (r5 == 0) goto L3a
            goto Ld2
        L3a:
            cl0.g r5 = new cl0.g     // Catch: java.lang.Exception -> Lbb
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r4 = "text"
            cl0.g r4 = r5.a(r4)     // Catch: java.lang.Exception -> Lbb
            boolean r6 = com.tencent.mm.sdk.platformtools.m2.m()     // Catch: java.lang.Exception -> Lbb
            if (r6 == 0) goto L4d
            goto L60
        L4d:
            boolean r6 = com.tencent.mm.sdk.platformtools.m2.n()     // Catch: java.lang.Exception -> Lbb
            if (r6 == 0) goto L57
            java.lang.String r6 = "traditional_chinese"
            goto L63
        L57:
            boolean r6 = com.tencent.mm.sdk.platformtools.m2.j()     // Catch: java.lang.Exception -> Lbb
            if (r6 != 0) goto L60
            java.lang.String r6 = "english"
            goto L63
        L60:
            java.lang.String r6 = "simplified_chinese"
        L63:
            java.lang.String r11 = r4.getString(r6)     // Catch: java.lang.Exception -> Lbb
            if (r11 == 0) goto L71
            int r4 = r11.length()     // Catch: java.lang.Exception -> Lbb
            if (r4 != 0) goto L70
            goto L71
        L70:
            r7 = r8
        L71:
            if (r7 == 0) goto L7a
            java.lang.String r0 = "null or empty text"
            com.tencent.mars.xlog.Log.i(r9, r0)     // Catch: java.lang.Exception -> Lbb
            goto Ldb
        L7a:
            rr.a r4 = new rr.a     // Catch: java.lang.Exception -> Lbb
            kotlin.jvm.internal.o.d(r11)     // Catch: java.lang.Exception -> Lbb
            boolean r6 = r5.has(r3)     // Catch: java.lang.Exception -> Lbb
            r12 = 0
            if (r6 == 0) goto L8c
            long r6 = r5.getLong(r3)     // Catch: java.lang.Exception -> Lbb
            goto L8d
        L8c:
            r6 = r12
        L8d:
            boolean r3 = r5.has(r2)     // Catch: java.lang.Exception -> Lbb
            if (r3 == 0) goto L99
            long r2 = r5.getLong(r2)     // Catch: java.lang.Exception -> Lbb
            r14 = r2
            goto L9a
        L99:
            r14 = r12
        L9a:
            boolean r2 = r5.has(r1)     // Catch: java.lang.Exception -> Lbb
            if (r2 == 0) goto La7
            int r1 = r5.getInt(r1)     // Catch: java.lang.Exception -> Lbb
            r16 = r1
            goto La9
        La7:
            r16 = r8
        La9:
            boolean r1 = r5.has(r0)     // Catch: java.lang.Exception -> Lbb
            if (r1 == 0) goto Lb3
            boolean r8 = r5.getBoolean(r0)     // Catch: java.lang.Exception -> Lbb
        Lb3:
            r17 = r8
            r10 = r4
            r12 = r6
            r10.<init>(r11, r12, r14, r16, r17)     // Catch: java.lang.Exception -> Lbb
            goto Ldc
        Lbb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getConfig, fail, reason:"
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mars.xlog.Log.e(r9, r0)
            goto Ldb
        Ld2:
            java.lang.String r0 = "invalid json: "
            java.lang.String r0 = r0.concat(r4)
            com.tencent.mars.xlog.Log.i(r9, r0)
        Ldb:
            r4 = 0
        Ldc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.b.invoke():java.lang.Object");
    }
}
