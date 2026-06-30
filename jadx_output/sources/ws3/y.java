package ws3;

/* loaded from: classes9.dex */
public class y extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f449196q = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f449199f;

    /* renamed from: g, reason: collision with root package name */
    public ws3.w f449200g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f449201h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f449202i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.AutoCompleteTextView f449203m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.recharge.ui.form.MallFormView f449204n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f449205o;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f449197d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f449198e = false;

    /* renamed from: p, reason: collision with root package name */
    public ws3.u f449206p = null;

    public y(com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView, java.util.List list) {
        this.f449202i = mallFormView.getContext();
        this.f449204n = mallFormView;
        this.f449203m = (android.widget.AutoCompleteTextView) mallFormView.getContentEditText();
        this.f449205o = list;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized vs3.a getItem(int i17) {
        if (!this.f449198e) {
            if (i17 >= this.f449197d.size()) {
                return null;
            }
            return (vs3.a) this.f449197d.get(i17);
        }
        if (i17 == 0) {
            return null;
        }
        if (i17 > this.f449197d.size()) {
            return null;
        }
        return (vs3.a) this.f449197d.get(i17 - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f449198e) {
            return this.f449197d.size() + 2;
        }
        if (this.f449197d.size() > 0) {
            return this.f449197d.size() + 1;
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f449200g == null) {
            this.f449200g = new ws3.w(this, null);
        }
        return this.f449200g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (!this.f449198e) {
            return i17 < this.f449197d.size() ? 0 : 1;
        }
        if (i17 == 0) {
            return 2;
        }
        return i17 <= this.f449197d.size() ? 0 : 3;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ws3.x xVar;
        android.widget.ImageView imageView;
        int itemViewType = getItemViewType(i17);
        android.content.Context context = this.f449202i;
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cco, null);
                inflate.setOnClickListener(new ws3.s(this));
                return inflate;
            }
            if (itemViewType == 2) {
                android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.ccm, null);
                inflate2.setOnClickListener(new ws3.r(this));
                return inflate2;
            }
            if (itemViewType != 3) {
                return view;
            }
            android.view.View inflate3 = android.view.View.inflate(context, com.tencent.mm.R.layout.cco, null);
            ((android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.lmv)).setText(com.tencent.mm.R.string.gsm);
            inflate3.setOnClickListener(new ws3.t(this));
            return inflate3;
        }
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.ccn, null);
            xVar = new ws3.x(this, null);
            xVar.f449193a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j9z);
            xVar.f449194b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j9y);
            xVar.f449195c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ofk);
            view.setTag(xVar);
        } else {
            xVar = (ws3.x) view.getTag();
        }
        if (xVar != null && (imageView = xVar.f449195c) != null) {
            if (i17 == 0) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        vs3.a item = getItem(i17);
        if (item == null || xVar == null || xVar.f449193a == null || xVar.f449194b == null) {
            return view;
        }
        java.lang.String b17 = vs3.b.b(item.f439875a);
        if (vs3.a.f439873f.equals(item.f439879e)) {
            xVar.f449193a.setTextSize(16.0f);
            xVar.f449193a.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            xVar.f449194b.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
            xVar.f449193a.setText(b17);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(b17);
            for (int i18 : item.f439879e) {
                if (i18 >= 0) {
                    if (i18 >= 7) {
                        i18 += 2;
                    } else if (i18 >= 3) {
                        i18++;
                    }
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.a2h)), i18, i18 + 1, 34);
                }
            }
            xVar.f449193a.setTextSize(24.0f);
            xVar.f449193a.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            xVar.f449194b.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            xVar.f449193a.setText(spannableStringBuilder);
        }
        java.lang.String str = item.f439876b;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str.trim())) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(item.f439877c)) {
                xVar.f449194b.setText(context.getString(com.tencent.mm.R.string.kxx));
                return view;
            }
            xVar.f449194b.setText(context.getString(com.tencent.mm.R.string.kxx) + context.getString(com.tencent.mm.R.string.kxp, item.f439877c));
            return view;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(item.f439877c)) {
            xVar.f449194b.setText(item.f439876b);
        } else {
            xVar.f449194b.setText(item.f439876b + context.getString(com.tencent.mm.R.string.kxp, item.f439877c));
        }
        if (item.f439876b.equals(context.getString(com.tencent.mm.R.string.kxw))) {
            xVar.f449194b.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a2e));
            return view;
        }
        xVar.f449194b.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a09));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }
}
