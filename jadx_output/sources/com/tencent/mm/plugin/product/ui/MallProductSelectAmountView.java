package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class MallProductSelectAmountView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f153207d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f153208e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f153209f;

    /* renamed from: g, reason: collision with root package name */
    public int f153210g;

    /* renamed from: h, reason: collision with root package name */
    public int f153211h;

    /* renamed from: i, reason: collision with root package name */
    public int f153212i;

    /* renamed from: m, reason: collision with root package name */
    public int f153213m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.k0 f153214n;

    public MallProductSelectAmountView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153207d = null;
        this.f153208e = null;
        this.f153209f = null;
        this.f153210g = Integer.MAX_VALUE;
        this.f153211h = 1;
        this.f153212i = 1;
        this.f153213m = 1;
        this.f153214n = null;
        android.view.View inflate = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.cag, (android.view.ViewGroup) this, true);
        this.f153207d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j_v);
        this.f153208e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.j_u);
        this.f153209f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485841ja0);
        this.f153207d.setText("" + this.f153213m);
        this.f153208e.setOnClickListener(new com.tencent.mm.plugin.product.ui.i0(this));
        this.f153209f.setOnClickListener(new com.tencent.mm.plugin.product.ui.j0(this));
    }

    public final boolean a() {
        int i17 = this.f153213m;
        int i18 = this.f153210g;
        if (i17 > i18) {
            this.f153213m = i18;
            com.tencent.mm.plugin.product.ui.k0 k0Var = this.f153214n;
            if (k0Var != null) {
                ((com.tencent.mm.plugin.product.ui.n0) k0Var).a(i18);
            }
            com.tencent.mm.plugin.product.ui.k0 k0Var2 = this.f153214n;
            if (k0Var2 != null) {
                ((com.tencent.mm.plugin.product.ui.n0) k0Var2).b(this.f153213m, this.f153211h);
            }
            this.f153207d.setText("" + this.f153213m);
            return false;
        }
        int i19 = this.f153212i;
        if (i17 > i19) {
            this.f153209f.setEnabled(true);
        } else {
            if (i17 != i19) {
                this.f153209f.setEnabled(false);
                int i27 = this.f153212i;
                this.f153213m = i27;
                com.tencent.mm.plugin.product.ui.k0 k0Var3 = this.f153214n;
                if (k0Var3 != null) {
                    ((com.tencent.mm.plugin.product.ui.n0) k0Var3).a(i27);
                }
                com.tencent.mm.plugin.product.ui.k0 k0Var4 = this.f153214n;
                if (k0Var4 != null) {
                    ((com.tencent.mm.plugin.product.ui.n0) k0Var4).b(this.f153213m, 2);
                }
                this.f153207d.setText("" + this.f153213m);
                return false;
            }
            this.f153209f.setEnabled(false);
        }
        return true;
    }

    public void setAddEnable(boolean z17) {
        this.f153208e.setEnabled(z17);
    }

    public void setAmount(int i17) {
        this.f153213m = i17;
        if (a()) {
            this.f153207d.setText("" + this.f153213m);
            com.tencent.mm.plugin.product.ui.k0 k0Var = this.f153214n;
            if (k0Var != null) {
                ((com.tencent.mm.plugin.product.ui.n0) k0Var).a(this.f153213m);
            }
        }
    }

    public void setMinAmount(int i17) {
        this.f153212i = i17;
        a();
    }

    public void setOnAmountChangeListener(com.tencent.mm.plugin.product.ui.k0 k0Var) {
        this.f153214n = k0Var;
    }

    public void setRemoveEnable(boolean z17) {
        this.f153209f.setEnabled(z17);
    }
}
