package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI f181040d;

    public e(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI, com.tencent.mm.plugin.wallet_ecard.ui.a aVar) {
        this.f181040d = walletECardBindCardListUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f181040d.f181012f).size() + 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI = this.f181040d;
        if (i17 < ((java.util.ArrayList) walletECardBindCardListUI.f181012f).size()) {
            return ((java.util.ArrayList) walletECardBindCardListUI.f181012f).get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return i17 >= ((java.util.ArrayList) this.f181040d.f181012f).size() ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI = this.f181040d;
        if (itemViewType == 1) {
            if (view == null) {
                view = android.view.LayoutInflater.from(walletECardBindCardListUI.getContext()).inflate(com.tencent.mm.R.layout.a4w, viewGroup, false);
                view.setTag(new com.tencent.mm.plugin.wallet_ecard.ui.c(walletECardBindCardListUI, view));
            }
            ((com.tencent.mm.plugin.wallet_ecard.ui.c) view.getTag()).f181039a.setText(com.tencent.mm.R.string.f491072bt0);
        } else {
            if (view == null) {
                view = android.view.LayoutInflater.from(walletECardBindCardListUI.getContext()).inflate(com.tencent.mm.R.layout.a4v, viewGroup, false);
                view.setTag(new com.tencent.mm.plugin.wallet_ecard.ui.f(walletECardBindCardListUI, view));
            }
            com.tencent.mm.plugin.wallet_ecard.ui.d dVar = (com.tencent.mm.plugin.wallet_ecard.ui.d) view.getTag();
            r45.od odVar = (r45.od) getItem(i17);
            com.tencent.mm.plugin.wallet_ecard.ui.f fVar = (com.tencent.mm.plugin.wallet_ecard.ui.f) dVar;
            if (odVar != null) {
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = fVar.f181041a;
                cdnImageView.setRoundCorner(true);
                cdnImageView.setUrl(odVar.f382160m);
                java.lang.String format = java.lang.String.format("%s %s(%s)", odVar.f382154d, odVar.f382156f, odVar.f382158h);
                android.widget.TextView textView = fVar.f181042b;
                textView.setText(format);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(odVar.f382162o);
                android.widget.TextView textView2 = fVar.f181043c;
                if (K0) {
                    textView2.setText(java.lang.String.format("%s", odVar.f382157g));
                } else {
                    textView2.setText(java.lang.String.format("%s，%s", odVar.f382157g, odVar.f382162o));
                }
                boolean z17 = odVar.f382161n;
                com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI2 = fVar.f181044d;
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "disable card: %s", odVar.f382154d);
                    view.setEnabled(false);
                    textView.setTextColor(walletECardBindCardListUI2.getResources().getColor(com.tencent.mm.R.color.f479304vk));
                    textView2.setTextColor(walletECardBindCardListUI2.getResources().getColor(com.tencent.mm.R.color.f479304vk));
                } else {
                    view.setEnabled(true);
                    textView.setTextColor(walletECardBindCardListUI2.getResources().getColor(com.tencent.mm.R.color.a0c));
                    textView2.setTextColor(walletECardBindCardListUI2.getResources().getColor(com.tencent.mm.R.color.a09));
                }
            } else {
                fVar.getClass();
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        r45.od odVar = (r45.od) getItem(i17);
        return odVar != null ? !odVar.f382161n : super.isEnabled(i17);
    }
}
