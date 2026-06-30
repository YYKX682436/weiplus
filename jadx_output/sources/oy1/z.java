package oy1;

/* loaded from: classes13.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy1.c0 f349934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(oy1.c0 c0Var) {
        super(0);
        this.f349934d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("SDK_Cgi_Router_Report", new oy1.y(this.f349934d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
