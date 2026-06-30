package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class WalletLqtPlanHomeUI extends com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f178023s = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f178024e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f178025f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f178026g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f178027h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f178028i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f178029m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f178030n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet.balance.model.lqt.y1 f178031o = (com.tencent.mm.plugin.wallet.balance.model.lqt.y1) this.f177946d.a(this, com.tencent.mm.plugin.wallet.balance.model.lqt.y1.class);

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.b5 f178032p = new com.tencent.mm.plugin.wallet.balance.ui.lqt.b5(this, null);

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f178033q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int f178034r;

    public final void U6(boolean z17) {
        com.tencent.mm.plugin.wallet.balance.model.lqt.c0 c0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.c0();
        c0Var.f213885c = new com.tencent.mm.plugin.wallet.balance.model.lqt.r();
        c0Var.c(new com.tencent.mm.plugin.wallet.balance.ui.lqt.x4(this, z17), true);
    }

    public final void V6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "go to add plan ui -> add");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.class);
        intent.putExtra("key_mode", 1);
        startActivityForResult(intent, i17);
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "show null plan home ui");
        setMMTitle(getString(com.tencent.mm.R.string.kqr));
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ixa);
        this.f178028i = relativeLayout;
        relativeLayout.setVisibility(0);
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ix_)).setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v4(this));
    }

    public final void X6(r45.m85 m85Var) {
        if (m85Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "resp is null");
            finish();
            return;
        }
        java.util.LinkedList linkedList = m85Var.f380240f;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "show empty view");
            if (this.f178034r != 3) {
                finish();
                return;
            }
            W6();
            this.f178033q = linkedList;
            this.f178032p.notifyDataSetChanged();
            this.f178030n.setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(m85Var.f380245n)) {
            setMMTitle("");
        } else {
            setMMTitle(m85Var.f380245n);
        }
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
        this.f178026g.setVisibility(8);
        this.f178024e.setVisibility(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "limit: %s", java.lang.Long.valueOf(m85Var.f380241g));
        this.f178030n.setVisibility(0);
        if (m85Var.f380241g <= linkedList.size()) {
            android.view.View findViewById = this.f178030n.findViewById(com.tencent.mm.R.id.f485737iu4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) this.f178030n.findViewById(com.tencent.mm.R.id.f485738iu5);
            textView.setPadding(i65.a.b(getContext(), 24), 0, 0, 0);
            textView.setText(m85Var.f380244m);
            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479232tk));
            this.f178030n.setEnabled(false);
        } else {
            android.view.View findViewById2 = this.f178030n.findViewById(com.tencent.mm.R.id.f485737iu4);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = (android.widget.TextView) this.f178030n.findViewById(com.tencent.mm.R.id.f485738iu5);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setText(com.tencent.mm.R.string.kol);
            textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            this.f178030n.setEnabled(true);
        }
        this.f178033q = linkedList;
        this.f178032p.notifyDataSetChanged();
        r45.rd rdVar = m85Var.f380243i;
        if (rdVar == null || com.tencent.mm.sdk.platformtools.t8.K0(rdVar.f384735d)) {
            this.f178027h.setVisibility(8);
            return;
        }
        this.f178029m.setText(m85Var.f380243i.f384735d);
        this.f178027h.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.w4(this, m85Var));
        this.f178027h.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.btr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178024e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.it7);
        this.f178025f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485729it2);
        this.f178026g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f485731it4);
        this.f178027h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.iuu);
        this.f178029m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iuv);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.b5 b5Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.b5(this, null);
        this.f178032p = b5Var;
        this.f178024e.setAdapter((android.widget.ListAdapter) b5Var);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.btq, (android.view.ViewGroup) this.f178024e, false);
        this.f178030n = viewGroup;
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.u4(this));
        this.f178024e.addFooterView(this.f178030n);
        this.f178025f.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.s4(this));
        this.f178024e.setOnItemClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t4(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 5 && i18 == -1) {
            i17 = intent.getIntExtra("oper_type", -1);
        }
        this.f178034r = i17;
        if (i17 != 1 && i17 != 2 && i17 != 3) {
            switch (i17) {
                case 65281:
                    if (i18 == -1) {
                        U6(false);
                        break;
                    }
                    break;
                case 65282:
                    if (i18 != -1) {
                        finish();
                        break;
                    } else {
                        U6(false);
                        break;
                    }
                case 65283:
                    if (i18 == -1) {
                        U6(false);
                        this.f178028i.setVisibility(8);
                        break;
                    }
                    break;
            }
        } else if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("encrypt_pwd");
            int intExtra = intent.getIntExtra("oper_type", -1);
            int intExtra2 = intent.getIntExtra("plan_id", -1);
            android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null);
            com.tencent.mm.plugin.wallet.balance.model.lqt.x1 x1Var = this.f178031o.f177752b;
            x1Var.getClass();
            ((km5.q) ((km5.q) km5.u.g(java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), stringExtra)).n(x1Var).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.a5(this, e17))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.y4(this, e17));
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        setStatusColor();
        hideActionbarLine();
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, 0);
        initView();
        int intExtra = getIntent().getIntExtra("key_plan_go_scene_ui", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "WalletLqtPlanHomeUI scene：%s", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 1) {
            V6(65282);
            return;
        }
        if (intExtra == 2) {
            W6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "go to plan home ui");
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_plan_index_resp");
        if (parcelableExtra instanceof com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel) {
            X6(com.tencent.mm.plugin.wallet.balance.model.lqt.r.t((com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel) parcelableExtra));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "parcelable no instanceof CgiLqtPlanIndex.PlanIndexParcel");
            finish();
        }
    }
}
