package dk5;

/* loaded from: classes9.dex */
public class t3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234915b;

    public t3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, ot0.q qVar) {
        this.f234915b = selectConversationUI;
        this.f234914a = qVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        ot0.q qVar = this.f234914a;
        int i17 = qVar.f348666i;
        if (i17 == 92 || i17 == 76) {
            return;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f348674k, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        java.lang.String wi7 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f348678l, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234915b;
        if (!com.tencent.mars.comm.NetStatusUtil.isMobile(selectConversationUI.getContext()) ? wi6 == null || wi6.length() <= 0 : wi7 != null && wi7.length() > 0) {
            wi6 = wi7;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", wi6);
        intent.putExtra("showShare", false);
        j45.l.j(selectConversationUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
