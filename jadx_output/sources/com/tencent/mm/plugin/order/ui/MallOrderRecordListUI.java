package com.tencent.mm.plugin.order.ui;

/* loaded from: classes9.dex */
public class MallOrderRecordListUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f152853e;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f152852d = null;

    /* renamed from: f, reason: collision with root package name */
    public fp3.v f152854f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f152855g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f152856h = true;

    /* renamed from: i, reason: collision with root package name */
    public int f152857i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f152858m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f152859n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f152860o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f152861p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f152862q = new java.util.HashMap();

    public void U6() {
        addSceneEndListener(nd1.u0.CTRL_INDEX);
        addSceneEndListener(nd1.p1.CTRL_INDEX);
    }

    public void V6(java.lang.String str, java.lang.String str2, int i17) {
        doSceneProgress(new dp3.m(str, str2, i17));
    }

    public void W6() {
        doSceneProgress(new dp3.k(10, this.f152858m, this.f152859n));
    }

    public java.lang.String X6(int i17) {
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        return com.tencent.mm.wallet_core.ui.r1.q(i17, new java.text.SimpleDateFormat("MM-dd HH:mm"), new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm"));
    }

    public final java.lang.String Y6(int i17, int i18) {
        return i17 + "-" + i18;
    }

    public void Z6(java.util.List list) {
        boolean z17;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f152855g == null) {
            this.f152855g = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            dp3.o oVar = (dp3.o) list.get(i17);
            java.lang.String str = oVar.f242224d;
            if (!android.text.TextUtils.isEmpty(str)) {
                for (int i18 = 0; i18 < this.f152855g.size(); i18++) {
                    dp3.o oVar2 = (dp3.o) this.f152855g.get(i18);
                    if (oVar2 != null && str.equals(oVar2.f242224d)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                this.f152855g.add(oVar);
            }
        }
    }

    public void a7() {
        removeSceneEndListener(nd1.u0.CTRL_INDEX);
        removeSceneEndListener(nd1.p1.CTRL_INDEX);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bwl;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (com.tencent.mm.wallet_core.a.g(this) instanceof bp3.e) {
            this.f152861p = true;
            W6();
        }
        setMMTitle(com.tencent.mm.R.string.f492472gr5);
        this.f152853e = (com.tencent.mm.ui.base.MMLoadMoreListView) findViewById(com.tencent.mm.R.id.j_f);
        fp3.v vVar = new fp3.v(this);
        this.f152854f = vVar;
        this.f152853e.setAdapter((android.widget.ListAdapter) vVar);
        this.f152853e.setOnItemClickListener(new fp3.o(this));
        this.f152853e.setOnItemLongClickListener(new fp3.q(this));
        this.f152853e.setOnLoadMoreListener(new fp3.r(this));
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "6";
        walletGetBulletinEvent.f192364d = new fp3.s(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
        java.util.List list = bp3.f.wi().f23088g;
        if (list != null) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i17 >= arrayList.size()) {
                    break;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) arrayList.get(i17);
                if (weakReference != null) {
                    android.support.v4.media.f.a(weakReference.get());
                }
                i17++;
            }
        }
        this.f152854f.notifyDataSetChanged();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11036, java.lang.Integer.valueOf(bp3.f.wi().Ai().b()));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f152852d = new com.tencent.mm.sdk.platformtools.n3();
        U6();
        initView();
        this.f152858m = 0;
        this.f152859n = null;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        a7();
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        fp3.v vVar = this.f152854f;
        if (vVar != null) {
            vVar.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof dp3.k) {
            dp3.k kVar = (dp3.k) m1Var;
            this.f152859n = kVar.f242218g;
            Z6(kVar.f242215d);
            java.util.List list = kVar.f242216e;
            if (list != null) {
                int i19 = 0;
                while (true) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) list;
                    if (i19 >= linkedList.size()) {
                        break;
                    }
                    dp3.j jVar = (dp3.j) linkedList.get(i19);
                    if (jVar != null) {
                        ((java.util.HashMap) this.f152862q).put(Y6(jVar.f242212d, jVar.f242213e), jVar.f242214f);
                    }
                    i19++;
                }
            }
            int size = ((java.util.ArrayList) this.f152855g).size();
            this.f152857i = size;
            this.f152856h = kVar.f242217f > size;
            this.f152854f.notifyDataSetChanged();
            this.f152852d.post(new fp3.t(this));
            this.f152861p = false;
        } else if (m1Var instanceof dp3.m) {
            com.tencent.mm.protobuf.f fVar = ((dp3.m) m1Var).f242222e.f70710a.f70684a;
            if (((r45.w55) fVar).f388899d == 2) {
                java.util.List list2 = this.f152855g;
                if (list2 != null) {
                    ((java.util.ArrayList) list2).clear();
                }
                this.f152857i = 0;
                this.f152856h = false;
                this.f152853e.b();
            } else {
                java.lang.String str2 = ((r45.w55) fVar).f388900e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.util.Iterator it = ((java.util.ArrayList) this.f152855g).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        dp3.o oVar = (dp3.o) it.next();
                        if (str2.equals(oVar.f242224d)) {
                            ((java.util.ArrayList) this.f152855g).remove(oVar);
                            this.f152857i = ((java.util.ArrayList) this.f152855g).size();
                            break;
                        }
                    }
                }
            }
            this.f152852d.post(new fp3.u(this));
        }
        if (this.f152857i > 0 || ((java.util.ArrayList) this.f152855g).size() != 0) {
            showOptionMenu(true);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.dfu);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            showOptionMenu(false);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dfu);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
