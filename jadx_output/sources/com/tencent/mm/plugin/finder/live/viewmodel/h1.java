package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l1 f117124e;

    public h1(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var) {
        this.f117123d = c0Var;
        this.f117124e = l1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f117123d.f310112d = true;
        this.f117124e.O6();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, 6, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
