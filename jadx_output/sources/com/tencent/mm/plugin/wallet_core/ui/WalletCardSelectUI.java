package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletCardSelectUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f179961s = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckedTextView f179964f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckedTextView f179965g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179966h;

    /* renamed from: m, reason: collision with root package name */
    public int f179968m;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.l3 f179972q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.base.MaxListView f179973r;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f179962d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f179963e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f179967i = 3;

    /* renamed from: n, reason: collision with root package name */
    public int f179969n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f179970o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f179971p = -1;

    public final void U6(boolean z17) {
        this.f179973r.setVisibility(0);
        if (z17) {
            this.f179964f.setChecked(true);
            this.f179965g.setChecked(false);
            com.tencent.mm.plugin.wallet_core.ui.l3 l3Var = this.f179972q;
            l3Var.f180401e = this.f179962d;
            l3Var.notifyDataSetChanged();
            this.f179973r.clearChoices();
            int i17 = this.f179969n;
            if (i17 < 0) {
                enableOptionMenu(false);
                return;
            } else {
                this.f179973r.setItemChecked(i17, true);
                enableOptionMenu(true);
                return;
            }
        }
        this.f179964f.setChecked(false);
        this.f179965g.setChecked(true);
        com.tencent.mm.plugin.wallet_core.ui.l3 l3Var2 = this.f179972q;
        l3Var2.f180401e = this.f179963e;
        l3Var2.notifyDataSetChanged();
        this.f179973r.clearChoices();
        int i18 = this.f179970o;
        if (i18 < 0) {
            enableOptionMenu(false);
        } else {
            this.f179973r.setItemChecked(i18, true);
            enableOptionMenu(true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5u;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179966h = getInput().getString("key_bank_type");
        this.f179968m = getInput().getInt("key_bankcard_type", 1);
        this.f179967i = getInput().getInt("key_support_bankcard", 1);
        this.f179971p = getInput().getInt("key_bind_scene", -1);
        this.f179973r = (com.tencent.mm.ui.base.MaxListView) findViewById(com.tencent.mm.R.id.mpt);
        this.f179964f = (android.widget.CheckedTextView) findViewById(com.tencent.mm.R.id.bta);
        this.f179965g = (android.widget.CheckedTextView) findViewById(com.tencent.mm.R.id.btb);
        com.tencent.mm.plugin.wallet_core.ui.l3 l3Var = new com.tencent.mm.plugin.wallet_core.ui.l3(this, this);
        this.f179972q = l3Var;
        this.f179973r.setAdapter((android.widget.ListAdapter) l3Var);
        this.f179973r.setOnItemClickListener(new com.tencent.mm.plugin.wallet_core.ui.e3(this));
        setBackBtn(new com.tencent.mm.plugin.wallet_core.ui.f3(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.wallet_core.ui.g3(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(false);
        this.f179964f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.h3(this));
        this.f179965g.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.i3(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kji);
        initView();
        ((java.util.LinkedList) this.f179963e).clear();
        ((java.util.LinkedList) this.f179962d).clear();
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.f13811b != null) {
            for (com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery : ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.f13811b) {
                if (this.f179971p == 5 && !elementQuery.R) {
                    elementQuery.f179665y = getString(com.tencent.mm.R.string.l1t);
                }
                if (2 == elementQuery.f179658r) {
                    ((java.util.LinkedList) this.f179963e).add(elementQuery);
                } else if (elementQuery.b()) {
                    ((java.util.LinkedList) this.f179962d).add(elementQuery);
                }
            }
        }
        if (this.f179967i == 3 && !this.f179963e.isEmpty()) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().t()) {
                java.util.Collections.sort(this.f179963e, new com.tencent.mm.plugin.wallet_core.ui.j3(this));
            } else {
                java.util.Collections.sort(this.f179963e, new com.tencent.mm.plugin.wallet_core.ui.k3(this));
            }
        }
        if (this.f179962d.isEmpty()) {
            int size = ((java.util.LinkedList) this.f179963e).size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                if (((com.tencent.mm.plugin.wallet_core.model.ElementQuery) ((java.util.LinkedList) this.f179963e).get(i17)).f179659s.equals(this.f179966h)) {
                    this.f179970o = i17;
                    U6(false);
                    enableOptionMenu(true);
                    break;
                }
                i17++;
            }
            if (this.f179970o < 0) {
                U6(false);
                enableOptionMenu(false);
            }
            this.f179964f.setVisibility(8);
            this.f179965g.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            this.f179965g.setCheckMarkDrawable(com.tencent.mm.R.drawable.axu);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179966h)) {
            this.f179964f.setChecked(false);
            this.f179965g.setChecked(false);
            this.f179973r.setVisibility(8);
            return;
        }
        if (this.f179968m == 2) {
            int size2 = ((java.util.LinkedList) this.f179963e).size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    break;
                }
                if (((com.tencent.mm.plugin.wallet_core.model.ElementQuery) ((java.util.LinkedList) this.f179963e).get(i18)).f179659s.equals(this.f179966h)) {
                    this.f179970o = i18;
                    U6(false);
                    enableOptionMenu(true);
                    break;
                }
                i18++;
            }
            if (this.f179970o < 0) {
                U6(false);
                enableOptionMenu(false);
                return;
            }
            return;
        }
        int size3 = ((java.util.LinkedList) this.f179962d).size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                break;
            }
            if (((com.tencent.mm.plugin.wallet_core.model.ElementQuery) ((java.util.LinkedList) this.f179962d).get(i19)).f179659s.equals(this.f179966h)) {
                this.f179969n = i19;
                U6(true);
                enableOptionMenu(true);
                break;
            }
            i19++;
        }
        if (this.f179969n < 0) {
            U6(false);
            enableOptionMenu(false);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ss4.z;
        return false;
    }
}
