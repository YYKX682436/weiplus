package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f192911a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f192912b = new com.tencent.mm.sdk.platformtools.r2(256);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.f8 f192913c;

    static {
        java.util.regex.Pattern.compile(((char) ("⍆[0-9]+@".charAt(0) ^ 56506)) + "[0-9]+@");
    }

    public p2(java.lang.String str) {
        try {
            this.f192911a = str.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException unused) {
            this.f192911a = str.getBytes();
        }
        this.f192913c = new com.tencent.mm.sdk.platformtools.f8(str);
    }
}
