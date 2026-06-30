package rr3;

/* loaded from: classes4.dex */
public final class e0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI f399183d;

    public e0(com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI newBizInfoRecordingUI) {
        this.f399183d = newBizInfoRecordingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f399183d.finish();
        return true;
    }
}
