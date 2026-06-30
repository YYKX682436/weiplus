package f93;

/* loaded from: classes11.dex */
public class e4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260329d;

    public e4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260329d = contactLabelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260329d;
        if (contactLabelUI.f143299g) {
            java.util.Iterator it = contactLabelUI.f143315z.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                if (!contactLabelUI.C.contains((java.lang.String) it.next())) {
                    z17 = true;
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(contactLabelUI.f143302m.getEdittextText())) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.label.ui.ContactLabelUI.X6(contactLabelUI);
            } else {
                contactLabelUI.finish();
            }
        } else {
            com.tencent.mm.plugin.label.ui.ContactLabelUI.X6(contactLabelUI);
        }
        return false;
    }
}
