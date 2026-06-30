package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class i5 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f188934a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f188935b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f188936c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f188937d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f188938e = false;

    public java.lang.String a(java.lang.String str) {
        if (this.f188938e && !com.tencent.mm.sdk.platformtools.t8.K0(this.f188935b)) {
            return this.f188935b;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    public java.lang.String toString() {
        return "OpenSDKTokenData{packageName=" + this.f188935b + ", openSDKVersion=" + this.f188937d + ", isValid=" + this.f188938e + "}";
    }
}
