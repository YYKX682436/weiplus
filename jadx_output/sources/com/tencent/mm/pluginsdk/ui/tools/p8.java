package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes7.dex */
public class p8 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f191839f = java.util.regex.Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f191840a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f191841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f191842c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f191843d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f191844e;

    public p8(java.lang.String str) {
        str.getClass();
        this.f191840a = "";
        this.f191841b = "";
        this.f191842c = -1;
        this.f191843d = "/";
        this.f191844e = "";
        java.util.regex.Matcher matcher = f191839f.matcher(str);
        if (!matcher.matches()) {
            throw new java.lang.Exception("Bad address");
        }
        java.lang.String group = matcher.group(1);
        if (group != null) {
            this.f191840a = group.toLowerCase();
        }
        java.lang.String group2 = matcher.group(2);
        if (group2 != null) {
            this.f191844e = group2;
        }
        java.lang.String group3 = matcher.group(3);
        if (group3 != null) {
            this.f191841b = group3;
        }
        java.lang.String group4 = matcher.group(4);
        if (group4 != null && group4.length() > 0) {
            try {
                this.f191842c = com.tencent.mm.sdk.platformtools.t8.P(group4, -1);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.Exception("Bad port");
            }
        }
        java.lang.String group5 = matcher.group(5);
        if (group5 != null && group5.length() > 0) {
            if (group5.charAt(0) == '/') {
                this.f191843d = group5;
            } else {
                this.f191843d = "/".concat(group5);
            }
        }
        if (this.f191842c == 443 && this.f191840a.equals("")) {
            this.f191840a = "https";
        } else if (this.f191842c == -1) {
            if (this.f191840a.equals("https")) {
                this.f191842c = com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX;
            } else {
                this.f191842c = 80;
            }
        }
        if (this.f191840a.equals("")) {
            this.f191840a = "http";
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.f191840a;
        java.lang.String str3 = "";
        int i17 = this.f191842c;
        if ((i17 == 443 || !str2.equals("https")) && (i17 == 80 || !str2.equals("http"))) {
            str = "";
        } else {
            str = ":" + java.lang.Integer.toString(i17);
        }
        java.lang.String str4 = this.f191844e;
        if (str4.length() > 0) {
            str3 = str4 + "@";
        }
        return str2 + "://" + str3 + this.f191841b + str + this.f191843d;
    }
}
