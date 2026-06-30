package hr3;

/* loaded from: classes5.dex */
public final class sd implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiPictureUI f283976d;

    public sd(com.tencent.mm.plugin.profile.ui.SayHiPictureUI sayHiPictureUI) {
        this.f283976d = sayHiPictureUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f283976d.finish();
        return true;
    }
}
