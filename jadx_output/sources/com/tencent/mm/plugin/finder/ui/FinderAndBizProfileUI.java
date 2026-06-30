package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderAndBizProfileUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderAndBizProfileUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 370;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e5l;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.p1.e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class, sr2.l5.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class)));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        boolean b17 = com.tencent.mm.plugin.finder.assist.s7.f102538a.b(getContext());
        boolean z17 = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).aj() || ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).nj();
        if (b17 && z17) {
            setMMTitle(getContext().getString(com.tencent.mm.R.string.o8g));
        } else if (z17) {
            setMMTitle(getContext().getString(com.tencent.mm.R.string.f490728aj1));
        } else if (b17) {
            setMMTitle(getContext().getString(com.tencent.mm.R.string.clc));
        }
        setBackBtn(new com.tencent.mm.plugin.finder.ui.x0(this), 0);
        int i17 = (b17 && z17) ? 1 : z17 ? 2 : 0;
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.k(com.tencent.mm.R.id.ttp, new com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment(i17), null);
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        beginTransaction.k(com.tencent.mm.R.id.sjg, new com.tencent.mm.modelbiz.ui.BizProfileCardFragment(((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b, !b17), null);
        beginTransaction.e();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderAndBiz);
        aVar.gk(this, com.tencent.mm.plugin.finder.report.d2.f124994a.a(this, kz5.c1.l(new jz5.l("finder_username", xy2.c.e(this)), new jz5.l("bizuin", ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ai()), new jz5.l("page_account_type", java.lang.Integer.valueOf(i17)))));
        aVar.Tj(this, 12, 1, false);
    }
}
