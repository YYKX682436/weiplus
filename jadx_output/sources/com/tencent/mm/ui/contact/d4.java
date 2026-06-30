package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class d4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206660d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f206661e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f206662f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f206663g;

    public d4(android.content.Context context, java.util.List list, java.util.List list2, boolean z17) {
        this.f206661e = list;
        this.f206660d = context;
        this.f206663g = z17;
        this.f206662f = list2;
    }

    public int a() {
        return com.tencent.mm.R.layout.bim;
    }

    public int c(com.tencent.mm.storage.z3 z3Var) {
        return ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(z3Var.d1());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f206661e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f206661e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.ui.contact.k4 k4Var;
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) this.f206661e.get(i17);
        android.content.Context context = this.f206660d;
        if (view == null) {
            k4Var = new com.tencent.mm.ui.contact.k4();
            view2 = android.view.View.inflate(context, a(), null);
            k4Var.f206990b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gtx);
            k4Var.f206989a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.gtz);
            k4Var.f206991c = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.gtw);
            k4Var.f206992d = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.mie);
            k4Var.f206993e = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.gty);
            view2.setTag(k4Var);
        } else {
            view2 = view;
            k4Var = (com.tencent.mm.ui.contact.k4) view.getTag();
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(k4Var.f206991c, z3Var.d1(), null);
        android.widget.TextView textView = k4Var.f206989a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        textView.setText(((ke0.e) xVar).bj(context, c01.a2.e(d17), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)));
        k4Var.f206990b.setText("(" + c(z3Var) + ")");
        if (c01.e2.R(z3Var.d1())) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            k4Var.f206989a.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            k4Var.f206989a.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        if (this.f206663g) {
            k4Var.f206992d.setVisibility(0);
            if (this.f206662f.contains(z3Var.d1())) {
                k4Var.f206992d.setChecked(true);
            } else {
                k4Var.f206992d.setChecked(false);
            }
        }
        return view2;
    }
}
