package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188004e;

    public e0(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188003d = kVar;
        this.f188004e = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.l44 l44Var = r45.l44.kKeepLoggedInDisabled;
        ug3.k kVar = this.f188003d;
        ug3.i.I(kVar, l44Var);
        kVar.N = false;
        this.f188004e.F.setChecked(!r1.isChecked());
    }
}
