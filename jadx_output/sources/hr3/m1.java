package hr3;

/* loaded from: classes11.dex */
public class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283787d;

    public m1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283787d = contactInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283787d;
        gr3.e.c(contactInfoUI.f153661n.d1(), com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX, contactInfoUI.f153673z, contactInfoUI.getIntent(), 0, contactInfoUI.f153659i);
        t25.a aVar = contactInfoUI.f153655e;
        if ((aVar instanceof t25.b) && ((t25.b) aVar).onBackPress()) {
            return true;
        }
        contactInfoUI.finish();
        return true;
    }
}
