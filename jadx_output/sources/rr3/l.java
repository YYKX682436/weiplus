package rr3;

/* loaded from: classes3.dex */
public final class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI f399198d;

    public l(com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI newBizInfoAuthMainUI) {
        this.f399198d = newBizInfoAuthMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f399198d.finish();
        return true;
    }
}
