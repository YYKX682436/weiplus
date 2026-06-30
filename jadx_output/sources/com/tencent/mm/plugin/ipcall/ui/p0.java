package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI f142977d;

    public p0(com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI) {
        this.f142977d = iPCallAddressUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f142977d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
