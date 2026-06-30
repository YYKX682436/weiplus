package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class d3 implements com.tencent.mm.vfs.x5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212894a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.v5 f212895b;

    public d3(java.lang.String str, com.tencent.mm.vfs.v5 v5Var) {
        this.f212894a = new com.tencent.mm.vfs.f1(str);
        this.f212895b = v5Var;
    }

    @Override // com.tencent.mm.vfs.x5
    public com.tencent.mm.vfs.w5 b(java.util.Map map) {
        java.lang.String a17 = this.f212894a.a(map);
        if (a17 == null) {
            return null;
        }
        return new com.tencent.mm.vfs.c3(a17, this.f212895b);
    }
}
