package qt3;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.l f366644d;

    public j(qt3.l lVar) {
        this.f366644d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "save pic ,imageState : %s", valueOf);
        java.lang.Boolean bool = (java.lang.Boolean) this.f366644d.f366647e.a().b("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.TRUE);
        if (!valueOf.booleanValue() || !bool.booleanValue()) {
            ((ku5.t0) ku5.t0.f312615d).g(new qt3.i(this));
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f366644d.f366646d.getResources().getString(com.tencent.mm.R.string.f491160c62, q75.c.d()), 1).show();
        ((android.app.Activity) this.f366644d.f366646d).setResult(-1);
        ((android.app.Activity) this.f366644d.f366646d).finish();
    }
}
