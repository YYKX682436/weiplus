package l9;

/* loaded from: classes15.dex */
public final class a extends i9.b {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.regex.Pattern f317244r = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f317245m;

    /* renamed from: n, reason: collision with root package name */
    public int f317246n;

    /* renamed from: o, reason: collision with root package name */
    public int f317247o;

    /* renamed from: p, reason: collision with root package name */
    public int f317248p;

    /* renamed from: q, reason: collision with root package name */
    public int f317249q;

    public a(java.util.List list) {
        super("SsaDecoder");
        java.lang.String d17;
        if (list == null) {
            this.f317245m = false;
            return;
        }
        this.f317245m = true;
        java.lang.String str = new java.lang.String((byte[]) list.get(0));
        t9.a.a(str.startsWith("Format: "));
        g(str);
        t9.p pVar = new t9.p((byte[]) list.get(1));
        do {
            d17 = pVar.d();
            if (d17 == null) {
                return;
            }
        } while (!d17.startsWith("[Events]"));
    }

    public static long h(java.lang.String str) {
        java.util.regex.Matcher matcher = f317244r.matcher(str);
        if (matcher.matches()) {
            return (java.lang.Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (java.lang.Long.parseLong(matcher.group(2)) * 60 * 1000000) + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(4)) * com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r2 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r12 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r2.startsWith("Format: ") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r2.startsWith("Dialogue: ") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r11.f317246n != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r2 = r2.substring(10).split(",", r11.f317246n);
        r3 = h(r2[r11.f317247o]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r3 != (-9223372036854775807L)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r7 = r2[r11.f317248p];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r7.trim().isEmpty() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r7 = h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r7 != (-9223372036854775807L)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if (r12 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r14.add(new i9.a(r2[r11.f317249q].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r13 != r0.length) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        r0 = java.util.Arrays.copyOf(r0, r13 * 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r2 = r13 + 1;
        r0[r13] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (r7 == (-9223372036854775807L)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
    
        r13 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        r14.add(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r2 != r0.length) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        r0 = java.util.Arrays.copyOf(r0, r2 * 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        r13 = r2 + 1;
        r0[r2] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0079, code lost:
    
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r13 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0031, code lost:
    
        g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c4, code lost:
    
        r12 = new i9.a[r14.size()];
        r14.toArray(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        return new l9.b(r12, java.util.Arrays.copyOf(r0, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r13.startsWith("[Events]") == false) goto L43;
     */
    @Override // i9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i9.d f(byte[] r12, int r13, boolean r14) {
        /*
            r11 = this;
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r0 = 32
            long[] r0 = new long[r0]
            t9.p r1 = new t9.p
            r1.<init>(r12, r13)
            boolean r12 = r11.f317245m
            if (r12 != 0) goto L20
        L12:
            java.lang.String r13 = r1.d()
            if (r13 == 0) goto L20
            java.lang.String r2 = "[Events]"
            boolean r13 = r13.startsWith(r2)
            if (r13 == 0) goto L12
        L20:
            r13 = 0
        L21:
            java.lang.String r2 = r1.d()
            if (r2 == 0) goto Lc4
            if (r12 != 0) goto L35
            java.lang.String r3 = "Format: "
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L35
            r11.g(r2)
            goto L21
        L35:
            java.lang.String r3 = "Dialogue: "
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L21
            int r3 = r11.f317246n
            if (r3 != 0) goto L42
            goto L21
        L42:
            r3 = 10
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = ","
            int r4 = r11.f317246n
            java.lang.String[] r2 = r2.split(r3, r4)
            int r3 = r11.f317247o
            r3 = r2[r3]
            long r3 = h(r3)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L62
            goto L21
        L62:
            int r7 = r11.f317248p
            r7 = r2[r7]
            java.lang.String r8 = r7.trim()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L79
            long r7 = h(r7)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L7a
            goto L21
        L79:
            r7 = r5
        L7a:
            int r9 = r11.f317249q
            r2 = r2[r9]
            java.lang.String r9 = "\\{.*?\\}"
            java.lang.String r10 = ""
            java.lang.String r2 = r2.replaceAll(r9, r10)
            java.lang.String r9 = "\\\\N"
            java.lang.String r10 = "\n"
            java.lang.String r2 = r2.replaceAll(r9, r10)
            java.lang.String r9 = "\\\\n"
            java.lang.String r2 = r2.replaceAll(r9, r10)
            i9.a r9 = new i9.a
            r9.<init>(r2)
            r14.add(r9)
            int r2 = r0.length
            if (r13 != r2) goto La5
            int r2 = r13 * 2
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
        La5:
            int r2 = r13 + 1
            r0[r13] = r3
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 == 0) goto Lc1
            r13 = 0
            r14.add(r13)
            int r13 = r0.length
            if (r2 != r13) goto Lbb
            int r13 = r2 * 2
            long[] r13 = java.util.Arrays.copyOf(r0, r13)
            r0 = r13
        Lbb:
            int r13 = r2 + 1
            r0[r2] = r7
            goto L21
        Lc1:
            r13 = r2
            goto L21
        Lc4:
            int r12 = r14.size()
            i9.a[] r12 = new i9.a[r12]
            r14.toArray(r12)
            long[] r13 = java.util.Arrays.copyOf(r0, r13)
            l9.b r14 = new l9.b
            r14.<init>(r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a.f(byte[], int, boolean):i9.d");
    }

    public final void g(java.lang.String str) {
        char c17;
        java.lang.String[] split = android.text.TextUtils.split(str.substring(8), ",");
        this.f317246n = split.length;
        this.f317247o = -1;
        this.f317248p = -1;
        this.f317249q = -1;
        for (int i17 = 0; i17 < this.f317246n; i17++) {
            java.lang.String j17 = t9.d0.j(split[i17].trim());
            j17.getClass();
            switch (j17.hashCode()) {
                case 100571:
                    if (j17.equals("end")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (j17.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
                        c17 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (j17.equals("start")) {
                        c17 = 2;
                        break;
                    }
                    break;
            }
            c17 = 65535;
            switch (c17) {
                case 0:
                    this.f317248p = i17;
                    break;
                case 1:
                    this.f317249q = i17;
                    break;
                case 2:
                    this.f317247o = i17;
                    break;
            }
        }
    }
}
