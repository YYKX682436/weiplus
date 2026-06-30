package yj5;

/* loaded from: classes5.dex */
public final class b extends yj5.a {
    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454889n;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = talkerInfo.f460742a;
        com.tencent.mm.storage.a3 z07 = a17.z0(str);
        if (!context.f460717l.hasDestory && z07 != null) {
            boolean z17 = true;
            if (!com.tencent.mm.storage.z3.q4(str) ? z07.y0() != 2 : (z07.y0() & 1) != 1) {
                z17 = false;
            }
            int Ui = z17 ? ((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Ui(str, 0L) : 0;
            if (Ui > 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(new xj5.b(Ui));
                return linkedList;
            }
        }
        return null;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.f(ui6, tipsBarContext, this);
    }
}
