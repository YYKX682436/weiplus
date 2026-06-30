package yk2;

/* loaded from: classes3.dex */
public final class i extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f462794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
        r45.v32 v32Var = (r45.v32) response.getCustom(31);
        if (v32Var != null) {
            boolean z17 = v32Var.getBoolean(2);
            android.view.ViewGroup viewGroup = this.f462791d;
            if (!z17) {
                viewGroup.setVisibility(8);
                return;
            }
            if (!this.f462794f) {
                this.f462794f = true;
                com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
                java.lang.String b17 = b();
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                a4Var.a(b17, "", b52.b.b(), "person_page_product_orderid", "");
            }
            viewGroup.setVisibility(0);
        }
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_product_orderid", "");
        android.content.Context context = this.f462791d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.lk2 lk2Var = this.f462792e;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = lk2Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lk2Var.getCustom(32) : null;
        if (finderJumpInfo == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.SOURCE, 3);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453235a0 = hashMap;
        xc2.y2.P(y2Var, context, p0Var, 0, false, null, 0.0f, 60, null);
    }
}
