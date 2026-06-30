package f93;

/* loaded from: classes10.dex */
public final class t2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI f260468d;

    public t2(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI) {
        this.f260468d = contactLabelRecommendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f260468d.finish();
        return false;
    }
}
