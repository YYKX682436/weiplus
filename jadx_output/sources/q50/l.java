package q50;

/* loaded from: classes.dex */
public final class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.forward.ui.PreviewProfileUI f360155d;

    public l(com.tencent.mm.feature.forward.ui.PreviewProfileUI previewProfileUI) {
        this.f360155d = previewProfileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f360155d.finish();
        return true;
    }
}
