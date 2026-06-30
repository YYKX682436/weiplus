package p61;

/* loaded from: classes11.dex */
public class g5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ f352276d;

    public g5(com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ startUnbindQQ) {
        this.f352276d = startUnbindQQ;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f352276d.finish();
        return true;
    }
}
