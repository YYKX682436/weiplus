package f93;

/* loaded from: classes11.dex */
public final class s2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI f260462d;

    public s2(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI) {
        this.f260462d = contactLabelRecommendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI.U6(this.f260462d);
        return true;
    }
}
