package uc4;

/* loaded from: classes4.dex */
public final class q0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.t0 f426446d;

    public q0(uc4.t0 t0Var) {
        this.f426446d = t0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        uc4.t0 t0Var = this.f426446d;
        v17.setTag(t0Var.n());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = (com.tencent.mm.plugin.sns.ui.listener.h1) ((jz5.n) t0Var.f426434f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        h1Var.onCreateContextMenu(menu, v17, contextMenuInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
        return true;
    }
}
