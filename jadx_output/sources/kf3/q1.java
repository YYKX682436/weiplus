package kf3;

/* loaded from: classes5.dex */
public class q1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307417d;

    public q1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        this.f307417d = massSendMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f307417d.finish();
        return true;
    }
}
