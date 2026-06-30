package yk2;

/* loaded from: classes3.dex */
public final class j extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f462795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
        r45.v32 v32Var = (r45.v32) response.getCustom(31);
        if (v32Var != null) {
            boolean z17 = v32Var.getBoolean(3);
            android.view.ViewGroup viewGroup = this.f462791d;
            if (!z17) {
                viewGroup.setVisibility(8);
                return;
            }
            if (!this.f462795f) {
                this.f462795f = true;
                com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
                java.lang.String b17 = b();
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                a4Var.a(b17, "", b52.b.b(), "person_page_buy", "");
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
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_buy", "");
        android.content.Intent intent = new android.content.Intent();
        r45.lk2 lk2Var = this.f462792e;
        if (lk2Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lk2Var.getCustom(37)) != null) {
            intent.putExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT", finderJumpInfo.toByteArray());
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f462791d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.lk2 lk2Var2 = this.f462792e;
        int integer = lk2Var2 != null ? lk2Var2.getInteger(29) : 0;
        r45.lk2 lk2Var3 = this.f462792e;
        int integer2 = lk2Var3 != null ? lk2Var3.getInteger(12) : 0;
        r45.lk2 lk2Var4 = this.f462792e;
        int integer3 = lk2Var4 != null ? lk2Var4.getInteger(33) : 0;
        r45.lk2 lk2Var5 = this.f462792e;
        int integer4 = lk2Var5 != null ? lk2Var5.getInteger(35) : 0;
        r45.lk2 lk2Var6 = this.f462792e;
        int integer5 = lk2Var6 != null ? lk2Var6.getInteger(36) : 0;
        ((c61.p2) ybVar).getClass();
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nk(context, intent, integer, integer2, integer3, integer4, integer5);
    }
}
