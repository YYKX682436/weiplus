package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class l0 implements pm5.a, pm5.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f213040a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f213041b = new java.util.HashSet();

    public l0(java.lang.String str) {
        this.f213040a = str;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        return ((com.tencent.mm.vfs.q2) obj).C(this.f213040a);
    }

    @Override // pm5.d
    public boolean b(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        return str == null || !this.f213041b.add(str);
    }
}
