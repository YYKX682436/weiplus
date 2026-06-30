package uc4;

/* loaded from: classes4.dex */
public final class e0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.g0 f426391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426392e;

    public e0(uc4.g0 g0Var, android.content.Context context) {
        this.f426391d = g0Var;
        this.f426392e = context;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        j45.l.g("favorite");
        xc4.p c17 = this.f426391d.c();
        if ((((c17 == null || (h17 = c17.h1()) == null || (a90Var = h17.ContentObj) == null || (kv2Var = a90Var.f369844o) == null) ? 0 : kv2Var.getInteger(25)) & 4) > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        } else {
            menu.add(0, 25, 0, this.f426392e.getString(com.tencent.mm.R.string.hjg));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        kotlin.jvm.internal.o.g(view, "view");
        uc4.g0 g0Var = this.f426391d;
        xc4.p c17 = g0Var.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
            return false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = c17.h1();
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "finderMediaMenuListener onbindOnSelectedView : %s", h17.Id);
        if (android.text.TextUtils.isEmpty(h17.Id)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
            return false;
        }
        g0Var.e().e(view, c17.W0(), h17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        return true;
    }
}
