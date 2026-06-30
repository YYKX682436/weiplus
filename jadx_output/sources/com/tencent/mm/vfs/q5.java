package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class q5 extends com.tencent.mm.vfs.l5 implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final int f213138f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.vfs.q2 f213139g;

    public q5(java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.vfs.q2 q2Var) {
        super(str, str2);
        this.f213138f = i17;
        this.f213139g = q2Var;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f213067d.compareTo((java.lang.String) obj);
    }
}
