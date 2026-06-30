package nr1;

/* loaded from: classes11.dex */
public final class g extends com.tencent.mm.storage.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xg3.m0 storage) {
        super(storage);
        kotlin.jvm.internal.o.g(storage, "storage");
        g(d(), "picfansmsg");
        a(new xg3.k0(4096, "picfansmsg", null));
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
        if (com.tencent.mm.storage.z3.G3(str)) {
            return "picfansmsg";
        }
        return null;
    }
}
