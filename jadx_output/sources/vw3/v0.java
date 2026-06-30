package vw3;

/* loaded from: classes.dex */
public final class v0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441154d;

    public v0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f441154d = repairerFileListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.j(0, "删除所有文件", com.tencent.mm.R.raw.icons_outlined_delete, i65.a.d(this.f441154d.getContext(), com.tencent.mm.R.color.FG_0), false);
    }
}
