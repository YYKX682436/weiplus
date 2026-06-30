package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public final class f0 extends android.widget.BaseAdapter implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f159541d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f159542e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f159543f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.view.LayoutInflater f159544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.g0 f159545h;

    public f0(com.tencent.mm.plugin.scanner.ui.g0 g0Var) {
        this.f159545h = g0Var;
        this.f159544g = null;
        this.f159544g = android.view.LayoutInflater.from(g0Var.M);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.f159541d = g0Var.M.getResources().getColor(com.tencent.mm.R.color.f479221t9);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        if (bitmap == null || bitmap.isRecycled() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Map map = this.f159543f;
        if (((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(str)) == null || (imageView = (android.widget.ImageView) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(str)).get()) == null || !str.equals((java.lang.String) imageView.getTag())) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.d0(this, imageView, bitmap));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f159542e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f159542e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.scanner.ui.e0 e0Var;
        if (view == null) {
            view = this.f159544g.inflate(com.tencent.mm.R.layout.ca_, viewGroup, false);
            e0Var = new com.tencent.mm.plugin.scanner.ui.e0(this);
            e0Var.f159535a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gtm);
            e0Var.f159536b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gtl);
            view.setTag(e0Var);
        } else {
            e0Var = (com.tencent.mm.plugin.scanner.ui.e0) view.getTag();
        }
        com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) this.f159542e.get(i17);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.tencent.mm.plugin.scanner.ui.b0 b0Var = new com.tencent.mm.plugin.scanner.ui.b0(aVar.f158803w);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(b0Var);
        if (d17 == null || d17.isRecycled()) {
            e0Var.f159535a.setBackgroundColor(this.f159541d);
            e0Var.f159535a.setImageBitmap(null);
        } else {
            e0Var.f159535a.setImageBitmap(d17);
            e0Var.f159535a.setBackgroundColor(0);
        }
        e0Var.f159535a.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.c0(this, aVar.f158795o, aVar));
        e0Var.f159535a.setTag(aVar.f158803w);
        ((java.util.HashMap) this.f159543f).put(aVar.f158803w, new java.lang.ref.WeakReference(e0Var.f159535a));
        e0Var.f159536b.setText(aVar.f158782b);
        return view;
    }
}
