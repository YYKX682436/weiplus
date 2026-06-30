package h05;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oi6 f277933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h05.i f277934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI f277935f;

    public g(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI, r45.oi6 oi6Var, h05.i iVar) {
        this.f277935f = wxGamePushSettingUI;
        this.f277933d = oi6Var;
        this.f277934e = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI = this.f277935f;
        r45.oi6 oi6Var = this.f277933d;
        h05.i iVar = this.f277934e;
        if (oi6Var == null) {
            int i17 = com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI.f188556i;
            wxGamePushSettingUI.getClass();
            iVar.a(false);
            return;
        }
        android.util.Pair pair = (android.util.Pair) wxGamePushSettingUI.f188560g.get(oi6Var);
        if (pair == null) {
            iVar.a(false);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(oi6Var);
        r45.ji6 ji6Var = new r45.ji6();
        ji6Var.f377844f = linkedList;
        ji6Var.f377842d = ((java.lang.Integer) pair.first).intValue();
        ji6Var.f377843e = (java.lang.String) pair.second;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(ji6Var);
        r45.d36 d36Var = new r45.d36();
        d36Var.f372051d = linkedList2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = d36Var;
        lVar.f70667d = 4642;
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamepluginappsvr/setuserswitch";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70665b = new r45.e36();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new h05.f(wxGamePushSettingUI, iVar), false);
    }
}
