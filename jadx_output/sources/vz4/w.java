package vz4;

/* loaded from: classes8.dex */
public class w implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.x f441751d;

    public w(vz4.x xVar) {
        this.f441751d = xVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        vz4.x xVar = this.f441751d;
        if (!xVar.f441763k || xVar.f441762j) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("we_pkg_sp", 4);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("white_screen_times", 0).commit();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "white screen");
            com.tencent.mm.sdk.platformtools.u3.h(new vz4.v(this));
        }
        return false;
    }
}
