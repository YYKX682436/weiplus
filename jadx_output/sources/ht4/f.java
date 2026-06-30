package ht4;

/* loaded from: classes.dex */
public class f implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.ECardJsApiCheckEvent f284962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht4.g f284963b;

    public f(ht4.g gVar, com.tencent.mm.autogen.events.ECardJsApiCheckEvent eCardJsApiCheckEvent) {
        this.f284963b = gVar;
        this.f284962a = eCardJsApiCheckEvent;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreECard", "open process end: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.ECardJsApiCheckEvent eCardJsApiCheckEvent = this.f284962a;
        if (i17 == -1) {
            eCardJsApiCheckEvent.f54097h.f7009a = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "openEcard:ok");
        } else {
            eCardJsApiCheckEvent.f54097h.f7009a = -1;
            if (!h45.y.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "openEcard:fail");
            }
        }
        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.m4) eCardJsApiCheckEvent.f54096g.f6911l).run();
        if (!h45.y.c()) {
            h45.y.f278968a = null;
        }
        this.f284963b.f284964d = null;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        return intent;
    }
}
