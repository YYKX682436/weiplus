package ww1;

/* loaded from: classes15.dex */
public class j2 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f450221d;

    public j2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent = (com.tencent.mm.autogen.events.ScanMaterialCodeEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanMaterialCodeListener", "scan material code type: %s", java.lang.Integer.valueOf(scanMaterialCodeEvent.f54731g.f8132c));
        am.us usVar = scanMaterialCodeEvent.f54731g;
        java.lang.ref.WeakReference weakReference = usVar.f8133d;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanMaterialCodeListener", "context has destroyed");
            ((e04.w0) usVar.f8134e).run();
        } else {
            android.content.Context context = (android.content.Context) usVar.f8133d.get();
            int i17 = usVar.f8132c;
            if (i17 == 0) {
                this.f450221d = com.tencent.mm.wallet_core.ui.b2.h(context, false, null);
                ww1.q1 q1Var = new ww1.q1(usVar.f8130a, usVar.f8131b);
                gm0.j1.d().a(1800, new ww1.h2(this, scanMaterialCodeEvent, context));
                gm0.j1.d().g(q1Var);
            } else if (i17 == 1) {
                this.f450221d = com.tencent.mm.wallet_core.ui.b2.h(context, false, null);
                xw1.e eVar = new xw1.e(usVar.f8130a, usVar.f8131b);
                gm0.j1.d().a(2811, new ww1.i2(this, scanMaterialCodeEvent, context));
                gm0.j1.d().g(eVar);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanMaterialCodeListener", "unknown type: %d", java.lang.Integer.valueOf(i17));
            }
        }
        return false;
    }
}
