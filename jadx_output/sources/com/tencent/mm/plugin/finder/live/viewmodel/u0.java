package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class u0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f117442f;

    public u0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var, kotlin.jvm.internal.c0 c0Var, r45.z53 z53Var) {
        this.f117440d = a1Var;
        this.f117441e = c0Var;
        this.f117442f = z53Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117440d;
        com.tencent.mars.xlog.Log.i(a1Var.f116871d, "dialog ok isInstall:" + this.f117441e.f310112d);
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        android.app.Activity context = a1Var.getContext();
        java.lang.String string = this.f117442f.getString(3);
        if (string == null) {
            string = "";
        }
        b3Var.c(context, string);
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.b(8);
        }
    }
}
