package uf5;

/* loaded from: classes4.dex */
public class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427238d;

    public h0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427238d = contactMgrUIBase;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427238d;
        contactMgrUIBase.hideVKB();
        contactMgrUIBase.finish();
        return false;
    }
}
