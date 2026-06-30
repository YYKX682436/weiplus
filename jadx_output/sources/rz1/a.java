package rz1;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.CgiReportDebugUI f401788d;

    public a(com.tencent.mm.plugin.datareport.sample.CgiReportDebugUI cgiReportDebugUI) {
        this.f401788d = cgiReportDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f401788d.finish();
        return true;
    }
}
