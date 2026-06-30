package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyExclusiveSelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI implements np5.f {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f146116J = 0;
    public java.lang.String C;
    public java.lang.String D;
    public int G;
    public final java.util.List E = new java.util.ArrayList();
    public java.util.List F = new java.util.ArrayList();
    public np5.b0 H = null;
    public java.lang.String[] I = null;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "user WalletSelectContactAdapter:%s", java.lang.Boolean.TRUE);
        com.tencent.mm.wallet_core.ui.c2 c2Var = new com.tencent.mm.wallet_core.ui.c2();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.F, ",");
        kotlin.jvm.internal.o.g(c17, "<set-?>");
        c2Var.f214122b = c17;
        java.lang.String str = this.C;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        c2Var.f214123c = str;
        c2Var.f214121a = true;
        return new com.tencent.mm.wallet_core.ui.e2(this, this.E, true, false, c2Var);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.lang.String str = this.C;
        java.util.HashSet hashSet = new java.util.HashSet(this.E);
        ((qd0.y0) j1Var).getClass();
        return new com.tencent.mm.ui.contact.e5(this, str, 11, false, hashSet);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_title");
        return !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? stringExtra : getString(com.tencent.mm.R.string.glt);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "handleItemClick: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.contact.item.d item = b7().getItem(i17 - this.f206446d.getHeaderViewsCount());
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f206850s;
        boolean z17 = true;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (com.tencent.mm.storage.z3.m4(str2)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0()))) {
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                java.lang.String str3 = this.C;
                ((l41.q2) b0Var).getClass();
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                if (n18.X4() && com.tencent.mm.storage.z3.m4(n18.d1())) {
                    com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                    if (n18.r2() || str3 == null) {
                        str3 = "";
                    }
                    r1Var.g(new l41.x(str2, str3, ""));
                }
            }
        }
        java.lang.String str4 = item.f206850s;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str5 = this.C;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str4, str5);
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.String str6 = (java.lang.String) it.next();
            if (!str6.equals(str4)) {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str7 = this.C;
                ((sg3.a) v0Var2).getClass();
                if (f17.equals(c01.a2.f(str6, str7))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "find same display name: %s", f17);
                    break;
                }
            }
        }
        if (!z17) {
            w7(item.f206850s);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_same_name_tips");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            stringExtra = getString(com.tencent.mm.R.string.gkq);
        }
        db5.e1.H(getContext(), stringExtra, "", false, new com.tencent.mm.plugin.luckymoney.ui.h4(this, item), new com.tencent.mm.plugin.luckymoney.ui.i4(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        java.lang.String[] strArr = this.I;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f206447e.setAlphabet(strArr);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        np5.b0 b0Var = new np5.b0(this, this);
        this.H = b0Var;
        b0Var.c(4465);
        this.C = getIntent().getStringExtra("chatroomName");
        this.G = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        ((java.util.ArrayList) this.E).add(c01.z1.r());
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.C);
        this.F = L0;
        if (L0 != null) {
            L0.remove(c01.z1.r());
        }
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.H.i(4465);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
        updateSearchIndexAtOnceEvent.e();
    }

    @Override // np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        if ((m1Var instanceof com.tencent.mm.plugin.remittance.model.j) && i17 == 0 && i18 == 0) {
            r45.xx xxVar = ((com.tencent.mm.plugin.remittance.model.j) m1Var).f156861r;
            if (xxVar.f390567d == 268492929) {
                java.lang.String str2 = xxVar.f390568e;
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = getString(com.tencent.mm.R.string.l0g);
                }
                db5.e1.G(this, str2, null, false, new com.tencent.mm.plugin.luckymoney.ui.j4(this));
                return;
            }
        }
        x7();
    }

    public final void w7(java.lang.String str) {
        this.D = str;
        if (!com.tencent.mm.storage.z3.m4(str) || this.G != 31) {
            x7();
        } else {
            this.H.d(new com.tencent.mm.plugin.remittance.model.j(str, this.C), true);
        }
    }

    public final void x7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.D)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "selectedUsername is null");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", this.D);
        setResult(-1, intent);
        finish();
    }
}
