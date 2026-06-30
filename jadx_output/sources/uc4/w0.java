package uc4;

/* loaded from: classes4.dex */
public final class w0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.y0 f426461d;

    public w0(uc4.y0 y0Var) {
        this.f426461d = y0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.i2 i2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        uc4.y0 y0Var = this.f426461d;
        y0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        xc4.p c17 = y0Var.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
            i2Var = null;
        } else {
            com.tencent.mm.plugin.sns.ui.i2 i2Var2 = new com.tencent.mm.plugin.sns.ui.i2(c17.h1(), c17.W0());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
            i2Var = i2Var2;
        }
        v17.setTag(i2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = (com.tencent.mm.plugin.sns.ui.listener.h1) ((jz5.n) y0Var.f426434f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        h1Var.onCreateContextMenu(menu, v17, contextMenuInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
        kotlin.jvm.internal.o.g(view, "view");
        uc4.y0 y0Var = this.f426461d;
        xc4.p c17 = y0Var.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
            return false;
        }
        y0Var.e().e(view, c17.W0(), c17.h1());
        view.setTag(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveOtherClick$linkMenuListner$2$1");
        return true;
    }
}
