package ji1;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f299911d;

    public a(ji1.b bVar, android.content.Intent intent) {
        this.f299911d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String stringExtra = this.f299911d.getStringExtra("extra_item");
        ki1.b bVar = (ki1.b) com.tencent.mm.plugin.appbrand.app.r9.fj(ki1.b.class);
        if (stringExtra == null || bVar == null) {
            return;
        }
        bVar.getClass();
        ki1.a aVar = new ki1.a();
        aVar.field_token = stringExtra;
        if (!bVar.get(aVar, "token") || (str = aVar.field_token) == null || !str.equals(stringExtra)) {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = aVar.field_appid;
        b1Var.f317012a = aVar.field_username;
        b1Var.f317016c = aVar.field_versionType;
        b1Var.f317018d = aVar.field_appVersion;
        b1Var.f317032k = 1223;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var != null) {
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
        }
    }
}
