package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class r2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191860d;

    public r2(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191860d = fileSelectorUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "handleTabSelected: cancel");
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191860d;
        com.google.android.material.tabs.TabLayout tabLayout = fileSelectorUI.f191382v;
        if (tabLayout != null) {
            int tabCount = tabLayout.getTabCount();
            for (int i18 = 0; i18 < tabCount; i18++) {
                oa.i k17 = tabLayout.k(i18);
                java.lang.Object obj = k17 != null ? k17.f343778a : null;
                if (obj instanceof com.tencent.mm.pluginsdk.ui.tools.j7) {
                    com.tencent.mm.pluginsdk.ui.tools.j7 j7Var = (com.tencent.mm.pluginsdk.ui.tools.j7) obj;
                    if (j7Var.f191738c == fileSelectorUI.f191384x) {
                        j7Var.a(true);
                        k17.b();
                        fileSelectorUI.j7(fileSelectorUI.f191384x);
                    }
                }
            }
        }
    }
}
