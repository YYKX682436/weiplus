package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class k1 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f211894d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f211895e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f211896f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f211897g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f211898h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.RadioButton f211899i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f211900m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f211901n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f211902o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f211903p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f211904q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f211905r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f211906s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.Button f211907t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f211908u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f211909v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f211910w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.l1 f211911x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.ui.widget.dialog.l1 l1Var, android.view.View view) {
        super(view);
        this.f211911x = l1Var;
        this.f211897g = null;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.nei);
        this.f211908u = findViewById;
        if (findViewById != null) {
            return;
        }
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f211894d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f211896f = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.h5n);
        this.f211901n = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.m7g);
        this.f211902o = view.findViewById(com.tencent.mm.R.id.k_2);
        this.f211903p = view.findViewById(com.tencent.mm.R.id.lqe);
        this.f211904q = view.findViewById(com.tencent.mm.R.id.s8z);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.v2q);
        this.f211906s = findViewById2;
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.v2c);
        this.f211907t = button;
        this.f211909v = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.sks);
        boolean z17 = l1Var.f211918h.B1;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = l1Var.f211918h;
        if (z17) {
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485288h62);
            this.f211898h = imageView;
            this.f211910w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nrk);
            com.tencent.mm.ui.widget.dialog.l1 l1Var2 = k0Var.f211888x1;
            if (l1Var2 != null && l1Var2.getItemCount() > 0) {
                imageView.setLongClickable(true);
                imageView.setOnLongClickListener(this);
                imageView.setOnClickListener(this);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(this);
                }
                if (button != null) {
                    button.setOnClickListener(this);
                }
            }
            this.f211897g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485287h61);
            this.f211905r = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485289u34);
        }
        if (k0Var.f211893z1) {
            this.f211899i = (android.widget.RadioButton) view.findViewById(com.tencent.mm.R.id.lhs);
        }
        if (k0Var.f211893z1 || k0Var.A1) {
            this.f211895e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
            this.f211900m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d0v);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f211911x.f211915e;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, view, getPosition(), getPosition());
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = this.f211911x.f211916f;
        if (onItemLongClickListener == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        onItemLongClickListener.onItemLongClick(null, view, getPosition(), getPosition());
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
