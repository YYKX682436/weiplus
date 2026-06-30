package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169842d;

    public o0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169842d = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
        if (view != null && (view.getTag() instanceof com.tencent.mm.protocal.protobuf.TimeLineObject)) {
            j45.l.g("favorite");
            contextMenu.add(0, 25, 0, com.tencent.mm.plugin.sns.ui.listener.i.e(this.f169842d).getString(com.tencent.mm.R.string.hjg));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.protocal.protobuf.TimeLineObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
            return false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "finderMediaMenuListener onbindOnSelectedView : %s", timeLineObject.Id);
        if (android.text.TextUtils.isEmpty(timeLineObject.Id)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo n17 = com.tencent.mm.plugin.sns.model.l4.Fj().n1(timeLineObject.Id);
        if (n17 != null) {
            this.f169842d.f169809l.e(view, n17.getLocalid(), timeLineObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$37");
        return true;
    }
}
