package or1;

/* loaded from: classes8.dex */
public class z1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI f347606d;

    public z1(com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI receiveTemplateMsgMgrUI) {
        this.f347606d = receiveTemplateMsgMgrUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f347606d.finish();
        return true;
    }
}
