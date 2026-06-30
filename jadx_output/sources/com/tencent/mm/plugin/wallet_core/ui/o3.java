package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class o3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f180550d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f180551e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180552f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.model.Orders f180553g;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.utils.m f180555i;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f180557n;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f180554h = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f180556m = true;

    public o3(android.content.Context context, java.util.ArrayList arrayList, int i17, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        this.f180553g = null;
        this.f180557n = false;
        this.f180550d = context;
        this.f180551e = arrayList;
        this.f180552f = i17;
        this.f180553g = orders;
        com.tencent.mm.plugin.wallet_core.utils.m mVar = new com.tencent.mm.plugin.wallet_core.utils.m();
        this.f180555i = mVar;
        mVar.c(context, this.f180551e);
        if (orders == null || orders.T != 1) {
            return;
        }
        this.f180557n = true;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard getItem(int i17) {
        if (this.f180557n) {
            return (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f180551e.get(i17);
        }
        int count = getCount();
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180553g;
        if (orders == null || !orders.G.equals("CFT")) {
            count--;
        }
        if (i17 < count) {
            return (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f180551e.get(i17);
        }
        return null;
    }

    public void c(java.util.ArrayList arrayList, boolean z17) {
        if (arrayList == null) {
            this.f180551e = new java.util.ArrayList();
        } else {
            this.f180551e = arrayList;
        }
        this.f180556m = z17;
        if (this.f180551e.size() > 0) {
            this.f180555i.c(this.f180550d, this.f180551e);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f180557n) {
            java.util.ArrayList arrayList = this.f180551e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180553g;
        int i17 = (orders == null || !orders.G.equals("CFT")) ? 1 : 0;
        java.util.ArrayList arrayList2 = this.f180551e;
        return arrayList2 != null ? i17 + arrayList2.size() : i17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet_core.ui.n3 n3Var;
        vr4.j0 j0Var;
        vr4.a aVar;
        vr4.j0 j0Var2;
        vr4.a aVar2;
        vr4.v0 v0Var;
        if (view == null) {
            view = android.view.View.inflate(this.f180550d, com.tencent.mm.R.layout.d5x, null);
            n3Var = new com.tencent.mm.plugin.wallet_core.ui.n3(this);
            n3Var.f180506a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
            n3Var.f180507b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ns9);
            n3Var.f180509d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.ad_);
            n3Var.f180508c = (com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout) view.findViewById(com.tencent.mm.R.id.f484339dy3);
            n3Var.f180510e = view.findViewById(com.tencent.mm.R.id.pgs);
            n3Var.f180511f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.aer);
            n3Var.f180512g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.k7j);
            n3Var.f180507b.setText("");
            view.setTag(n3Var);
        } else {
            n3Var = (com.tencent.mm.plugin.wallet_core.ui.n3) view.getTag();
        }
        if (i17 == getCount() - 1) {
            android.view.ViewGroup.LayoutParams layoutParams = n3Var.f180510e.getLayoutParams();
            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = 0;
                layoutParams2.bottomMargin = i65.a.b(this.f180550d, 16);
                n3Var.f180510e.setLayoutParams(layoutParams);
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = n3Var.f180510e.getLayoutParams();
            if (layoutParams3 instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.leftMargin = i65.a.b(this.f180550d, 40);
                layoutParams4.bottomMargin = 0;
                n3Var.f180510e.setLayoutParams(layoutParams3);
            }
        }
        n3Var.f180507b.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479232tk));
        n3Var.f180508c.setVisibility(8);
        com.tencent.mm.plugin.wallet_core.model.Bankcard item = getItem(i17);
        if (item == null) {
            n3Var.f180507b.setVisibility(8);
            n3Var.f180506a.setText(com.tencent.mm.R.string.f493589kv1);
            n3Var.f180509d.setVisibility(8);
            n3Var.f180512g.setVisibility(0);
            java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList<>();
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180553g;
            if (orders != null && (j0Var2 = orders.N) != null && (aVar2 = j0Var2.f439767u) != null && (v0Var = aVar2.f439674e) != null) {
                java.util.Iterator it = v0Var.f439808d.iterator();
                while (it.hasNext()) {
                    linkedList.add(((vr4.w0) it.next()).f439809d);
                }
            }
            if (this.f180556m && linkedList.size() > 0) {
                n3Var.f180508c.setVisibility(0);
                n3Var.f180507b.setVisibility(8);
                n3Var.f180508c.setWording(linkedList);
            }
        } else {
            n3Var.f180509d.setVisibility(0);
            n3Var.f180512g.setVisibility(8);
            n3Var.f180507b.setVisibility(0);
            n3Var.f180507b.setText("");
            if (item.A0()) {
                android.widget.TextView textView = n3Var.f180506a;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = this.f180550d;
                java.lang.String str = item.field_desc;
                float textSize = n3Var.f180506a.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            } else {
                n3Var.f180506a.setText(item.field_desc);
            }
            if (item.v0()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13999h;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bankcard.P2)) {
                    n3Var.f180506a.setText(bankcard.P2);
                } else if (bankcard.O2 >= 0.0d) {
                    n3Var.f180506a.setText(this.f180550d.getString(c01.z1.I() ? com.tencent.mm.R.string.kjr : com.tencent.mm.R.string.kjq, com.tencent.mm.wallet_core.ui.r1.m(bankcard.O2)));
                } else {
                    n3Var.f180506a.setText(this.f180550d.getText(com.tencent.mm.R.string.kmq));
                }
            } else if (item.D0()) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(item.P2)) {
                    double d17 = item.O2;
                    if (d17 >= 0.0d) {
                        n3Var.f180506a.setText(this.f180550d.getString(com.tencent.mm.R.string.kow, com.tencent.mm.wallet_core.ui.r1.m(d17)));
                    } else {
                        n3Var.f180506a.setText(this.f180550d.getText(com.tencent.mm.R.string.kmq));
                    }
                } else {
                    n3Var.f180506a.setText(item.P2);
                }
            }
            n3Var.f180507b.setVisibility(0);
            switch (item.t0(this.f180552f, this.f180553g)) {
                case 1:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.f493592kv4);
                    break;
                case 2:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.kv_);
                    break;
                case 3:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.kve);
                    break;
                case 4:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.kv6);
                    break;
                case 5:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.f493590kv2);
                    break;
                case 6:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.kv8);
                    break;
                case 7:
                    n3Var.f180507b.setText(com.tencent.mm.R.string.kvc);
                    break;
                case 8:
                    n3Var.f180507b.setText(item.field_forbidWord);
                    break;
                default:
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.field_tips)) {
                        n3Var.f180507b.setText(item.field_tips);
                        break;
                    } else {
                        n3Var.f180507b.setVisibility(8);
                        break;
                    }
            }
            java.lang.String charSequence = n3Var.f180507b.getText().toString();
            n3Var.f180506a.setTextColor(this.f180550d.getResources().getColor(com.tencent.mm.R.color.a0c));
            if (!isEnabled(i17)) {
                n3Var.f180506a.setTextColor(this.f180550d.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            }
            java.lang.String str2 = this.f180554h;
            if (str2 == null || !str2.equalsIgnoreCase(item.field_bindSerial)) {
                n3Var.f180511f.setVisibility(8);
            } else {
                n3Var.f180511f.setVisibility(0);
            }
            n3Var.f180509d.setTag(com.tencent.mm.R.id.pbo, null);
            n3Var.f180509d.setTag(null);
            n3Var.f180509d.setImageDrawable(null);
            n3Var.f180507b.setOnClickListener(null);
            if (item.v0()) {
                com.tencent.mm.plugin.wallet_core.utils.m mVar = this.f180555i;
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = n3Var.f180509d;
                mVar.getClass();
                if (cdnImageView != null) {
                    cdnImageView.setTag(com.tencent.mm.R.id.pbo, null);
                    cdnImageView.setImageResource(com.tencent.mm.R.drawable.ch9);
                }
            } else if (item.D0()) {
                this.f180555i.f(item, n3Var.f180509d);
            } else if (item.A0()) {
                n3Var.f180509d.setImageDrawable(m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(item.f179570i3)) {
                    n3Var.f180509d.setUseSdcardCache(true);
                    n3Var.f180509d.setImgSavedPath(dt4.b.f243228a);
                    n3Var.f180509d.b(item.f179570i3, 0, 0, com.tencent.mm.R.raw.honey_pay_bank_logo);
                }
            } else {
                this.f180555i.e(this.f180550d, item, n3Var.f180509d);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(item.field_forbid_title) && !com.tencent.mm.sdk.platformtools.t8.K0(item.field_forbid_url)) {
                java.lang.String str3 = charSequence + "  ";
                android.text.SpannableString spannableString = new android.text.SpannableString(str3 + item.field_forbid_title);
                n3Var.f180507b.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.m3(this));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.a_t)), str3.length(), str3.length() + item.field_forbid_title.length(), 34);
                n3Var.f180507b.setText(spannableString);
                n3Var.f180507b.setTag(item.field_forbid_url);
            } else if (this.f180556m && com.tencent.mm.sdk.platformtools.t8.K0(item.field_forbidWord) && com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                java.util.LinkedList<java.lang.String> linkedList2 = new java.util.LinkedList<>();
                com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f180553g;
                if (orders2 != null && (j0Var = orders2.N) != null && (aVar = j0Var.f439767u) != null) {
                    java.util.Iterator it6 = aVar.f439673d.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            vr4.c cVar = (vr4.c) it6.next();
                            if (cVar.f439705d.equals(item.field_bindSerial)) {
                                java.util.Iterator it7 = cVar.f439706e.iterator();
                                while (it7.hasNext()) {
                                    linkedList2.add(((vr4.d) it7.next()).f439707d);
                                }
                            }
                        }
                    }
                }
                if (linkedList2.size() > 0) {
                    n3Var.f180508c.setVisibility(0);
                    n3Var.f180507b.setVisibility(8);
                    n3Var.f180508c.setWording(linkedList2);
                }
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard item = getItem(i17);
        return item == null || item.t0(this.f180552f, this.f180553g) == 0;
    }
}
