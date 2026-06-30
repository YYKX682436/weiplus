package ve1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f436073h = java.util.regex.Pattern.compile("[R,r]ange:\\s*bytes=(\\d*)\\s*-\\s*(\\d*)");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f436074i = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedReader f436075a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.LinkedHashMap f436076b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.util.LinkedHashMap f436077c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f436078d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f436079e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436080f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f436081g;

    public e(java.io.InputStream inputStream, java.lang.String str) {
        this.f436075a = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        this.f436081g = str + "HttpParser";
        try {
            e();
        } catch (java.io.IOException e17) {
            ve1.g.p(6, this.f436081g, "error parsing request " + ve1.g.h(e17, false), null);
        }
    }

    public static java.lang.String a(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            for (int i17 = 0; i17 < list.size(); i17++) {
                if (str != null) {
                    linkedHashMap.put(str.toLowerCase().trim(), (java.lang.String) list.get(i17));
                } else {
                    linkedHashMap.put(str, (java.lang.String) list.get(i17));
                }
            }
        }
        java.lang.String str2 = "";
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2.getKey() != null) {
                str2 = (str2 + ((java.lang.String) entry2.getKey())) + ": ";
            }
            str2 = (str2 + ((java.lang.String) entry2.getValue())) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
        }
        return str2;
    }

    public static long[] c(java.lang.String str) {
        long j17;
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.regex.Matcher matcher = f436073h.matcher(str);
            if (matcher.find()) {
                java.lang.String group = matcher.group(1);
                java.lang.String group2 = matcher.group(2);
                try {
                    j17 = java.lang.Long.parseLong(group);
                } catch (java.lang.NumberFormatException unused) {
                    j17 = 0;
                }
                try {
                    return new long[]{j17, java.lang.Long.parseLong(group2)};
                } catch (java.lang.NumberFormatException unused2) {
                    return new long[]{j17, -2};
                }
            }
        }
        return new long[]{-1, -1};
    }

    public static java.lang.String d(long j17, long j18, long j19, java.lang.String str, boolean z17) {
        long j27;
        java.lang.String str2;
        long j28 = j18;
        boolean z18 = j17 != -1;
        boolean z19 = !android.text.TextUtils.isEmpty(str);
        boolean z27 = j19 >= 0;
        if (!z18) {
            j27 = j19;
        } else if (j28 == -2) {
            j27 = j19 - j17;
        } else {
            long j29 = j19 - 1;
            if (j28 > j29) {
                ve1.g.p(5, "HttpParser", "fix rangeEnd. max=" + j29 + " current=" + j28, null);
            }
            j28 = java.lang.Math.min(j28, j29);
            j27 = (j28 - j17) + 1;
        }
        java.lang.String str3 = (z18 ? "HTTP/1.1 206 PARTIAL CONTENT\r\n" : "HTTP/1.1 200 OK\r\n") + "Connection: close\r\n";
        if (z27 && z18) {
            if (j28 == -2) {
                str3 = str3 + java.lang.String.format(java.util.Locale.US, "Content-Range: bytes %d-%d/%d\r\n", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19 - 1), java.lang.Long.valueOf(j19));
            } else {
                str3 = str3 + java.lang.String.format(java.util.Locale.US, "Content-Range: bytes %d-%d/%d\r\n", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j19));
            }
        }
        if (z17) {
            str2 = str3 + java.lang.String.format(java.util.Locale.US, "Cache-Control: max-age=%d\r\n", 10800);
        } else {
            str2 = str3 + "Cache-Control: no-cache\r\n";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", locale);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        sb6.append("Date: " + simpleDateFormat.format(new java.util.Date()) + " GMT");
        sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        java.lang.String sb7 = sb6.toString();
        if (z17) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(sb7);
            java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", locale);
            simpleDateFormat2.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            sb8.append("Expires: " + simpleDateFormat2.format(new java.util.Date(java.lang.System.currentTimeMillis() + 10800000)) + " GMT");
            sb8.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7 = sb8.toString();
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(sb7);
        sb9.append(z27 ? java.lang.String.format(java.util.Locale.US, "Content-Length: %d\r\n", java.lang.Long.valueOf(j27)) : "");
        java.lang.String str4 = sb9.toString() + "Accept-Ranges: bytes\r\n";
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(str4);
        sb10.append(z19 ? java.lang.String.format("Content-Type: %s\r\n", str) : "");
        java.lang.String str5 = (sb10.toString() + java.lang.String.format("X-Server: %s\r\n", "VideoProxy 1.4.1")) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
        if (!z18 && z19 && str.equalsIgnoreCase(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4)) {
            ((lm1.c) qe1.a.a().f362029n).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1234L, 37L, j19, false);
        }
        return str5;
    }

    public java.lang.String b(java.lang.String str) {
        return (java.lang.String) this.f436077c.get(str);
    }

    public void e() {
        int[] iArr = this.f436078d;
        java.io.BufferedReader bufferedReader = this.f436075a;
        java.lang.String readLine = bufferedReader.readLine();
        java.lang.String str = this.f436081g;
        ve1.g.p(4, str, "parseRequest:" + readLine, null);
        if (readLine == null || readLine.length() == 0) {
            ve1.g.p(6, str, "initial is not valid", null);
            return;
        }
        if (java.lang.Character.isWhitespace(readLine.charAt(0))) {
            ve1.g.p(6, str, "character first char is whitespace", null);
            return;
        }
        java.lang.String[] split = readLine.split("\\s");
        if (split.length != 3) {
            ve1.g.p(6, str, "cmd.length is not 3", null);
            return;
        }
        java.util.ArrayList arrayList = this.f436079e;
        arrayList.add(readLine);
        this.f436080f = split[0];
        java.lang.String str2 = (split[2].indexOf("HTTP/") != 0 || split[2].indexOf(46) <= 5) ? (split[0].indexOf("HTTP/") != 0 || split[0].indexOf(46) <= 5) ? null : split[0] : split[2];
        if (str2 != null) {
            java.lang.String[] split2 = str2.substring(5).split("\\.");
            try {
                iArr[0] = java.lang.Integer.parseInt(split2[0]);
                iArr[1] = java.lang.Integer.parseInt(split2[1]);
            } catch (java.lang.NumberFormatException e17) {
                ve1.g.p(6, str, "error parsing request NumberFormatException:" + ve1.g.h(e17, false), null);
                return;
            }
        }
        if (split[0].equals("GET") || split[0].equals("HEAD")) {
            int indexOf = split[1].indexOf(63);
            if (indexOf >= 0) {
                java.lang.String[] split3 = split[1].substring(indexOf + 1).split("&");
                this.f436077c = new java.util.LinkedHashMap();
                for (int i17 = 0; i17 < split3.length; i17++) {
                    java.lang.String[] split4 = split3[i17].split("=");
                    if (split4.length == 2) {
                        this.f436077c.put(java.net.URLDecoder.decode(split4[0], com.tencent.mapsdk.internal.rv.f51270c), java.net.URLDecoder.decode(split4[1], com.tencent.mapsdk.internal.rv.f51270c));
                    } else if (split4.length == 1 && split3[i17].indexOf(61) == split3[i17].length() - 1) {
                        this.f436077c.put(java.net.URLDecoder.decode(split4[0], com.tencent.mapsdk.internal.rv.f51270c), "");
                    }
                }
            }
        } else if (!split[0].equals("POST") && !split[0].equals("OPTIONS") && !split[0].equals("PUT") && !split[0].equals("DELETE") && !split[0].equals("TRACE")) {
            split[0].equals("CONNECT");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String readLine2 = bufferedReader.readLine();
        sb6.append(readLine2);
        sb6.append("|");
        while (true) {
            if (readLine2.equals("")) {
                break;
            }
            int indexOf2 = readLine2.indexOf(58);
            if (indexOf2 < 0) {
                this.f436076b = null;
                break;
            }
            this.f436076b.put(readLine2.substring(0, indexOf2).toLowerCase().trim(), readLine2.substring(indexOf2 + 1).trim());
            arrayList.add(readLine2);
            readLine2 = bufferedReader.readLine();
            sb6.append(readLine2);
            sb6.append("|");
        }
        ve1.g.p(4, str, "parseHeaders:" + sb6.toString(), null);
    }
}
