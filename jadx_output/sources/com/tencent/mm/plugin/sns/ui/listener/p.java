package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class p extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169843d;

    public p(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169843d = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = this.f169843d.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            h1Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
            return false;
        }
        java.lang.String str = ((com.tencent.mm.plugin.sns.ui.i2) view.getTag()).f168550b;
        this.f169843d.f169809l.e(view, str, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str).getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$14");
        return true;
    }
}
