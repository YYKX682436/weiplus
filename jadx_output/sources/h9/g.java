package h9;

/* loaded from: classes13.dex */
public final class g implements r9.h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f279625a = java.util.regex.Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f279626b = java.util.regex.Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f279627c = java.util.regex.Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f279628d = java.util.regex.Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f279629e = java.util.regex.Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f279630f = java.util.regex.Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f279631g = java.util.regex.Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f279632h = java.util.regex.Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f279633i = java.util.regex.Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f279634j = java.util.regex.Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f279635k = java.util.regex.Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f279636l = java.util.regex.Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f279637m = java.util.regex.Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.regex.Pattern f279638n = java.util.regex.Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f279639o = java.util.regex.Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f279640p = java.util.regex.Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.regex.Pattern f279641q = java.util.regex.Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.regex.Pattern f279642r = java.util.regex.Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.regex.Pattern f279643s = java.util.regex.Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.regex.Pattern f279644t = a("AUTOSELECT");

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.regex.Pattern f279645u = a(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN);

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.regex.Pattern f279646v = a("FORCED");

    public static java.util.regex.Pattern a(java.lang.String str) {
        return java.util.regex.Pattern.compile(str + "=(NO|YES)");
    }

    public static boolean c(java.lang.String str, java.util.regex.Pattern pattern, boolean z17) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h9.b d(h9.f r74, java.lang.String r75) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.d(h9.f, java.lang.String):h9.b");
    }

    public static h9.d e(h9.f fVar, java.lang.String str) {
        java.lang.String str2;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i18 = 0;
        java.lang.String str3 = null;
        boolean z17 = false;
        int i19 = 0;
        int i27 = 0;
        boolean z18 = false;
        boolean z19 = false;
        int i28 = 0;
        boolean z27 = false;
        int i29 = 1;
        long j17 = -9223372036854775807L;
        long j18 = -9223372036854775807L;
        h9.c cVar = null;
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        long j19 = 0;
        long j27 = 0;
        long j28 = -1;
        long j29 = 0;
        long j37 = 0;
        int i37 = 0;
        int i38 = 0;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.f279624c;
                fVar.f279624c = str3;
            } else {
                str2 = str3;
            }
            if (str2.startsWith("#EXT")) {
                arrayList2.add(str2);
            }
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                java.lang.String g17 = g(str2, f279631g);
                if ("VOD".equals(g17)) {
                    i37 = 1;
                } else if ("EVENT".equals(g17)) {
                    i37 = 2;
                }
            } else if (str2.startsWith("#EXT-X-START")) {
                j17 = (long) (java.lang.Double.parseDouble(g(str2, f279634j)) * 1000000.0d);
            } else {
                boolean startsWith = str2.startsWith("#EXT-X-MAP");
                java.util.regex.Pattern pattern = f279638n;
                if (startsWith) {
                    java.lang.String g18 = g(str2, pattern);
                    java.lang.String f17 = f(str2, f279636l);
                    if (f17 != null) {
                        java.lang.String[] split = f17.split("@");
                        j28 = java.lang.Long.parseLong(split[i18]);
                        if (split.length > 1) {
                            j27 = java.lang.Long.parseLong(split[1]);
                        }
                    }
                    cVar = new h9.c(g18, 0L, -1, -9223372036854775807L, false, null, null, j27, j28);
                    str3 = null;
                    j27 = 0;
                    j28 = -1;
                } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                    j18 = java.lang.Integer.parseInt(g(str2, f279629e)) * 1000000;
                } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    i28 = java.lang.Integer.parseInt(g(str2, f279632h));
                    i27 = i28;
                } else if (str2.startsWith("#EXT-X-VERSION")) {
                    i29 = java.lang.Integer.parseInt(g(str2, f279630f));
                } else if (str2.startsWith("#EXTINF")) {
                    j37 = (long) (java.lang.Double.parseDouble(g(str2, f279633i)) * 1000000.0d);
                } else if (str2.startsWith("#EXT-X-KEY")) {
                    z27 = "AES-128".equals(g(str2, f279637m));
                    if (z27) {
                        str5 = g(str2, pattern);
                        str4 = f(str2, f279639o);
                    } else {
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                    java.lang.String[] split2 = g(str2, f279635k).split("@");
                    j28 = java.lang.Long.parseLong(split2[i18]);
                    if (split2.length > 1) {
                        j27 = java.lang.Long.parseLong(split2[1]);
                    }
                } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i19 = java.lang.Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                    z17 = true;
                } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                    i38++;
                } else {
                    if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j19 == 0) {
                            java.lang.String substring = str2.substring(str2.indexOf(58) + 1);
                            java.util.regex.Matcher matcher = t9.d0.f416502e.matcher(substring);
                            if (!matcher.matches()) {
                                throw new m8.x("Invalid date/time format: " + substring);
                            }
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i17 = i18;
                            } else {
                                i17 = (java.lang.Integer.parseInt(matcher.group(12)) * 60) + java.lang.Integer.parseInt(matcher.group(13));
                                if (matcher.group(11).equals("-")) {
                                    i17 *= -1;
                                }
                            }
                            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)) - 1, java.lang.Integer.parseInt(matcher.group(3)), java.lang.Integer.parseInt(matcher.group(4)), java.lang.Integer.parseInt(matcher.group(5)), java.lang.Integer.parseInt(matcher.group(6)));
                            if (!android.text.TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new java.math.BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i17 != 0) {
                                timeInMillis -= i17 * com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
                            }
                            j19 = m8.b.a(timeInMillis) - j29;
                        }
                    } else if (!str2.startsWith("#")) {
                        java.lang.String hexString = !z27 ? null : str4 != null ? str4 : java.lang.Integer.toHexString(i28);
                        int i39 = i28 + 1;
                        if (j28 == -1) {
                            j27 = 0;
                        }
                        arrayList.add(new h9.c(str2, j37, i38, j29, z27, str5, hexString, j27, j28));
                        j29 += j37;
                        if (j28 != -1) {
                            j27 += j28;
                        }
                        i28 = i39;
                        j28 = -1;
                        i18 = 0;
                        str3 = null;
                        j37 = 0;
                    } else if (str2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        z18 = true;
                    } else if (str2.equals("#EXT-X-ENDLIST")) {
                        z19 = true;
                    }
                    i18 = 0;
                }
            }
            str3 = null;
        }
        return new h9.d(i37, str, arrayList2, j17, j19, z17, i19, i27, i29, j18, z18, z19, j19 != 0, cVar, arrayList);
    }

    public static java.lang.String f(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static java.lang.String g(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new m8.x("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        if (r1 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (r1.isEmpty() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        if (r1.startsWith("#EXTINF") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r1.startsWith("#EXT-X-KEY") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        r10.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        r10.add(r1);
        r9 = e(new h9.f(r10, r0), r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        r10.add(r1);
        r9 = d(new h9.f(r10, r0), r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        t9.d0.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        throw new m8.x("Failed to parse the playlist, could not identify any tags.");
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0068 A[Catch: all -> 0x0112, LOOP:3: B:77:0x004f->B:87:0x0068, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:12:0x0076, B:14:0x007c, B:17:0x0087, B:52:0x008f, B:19:0x00a0, B:21:0x00a8, B:23:0x00b0, B:25:0x00b8, B:27:0x00c0, B:29:0x00c8, B:31:0x00d0, B:33:0x00d8, B:35:0x00e1, B:40:0x00e5, B:59:0x0104, B:60:0x0111, B:64:0x0030, B:66:0x0036, B:71:0x003f, B:73:0x0048, B:79:0x0056, B:81:0x005c, B:87:0x0068, B:89:0x006d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006d A[EDGE_INSN: B:88:0x006d->B:89:0x006d BREAK  A[LOOP:3: B:77:0x004f->B:87:0x0068], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.net.Uri r9, java.io.InputStream r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.g.b(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
