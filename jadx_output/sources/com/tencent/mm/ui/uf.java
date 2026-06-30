package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class uf implements zk3.b {
    public uf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
    }

    @Override // zk3.b
    public boolean c(android.content.Context context) {
        return ((context instanceof com.tencent.mm.ui.vas.VASActivity) && ((com.tencent.mm.ui.vas.VASActivity) context).isVASValid()) ? false : true;
    }

    @Override // zk3.b
    public boolean d() {
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI == null || launcherUI.f7() == null) {
            return false;
        }
        return launcherUI.f7().j();
    }

    @Override // zk3.b
    public boolean e() {
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI != null) {
            return launcherUI.i7() || launcherUI.U6();
        }
        return false;
    }

    @Override // zk3.b
    public int f() {
        return com.tencent.mm.ui.LauncherUI.getCurrentTabIndex();
    }

    @Override // zk3.b
    public void g(int i17, int i18) {
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI == null || launcherUI.f7() == null) {
            return;
        }
        launcherUI.f7().k(i17, i18);
    }

    @Override // zk3.b
    public void h(int i17) {
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI == null || launcherUI.f7() == null) {
            return;
        }
        launcherUI.f7().l(i17);
    }
}
