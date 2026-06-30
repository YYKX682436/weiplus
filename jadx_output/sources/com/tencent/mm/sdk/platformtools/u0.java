package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f193000a = "<unknown ssid>";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f193001b = "02:00:00:00:00:00";

    /* renamed from: c, reason: collision with root package name */
    public int f193002c;

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f193002c);
        sb6.append(',');
        sb6.append(this.f193001b);
        sb6.append(',');
        byte[] bytes = this.f193000a.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(android.util.Base64.encodeToString(bytes, 2));
        return sb6.toString();
    }

    public java.lang.String toString() {
        return "ssid(" + this.f193000a + "), bssid(" + this.f193001b + "), level(" + this.f193002c + ')';
    }
}
