package com.tencent.mm.vfs;

/* loaded from: classes11.dex */
public class v6 implements com.tencent.mm.vfs.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.z2 f213216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f213217c;

    public v6(int i17, com.tencent.mm.vfs.z2 z2Var, java.util.HashSet hashSet) {
        this.f213215a = i17;
        this.f213216b = z2Var;
        this.f213217c = hashSet;
    }

    @Override // com.tencent.mm.vfs.b8
    public boolean accept(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        java.lang.String substring = x1Var.f213231a.substring(this.f213215a);
        if (!substring.startsWith("/")) {
            substring = "/".concat(substring);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.z2 z2Var = this.f213216b;
        sb6.append(z2Var.f213267b);
        sb6.append(substring);
        java.lang.String sb7 = sb6.toString();
        try {
            z17 = z2Var.f213266a.t(sb7, x1Var.f213237g, x1Var.f213231a);
        } catch (java.io.IOException unused) {
            z17 = false;
        }
        if (z17) {
            this.f213217c.add(sb7);
        }
        return !z17;
    }
}
