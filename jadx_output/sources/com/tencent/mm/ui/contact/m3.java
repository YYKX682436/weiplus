package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.n3 f207023d;

    public m3(com.tencent.mm.ui.contact.n3 n3Var) {
        this.f207023d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.n3 n3Var = this.f207023d;
        java.util.List list = n3Var.f207039d.f207133h;
        if (list != null && list.contains("wework")) {
            n3Var.f207039d.f207133h.clear();
            n3Var.f207039d.f207133h.add("wework");
        }
        if (n3Var.f207039d.f207131f.size() > 0 || n3Var.f207039d.f207133h.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseBizView", "biz list size = %s", java.lang.Integer.valueOf(n3Var.f207039d.f207131f.size()));
            com.tencent.mm.ui.contact.q3 q3Var = n3Var.f207039d;
            if (q3Var.f207130e == null) {
                android.view.View.inflate(q3Var.getContext(), com.tencent.mm.R.layout.a8z, n3Var.f207039d);
                com.tencent.mm.ui.contact.q3 q3Var2 = n3Var.f207039d;
                q3Var2.f207130e = (android.widget.LinearLayout) q3Var2.findViewById(com.tencent.mm.R.id.cg7);
            }
            n3Var.f207039d.f207130e.removeAllViews();
            if (n3Var.f207039d.f207133h.size() > 0) {
                for (int i17 = 0; i17 < n3Var.f207039d.f207133h.size(); i17++) {
                    com.tencent.mm.ui.contact.j8 j8Var = new com.tencent.mm.ui.contact.j8(n3Var.f207039d.getContext(), (java.lang.String) n3Var.f207039d.f207133h.get(i17));
                    n3Var.f207039d.f207130e.addView(j8Var);
                    if (i17 == n3Var.f207039d.f207133h.size() - 1 && n3Var.f207039d.f207131f.size() == 0) {
                        android.view.View findViewById = j8Var.findViewById(com.tencent.mm.R.id.dgy);
                        int paddingLeft = findViewById.getPaddingLeft();
                        findViewById.setBackground(com.tencent.mm.ui.zk.d(n3Var.f207039d.f207129d, com.tencent.mm.R.attr.f478322gp));
                        findViewById.findViewById(com.tencent.mm.R.id.f484231dh0).setBackground(null);
                        findViewById.setPadding(paddingLeft, 0, 0, 0);
                    } else {
                        j8Var.findViewById(com.tencent.mm.R.id.dgy).setBackground(null);
                        j8Var.findViewById(com.tencent.mm.R.id.dgy).findViewById(com.tencent.mm.R.id.f484231dh0).setBackground(com.tencent.mm.ui.zk.d(n3Var.f207039d.f207129d, com.tencent.mm.R.attr.f478322gp));
                    }
                }
            }
            if (n3Var.f207039d.f207131f.size() > 0) {
                n3Var.f207039d.f207132g = new java.util.HashMap();
                for (int i18 = 0; i18 < n3Var.f207039d.f207131f.size(); i18++) {
                    java.lang.String str = (java.lang.String) n3Var.f207039d.f207131f.get(i18);
                    com.tencent.mm.ui.contact.t3 t3Var = new com.tencent.mm.ui.contact.t3(n3Var.f207039d.getContext(), str);
                    n3Var.f207039d.f207130e.addView(t3Var);
                    n3Var.f207039d.f207132g.put(str, t3Var);
                    if (i18 == n3Var.f207039d.f207131f.size() - 1) {
                        android.view.View findViewById2 = t3Var.findViewById(com.tencent.mm.R.id.dgy);
                        int paddingLeft2 = findViewById2.getPaddingLeft();
                        findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
                        findViewById2.findViewById(com.tencent.mm.R.id.dgz).setBackground(null);
                        findViewById2.setPadding(paddingLeft2, 0, 0, 0);
                    } else {
                        t3Var.findViewById(com.tencent.mm.R.id.dgy).setBackground(null);
                        android.view.View findViewById3 = t3Var.findViewById(com.tencent.mm.R.id.dgy).findViewById(com.tencent.mm.R.id.dgz);
                        int paddingRight = findViewById3.getPaddingRight();
                        findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
                        findViewById3.setPadding(0, 0, paddingRight, 0);
                    }
                }
            }
            com.tencent.mm.ui.contact.q3 q3Var3 = n3Var.f207039d;
            q3Var3.f207134i.a(q3Var3.getEnterpriseFriendCount());
        }
    }
}
