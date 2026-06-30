package com.tencent.xweb;

/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f220517f = java.util.regex.Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f220518a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f220519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f220520c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f220521d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f220522e;

    public q0(java.lang.String str) {
        str.getClass();
        this.f220518a = "";
        this.f220519b = "";
        this.f220520c = -1;
        this.f220521d = "/";
        this.f220522e = "";
        java.util.regex.Matcher matcher = f220517f.matcher(str);
        if (!matcher.matches()) {
            throw new com.tencent.xweb.p0("Bad address");
        }
        java.lang.String group = matcher.group(1);
        if (group != null) {
            this.f220518a = group.toLowerCase(java.util.Locale.ROOT);
        }
        java.lang.String group2 = matcher.group(2);
        if (group2 != null) {
            this.f220522e = group2;
        }
        java.lang.String group3 = matcher.group(3);
        if (group3 != null) {
            this.f220519b = group3;
        }
        java.lang.String group4 = matcher.group(4);
        if (group4 != null && group4.length() > 0) {
            try {
                this.f220520c = java.lang.Integer.parseInt(group4);
            } catch (java.lang.NumberFormatException unused) {
                throw new com.tencent.xweb.p0("Bad port");
            }
        }
        java.lang.String group5 = matcher.group(5);
        if (group5 != null && group5.length() > 0) {
            if (group5.charAt(0) == '/') {
                this.f220521d = group5;
            } else {
                this.f220521d = "/".concat(group5);
            }
        }
        if (this.f220520c == 443 && this.f220518a.equals("")) {
            this.f220518a = "https";
        } else if (this.f220520c == -1) {
            if (this.f220518a.equals("https")) {
                this.f220520c = com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX;
            } else {
                this.f220520c = 80;
            }
        }
        if (this.f220518a.equals("")) {
            this.f220518a = "http";
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.f220518a;
        java.lang.String str3 = "";
        int i17 = this.f220520c;
        if ((i17 == 443 || !str2.equals("https")) && (i17 == 80 || !str2.equals("http"))) {
            str = "";
        } else {
            str = ":" + i17;
        }
        java.lang.String str4 = this.f220522e;
        if (str4.length() > 0) {
            str3 = str4 + "@";
        }
        return str2 + "://" + str3 + this.f220519b + str + this.f220521d;
    }
}
