package l36;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f315668j = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f315669k = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f315670l = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f315671m = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f315672a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315673b;

    /* renamed from: c, reason: collision with root package name */
    public final long f315674c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f315675d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f315676e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f315677f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f315678g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f315679h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f315680i;

    public w(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f315672a = str;
        this.f315673b = str2;
        this.f315674c = j17;
        this.f315675d = str3;
        this.f315676e = str4;
        this.f315677f = z17;
        this.f315678g = z18;
        this.f315680i = z19;
        this.f315679h = z27;
    }

    public static int a(java.lang.String str, int i17, int i18, boolean z17) {
        while (i17 < i18) {
            char charAt = str.charAt(i17);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z17)) {
                return i17;
            }
            i17++;
        }
        return i18;
    }

    public static long b(java.lang.String str, int i17, int i18) {
        int a17 = a(str, i17, i18, false);
        java.util.regex.Pattern pattern = f315671m;
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int i19 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i37 = -1;
        int i38 = -1;
        while (a17 < i18) {
            int a18 = a(str, a17 + 1, i18, true);
            matcher.region(a17, a18);
            if (i27 == -1 && matcher.usePattern(pattern).matches()) {
                i27 = java.lang.Integer.parseInt(matcher.group(1));
                i37 = java.lang.Integer.parseInt(matcher.group(2));
                i38 = java.lang.Integer.parseInt(matcher.group(3));
            } else if (i28 == -1 && matcher.usePattern(f315670l).matches()) {
                i28 = java.lang.Integer.parseInt(matcher.group(1));
            } else {
                if (i29 == -1) {
                    java.util.regex.Pattern pattern2 = f315669k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i29 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(java.util.Locale.US)) / 4;
                    }
                }
                if (i19 == -1 && matcher.usePattern(f315668j).matches()) {
                    i19 = java.lang.Integer.parseInt(matcher.group(1));
                }
            }
            a17 = a(str, a18 + 1, i18, false);
        }
        if (i19 >= 70 && i19 <= 99) {
            i19 += 1900;
        }
        if (i19 >= 0 && i19 <= 69) {
            i19 += 2000;
        }
        if (i19 < 1601) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i29 == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i28 < 1 || i28 > 31) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i27 < 0 || i27 > 23) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i37 < 0 || i37 > 59) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i38 < 0 || i38 > 59) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(m36.e.f323390e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i19);
        gregorianCalendar.set(2, i29 - 1);
        gregorianCalendar.set(5, i28);
        gregorianCalendar.set(11, i27);
        gregorianCalendar.set(12, i37);
        gregorianCalendar.set(13, i38);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof l36.w)) {
            return false;
        }
        l36.w wVar = (l36.w) obj;
        return wVar.f315672a.equals(this.f315672a) && wVar.f315673b.equals(this.f315673b) && wVar.f315675d.equals(this.f315675d) && wVar.f315676e.equals(this.f315676e) && wVar.f315674c == this.f315674c && wVar.f315677f == this.f315677f && wVar.f315678g == this.f315678g && wVar.f315679h == this.f315679h && wVar.f315680i == this.f315680i;
    }

    public int hashCode() {
        int hashCode = (((((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f315672a.hashCode()) * 31) + this.f315673b.hashCode()) * 31) + this.f315675d.hashCode()) * 31) + this.f315676e.hashCode()) * 31;
        long j17 = this.f315674c;
        return ((((((((hashCode + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (!this.f315677f ? 1 : 0)) * 31) + (!this.f315678g ? 1 : 0)) * 31) + (!this.f315679h ? 1 : 0)) * 31) + (!this.f315680i ? 1 : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f315672a);
        sb6.append('=');
        sb6.append(this.f315673b);
        if (this.f315679h) {
            long j17 = this.f315674c;
            if (j17 == Long.MIN_VALUE) {
                sb6.append("; max-age=0");
            } else {
                sb6.append("; expires=");
                sb6.append(((java.text.DateFormat) p36.f.f351718a.get()).format(new java.util.Date(j17)));
            }
        }
        if (!this.f315680i) {
            sb6.append("; domain=");
            sb6.append(this.f315675d);
        }
        sb6.append("; path=");
        sb6.append(this.f315676e);
        if (this.f315677f) {
            sb6.append("; secure");
        }
        if (this.f315678g) {
            sb6.append("; httponly");
        }
        return sb6.toString();
    }
}
