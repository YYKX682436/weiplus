package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes11.dex */
public class c2 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.e2 f157655a;

    public c2(com.tencent.mm.plugin.remittance.ui.e2 e2Var) {
        this.f157655a = e2Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        com.tencent.mm.plugin.remittance.ui.e2 e2Var = this.f157655a;
        e2Var.getClass();
        com.tencent.mm.plugin.remittance.ui.d2 d2Var = new com.tencent.mm.plugin.remittance.ui.d2(e2Var);
        d2Var.f157670a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut)).setVisibility(8);
        d2Var.f157671b = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        inflate.setEnabled(false);
        inflate.setTag(d2Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.remittance.ui.d2 d2Var = (com.tencent.mm.plugin.remittance.ui.d2) bVar;
        d2Var.f157670a.setText("");
        d2Var.f157671b.setVisibility(8);
    }
}
