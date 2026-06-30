package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class y4 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f196353a;

    /* renamed from: b, reason: collision with root package name */
    public final long f196354b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f196355c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f196356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f196357e;

    public y4(java.lang.String str) {
        java.lang.String str2;
        this.f196356d = "-1";
        this.f196357e = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. content is null.");
            return;
        }
        try {
            if (str.endsWith("\n")) {
                str2 = str.substring(0, str.length() - 1);
            } else {
                this.f196357e = str.replace(":", "*#*");
                str2 = str;
            }
            java.lang.String[] split = str2.split(":", 6);
            if (split.length > 0) {
                this.f196353a = split[0];
            }
            if (split.length > 1) {
                this.f196354b = com.tencent.mm.sdk.platformtools.t8.V(split[1], 0L);
            }
            if (split.length > 2) {
                this.f196355c = split[2].equals("1");
            }
            if (split.length > 3) {
                this.f196356d = split[3];
            }
            if (split.length > 4) {
                this.f196357e = split[4].replace("*#*", ":");
            }
        } catch (java.lang.Exception e17) {
            this.f196354b = 0L;
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiContent", "EmojiContent parse failed. Content:%s Excpetion:%s", str, com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static com.tencent.mm.storage.y4 a(java.lang.String str) {
        return new com.tencent.mm.storage.y4(str);
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String replace = str.replace("*#*", ":");
        int indexOf = replace.indexOf("<msg");
        if (!z65.c.f470458d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiContent", "getOriginContent: %s", java.lang.Integer.valueOf(indexOf));
        }
        if (indexOf < 0) {
            return null;
        }
        java.lang.String[] split = replace.substring(0, indexOf).split(":");
        int lastIndexOf = replace.substring(0, indexOf).lastIndexOf(":");
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiContent", "getOriginContent: %s", java.lang.Integer.valueOf(split.length));
        if (split.length < 5) {
            return replace;
        }
        return split[4] + replace.substring(lastIndexOf);
    }

    public static java.lang.String e(java.lang.String str, long j17, boolean z17, java.lang.String str2, boolean z18, java.lang.String str3) {
        return str + ":" + j17 + ":" + (z17 ? 1 : 0) + ":" + str2 + ":" + str3.replace(":", "*#*") + ":0\n";
    }

    public java.lang.String b() {
        return this.f196353a;
    }

    public java.lang.String d() {
        return this.f196353a + ":" + this.f196354b + ":" + (this.f196355c ? 1 : 0) + ":" + this.f196356d + ":" + this.f196357e + ":\n";
    }
}
