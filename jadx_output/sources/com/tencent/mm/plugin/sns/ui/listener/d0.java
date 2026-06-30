package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169768d;

    public d0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169768d = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        if ((com.tencent.mm.plugin.sns.ui.listener.i.e(r7) instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) != false) goto L50;
     */
    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ContextMenu r32, android.view.View r33, android.view.ContextMenu.ContextMenuInfo r34) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.listener.d0.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(((com.tencent.mm.plugin.sns.ui.u1) view.getTag()).f170554b);
        this.f169768d.f169809l.e(view, b17.getLocalid(), b17.getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$26");
        return true;
    }
}
