package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class v0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153361d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f153362e;

    public v0(android.content.Context context) {
        this.f153361d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f153362e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (wq3.u) this.f153362e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.product.ui.x0 x0Var;
        wq3.u uVar = (wq3.u) this.f153362e.get(i17);
        if (view == null || view.getTag() == null) {
            x0Var = new com.tencent.mm.plugin.product.ui.x0();
            view = android.view.View.inflate(this.f153361d, com.tencent.mm.R.layout.cak, null);
            x0Var.f153373e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ja7);
            x0Var.f153372d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ja6);
            view.setTag(x0Var);
        } else {
            x0Var = (com.tencent.mm.plugin.product.ui.x0) view.getTag();
        }
        x0Var.f153374f = uVar;
        x0Var.f153373e.setText(uVar.f448606a);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.tencent.mm.plugin.product.ui.o oVar = new com.tencent.mm.plugin.product.ui.o(uVar.f448607b);
        ((x60.e) fVar).getClass();
        x0Var.f153372d.setImageBitmap(x51.w0.d(oVar));
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(x0Var);
        return view;
    }
}
