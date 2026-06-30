package to1;

/* loaded from: classes15.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to1.k f420917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f420919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(to1.k kVar, java.lang.String str, boolean z17) {
        super(0);
        this.f420917d = kVar;
        this.f420918e = str;
        this.f420919f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        to1.r c17;
        to1.k kVar = this.f420917d;
        com.tencent.mm.sdk.platformtools.r2 r2Var = kVar.f420922c;
        java.lang.String str = this.f420918e;
        to1.r rVar = (to1.r) r2Var.get(str);
        if (rVar != null) {
            return rVar;
        }
        com.tencent.mm.sdk.platformtools.r2 r2Var2 = kVar.f420922c;
        if (!this.f420919f) {
            c17 = kVar.f420920a.c(str);
            if (c17 != null) {
                r2Var2.put(str, c17);
                return c17;
            }
            return null;
        }
        java.io.File file = new java.io.File(str);
        to1.r b17 = kVar.b(file.getParent());
        if (b17 != null) {
            java.lang.String name = file.getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            c17 = b17.d(name, true);
            if (c17 != null) {
                r2Var2.put(str, c17);
                return c17;
            }
        }
        return null;
    }
}
