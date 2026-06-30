package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class j implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.m f169827e;

    public j(com.tencent.mm.plugin.sns.ui.listener.m mVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f169827e = mVar;
        this.f169826d = snsInfo;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$1");
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169826d;
        com.tencent.mm.storage.z3 f07 = Bi.f0(snsInfo.getUserName());
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        com.tencent.mm.plugin.sns.ui.listener.m mVar = this.f169827e;
        if (f07 == null || snsInfo == null || !com.tencent.mm.storage.z3.m4(snsInfo.getUserName()) || !"3552365301".equals(f07.Q0())) {
            android.app.Activity e17 = com.tencent.mm.plugin.sns.ui.listener.i.e(mVar.f169837d);
            contextMenu.add(0, 0, 0, z17 ? e17.getString(com.tencent.mm.R.string.bfm) : e17.getString(com.tencent.mm.R.string.bfn));
        } else {
            android.app.Activity e18 = com.tencent.mm.plugin.sns.ui.listener.i.e(mVar.f169837d);
            contextMenu.add(0, 0, 0, z17 ? e18.getString(com.tencent.mm.R.string.bfm) : e18.getString(com.tencent.mm.R.string.bfo));
        }
        contextMenu.add(1, 1, 0, com.tencent.mm.plugin.sns.ui.listener.i.e(mVar.f169837d).getString(com.tencent.mm.R.string.f493255jg4));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$1");
    }
}
