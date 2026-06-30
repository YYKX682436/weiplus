package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class q extends com.tencent.mm.ui.contact.item.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.r f206919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.contact.item.r rVar) {
        super(rVar);
        this.f206919b = rVar;
    }

    @Override // com.tencent.mm.ui.contact.item.b0, com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        super.c(context, bVar, dVar, z17, z18);
        com.tencent.mm.ui.contact.item.a0 a0Var = (com.tencent.mm.ui.contact.item.a0) bVar;
        com.tencent.mm.ui.contact.item.r rVar = this.f206919b;
        if (com.tencent.mm.sdk.platformtools.t8.J0(rVar.G)) {
            a0Var.f206822c.setVisibility(8);
            return;
        }
        a0Var.f206822c.setVisibility(0);
        rVar.G = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, rVar.G, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        android.widget.TextView textView = a0Var.f206822c;
        textView.setText(textView.getContext().getResources().getString(rVar.H ? com.tencent.mm.R.string.f490956bd0 : com.tencent.mm.R.string.bcz, rVar.G));
    }
}
