package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class g0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188010e;

    public g0(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188009d = kVar;
        this.f188010e = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.l44 l44Var = r45.l44.kKeepLoggedInEnabled;
        ug3.k kVar = this.f188009d;
        ug3.i.I(kVar, l44Var);
        this.f188010e.F.setChecked(!r3.isChecked());
        kVar.N = true;
    }
}
