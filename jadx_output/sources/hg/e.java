package hg;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.u3 f281287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg.g f281288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hg.h f281289f;

    public e(hg.h hVar, com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var, hg.g gVar) {
        this.f281289f = hVar;
        this.f281287d = u3Var;
        this.f281288e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hg.h hVar = this.f281289f;
        if (hVar.f281303g) {
            this.f281287d.a(this.f281288e.f281292b);
            if (android.os.Build.VERSION.SDK_INT < 33) {
                sf.c cVar = sf.c.f406939a;
                com.tencent.mm.plugin.appbrand.jsapi.t a17 = hVar.f281297a.a();
                com.tencent.mm.plugin.appbrand.jsapi.l b17 = hVar.f281297a.b();
                int i17 = hVar.f281302f;
                cVar.a(a17, b17, new sf.b(i17, hVar.c(i17), java.lang.Integer.valueOf(hVar.f281304h), new yz5.a() { // from class: hg.e$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        hg.h hVar2 = hg.e.this.f281289f;
                        hVar2.onKeyboardHeightChanged(true, hVar2.f281303g ? hVar2.f281302f : 0, false);
                        return null;
                    }
                }));
            }
        }
    }
}
