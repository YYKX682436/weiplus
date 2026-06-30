package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class u0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f143017a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI, android.os.Looper looper) {
        super(looper);
        this.f143017a = iPCallContactUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143017a;
        if (i17 != 1) {
            if (i17 == 2) {
                if (iPCallContactUI.f142552g.getCount() == 0) {
                    iPCallContactUI.f142557o.setVisibility(0);
                } else {
                    iPCallContactUI.f142557o.setVisibility(8);
                }
                if (iPCallContactUI.f142552g.getCount() == 0 || !iPCallContactUI.f142564v) {
                    return;
                }
                iPCallContactUI.f142552g.notifyDataSetChanged();
                return;
            }
            return;
        }
        android.app.ProgressDialog progressDialog = iPCallContactUI.f142550e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        iPCallContactUI.f142553h.setVisibility(0);
        com.tencent.mm.plugin.ipcall.ui.w wVar = iPCallContactUI.f142552g;
        java.util.HashMap hashMap = s83.b.f404867b;
        wVar.getClass();
        com.tencent.mm.plugin.ipcall.ui.w.f143045x = hashMap;
        iPCallContactUI.f142552g.q();
        iPCallContactUI.f142552g.notifyDataSetChanged();
        iPCallContactUI.f142551f.invalidateViews();
        iPCallContactUI.f142555m.setAddressCount(iPCallContactUI.f142552g.getCount());
        if (com.tencent.mm.plugin.ipcall.c.f142436e == null) {
            com.tencent.mm.plugin.ipcall.c.f142436e = new com.tencent.mm.plugin.ipcall.c();
        }
        com.tencent.mm.plugin.ipcall.c.f142436e.a();
    }
}
