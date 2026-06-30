package kc5;

/* loaded from: classes5.dex */
public final class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerActionMediaGroupClearUnreadDB();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_MediaGroup_ClearUnreadDB")) {
            return false;
        }
        c95.d.f39747a.c().deleteObjects();
        android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Clear", 0).show();
        return true;
    }
}
