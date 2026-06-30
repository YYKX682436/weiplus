package com.tencent.xweb;

/* loaded from: classes7.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220328a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220329b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220330c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f220331d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f220332e;

    public l2(java.lang.Object obj) {
        this.f220328a = obj;
    }

    public java.nio.ByteBuffer a() {
        if (this.f220331d == null) {
            this.f220331d = new by5.i0(this.f220328a, "getBuffer", new java.lang.Class[0]);
        }
        try {
            return (java.nio.ByteBuffer) this.f220331d.b(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "getBuffer invoke failed, error: " + e17);
            return null;
        }
    }

    public int b() {
        if (this.f220329b == null) {
            this.f220329b = new by5.i0(this.f220328a, "getErrorCode", new java.lang.Class[0]);
        }
        try {
            return ((java.lang.Integer) this.f220329b.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "getErrorCode invoke failed, error: " + e17);
            return -2;
        }
    }

    public java.lang.String c() {
        if (this.f220330c == null) {
            this.f220330c = new by5.i0(this.f220328a, "getUrl", new java.lang.Class[0]);
        }
        try {
            return (java.lang.String) this.f220330c.b(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "getUrl invoke failed, error: " + e17);
            return null;
        }
    }

    public void d() {
        if (this.f220332e == null) {
            this.f220332e = new by5.i0(this.f220328a, "release", new java.lang.Class[0]);
        }
        try {
            this.f220332e.b(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            by5.c4.c("XWebGetImageFromDiskCacheResult", "release invoke failed, error: " + e17);
        }
    }
}
