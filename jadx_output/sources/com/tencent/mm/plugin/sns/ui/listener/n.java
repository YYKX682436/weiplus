package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169839d;

    public n(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169839d = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
    
        if ((com.tencent.mm.plugin.sns.ui.listener.i.e(r8) instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) != false) goto L52;
     */
    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ContextMenu r29, android.view.View r30, android.view.ContextMenu.ContextMenuInfo r31) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.listener.n.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.go) && !(view.getTag(com.tencent.mm.R.id.r0u) instanceof com.tencent.mm.plugin.sns.ui.go)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.go goVar = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.go ? (com.tencent.mm.plugin.sns.ui.go) view.getTag() : view.getTag(com.tencent.mm.R.id.r0u) instanceof com.tencent.mm.plugin.sns.ui.go ? (com.tencent.mm.plugin.sns.ui.go) view.getTag(com.tencent.mm.R.id.r0u) : null;
        if (goVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "onbindOnSelectedView: snsPostDescInfo = null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        java.lang.String str = goVar.f168446b;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = Fj.k1(str);
        java.lang.String str2 = goVar.f168445a;
        if (k17 == null) {
            k17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str2);
        }
        if (k17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "onbindOnSelectedView: desc failed, snsId:%s, localId:%s", str2, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
            return false;
        }
        this.f169839d.f169809l.e(view, k17.getLocalid(), k17.getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$11");
        return true;
    }
}
