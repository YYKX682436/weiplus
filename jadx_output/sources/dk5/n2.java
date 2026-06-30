package dk5;

/* loaded from: classes.dex */
public class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.RetransmitPreviewUI f234761d;

    public n2(com.tencent.mm.ui.transmit.RetransmitPreviewUI retransmitPreviewUI) {
        this.f234761d = retransmitPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f234761d.finish();
        return true;
    }
}
