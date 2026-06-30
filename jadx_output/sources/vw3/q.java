package vw3;

/* loaded from: classes8.dex */
public final class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI f441074d;

    public q(com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI repairerActivityStackDebugUI) {
        this.f441074d = repairerActivityStackDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441074d.U6().A(true, 2);
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(69, dx3.c.f244498v);
        }
        return true;
    }
}
