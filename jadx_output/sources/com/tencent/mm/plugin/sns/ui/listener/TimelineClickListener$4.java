package com.tencent.mm.plugin.sns.ui.listener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TimelineClickListener$4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineClickListener$4(com.tencent.mm.plugin.sns.ui.listener.i iVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f169744d = iVar;
        this.__eventId = 730732294;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent timelinePlayClickAnimEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
        com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent timelinePlayClickAnimEvent2 = timelinePlayClickAnimEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "receive timeline play click anim event");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169744d;
        boolean z17 = true;
        if (com.tencent.mm.plugin.sns.ui.listener.i.o(iVar) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.listener.t0(this, timelinePlayClickAnimEvent2.f54892g.f8408a));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
        } else if (com.tencent.mm.plugin.sns.ui.listener.i.p(iVar) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.listener.v0(this, timelinePlayClickAnimEvent2.f54892g.f8408a));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
        return z17;
    }
}
