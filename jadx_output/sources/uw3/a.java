package uw3;

/* loaded from: classes11.dex */
public final class a extends jm0.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jm0.o featureService) {
        super(featureService);
        kotlin.jvm.internal.o.g(featureService, "featureService");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        final jm0.o oVar = this.f300267d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ConfigUpdatedEvent>(oVar) { // from class: com.tencent.mm.plugin.repairer.fsc.RepairerLogFSC$onAccountInit$1
            {
                this.__eventId = 320120113;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent) {
                com.tencent.mm.autogen.events.ConfigUpdatedEvent event = configUpdatedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!kotlin.jvm.internal.o.b(event.f54072g.f7126a, "clicfg_repairer_print_xlog")) {
                    return false;
                }
                uw3.a.this.getClass();
                if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigPrintXlog()) == 1) {
                    int i17 = com.tencent.mm.sdk.platformtools.Log.f192413a;
                    return false;
                }
                int i18 = com.tencent.mm.sdk.platformtools.Log.f192413a;
                return false;
            }
        }.alive();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigPrintXlog()) == 1) {
            int i17 = com.tencent.mm.sdk.platformtools.Log.f192413a;
        } else {
            int i18 = com.tencent.mm.sdk.platformtools.Log.f192413a;
        }
    }

    @Override // jm0.g
    public void S6() {
    }
}
