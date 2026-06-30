package ww1;

/* loaded from: classes15.dex */
public class i2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanMaterialCodeEvent f450217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.j2 f450219f;

    public i2(ww1.j2 j2Var, com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent, android.content.Context context) {
        this.f450219f = j2Var;
        this.f450217d = scanMaterialCodeEvent;
        this.f450218e = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ww1.j2 j2Var = this.f450219f;
        android.app.Dialog dialog = j2Var.f450221d;
        if (dialog != null && dialog.isShowing()) {
            j2Var.f450221d.dismiss();
            j2Var.f450221d = null;
        }
        gm0.j1.d().q(2811, this);
        xw1.e eVar = (xw1.e) m1Var;
        boolean z17 = eVar.f214031i;
        com.tencent.mm.autogen.events.ScanMaterialCodeEvent scanMaterialCodeEvent = this.f450217d;
        if (!z17 && !eVar.f214032m) {
            am.vs vsVar = scanMaterialCodeEvent.f54732h;
            r45.av5 av5Var = eVar.f457667r;
            vsVar.f8213b = av5Var.f370279f;
            vsVar.f8214c = av5Var.f370280g;
        }
        if (eVar.f214032m) {
            am.vs vsVar2 = scanMaterialCodeEvent.f54732h;
            java.lang.String str2 = eVar.f457667r.f370278e;
            vsVar2.f8212a = str2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                this.f450217d.f54732h.f8212a = this.f450218e.getString(com.tencent.mm.R.string.l0g);
            }
        }
        if (eVar.f214031i) {
            java.lang.String str3 = eVar.f214029g;
            scanMaterialCodeEvent.f54732h.f8212a = str3;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                this.f450217d.f54732h.f8212a = this.f450218e.getString(com.tencent.mm.R.string.l0g);
            }
        }
        ((e04.w0) scanMaterialCodeEvent.f54731g.f8134e).run();
    }
}
