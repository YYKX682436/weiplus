package vw3;

/* loaded from: classes.dex */
public final class n3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI f441040d;

    public n3(com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI) {
        this.f441040d = repairerMsgResendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441040d.finish();
        return true;
    }
}
