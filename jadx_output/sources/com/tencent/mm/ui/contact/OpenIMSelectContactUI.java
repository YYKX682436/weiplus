package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class OpenIMSelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public java.lang.String C;
    public java.lang.String E;
    public java.util.List F;
    public java.util.HashSet G;
    public java.util.HashSet H;
    public java.util.HashSet I;
    public int K;
    public int L;
    public boolean D = false;

    /* renamed from: J, reason: collision with root package name */
    public int f206533J = 0;
    public final boolean M = true;
    public final com.tencent.mm.ui.contact.la N = new com.tencent.mm.ui.contact.la();

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.H.remove(str);
            b7().notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.ui.contact.l8(this.C, this, this.F, com.tencent.mm.ui.contact.i5.d(this.L, 64), null);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.F, com.tencent.mm.ui.contact.i5.d(this.L, 64), this.A);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131081};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.E)) {
            this.E = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(this.C, "openim_acct_type_title", j41.a0.TYPE_WORDING);
        }
        if (!this.D) {
            return this.E;
        }
        return getString(com.tencent.mm.R.string.f490352sk) + this.E;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.a aVar;
        com.tencent.mm.storage.z3 z3Var;
        int i18;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("OpenIMSelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.a) || (z3Var = (aVar = (com.tencent.mm.ui.contact.item.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        java.lang.String d17 = aVar.B.d1();
        com.tencent.mars.xlog.Log.i("OpenIMSelectContactUI", "ClickUser=%s", d17);
        if (!com.tencent.mm.ui.contact.i5.d(this.L, 64)) {
            w7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{d17}), new java.util.ArrayList(0));
            return;
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.L, 131072) || this.f206533J + this.H.size() < getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
            if (!this.G.contains(d17)) {
                Y6();
                if (this.H.contains(d17)) {
                    this.H.remove(d17);
                } else {
                    this.H.add(d17);
                }
            }
        } else if (!this.G.contains(d17)) {
            Y6();
            if (this.H.contains(d17)) {
                this.H.remove(d17);
            } else {
                java.lang.String stringExtra = getIntent().getStringExtra("too_many_member_tip_string");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    stringExtra = getString(com.tencent.mm.R.string.ifp, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)));
                }
                db5.e1.t(getContext(), stringExtra, "", new com.tencent.mm.ui.contact.n8(this));
            }
        }
        x7();
        if (this.M && ((i18 = this.K) == 1 || i18 == 0)) {
            java.util.HashSet hashSet = this.G;
            int size = hashSet != null ? hashSet.size() : 0;
            java.util.HashSet hashSet2 = this.H;
            this.N.a(this, size + (hashSet2 != null ? hashSet2.size() : 0), com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatRoomInviteStartCount"), 0));
        }
        this.f206448f.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.C = getIntent().getStringExtra("openim_appid");
        this.E = getIntent().getStringExtra("titile");
        this.D = getIntent().getBooleanExtra("open_half_screen", false);
        this.K = getIntent().getIntExtra("list_type", -1);
        android.content.Intent intent = getIntent();
        com.tencent.mm.ui.contact.i5.e();
        this.L = intent.getIntExtra("list_attr", com.tencent.mm.ui.contact.i5.f206780a);
        this.f206533J = getIntent().getIntExtra("AlreadySelectOtherUserCount", 0);
        this.F = new java.util.ArrayList();
        this.H = new java.util.HashSet();
        this.I = new java.util.HashSet();
        this.G = new java.util.HashSet();
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.G.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.H.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
            this.I.addAll(this.H);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String stringExtra3 = getIntent().getStringExtra("block_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra3.split(",")));
        }
        java.util.HashSet hashSet2 = new java.util.HashSet(hashSet);
        hashSet2.addAll(com.tencent.mm.ui.contact.i5.b());
        hashSet2.addAll(c01.e2.i());
        ((java.util.ArrayList) this.F).addAll(hashSet2);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean k7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        hideActionbarLine();
        if (this.D) {
            int e17 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479704cz);
            getController().Q0(com.tencent.mm.ui.uk.d(getContext(), com.tencent.mm.R.raw.icons_outlined_arrow_down, getResources().getColor(com.tencent.mm.R.color.FG_0), com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479693cs), com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479671c8), getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3), e17, 0.5f * e17));
        }
        if (com.tencent.mm.ui.contact.i5.d(this.L, 64)) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.ui.contact.m8(this), null, com.tencent.mm.ui.fb.GREEN);
        }
        x7();
        java.util.Iterator it = this.H.iterator();
        while (it.hasNext()) {
        }
        this.f206450h.findViewById(com.tencent.mm.R.id.m7g).setBackground(null);
        this.f206450h.findViewById(com.tencent.mm.R.id.f486064k12).setBackgroundResource(com.tencent.mm.R.drawable.ahm);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.G.contains(str);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        java.lang.String str2;
        if (dVar.d() && (str2 = dVar.f206850s) != null) {
            return this.H.contains(str2);
        }
        if (dVar.f206839h && (str = dVar.f206850s) != null) {
            return this.H.contains(str);
        }
        if (dVar instanceof com.tencent.mm.ui.contact.item.d1) {
            return this.H.isEmpty();
        }
        return false;
    }

    public final boolean w7(java.util.List list, java.util.List list2) {
        com.tencent.mars.xlog.Log.i("OpenIMSelectContactUI", "handleSelect %s, cancel %s", list, list2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
        intent.putExtra("Cancel_Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(list2, ","));
        setResult(-1, intent);
        finish();
        return true;
    }

    public final void x7() {
        if (!com.tencent.mm.ui.contact.i5.d(this.L, 64) || this.H.size() <= 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490352sk));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490352sk) + "(" + this.H.size() + ")");
        int intExtra = getIntent().getIntExtra("min_limit_num", 0);
        if (!com.tencent.mm.ui.contact.i5.d(this.L, 262144)) {
            enableOptionMenu(1, true);
        } else if (this.H.size() >= intExtra) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }
}
