package kp3;

/* loaded from: classes14.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.palm.ui.PalmPrintMainUI f310970d;

    public d0(com.tencent.mm.plugin.palm.ui.PalmPrintMainUI palmPrintMainUI) {
        this.f310970d = palmPrintMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintMainUI", "click BackBtn");
        this.f310970d.onBackPressed();
        return true;
    }
}
