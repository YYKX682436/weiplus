package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class c3 implements com.tencent.mm.vfs.w5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f212868a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.v5 f212869b;

    public c3(java.lang.String str, com.tencent.mm.vfs.v5 v5Var) {
        this.f212868a = str;
        this.f212869b = v5Var;
    }

    @Override // com.tencent.mm.vfs.w5
    public void a(com.tencent.mm.vfs.q2 q2Var, int i17, java.util.Map map) {
        this.f212869b.a(this.f212868a, q2Var.y(), i17, map);
    }
}
