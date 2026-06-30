package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f213231a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213232b;

    /* renamed from: c, reason: collision with root package name */
    public final long f213233c;

    /* renamed from: d, reason: collision with root package name */
    public final long f213234d;

    /* renamed from: e, reason: collision with root package name */
    public final long f213235e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f213236f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213237g;

    public x1(com.tencent.mm.vfs.q2 q2Var, java.lang.String str, java.lang.String str2, long j17, long j18, long j19, boolean z17) {
        this.f213237g = q2Var;
        this.f213231a = str;
        this.f213232b = str2;
        this.f213233c = j17;
        this.f213234d = j18;
        this.f213235e = j19;
        this.f213236f = z17;
    }

    public boolean a() {
        return b(true);
    }

    public boolean b(boolean z17) {
        boolean z18 = this.f213236f;
        java.lang.String str = this.f213231a;
        com.tencent.mm.vfs.q2 q2Var = this.f213237g;
        return z18 ? q2Var.e(str, z17) : q2Var.d(str);
    }

    public boolean c() {
        return this instanceof com.tencent.mm.vfs.k5;
    }

    public java.lang.Iterable d() {
        if (this.f213236f) {
            return this.f213237g.list(this.f213231a);
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        if (this.f213236f) {
            sb6.append("[DIR] ");
        }
        sb6.append(this.f213231a);
        sb6.append(" -> ");
        sb6.append(this.f213237g);
        return sb6.toString();
    }
}
