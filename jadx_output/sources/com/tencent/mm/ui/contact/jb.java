package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class jb extends com.tencent.mm.ui.contact.d4 {

    /* renamed from: h, reason: collision with root package name */
    public final int f206975h;

    /* renamed from: i, reason: collision with root package name */
    public final vg3.x3 f206976i;

    public jb(android.content.Context context, java.util.List list, java.util.List list2, boolean z17) {
        super(context, list, list2, z17);
        this.f206975h = ((android.app.Activity) context).getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f206976i = (vg3.x3) gm0.j1.s(vg3.x3.class);
    }

    @Override // com.tencent.mm.ui.contact.d4
    public int a() {
        return com.tencent.mm.R.layout.bin;
    }

    @Override // com.tencent.mm.ui.contact.d4
    public int c(com.tencent.mm.storage.z3 z3Var) {
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d17 = z3Var.d1();
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(d17);
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) m17;
            if (i17 >= linkedList.size()) {
                return i18;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) this.f206976i).Bi().n((java.lang.String) linkedList.get(i17), true);
            if (n17 != null) {
                java.lang.String d18 = n17.d1();
                boolean z17 = !android.text.TextUtils.isEmpty(d18) && d18.contains("@openim");
                if (n17.r2() && !z17 && !c01.z1.J(n17.d1())) {
                    i18++;
                }
            }
            i17++;
        }
    }

    @Override // com.tencent.mm.ui.contact.d4, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        ((com.tencent.mm.ui.contact.k4) view2.getTag()).f206993e.setOnClickListener(new com.tencent.mm.ui.contact.ib(this, (com.tencent.mm.storage.z3) this.f206661e.get(i17)));
        return view2;
    }
}
