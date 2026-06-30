package hr1;

/* loaded from: classes11.dex */
public final class j extends com.tencent.mm.storage.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xg3.m0 storage) {
        super(storage);
        kotlin.jvm.internal.o.g(storage, "storage");
        g(d(), "bizfansmessage");
        a(new xg3.k0(64, "bizfansmessage", xg3.k0.a(5500001L, 6000000L, 408000001L, 458000000L, -1L, -1L)));
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
        if (com.tencent.mm.storage.z3.E3(str)) {
            return "bizfansmessage";
        }
        return null;
    }
}
