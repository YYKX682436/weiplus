package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.d8 f206644d;

    public c8(com.tencent.mm.ui.contact.d8 d8Var) {
        this.f206644d = d8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.d8 d8Var = this.f206644d;
        java.util.List list = d8Var.f206667d.f206726f;
        if (list == null || list.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMListHeaderView", "openimIdList is null");
            return;
        }
        d8Var.f206667d.f206726f.remove("wework");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMListHeaderView", "openim list size = %s", java.lang.Integer.valueOf(d8Var.f206667d.f206726f.size()));
        com.tencent.mm.ui.contact.g8 g8Var = d8Var.f206667d;
        if (g8Var.f206725e == null) {
            android.view.View.inflate(g8Var.getContext(), com.tencent.mm.R.layout.c8r, d8Var.f206667d);
            com.tencent.mm.ui.contact.g8 g8Var2 = d8Var.f206667d;
            g8Var2.f206725e = (android.widget.LinearLayout) g8Var2.findViewById(com.tencent.mm.R.id.cg7);
        }
        d8Var.f206667d.f206725e.removeAllViews();
        for (int i17 = 0; i17 < d8Var.f206667d.f206726f.size(); i17++) {
            com.tencent.mm.ui.contact.j8 j8Var = new com.tencent.mm.ui.contact.j8(d8Var.f206667d.getContext(), (java.lang.String) d8Var.f206667d.f206726f.get(i17));
            d8Var.f206667d.f206725e.addView(j8Var);
            if (i17 == d8Var.f206667d.f206726f.size() - 1) {
                android.view.View findViewById = j8Var.findViewById(com.tencent.mm.R.id.dgy);
                int paddingLeft = findViewById.getPaddingLeft();
                findViewById.setBackground(com.tencent.mm.ui.zk.d(d8Var.f206667d.f206724d, com.tencent.mm.R.attr.f478322gp));
                findViewById.findViewById(com.tencent.mm.R.id.f484231dh0).setBackground(null);
                findViewById.setPadding(paddingLeft, 0, 0, 0);
            } else {
                j8Var.findViewById(com.tencent.mm.R.id.dgy).setBackground(null);
                j8Var.findViewById(com.tencent.mm.R.id.dgy).findViewById(com.tencent.mm.R.id.f484231dh0).setBackground(com.tencent.mm.ui.zk.d(d8Var.f206667d.f206724d, com.tencent.mm.R.attr.f478322gp));
            }
        }
        com.tencent.mm.ui.contact.g8 g8Var3 = d8Var.f206667d;
        g8Var3.f206727g.a(g8Var3.f206726f.size());
    }
}
