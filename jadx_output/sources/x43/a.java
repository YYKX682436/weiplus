package x43;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.util.HashMap hashMap = com.tencent.mm.plugin.game.luggage.p1.f139865a;
        hashMap.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebCoreHelp", "MultiWebView-Trace destroy 1 webView for GameCenter");
        for (sd.o0 o0Var : hashMap.values()) {
            o0Var.k();
            pf.b bVar = o0Var.f406633i;
            if (bVar != null) {
                bVar.destroy();
            }
        }
        hashMap.clear();
        return false;
    }
}
