package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class p7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f117329e;

    public p7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, r45.z53 z53Var) {
        this.f117328d = b8Var;
        this.f117329e = z53Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        android.app.Activity context = this.f117328d.getContext();
        java.lang.String string = this.f117329e.getString(3);
        if (string == null) {
            string = "";
        }
        b3Var.c(context, string);
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.b(8);
        }
    }
}
