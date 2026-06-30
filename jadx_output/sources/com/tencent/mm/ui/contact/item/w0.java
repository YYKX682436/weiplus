package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class w0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.x0 f206941a;

    public w0(com.tencent.mm.ui.contact.item.x0 x0Var) {
        this.f206941a = x0Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck_, viewGroup, false);
        com.tencent.mm.ui.contact.item.v0 v0Var = (com.tencent.mm.ui.contact.item.v0) this.f206941a.E;
        v0Var.f206938a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hcv);
        inflate.setTag(v0Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.fts.ui.n3.a(this.f206941a.C, ((com.tencent.mm.ui.contact.item.v0) bVar).f206938a);
    }
}
