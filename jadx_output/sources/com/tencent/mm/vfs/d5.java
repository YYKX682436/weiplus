package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class d5 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f212898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.g5 f212899e;

    public d5(com.tencent.mm.vfs.g5 g5Var, boolean z17) {
        this.f212899e = g5Var;
        this.f212898d = z17;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        if (this.f212898d && ".ref".equals(x1Var.f213232b)) {
            return null;
        }
        boolean z17 = x1Var.f213236f;
        com.tencent.mm.vfs.g5 g5Var = this.f212899e;
        if (!z17) {
            if (x1Var.f213232b.charAt(r0.length() - 1) == 8982) {
                return g5Var.L(x1Var.f213231a.substring(0, r0.length() - 1), x1Var);
            }
        }
        g5Var.getClass();
        return new com.tencent.mm.vfs.x1(g5Var, x1Var.f213231a, x1Var.f213232b, x1Var.f213233c, x1Var.f213234d, x1Var.f213235e, x1Var.f213236f);
    }
}
