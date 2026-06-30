package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class c extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f178617d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f178618e;

    /* renamed from: f, reason: collision with root package name */
    public int f178619f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.utils.m f178620g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f178621h;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh);
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh);
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh);
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh);
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh);
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyh);
    }

    public c(android.content.Context context, java.util.ArrayList arrayList) {
        this.f178617d = context;
        this.f178618e = arrayList;
        com.tencent.mm.plugin.wallet_core.utils.m mVar = new com.tencent.mm.plugin.wallet_core.utils.m();
        this.f178620g = mVar;
        mVar.c(context, this.f178618e);
        d();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard getItem(int i17) {
        if (i17 < 0 || i17 >= this.f178619f) {
            return null;
        }
        return (com.tencent.mm.plugin.wallet_core.model.Bankcard) this.f178618e.get(i17);
    }

    public void c(java.util.ArrayList arrayList) {
        this.f178618e = arrayList;
        if (arrayList != null) {
            this.f178619f = arrayList.size();
        } else {
            this.f178619f = 0;
        }
        if (this.f178619f > 0) {
            this.f178620g.c(this.f178617d, this.f178618e);
        }
        d();
    }

    public final void d() {
        gm0.j1.i();
        this.f178621h = com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC, "")).split(","));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f178619f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard item = getItem(i17);
        if (item == null) {
            return 4;
        }
        if (item.field_bankcardState == 9) {
            return item.field_wxcreditState == 0 ? 2 : 3;
        }
        if (item.F0() && "CITIC_CREDIT".equals(item.field_bankcardType)) {
            return 5;
        }
        if (item.A0()) {
            return 6;
        }
        return (!item.y0() || c01.z1.I()) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17;
        com.tencent.mm.plugin.wallet.bind.ui.b bVar;
        com.tencent.mm.plugin.wallet.bind.ui.b bVar2;
        com.tencent.mm.plugin.wallet.bind.ui.b bVar3;
        com.tencent.mm.plugin.wallet_core.model.Bankcard item = getItem(i17);
        if (item == null) {
            return view;
        }
        int itemViewType = getItemViewType(i17);
        java.util.List list = this.f178621h;
        if (list != null && !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) this.f178621h).iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).equals(item.field_bindSerial)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        android.content.Context context = this.f178617d;
        switch (itemViewType) {
            case 0:
                return gt4.q.a(this.f178617d, view, item, com.tencent.mm.R.layout.d5f, this.f178620g, z17, itemViewType);
            case 1:
                return gt4.q.a(this.f178617d, view, item, com.tencent.mm.R.layout.d5k, this.f178620g, z17, itemViewType);
            case 2:
                if (view == null || view.getTag() == null) {
                    view = android.view.View.inflate(context, com.tencent.mm.R.layout.d5n, null);
                    bVar = new com.tencent.mm.plugin.wallet.bind.ui.b(this);
                    bVar.f178611e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ad_);
                    bVar.f178607a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.adf);
                    bVar.f178613g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k9r);
                    view.setTag(bVar);
                } else {
                    bVar = (com.tencent.mm.plugin.wallet.bind.ui.b) view.getTag();
                }
                bVar.f178607a.setText(context.getString(com.tencent.mm.R.string.kmw, item.field_bankName));
                if (com.tencent.mm.plugin.wallet.bind.ui.d.a(item)) {
                    bVar.f178613g.setVisibility(0);
                } else {
                    bVar.f178613g.setVisibility(8);
                }
                return view;
            case 3:
                if (view == null || view.getTag() == null) {
                    view = android.view.View.inflate(context, com.tencent.mm.R.layout.d5p, null);
                    com.tencent.mm.plugin.wallet.bind.ui.b bVar4 = new com.tencent.mm.plugin.wallet.bind.ui.b(this);
                    bVar4.f178611e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ad_);
                    bVar4.f178607a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.adf);
                    bVar4.f178612f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aed);
                    view.setTag(bVar4);
                    bVar2 = bVar4;
                } else {
                    bVar2 = (com.tencent.mm.plugin.wallet.bind.ui.b) view.getTag();
                }
                int i18 = item.field_wxcreditState;
                if (i18 == 1) {
                    bVar2.f178612f.setBackgroundResource(com.tencent.mm.R.drawable.chm);
                    bVar2.f178612f.setVisibility(0);
                } else if (i18 != 3) {
                    bVar2.f178612f.setVisibility(8);
                } else {
                    bVar2.f178612f.setBackgroundResource(com.tencent.mm.R.drawable.chd);
                    bVar2.f178612f.setVisibility(0);
                }
                bVar2.f178607a.setText(item.field_bankName);
                this.f178620g.e(context, item, bVar2.f178611e);
                return view;
            case 4:
                return android.view.View.inflate(context, com.tencent.mm.R.layout.d5g, null);
            case 5:
                return gt4.q.a(this.f178617d, view, item, com.tencent.mm.R.layout.d5o, this.f178620g, z17, itemViewType);
            case 6:
                if (view == null || view.getTag() == null) {
                    view = android.view.View.inflate(context, com.tencent.mm.R.layout.d5i, null);
                    com.tencent.mm.plugin.wallet.bind.ui.b bVar5 = new com.tencent.mm.plugin.wallet.bind.ui.b(this);
                    bVar5.f178611e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ad_);
                    bVar5.f178607a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.adf);
                    bVar5.f178608b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aex);
                    bVar5.f178612f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aed);
                    bVar5.f178614h = (com.tencent.mm.wallet_core.ui.WalletTextView) view.findViewById(com.tencent.mm.R.id.pam);
                    bVar5.f178610d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.aen);
                    bVar5.f178615i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pan);
                    bVar5.f178609c = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.pap);
                    view.setTag(bVar5);
                    bVar3 = bVar5;
                } else {
                    bVar3 = (com.tencent.mm.plugin.wallet.bind.ui.b) view.getTag();
                }
                bVar3.f178611e.setImageDrawable(m95.a.e(context.getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
                if ((bVar3.f178611e instanceof com.tencent.mm.pluginsdk.ui.applet.CdnImageView) && !com.tencent.mm.sdk.platformtools.t8.K0(item.f179570i3)) {
                    ((com.tencent.mm.pluginsdk.ui.applet.CdnImageView) bVar3.f178611e).setUseSdcardCache(true);
                    ((com.tencent.mm.pluginsdk.ui.applet.CdnImageView) bVar3.f178611e).setImgSavedPath(dt4.b.f243228a);
                    ((com.tencent.mm.pluginsdk.ui.applet.CdnImageView) bVar3.f178611e).b(item.f179570i3, 0, 0, com.tencent.mm.R.raw.honey_pay_bank_logo);
                }
                java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(item.f179566e3), 10);
                android.widget.TextView textView = bVar3.f178607a;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = bVar3.f178607a.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, I, textSize));
                bVar3.f178608b.setText(item.f179569h3);
                if (item.f179567f3 == 0) {
                    java.lang.String bigDecimal = com.tencent.mm.wallet_core.ui.r1.i("" + item.f179565d3, "100", 2, java.math.RoundingMode.HALF_UP).toString();
                    bVar3.f178614h.setPrefix(com.tencent.mm.wallet_core.model.c2.b());
                    bVar3.f178614h.setText(bigDecimal);
                    bVar3.f178614h.setTextSize(1, 30.0f);
                    bVar3.f178614h.setVisibility(0);
                    bVar3.f178615i.setVisibility(0);
                } else {
                    bVar3.f178614h.setVisibility(4);
                    bVar3.f178615i.setVisibility(4);
                }
                if (com.tencent.mm.ui.bk.C()) {
                    bVar3.f178609c.setBackgroundResource(com.tencent.mm.R.drawable.chi);
                    bVar3.f178610d.setImageResource(com.tencent.mm.R.raw.honey_pay_input_logo_dm);
                }
                view.postDelayed(new com.tencent.mm.plugin.wallet.bind.ui.a(this, bVar3, view), 50L);
                return view;
            default:
                return view;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }
}
