package v73;

/* loaded from: classes2.dex */
public class c implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.k f433676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI f433677b;

    public c(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI honeyPayCardBackUI, r73.k kVar) {
        this.f433677b = honeyPayCardBackUI;
        this.f433676a = kVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pg5 pg5Var = this.f433676a.f393176r;
        r45.an6 an6Var = pg5Var.f383033m;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI honeyPayCardBackUI = this.f433677b;
        honeyPayCardBackUI.f142268o = an6Var;
        honeyPayCardBackUI.f142262f.setImageDrawable(m95.a.e(honeyPayCardBackUI.getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(pg5Var.f383036p)) {
            honeyPayCardBackUI.f142262f.b(pg5Var.f383036p, 0, 0, com.tencent.mm.R.raw.honey_pay_bank_logo);
        }
        honeyPayCardBackUI.f142265i.setText(pg5Var.f383034n);
        com.tencent.mm.wallet_core.ui.r1.t0(honeyPayCardBackUI.f142266m, pg5Var.f383029f, 10);
        honeyPayCardBackUI.f142263g.setText(u73.h.a(pg5Var.f383030g));
        honeyPayCardBackUI.f142264h.setText(honeyPayCardBackUI.getString(com.tencent.mm.R.string.fxa, com.tencent.mm.wallet_core.model.c2.b() + u73.h.a(pg5Var.f383031h)));
        u73.h.h(honeyPayCardBackUI, pg5Var.f383032i, honeyPayCardBackUI.f142267n, 1, honeyPayCardBackUI.f142268o);
        android.view.View findViewById = honeyPayCardBackUI.findViewById(com.tencent.mm.R.id.f485255h21);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayCardDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayCardDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
