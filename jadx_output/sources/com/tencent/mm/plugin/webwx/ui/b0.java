package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f187996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f187997e;

    public b0(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f187996d = kVar;
        this.f187997e = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelsimple.r1 r1Var = com.tencent.mm.modelsimple.r1.f71404f;
        ug3.k kVar = this.f187996d;
        ug3.i.H(kVar, r1Var);
        this.f187997e.D.setChecked(!r3.isChecked());
        kVar.L = true;
    }
}
