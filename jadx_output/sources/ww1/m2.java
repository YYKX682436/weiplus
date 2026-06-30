package ww1;

/* loaded from: classes15.dex */
public final class m2 extends com.tencent.mm.sdk.event.n {
    public m2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.UniPcPayUseCaseEvent event = (com.tencent.mm.autogen.events.UniPcPayUseCaseEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("code url: ");
        am.pz pzVar = event.f54910g;
        sb6.append(pzVar.f7672a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPayCodeListener", sb6.toString());
        java.lang.ref.WeakReference weakReference = pzVar.f7682k;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanPayCodeListener", "context has destroyed");
            am.qz qzVar = event.f54911h;
            if (qzVar != null) {
                qzVar.f7754a = 2;
            }
            java.lang.Runnable runnable = pzVar.f7683l;
            if (runnable == null) {
                return false;
            }
            ((e04.s0) runnable).run();
            return false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("qrcode_url", pzVar.f7672a);
        bundle.putInt("pay_channel", pzVar.f7673b);
        bundle.putInt("pay_scene", pzVar.f7674c);
        bundle.putInt("qrcode_session_type", pzVar.f7675d);
        bundle.putString("qrcode_session_name", pzVar.f7676e);
        bundle.putString("qrcode_sender_name", pzVar.f7677f);
        bundle.putString("qrcode_timeline_objid", pzVar.f7678g);
        bundle.putInt("chat_type", pzVar.f7679h);
        bundle.putInt("send_type", pzVar.f7680i);
        bundle.putString("msg_svr_id", pzVar.f7681j);
        ((h45.q) i95.n0.c(h45.q.class)).startUniPcPay(bundle, new ww1.l2(event));
        return false;
    }
}
