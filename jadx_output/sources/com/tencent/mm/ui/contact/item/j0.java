package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class j0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.k0 f206885a;

    public j0(com.tencent.mm.ui.contact.item.k0 k0Var) {
        this.f206885a = k0Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        this.f206885a.getClass();
        com.tencent.mm.ui.contact.item.a0 a0Var = new com.tencent.mm.ui.contact.item.a0(new com.tencent.mm.ui.contact.item.c0(0));
        a0Var.f206820a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        a0Var.f206821b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        a0Var.f206822c = textView;
        textView.setVisibility(8);
        a0Var.f206823d = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        inflate.setEnabled(false);
        inflate.setTag(a0Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.a0 a0Var = (com.tencent.mm.ui.contact.item.a0) bVar;
        a0Var.f206821b.setText("");
        a0Var.f206823d.setVisibility(8);
    }
}
