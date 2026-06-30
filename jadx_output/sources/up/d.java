package up;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final up.d f429757d = new up.d();

    public d() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sc.c type = (sc.c) obj;
        java.lang.String path = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(path, "path");
        jz5.g gVar = up.g.f429760a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (type == sc.c.f405611d) {
            java.lang.System.load(path);
        }
        return java.lang.Boolean.FALSE;
    }
}
