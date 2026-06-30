package ww1;

/* loaded from: classes15.dex */
public class h2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanMaterialCodeEvent f450211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.j2 f450213f;

    public h2(ww1.j2 j2Var, com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent, android.content.Context context) {
        this.f450213f = j2Var;
        this.f450211d = scanMaterialCodeEvent;
        this.f450212e = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ww1.j2 j2Var = this.f450213f;
        android.app.Dialog dialog = j2Var.f450221d;
        if (dialog != null && dialog.isShowing()) {
            j2Var.f450221d.dismiss();
            j2Var.f450221d = null;
        }
        gm0.j1.d().q(1800, this);
        ww1.q1 q1Var = (ww1.q1) m1Var;
        boolean z17 = q1Var.f214031i;
        com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent = this.f450211d;
        if (!z17 && !q1Var.f214032m) {
            am.vs vsVar = scanMaterialCodeEvent.f54732h;
            r45.wu5 wu5Var = q1Var.f450270r;
            vsVar.f8213b = wu5Var.f389477f;
            vsVar.f8214c = wu5Var.f389478g;
        }
        if (q1Var.f214032m) {
            am.vs vsVar2 = scanMaterialCodeEvent.f54732h;
            java.lang.String str2 = q1Var.f450270r.f389476e;
            vsVar2.f8212a = str2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                this.f450211d.f54732h.f8212a = this.f450212e.getString(com.tencent.mm.R.string.l0g);
            }
        }
        if (q1Var.f214031i) {
            java.lang.String str3 = q1Var.f214029g;
            scanMaterialCodeEvent.f54732h.f8212a = str3;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                this.f450211d.f54732h.f8212a = this.f450212e.getString(com.tencent.mm.R.string.l0g);
            }
        }
        ((e04.w0) scanMaterialCodeEvent.f54731g.f8134e).run();
    }
}
