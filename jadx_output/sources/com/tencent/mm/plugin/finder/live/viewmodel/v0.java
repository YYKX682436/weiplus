package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117464d;

    public v0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        this.f117464d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i(this.f117464d.f116871d, "dialog cancel");
        dialogInterface.dismiss();
    }
}
