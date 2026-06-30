package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class k extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f155195d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f155196e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f155197f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.j f155198g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155199h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.MallEditText f155200i;

    public k(com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText, com.tencent.mm.plugin.recharge.ui.a aVar) {
        this.f155200i = mallEditText;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized vs3.a getItem(int i17) {
        if (!this.f155196e) {
            if (i17 >= this.f155195d.size()) {
                return null;
            }
            return (vs3.a) this.f155195d.get(i17);
        }
        if (i17 == 0) {
            return null;
        }
        if (i17 > this.f155195d.size()) {
            return null;
        }
        return (vs3.a) this.f155195d.get(i17 - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f155196e) {
            return this.f155195d.size() + 2;
        }
        if (this.f155195d.size() > 0) {
            return this.f155195d.size() + 1;
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f155198g == null) {
            this.f155198g = new com.tencent.mm.plugin.recharge.ui.j(this, null);
        }
        return this.f155198g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (!this.f155196e) {
            return i17 < this.f155195d.size() ? 0 : 1;
        }
        if (i17 == 0) {
            return 2;
        }
        return i17 <= this.f155195d.size() ? 0 : 3;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.recharge.ui.m mVar;
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = this.f155200i;
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                android.view.View inflate = android.view.View.inflate(mallEditText.getContext(), com.tencent.mm.R.layout.cco, null);
                inflate.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.e(this));
                return inflate;
            }
            if (itemViewType == 2) {
                android.view.View inflate2 = android.view.View.inflate(mallEditText.getContext(), com.tencent.mm.R.layout.ccm, null);
                inflate2.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.d(this));
                return inflate2;
            }
            if (itemViewType != 3) {
                return view;
            }
            android.view.View inflate3 = android.view.View.inflate(mallEditText.getContext(), com.tencent.mm.R.layout.cco, null);
            ((android.widget.TextView) inflate3).setText(com.tencent.mm.R.string.gsm);
            inflate3.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.f(this));
            return inflate3;
        }
        if (view == null) {
            view = android.view.View.inflate(mallEditText.getContext(), com.tencent.mm.R.layout.ccn, null);
            mVar = new com.tencent.mm.plugin.recharge.ui.m(mallEditText, null);
            mVar.f155203a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j9z);
            mVar.f155204b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j9y);
            view.setTag(mVar);
        } else {
            mVar = (com.tencent.mm.plugin.recharge.ui.m) view.getTag();
        }
        vs3.a item = getItem(i17);
        if (item == null || mVar == null || mVar.f155203a == null || mVar.f155204b == null) {
            return view;
        }
        java.lang.String b17 = vs3.b.b(item.f439875a);
        if (vs3.a.f439873f.equals(item.f439879e)) {
            mVar.f155203a.setText(b17);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(b17);
            for (int i18 : item.f439879e) {
                if (i18 >= 0) {
                    if (i18 >= 7) {
                        i18 += 2;
                    } else if (i18 >= 3) {
                        i18++;
                    }
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(-65536), i18, i18 + 1, 34);
                }
            }
            mVar.f155203a.setText(spannableStringBuilder);
        }
        java.lang.String str = item.f439876b;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str.trim())) {
            mVar.f155204b.setText("");
        } else {
            mVar.f155204b.setText(mallEditText.getResources().getString(com.tencent.mm.R.string.gsx, item.f439876b));
        }
        view.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }
}
