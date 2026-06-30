package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelfUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/wa;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSelfUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements zy2.wa {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 95;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.f50.class, com.tencent.mm.plugin.finder.viewmodel.component.iz.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.o8.class)), sr2.l5.class, hy2.f.class, d92.a2.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.o5.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.n5.class))});
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.finder.ui.ig(this));
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).V6();
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, getIntent().getStringExtra("key_ref_feed_dup_flag"), intExtra);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSelfUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 40, 1, false);
        jz5.l[] lVarArr = new jz5.l[7];
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        lVarArr[0] = new jz5.l("enterscene", java.lang.Integer.valueOf(finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0));
        lVarArr[1] = new jz5.l("finder_context_id", V6.getString(1));
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6.getString(2));
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        lVarArr[4] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        lVarArr[5] = new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(intExtra));
        lVarArr[6] = new jz5.l("source_feed_sessionbuffer", ek6);
        aVar.gk(this, kz5.c1.k(lVarArr));
    }
}
