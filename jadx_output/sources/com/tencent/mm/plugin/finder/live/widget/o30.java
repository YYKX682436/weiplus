package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o30 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q30 f119244d;

    public o30(com.tencent.mm.plugin.finder.live.widget.q30 q30Var) {
        this.f119244d = q30Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f119244d.f119467d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
