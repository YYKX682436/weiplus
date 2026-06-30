package vw3;

/* loaded from: classes.dex */
public final class w0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441164d;

    public w0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f441164d = repairerFileListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441164d;
        g4Var.j(1, "名称排序(A-Z)", com.tencent.mm.R.raw.icons_outlined_arrow_down, i65.a.d(repairerFileListUI.getContext(), com.tencent.mm.R.color.FG_0), false);
        g4Var.j(2, "名称排序(Z-A)", com.tencent.mm.R.raw.icons_outlined_arrow_down, i65.a.d(repairerFileListUI.getContext(), com.tencent.mm.R.color.FG_0), false);
        g4Var.j(3, "时间排序(早到晚)", com.tencent.mm.R.raw.icons_outlined_time, i65.a.d(repairerFileListUI.getContext(), com.tencent.mm.R.color.Green_100), false);
        g4Var.j(4, "时间排序(晚到早)", com.tencent.mm.R.raw.icons_outlined_time, i65.a.d(repairerFileListUI.getContext(), com.tencent.mm.R.color.Green_100), false);
        g4Var.j(5, "大小排序(小到大)", com.tencent.mm.R.raw.icons_outlined_data, i65.a.d(repairerFileListUI.getContext(), com.tencent.mm.R.color.Indigo_100), false);
        g4Var.j(6, "大小排序(大到小)", com.tencent.mm.R.raw.icons_outlined_data, i65.a.d(repairerFileListUI.getContext(), com.tencent.mm.R.color.Indigo_100), false);
    }
}
