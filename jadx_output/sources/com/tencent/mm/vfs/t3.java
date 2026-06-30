package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class t3 implements com.tencent.mm.vfs.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f213183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.q2 f213184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.q2 f213185c;

    public t3(com.tencent.mm.vfs.u3 u3Var, boolean[] zArr, com.tencent.mm.vfs.q2 q2Var, com.tencent.mm.vfs.q2 q2Var2) {
        this.f213183a = zArr;
        this.f213184b = q2Var;
        this.f213185c = q2Var2;
    }

    @Override // com.tencent.mm.vfs.b8
    public boolean accept(java.lang.Object obj) {
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        boolean[] zArr = this.f213183a;
        try {
            com.tencent.mm.vfs.q2 q2Var = this.f213184b;
            java.lang.String str = x1Var.f213231a;
            boolean t17 = q2Var.t(str, this.f213185c, str);
            zArr[0] = t17;
            return true ^ t17;
        } catch (java.io.IOException unused) {
            zArr[0] = false;
            return true;
        }
    }
}
