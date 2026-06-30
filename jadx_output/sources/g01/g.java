package g01;

/* loaded from: classes8.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI f267413d;

    public g(com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI mPGdprPolicyUI) {
        this.f267413d = mPGdprPolicyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f267413d.finish();
        return true;
    }
}
