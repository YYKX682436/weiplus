package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class WalletLqtArriveTimeLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f177926d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f177927e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bn5 f177928f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.t f177929g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f177930h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f177931i;

    public WalletLqtArriveTimeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177926d = new java.util.ArrayList();
        this.f177927e = new java.util.ArrayList();
        this.f177930h = false;
        this.f177931i = new com.tencent.mm.plugin.wallet.balance.ui.lqt.s(this);
    }

    public final void a() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.t tVar = this.f177929g;
        if (tVar != null) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.k6 k6Var = (com.tencent.mm.plugin.wallet.balance.ui.lqt.k6) tVar;
            k6Var.getClass();
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
            k6Var.f178240a.Z6(true);
        }
    }

    public void b(java.util.List list, boolean z17) {
        this.f177930h = true;
        java.util.List list2 = this.f177926d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        java.util.List list3 = this.f177927e;
        ((java.util.ArrayList) list3).clear();
        removeAllViews();
        setVisibility(0);
        if (list2 == null || ((java.util.ArrayList) list2).isEmpty()) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.bn5 bn5Var = (r45.bn5) it.next();
            android.view.View view = (android.widget.LinearLayout) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489628d73, (android.view.ViewGroup) this, false);
            com.tencent.mm.plugin.wallet.balance.ui.lqt.u uVar = new com.tencent.mm.plugin.wallet.balance.ui.lqt.u(null);
            uVar.f178388d = view;
            uVar.f178385a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ixh);
            uVar.f178386b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ixg);
            uVar.f178387c = (android.widget.RadioButton) view.findViewById(com.tencent.mm.R.id.ixj);
            uVar.f178385a.setText(bn5Var.f370897e);
            if (com.tencent.mm.sdk.platformtools.t8.K0(bn5Var.f370898f)) {
                uVar.f178386b.setVisibility(8);
            } else {
                uVar.f178386b.setText(bn5Var.f370898f);
            }
            if (this.f177928f != null) {
                int i18 = this.f177928f.f370896d;
            }
            if (z17) {
                r45.bn5 bn5Var2 = this.f177928f;
                if (bn5Var2 != null && bn5Var2.f370896d == bn5Var.f370896d) {
                    uVar.f178387c.setChecked(true);
                }
            } else if (i17 == 0) {
                uVar.f178387c.setChecked(true);
                this.f177928f = bn5Var;
            }
            uVar.f178389e = i17;
            view.setTag(uVar);
            view.setOnClickListener(this.f177931i);
            ((java.util.ArrayList) list3).add(new java.lang.ref.WeakReference(uVar));
            addView(view);
            i17++;
        }
    }

    public void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "input money: %s", str);
        java.util.List list = this.f177926d;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.isEmpty()) {
                return;
            }
            this.f177928f = null;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f177927e;
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference.get() != null) {
                    ((com.tencent.mm.plugin.wallet.balance.ui.lqt.u) weakReference.get()).f178387c.setEnabled(true);
                    ((com.tencent.mm.plugin.wallet.balance.ui.lqt.u) weakReference.get()).f178387c.setChecked(false);
                }
            }
            int i07 = com.tencent.mm.wallet_core.ui.r1.i0(str, "100");
            java.util.Iterator it6 = arrayList.iterator();
            int i17 = 0;
            while (it6.hasNext()) {
                r45.bn5 bn5Var = (r45.bn5) it6.next();
                int i18 = bn5Var.f370899g;
                if (i18 < 0 || i07 <= i18) {
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.u uVar = (com.tencent.mm.plugin.wallet.balance.ui.lqt.u) ((java.lang.ref.WeakReference) arrayList2.get(i17)).get();
                    if (uVar != null) {
                        uVar.f178387c.setEnabled(true);
                        uVar.f178385a.setEnabled(true);
                        uVar.f178386b.setEnabled(true);
                        uVar.f178388d.setEnabled(true);
                        if (this.f177928f == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "auto select type: %s", java.lang.Integer.valueOf(bn5Var.f370896d));
                            uVar.f178387c.setChecked(true);
                            this.f177928f = bn5Var;
                            a();
                            if (i17 > 0) {
                                uVar.f178385a.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479206su));
                            } else {
                                uVar.f178385a.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColorStateList(com.tencent.mm.R.color.a_z));
                            }
                        } else {
                            uVar.f178385a.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColorStateList(com.tencent.mm.R.color.a_z));
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "disable item: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bn5Var.f370899g));
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.u uVar2 = (com.tencent.mm.plugin.wallet.balance.ui.lqt.u) ((java.lang.ref.WeakReference) arrayList2.get(i17)).get();
                    if (uVar2 != null) {
                        uVar2.f178387c.setChecked(false);
                        uVar2.f178387c.setEnabled(false);
                        uVar2.f178385a.setEnabled(false);
                        uVar2.f178386b.setEnabled(false);
                        uVar2.f178388d.setEnabled(false);
                        this.f177928f = null;
                        a();
                    }
                }
                i17++;
            }
        }
    }

    public java.util.List<r45.bn5> getRedeemTypeList() {
        return this.f177926d;
    }

    public r45.bn5 getSelectRedeemType() {
        return this.f177928f;
    }

    public void setCallback(com.tencent.mm.plugin.wallet.balance.ui.lqt.t tVar) {
        this.f177929g = tVar;
    }

    public WalletLqtArriveTimeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f177926d = new java.util.ArrayList();
        this.f177927e = new java.util.ArrayList();
        this.f177930h = false;
        this.f177931i = new com.tencent.mm.plugin.wallet.balance.ui.lqt.s(this);
    }
}
