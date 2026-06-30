package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169841d;

    public o(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169841d = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        java.lang.Object tag = view.getTag();
        boolean z17 = tag instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
        if (z17 || (tag instanceof com.tencent.mm.plugin.sns.storage.SnsInfo)) {
            com.tencent.mm.plugin.sns.storage.SnsInfo a17 = z17 ? com.tencent.mm.plugin.sns.storage.l1.a(((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) tag).f169264d) : tag instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? (com.tencent.mm.plugin.sns.storage.SnsInfo) tag : null;
            j45.l.g("favorite");
            com.tencent.mm.plugin.sns.storage.ADXml adXml = a17.getAdXml();
            com.tencent.mm.plugin.sns.storage.ADInfo s17 = com.tencent.mm.plugin.sns.ui.listener.i.s(this.f169841d, a17);
            if (adXml.isLinkAd()) {
                if (adXml.isLandingPagesAd()) {
                    contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (s17.adActionType == 0) {
                    contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                }
            }
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = a17.getLocalid();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                contextMenu.add(0, 18, 0, view.getContext().getString(com.tencent.mm.R.string.f490508x2));
            }
            if (a17 != null) {
                com.tencent.mm.plugin.sns.abtest.a.b(contextMenu, a17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) && !(view.getTag() instanceof com.tencent.mm.plugin.sns.storage.SnsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
            return false;
        }
        java.lang.Object tag = view.getTag();
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = tag instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder ? com.tencent.mm.plugin.sns.storage.l1.a(((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag()).f169264d) : tag instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? (com.tencent.mm.plugin.sns.storage.SnsInfo) tag : null;
        if (a17 != null) {
            this.f169841d.f169809l.e(view, a17.getLocalid(), a17.getTimeLine());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        return true;
    }
}
