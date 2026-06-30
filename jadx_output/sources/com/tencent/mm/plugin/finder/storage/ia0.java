package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes11.dex */
public final class ia0 extends com.tencent.mm.storage.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(xg3.m0 storage) {
        super(storage);
        kotlin.jvm.internal.o.g(storage, "storage");
        g(d(), "findermessage006");
        a(new xg3.k0(512, "findermessage006", xg3.k0.a(4000001L, 4500000L, 108000001L, 208000000L, -1L, -1L)));
    }

    @Override // com.tencent.mm.storage.f
    public java.lang.String f(java.lang.String str) {
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        iz5.a.g(null, z17);
        if (com.tencent.mm.storage.z3.V3(str)) {
            return "findermessage006";
        }
        return null;
    }
}
