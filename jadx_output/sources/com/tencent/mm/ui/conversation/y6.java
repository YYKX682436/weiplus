package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class y6 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208263d;

    public y6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208263d = mainUI;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        yf5.j0 j0Var = this.f208263d.f207379v;
        if (j0Var != null) {
            ((yf5.w0) j0Var).notifyDataSetChanged();
            com.tencent.mm.ui.LauncherUI.getInstance().f7().n();
        }
    }
}
