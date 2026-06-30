package com.tencent.mm.plugin.sns.ui.listener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TimelineClickListener$5 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineClickListener$5(com.tencent.mm.plugin.sns.ui.listener.i iVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f169745d = iVar;
        this.__eventId = -548976483;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent timelinePlayBackAnimEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent timelinePlayBackAnimEvent2 = timelinePlayBackAnimEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "receive timeline back anim event");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169745d;
        boolean z17 = true;
        if (com.tencent.mm.plugin.sns.ui.listener.i.q(iVar) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.listener.z0(this, timelinePlayBackAnimEvent2.f54891g.f8328a));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        } else if (com.tencent.mm.plugin.sns.ui.listener.i.r(iVar) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.listener.b1(this, timelinePlayBackAnimEvent2.f54891g.f8328a));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        return z17;
    }
}
