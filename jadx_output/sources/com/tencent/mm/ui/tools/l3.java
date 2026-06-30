package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class l3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f210544d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.FilterImageView f210545e;

    public l3(com.tencent.mm.ui.tools.FilterImageView filterImageView) {
        this.f210545e = filterImageView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.ui.tools.n3[] n3VarArr = com.tencent.mm.ui.tools.FilterImageView.f210041r;
        return 12;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return com.tencent.mm.ui.tools.FilterImageView.f210041r[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.tools.k3 k3Var;
        com.tencent.mm.ui.tools.n3 n3Var = com.tencent.mm.ui.tools.FilterImageView.f210041r[i17];
        com.tencent.mm.ui.tools.FilterImageView filterImageView = this.f210545e;
        if (view == null || !(view.getTag() instanceof com.tencent.mm.ui.tools.k3)) {
            view = android.view.View.inflate(filterImageView.f210042d, com.tencent.mm.R.layout.f488778ad5, null);
            k3Var = new com.tencent.mm.ui.tools.k3(this);
            k3Var.f210527a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.e4z);
            k3Var.f210528b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.e4y);
            view.setTag(k3Var);
        } else {
            k3Var = (com.tencent.mm.ui.tools.k3) view.getTag();
            android.graphics.Bitmap bitmap = k3Var.f210529c;
            if (bitmap != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", bitmap.toString());
                k3Var.f210529c.recycle();
            }
        }
        android.widget.TextView textView = k3Var.f210527a;
        com.tencent.mm.ui.tools.m3 m3Var = n3Var.f210594a;
        m3Var.getClass();
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        textView.setText(d17.equals("zh_CN") ? m3Var.f210565a : (d17.equals("zh_TW") || d17.equals("zh_HK")) ? m3Var.f210566b : m3Var.f210567c);
        try {
            java.io.InputStream open = filterImageView.f210042d.getAssets().open("filter/" + n3Var.f210598e);
            k3Var.f210529c = com.tencent.mm.sdk.platformtools.x.O(open);
            open.close();
            k3Var.f210528b.setImageBitmap(k3Var.f210529c);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FilterView", e17, "", new java.lang.Object[0]);
        }
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        if (i17 == this.f210544d) {
            view.findViewById(com.tencent.mm.R.id.e4y).setBackgroundResource(com.tencent.mm.R.drawable.bgq);
        } else {
            view.findViewById(com.tencent.mm.R.id.e4y).setBackgroundResource(com.tencent.mm.R.drawable.bgr);
        }
        return view;
    }
}
