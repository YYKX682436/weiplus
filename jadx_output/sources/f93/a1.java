package f93;

/* loaded from: classes11.dex */
public final class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelCreateUI f260287d;

    public a1(com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI) {
        this.f260287d = contactLabelCreateUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI = this.f260287d;
        contactLabelCreateUI.setResult(0);
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
        return true;
    }
}
