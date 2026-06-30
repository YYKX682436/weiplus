package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class z0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.a1 f206950a;

    public z0(com.tencent.mm.ui.contact.item.a1 a1Var) {
        this.f206950a = a1Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cka, viewGroup, false);
        com.tencent.mm.ui.contact.item.y0 y0Var = (com.tencent.mm.ui.contact.item.y0) this.f206950a.F;
        y0Var.f206947a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jrw);
        y0Var.f206948b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jqn);
        inflate.setTag(y0Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.y0 y0Var = (com.tencent.mm.ui.contact.item.y0) bVar;
        com.tencent.mm.ui.contact.item.a1 a1Var = (com.tencent.mm.ui.contact.item.a1) dVar;
        android.content.res.Resources resources = context.getResources();
        if (this.f206950a.D) {
            com.tencent.mm.plugin.fts.ui.n3.b(resources.getString(com.tencent.mm.R.string.idk, resources.getString(a1Var.C)), y0Var.f206947a);
            y0Var.f206948b.setRotation(0.0f);
        } else {
            com.tencent.mm.plugin.fts.ui.n3.b(resources.getString(com.tencent.mm.R.string.idl), y0Var.f206947a);
            y0Var.f206948b.setRotation(180.0f);
        }
    }
}
