package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class b1 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.d1 f206828a;

    public b1(com.tencent.mm.ui.contact.item.d1 d1Var) {
        this.f206828a = d1Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ckb, viewGroup, false);
        com.tencent.mm.ui.contact.item.c1 c1Var = this.f206828a.D;
        c1Var.f206830b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        c1Var.f206829a = inflate.findViewById(com.tencent.mm.R.id.mjc);
        c1Var.f206831c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.mk7);
        inflate.setTag(c1Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.c1 c1Var = (com.tencent.mm.ui.contact.item.c1) bVar;
        c1Var.f206830b.setText(com.tencent.mm.R.string.ifn);
        if (z18) {
            c1Var.f206831c.setVisibility(0);
        } else {
            c1Var.f206831c.setVisibility(8);
        }
        c1Var.f206829a.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
    }
}
