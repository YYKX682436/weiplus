package rz1;

/* loaded from: classes.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.SampleUI f401793d;

    public g(com.tencent.mm.plugin.datareport.sample.SampleUI sampleUI) {
        this.f401793d = sampleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f401793d.finish();
        return true;
    }
}
