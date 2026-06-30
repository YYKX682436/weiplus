package uc4;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.o f426421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426422e;

    public j(uc4.o oVar, android.content.Context context) {
        this.f426421d = oVar;
        this.f426422e = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
        xc4.p c17 = this.f426421d.c();
        java.lang.String userName = c17 != null ? c17.getUserName() : null;
        if (userName == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
            return;
        }
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(userName);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = true;
        boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        android.content.Context context = this.f426422e;
        if (f07 != null && com.tencent.mm.storage.z3.m4(userName) && kotlin.jvm.internal.o.b("3552365301", f07.Q0())) {
            contextMenu.add(0, 0, 0, z18 ? i65.a.r(context, com.tencent.mm.R.string.bfm) : i65.a.r(context, com.tencent.mm.R.string.bfo));
        } else {
            contextMenu.add(0, 0, 0, z18 ? i65.a.r(context, com.tencent.mm.R.string.bfm) : i65.a.r(context, com.tencent.mm.R.string.bfn));
        }
        contextMenu.add(1, 1, 0, context.getString(com.tencent.mm.R.string.f493255jg4));
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            contextMenu.add(2, 2, 0, context.getString(com.tencent.mm.R.string.j_z));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
    }
}
