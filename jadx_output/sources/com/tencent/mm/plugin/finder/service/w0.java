package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class w0 implements com.tencent.mm.storage.c8 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f126236d = jz5.h.b(com.tencent.mm.plugin.finder.service.v0.f126226d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f126237e = jz5.h.b(com.tencent.mm.plugin.finder.service.u0.f126216d);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r1 != false) goto L51;
     */
    @Override // com.tencent.mm.storage.c8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.storage.z3 get(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.service.w0.get(java.lang.String):com.tencent.mm.storage.z3");
    }

    @Override // com.tencent.mm.storage.c8
    public int o0(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        if (z3Var == null) {
            return -1;
        }
        java.lang.String d17 = z3Var.d1();
        if (d17 == null || d17.length() == 0) {
            return -1;
        }
        if (com.tencent.mm.storage.z3.V3(d17)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            d17 = com.tencent.mm.plugin.finder.service.m4.f126148a.h(d17);
        } else {
            kotlin.jvm.internal.o.d(d17);
        }
        return !(z3Var.Z == 2 || com.tencent.mm.storage.z3.U3(d17) || com.tencent.mm.storage.z3.S3(d17)) ? -1 : 1;
    }

    @Override // com.tencent.mm.storage.c8
    public void w0(com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var) {
    }
}
