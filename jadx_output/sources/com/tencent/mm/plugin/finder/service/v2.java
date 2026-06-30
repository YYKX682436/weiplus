package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class v2 implements c01.rb {
    public v2() {
        jz5.h.b(com.tencent.mm.plugin.finder.service.u2.f126218d);
    }

    @Override // c01.rb
    public c01.p8 be() {
        return new com.tencent.mm.plugin.finder.service.t2();
    }

    @Override // c01.rb
    public boolean sh(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return i17 == 2 || com.tencent.mm.storage.z3.S3(str) || com.tencent.mm.storage.z3.V3(str) || com.tencent.mm.storage.z3.U3(str);
    }
}
