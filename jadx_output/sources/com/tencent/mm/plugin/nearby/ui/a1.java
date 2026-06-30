package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.c1 f152125d;

    public a1(com.tencent.mm.plugin.nearby.ui.c1 c1Var) {
        this.f152125d = c1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.nearby.ui.c1 c1Var = this.f152125d;
        com.tencent.mm.storage.u8 u8Var = c1Var.f152130d.f152110d;
        u8Var.f196265d.delete(u8Var.getTableName(), null, null);
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = c1Var.f152130d;
        nearbySayHiListUI.f152111e.q();
        android.widget.TextView textView = (android.widget.TextView) nearbySayHiListUI.findViewById(com.tencent.mm.R.id.dfo);
        textView.setText(com.tencent.mm.R.string.i8k);
        textView.setVisibility(0);
        nearbySayHiListUI.enableOptionMenu(false);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(9L);
    }
}
