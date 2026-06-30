package li4;

/* loaded from: classes11.dex */
public final class c extends com.tencent.mm.storage.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xg3.m0 storage) {
        super(storage);
        kotlin.jvm.internal.o.g(storage, "storage");
        g(d(), "textstatusmessage");
        a(new xg3.k0(2048, "textstatusmessage", xg3.k0.a(5000001L, 5500000L, 308000001L, 408000000L, -1L, -1L)));
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
        if (com.tencent.mm.storage.z3.H4(str)) {
            return "textstatusmessage";
        }
        return null;
    }
}
