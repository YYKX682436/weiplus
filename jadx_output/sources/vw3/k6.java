package vw3;

/* loaded from: classes.dex */
public final class k6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441017d;

    public k6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f441017d = repairerUploadTestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441017d.finish();
        return true;
    }
}
