package yk2;

/* loaded from: classes3.dex */
public final class h extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f462793f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // yk2.g
    public int c() {
        if (this.f462793f) {
            return 0;
        }
        this.f462793f = true;
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(b17, "", b52.b.b(), "person_page_private_letter", "");
        return 0;
    }

    @Override // yk2.g
    public void d() {
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_private_letter", "");
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f462791d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).yk(context, null);
    }
}
