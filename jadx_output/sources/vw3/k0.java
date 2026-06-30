package vw3;

/* loaded from: classes.dex */
public final class k0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f441009e;

    public k0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI, com.tencent.mm.vfs.r6 r6Var) {
        this.f441008d = repairerFileListUI;
        this.f441009e = r6Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441008d;
        android.content.res.Resources resources = repairerFileListUI.getContext().getResources();
        g4Var.j(1, resources != null ? resources.getString(com.tencent.mm.R.string.f490559yh) : null, com.tencent.mm.R.raw.icons_filled_share, i65.a.d(repairerFileListUI, com.tencent.mm.R.color.f478502m), false);
        android.content.res.Resources resources2 = repairerFileListUI.getContext().getResources();
        g4Var.j(2, resources2 != null ? resources2.getString(com.tencent.mm.R.string.f490367t0) : null, com.tencent.mm.R.raw.icons_filled_delete, i65.a.d(repairerFileListUI, com.tencent.mm.R.color.f478502m), false);
        g4Var.j(3, "查看并拷贝exif-aigc信息", com.tencent.mm.R.raw.icons_filled_expand, i65.a.d(repairerFileListUI, com.tencent.mm.R.color.f478502m), false);
        if (this.f441009e.A()) {
            g4Var.j(4, "以图片方式打开", com.tencent.mm.R.raw.icons_filled_album, i65.a.d(repairerFileListUI, com.tencent.mm.R.color.f478502m), false);
        }
        g4Var.j(5, "查看并拷贝exif-隐私信息", com.tencent.mm.R.raw.icons_filled_search, i65.a.d(repairerFileListUI, com.tencent.mm.R.color.f478502m), false);
        g4Var.j(6, "查看视频信息", com.tencent.mm.R.raw.icons_filled_keyboard, i65.a.d(repairerFileListUI, com.tencent.mm.R.color.f478502m), false);
    }
}
