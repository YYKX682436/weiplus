package fx3;

/* loaded from: classes10.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.m implements yz5.l {
    public v(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/monitor/RepairerMonitorState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fx3.r p07 = (fx3.r) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI repairerMonitorUI = (com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI) this.receiver;
        int i17 = com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorUI.d;
        repairerMonitorUI.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof fx3.g)) {
            repairerMonitorUI.setMMTitle(p07.f267148e);
        }
        j75.d dVar2 = p07.f298066d;
        if (dVar2 != null && (dVar2 instanceof fx3.i)) {
            android.widget.Toast.makeText((android.content.Context) repairerMonitorUI, (java.lang.CharSequence) ("RepairerMonitor(" + ((fx3.i) dVar2).f267140b.f267137d + ")Click"), 0).show();
        }
        j75.d dVar3 = p07.f298066d;
        if (dVar3 != null && (dVar3 instanceof fx3.k)) {
            android.widget.Toast.makeText((android.content.Context) repairerMonitorUI, (java.lang.CharSequence) ("RepairerMonitor(" + ((fx3.k) dVar3).f267141b.f267137d + ")LongClick"), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
