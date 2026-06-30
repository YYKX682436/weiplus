package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class j3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191730d;

    public j3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191730d = fileSelectorUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191730d;
        fileSelectorUI.setMMTitle(fileSelectorUI.getString(com.tencent.mm.R.string.dcq));
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "backBtn");
        com.tencent.mm.plugin.multitalk.model.e3.Ri().K();
        com.tencent.mm.ui.chatting.pc pcVar = fileSelectorUI.F;
        if (pcVar != null) {
            pcVar.c();
        }
        com.tencent.mm.ui.chatting.pc pcVar2 = fileSelectorUI.F;
        if (pcVar2 != null) {
            pcVar2.removeAllViews();
        }
        android.view.View contentView = fileSelectorUI.getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) contentView).removeView(fileSelectorUI.F);
        fileSelectorUI.m7();
        fileSelectorUI.getClass();
        fileSelectorUI.getClass();
        fileSelectorUI.setRequestedOrientation(1);
        fileSelectorUI.addSearchMenu(true, fileSelectorUI.f191375o);
        fileSelectorUI.G = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markExitDuringProfileUI");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 2L, 1L);
        return false;
    }
}
