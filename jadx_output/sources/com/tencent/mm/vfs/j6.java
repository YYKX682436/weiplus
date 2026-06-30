package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class j6 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final int f213014d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f213015e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f213016f;

    public j6(int i17, java.lang.String fsName, yz5.p pVar) {
        kotlin.jvm.internal.o.g(fsName, "fsName");
        this.f213014d = i17;
        this.f213015e = fsName;
        this.f213016f = pVar;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
        if (x1Var == null) {
            return null;
        }
        int i17 = this.f213014d;
        yz5.p pVar = this.f213016f;
        if (pVar != null) {
            i17 = ((java.lang.Number) pVar.invoke(x1Var, java.lang.Integer.valueOf(i17))).intValue();
        }
        return new com.tencent.mm.vfs.k6(i17, this.f213015e, x1Var);
    }
}
