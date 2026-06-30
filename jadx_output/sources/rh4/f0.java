package rh4;

/* loaded from: classes8.dex */
public class f0 implements cl1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView f395722a;

    public f0(com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView) {
        this.f395722a = taskBarSectionWeAppRecyclerView;
    }

    public boolean a() {
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = this.f395722a;
        rh4.j0 j0Var = taskBarSectionWeAppRecyclerView.f172715j2;
        if (j0Var == null) {
            return false;
        }
        if (j0Var.o()) {
            return taskBarSectionWeAppRecyclerView.f172714i2;
        }
        rh4.o oVar = (rh4.o) taskBarSectionWeAppRecyclerView.f172715j2.n();
        if (oVar == null) {
            return false;
        }
        return oVar.f395776t;
    }
}
