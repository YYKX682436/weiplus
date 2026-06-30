package zw1;

/* loaded from: classes15.dex */
public class g1 implements ww1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476634a;

    public g1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476634a = collectMainUI;
    }

    public void a(boolean z17, r45.hw hwVar) {
        int i17 = 2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = hwVar == null ? "null" : java.lang.Integer.valueOf(hwVar.f376475d);
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "get from cgi: %s resp.retcode: %s", objArr);
        if (z17) {
            com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476634a;
            if (hwVar != null && hwVar.f376475d == 416) {
                collectMainUI.f96407u.setVisibility(4);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.CollectMainUI");
                bundle.putString("realname_verify_process_jump_plugin", "collect");
                zs4.q.d(this.f476634a, hwVar.f376475d, hwVar.f376476e, bundle, true, new zw1.f1(this), null, 1010, 2);
                return;
            }
            collectMainUI.t7();
            collectMainUI.f96407u.setVisibility(0);
            collectMainUI.L = hwVar.f376477f;
            int i18 = hwVar.f376478g;
            if (i18 == 0) {
                i17 = 0;
            } else if (i18 == 1) {
                i17 = 1;
            } else if (i18 != 2) {
                i17 = 3;
            }
            collectMainUI.Q = i17;
            collectMainUI.M = hwVar.f376479h;
            collectMainUI.f96415y1 = hwVar.f376484p;
            collectMainUI.f96417z1 = hwVar.f376485q;
            com.tencent.mm.plugin.collect.ui.CollectMainUI.a7(collectMainUI, hwVar.f376481m);
            collectMainUI.m7(hwVar.f376480i);
            collectMainUI.G1 = hwVar.f376486r;
            collectMainUI.H1 = hwVar.f376487s;
            collectMainUI.M1 = hwVar.f376489u;
            collectMainUI.T1 = hwVar.f376488t == 0;
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_BUSITYPE_INT_SYNC, java.lang.Integer.valueOf(collectMainUI.f96402p1));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_BUSIURL_STRING_SYNC, collectMainUI.f96412x1);
            collectMainUI.p7();
        }
    }
}
