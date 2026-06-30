package v73;

/* loaded from: classes9.dex */
public class d implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433681a;

    public d(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f433681a = honeyPayCardManagerUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433681a;
        java.lang.String str = honeyPayCardManagerUI.f142260d;
        int i17 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.Y;
        com.tencent.mars.xlog.Log.i(honeyPayCardManagerUI.f142260d, "do modify notify");
        r73.i iVar = new r73.i(z17 ? 1 : 0);
        iVar.K(honeyPayCardManagerUI);
        honeyPayCardManagerUI.doSceneProgress(iVar, false);
    }
}
