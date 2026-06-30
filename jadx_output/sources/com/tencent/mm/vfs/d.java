package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f212888a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212889b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f212890c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Throwable f212891d;

    public d(int i17, com.tencent.mm.vfs.q2 q2Var, java.lang.String str) {
        if (i17 < 0 || i17 >= com.tencent.mm.vfs.AccessControlFileSystem.f212681i) {
            throw new java.lang.IllegalArgumentException("Illegal access token: " + i17);
        }
        this.f212888a = i17;
        this.f212889b = q2Var;
        this.f212890c = str;
        this.f212891d = new java.lang.Throwable();
    }
}
