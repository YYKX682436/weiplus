package os3;

/* loaded from: classes.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348109d;

    public i4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348109d = readMailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348109d;
        android.content.Intent launchIntentForPackage = readMailUI.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("curPageId", 2);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String string = readMailUI.getString(com.tencent.mm.R.string.azq);
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(readMailUI, launchIntentForPackage, string, null, null);
    }
}
