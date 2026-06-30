package com.tencent.mm.plugin.repairer.ui;

@kotlin.Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$resUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerResDownloadUI$resUpdateListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI f158071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairerResDownloadUI$resUpdateListener$1(com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.f158071d = repairerResDownloadUI;
        this.__eventId = 905296653;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI = this.f158071d;
        repairerResDownloadUI.d.append("========================\n");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        am.r2 r2Var = event.f54053g;
        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f7759a) : null);
        sb6.append(" subtype:");
        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f7760b) : null);
        sb6.append(" version:");
        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f7762d) : null);
        sb6.append(" updated:");
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.f7763e) : null);
        sb6.append(" fileSize:");
        sb6.append(com.tencent.mm.vfs.w6.k(r2Var != null ? r2Var.f7761c : null));
        sb6.append('\n');
        repairerResDownloadUI.d.append(sb6.toString());
        pm0.v.X(new vw3.o4(repairerResDownloadUI));
        return false;
    }
}
