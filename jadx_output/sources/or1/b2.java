package or1;

/* loaded from: classes8.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI f347458d;

    public b2(com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI receiveTemplateMsgMgrUI) {
        this.f347458d = receiveTemplateMsgMgrUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI receiveTemplateMsgMgrUI = this.f347458d;
        if (receiveTemplateMsgMgrUI.f94041f) {
            receiveTemplateMsgMgrUI.f94041f = false;
            gm0.j1.d().g(new lr1.i0(receiveTemplateMsgMgrUI.f94040e, com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI.f94038h));
        }
    }
}
