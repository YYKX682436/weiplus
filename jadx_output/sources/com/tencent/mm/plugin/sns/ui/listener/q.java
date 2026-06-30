package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169845d;

    public q(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169845d = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
        j45.l.g("favorite");
        contextMenu.add(0, 24, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.y5)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
            return false;
        }
        java.lang.String str = ((com.tencent.mm.plugin.sns.ui.y5) view.getTag()).f171611c;
        this.f169845d.f169809l.e(view, str, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str).getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$15");
        return true;
    }
}
