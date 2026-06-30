package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class w1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148510d;

    public w1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        this.f148510d = mallIndexUIv2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148510d;
            if (i17 >= mallIndexUIv2.M.size()) {
                return;
            }
            at4.x0 x0Var = (at4.x0) mallIndexUIv2.M.get(i17);
            g4Var.f(i17, x0Var.f13987a);
            int i18 = x0Var.f13988b;
            if (i18 == 9) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23388, 1, 1);
            } else if (i18 == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23388, 1, 2);
            }
            i17++;
        }
    }
}
