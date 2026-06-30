package y13;

/* loaded from: classes5.dex */
public final class p extends com.tencent.mm.sdk.event.n {
    public p() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoClearRecommendRecord();
        am.uq uqVar = event.f54679g;
        if (uqVar.f8125a != 2 || !kotlin.jvm.internal.o.b(uqVar.f8126b, "RepairerConfig_YuanBaoClearRecommendRecord")) {
            return false;
        }
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) jz5.h.b(y13.o.f458898d)).getValue()).clear();
        android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "已清除", 0).show();
        return true;
    }
}
