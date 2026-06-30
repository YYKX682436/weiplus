package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.l f152131d;

    public d(com.tencent.mm.plugin.nearby.ui.l lVar) {
        this.f152131d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().w(4104, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.nearby.ui.l lVar = this.f152131d;
        m25.a.a(lVar.f152157e, new android.content.Intent());
        ((android.app.Activity) lVar.f152157e).finish();
    }
}
