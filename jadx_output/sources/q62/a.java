package q62;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtOpenApiCallEvent extOpenApiCallEvent = (com.tencent.mm.autogen.events.ExtOpenApiCallEvent) iEvent;
        if (!(extOpenApiCallEvent instanceof com.tencent.mm.autogen.events.ExtOpenApiCallEvent)) {
            com.tencent.mars.xlog.Log.f("ExtOpenApiCallEvent", "mismatched event");
            return false;
        }
        am.k8 k8Var = extOpenApiCallEvent.f54202g;
        if (k8Var == null) {
            com.tencent.mars.xlog.Log.e("ExtOpenApiCallEvent", "revent.data is null");
            return false;
        }
        int i17 = k8Var.f7130a;
        am.l8 l8Var = extOpenApiCallEvent.f54203h;
        if (i17 == 9 || i17 == 13) {
            l8Var.f7229a = new com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg(k8Var.f7132c, k8Var.f7130a, k8Var.f7131b).query(k8Var.f7133d, null, null, k8Var.f7134e, null);
        } else if (i17 == 3) {
            l8Var.f7229a = new com.tencent.mm.plugin.ext.provider.ExtControlProviderEntry(k8Var.f7132c, k8Var.f7130a, k8Var.f7131b).query(k8Var.f7133d, null, null, k8Var.f7134e, null);
        } else if (i17 == 29) {
            l8Var.f7229a = new com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl(k8Var.f7132c, k8Var.f7130a, k8Var.f7131b).query(k8Var.f7133d, null, null, k8Var.f7134e, null);
            android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
            if (!n62.k.f335196t) {
                d17.edit().putBoolean("hasCallVoiceControlApi", true).commit();
                n62.k.f335196t = true;
            }
        } else {
            l8Var.f7229a = new com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi(k8Var.f7132c, k8Var.f7130a, k8Var.f7131b, k8Var.f7135f).query(k8Var.f7133d, null, null, k8Var.f7134e, null);
        }
        return true;
    }
}
