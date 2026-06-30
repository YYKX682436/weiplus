package dk5;

/* loaded from: classes.dex */
public class n4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectNoSupportUI f234763d;

    public n4(com.tencent.mm.ui.transmit.SelectNoSupportUI selectNoSupportUI) {
        this.f234763d = selectNoSupportUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.transmit.SelectNoSupportUI selectNoSupportUI = this.f234763d;
        selectNoSupportUI.hideVKB();
        selectNoSupportUI.finish();
        return true;
    }
}
