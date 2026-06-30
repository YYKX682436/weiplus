package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public long f198408a;

    /* renamed from: b, reason: collision with root package name */
    public final int f198409b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f198410c;

    /* renamed from: d, reason: collision with root package name */
    public long f198411d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f198412e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198413f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f198414g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f198415h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.regex.Pattern f198416i = java.util.regex.Pattern.compile("[._a-zA-Z0-9]+");

    public f0() {
    }

    public int a() {
        return this.f198409b;
    }

    public boolean b(java.lang.String str) {
        for (char c17 : str.toCharArray()) {
            if (c17 >= 19968 && c17 <= 40891) {
                return true;
            }
        }
        return false;
    }

    public boolean c(java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.util.regex.Matcher matcher = this.f198416i.matcher(str2);
            while (matcher.find()) {
                java.lang.String group = matcher.group();
                z17 = group.startsWith(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryListAdapter", "[isContains] search:%s group:%s", str, group);
                if (z17) {
                    break;
                }
            }
        }
        return z17;
    }

    public boolean d(java.lang.String str) {
        boolean b17 = b(str);
        java.lang.String str2 = this.f198414g;
        java.lang.String str3 = this.f198415h;
        if (b17) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198410c) && this.f198410c.toLowerCase().contains(str)) {
                return true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198413f) && this.f198413f.toLowerCase().contains(str)) {
                return true;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || !str3.toLowerCase().contains(str)) {
                return !com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.toLowerCase().contains(str);
            }
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198410c) && c(str, this.f198410c.toLowerCase())) {
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f198413f) && c(str, this.f198413f.toLowerCase())) {
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || !c(str, str3.toLowerCase())) {
            return !com.tencent.mm.sdk.platformtools.t8.K0(str2) && c(str, str2.toLowerCase());
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == null || !(obj instanceof com.tencent.mm.ui.chatting.adapter.f0)) ? super.equals(obj) : this.f198411d == ((com.tencent.mm.ui.chatting.adapter.f0) obj).f198411d;
    }

    public f0(long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f198408a = j17;
        this.f198409b = i17;
        this.f198410c = str;
        this.f198411d = j18;
        this.f198412e = str2;
        this.f198413f = str3;
        this.f198414g = str4;
        this.f198415h = str5;
    }
}
