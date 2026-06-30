package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class v9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI f161637d;

    public v9(com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI settingsChattingBackgroundUI) {
        this.f161637d = settingsChattingBackgroundUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI.f160365m;
        this.f161637d.getClass();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.b wi6 = f21.r0.wi();
        wi6.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBgInfoStorage", "getAll() called");
        l75.k0 k0Var = wi6.f258841d;
        android.database.Cursor B = k0Var.B("select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo  ", null);
        if (B == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsChattingBackgroundUI", "applyToAll : cursor is null");
            return;
        }
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        if (B.moveToFirst()) {
            while (!B.isAfterLast()) {
                java.lang.String string = B.getString(0);
                B.getInt(1);
                B.getString(2);
                B.getString(3);
                B.getString(4);
                B.getInt(5);
                B.getInt(6);
                com.tencent.mm.vfs.w6.h(Bi.s0(string == null ? "" : string, true));
                if (string == null) {
                    string = "";
                }
                com.tencent.mm.vfs.w6.h(Bi.s0(string, false));
                B.moveToNext();
            }
        }
        B.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBgInfoStorage", "deleteAll() called");
        if (k0Var.delete("chattingbginfo", null, null) > 0) {
            wi6.doNotify();
        }
    }
}
