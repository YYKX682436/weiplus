package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class d implements com.tencent.xweb.pinus.sdk.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220378a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220379b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220380c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f220381d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f220382e;

    /* renamed from: f, reason: collision with root package name */
    public by5.i0 f220383f;

    /* renamed from: g, reason: collision with root package name */
    public by5.i0 f220384g;

    public d(java.lang.Object obj) {
        this.f220378a = obj;
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public java.lang.String a(java.lang.String str) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220380c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220378a, "getCookie", java.lang.String.class);
                    this.f220380c = i0Var;
                }
            }
            return (java.lang.String) i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void b(java.lang.String str, java.lang.String str2) {
        try {
            f().b(str, str2);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void c() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220382e;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220378a, "removeSessionCookie", new java.lang.Class[0]);
                    this.f220382e = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void d(boolean z17) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220383f;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220378a, "setAcceptCookie", java.lang.Boolean.TYPE);
                    this.f220383f = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void e() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220381d;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220378a, "removeAllCookie", new java.lang.Class[0]);
                    this.f220381d = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    public final synchronized by5.i0 f() {
        by5.i0 i0Var;
        i0Var = this.f220384g;
        if (i0Var == null) {
            i0Var = new by5.i0(this.f220378a, "setCookie", java.lang.String.class, java.lang.String.class);
            this.f220384g = i0Var;
        }
        return i0Var;
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void flush() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220379b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220378a, "flush", new java.lang.Class[0]);
                    this.f220379b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
