package kf3;

/* loaded from: classes.dex */
public final class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity f307405d;

    public n2(com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity massSendSelectPreviewFinderActivity) {
        this.f307405d = massSendSelectPreviewFinderActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f307405d.finish();
        return false;
    }
}
