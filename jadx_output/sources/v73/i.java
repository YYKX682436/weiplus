package v73;

/* loaded from: classes9.dex */
public class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f433697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v73.j f433698e;

    public i(v73.j jVar, java.util.List list) {
        this.f433698e = jVar;
        this.f433697d = list;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        v73.j jVar = this.f433698e;
        jVar.f433701d.G = (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f433697d.get(i17);
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = jVar.f433701d;
        java.lang.String str = honeyPayCardManagerUI.f142260d;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = honeyPayCardManagerUI.G;
        com.tencent.mars.xlog.Log.i(str, "select bankcard: %s, %s", bankcard.field_bindSerial, bankcard.field_bankcardTypeName);
        honeyPayCardManagerUI.I = honeyPayCardManagerUI.H;
        r45.n75 n75Var = new r45.n75();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = honeyPayCardManagerUI.G;
        n75Var.f381134d = bankcard2.field_desc;
        n75Var.f381136f = bankcard2.field_bankcardType;
        n75Var.f381137g = bankcard2.field_bindSerial;
        n75Var.f381138h = bankcard2.field_bankcardTail;
        honeyPayCardManagerUI.H = n75Var;
        honeyPayCardManagerUI.Y6();
        com.tencent.mars.xlog.Log.i(honeyPayCardManagerUI.f142260d, "do modify pay way");
        r73.j jVar2 = new r73.j(honeyPayCardManagerUI.H, honeyPayCardManagerUI.M, honeyPayCardManagerUI.L);
        jVar2.K(honeyPayCardManagerUI);
        honeyPayCardManagerUI.doSceneProgress(jVar2, false);
    }
}
