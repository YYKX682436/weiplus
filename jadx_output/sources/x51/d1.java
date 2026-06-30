package x51;

/* loaded from: classes5.dex */
public class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f451986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f451988f;

    public d1(int i17, android.app.Activity activity, java.lang.Runnable runnable) {
        this.f451986d = i17;
        this.f451987e = activity;
        this.f451988f = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f451986d;
        com.tencent.mars.xlog.Log.i("MicroMsg.PostLoginUtil", "[cpan] kv report logid:%d scene:%d", 11438, java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11438, java.lang.Integer.valueOf(i18));
        r61.q0.k(true);
        x51.i1.g(true, false);
        x51.e.a(x51.e.f451990b);
        java.lang.Runnable runnable = this.f451988f;
        if (runnable != null) {
            runnable.run();
        }
        this.f451987e.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
    }
}
