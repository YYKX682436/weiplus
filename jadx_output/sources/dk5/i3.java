package dk5;

/* loaded from: classes9.dex */
public class i3 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f234670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234672c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234675f;

    public i3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.util.HashMap hashMap, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Intent intent) {
        this.f234675f = selectConversationUI;
        this.f234670a = hashMap;
        this.f234671b = str;
        this.f234672c = str2;
        this.f234673d = str3;
        this.f234674e = intent;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        java.lang.Object obj;
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234675f;
        selectConversationUI.hideVKB();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandShareTextToGroup bOk:%b", java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = this.f234674e;
        if (!z17) {
            int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
            selectConversationUI.a8(0, intent);
            selectConversationUI.finish();
            return;
        }
        java.util.HashMap hashMap = this.f234670a;
        boolean a17 = c01.od.a(hashMap.get("useForChatTool"), false);
        boolean a18 = c01.od.a(hashMap.get("needShowEntrance"), false);
        c01.od.c(hashMap.get("entrancePath"), "");
        java.lang.String c17 = c01.od.c(hashMap.get("srcUsername"), "");
        ot0.q qVar = new ot0.q();
        qVar.f348654f = this.f234671b;
        qVar.f348666i = 1;
        qVar.f348722w = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandShareTextToGroup needShowEntrance:%b useForChatTool:%b", java.lang.Boolean.valueOf(a18), java.lang.Boolean.valueOf(a17));
        ot0.a aVar = new ot0.a();
        aVar.R = this.f234672c;
        if (a18) {
            p15.x xVar = new p15.x();
            xVar.fromXml(c01.od.c(hashMap.get("wxaInfo"), ""));
            aVar.P = xVar;
            qVar.f(aVar);
        }
        android.util.Pair I = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", this.f234673d, null, null);
        java.lang.Object obj2 = I.first;
        if (obj2 != null && (obj = I.second) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandShareTextToGroup result:%d %d", obj2, obj);
        }
        if (str != null && !str.isEmpty()) {
            tg3.a1 a19 = tg3.t1.a();
            java.lang.String str2 = this.f234673d;
            ((dk5.s5) a19).fj(str2, str, c01.e2.C(str2), 0);
        }
        int i19 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        selectConversationUI.a8(-1, intent);
        selectConversationUI.finish();
    }
}
