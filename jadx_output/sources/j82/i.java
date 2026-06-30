package j82;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f298158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI f298159e;

    public i(com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI favOfflineWebViewUI, android.app.Dialog dialog) {
        this.f298159e = favOfflineWebViewUI;
        this.f298158d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f298158d.dismiss();
        com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI favOfflineWebViewUI = this.f298159e;
        com.tencent.mm.ui.widget.snackbar.j.c(favOfflineWebViewUI.getString(com.tencent.mm.R.string.c9u), null, favOfflineWebViewUI, null, null);
    }
}
