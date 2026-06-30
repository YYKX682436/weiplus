package z43;

/* loaded from: classes15.dex */
public class u implements com.tencent.mm.pluginsdk.model.app.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.c5 f470129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z43.v f470130b;

    public u(z43.v vVar, com.tencent.mm.pluginsdk.model.app.c5 c5Var) {
        this.f470130b = vVar;
        this.f470129a = c5Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchApplication", "onLaunchApp(launchSuccess : %s, launchCancel : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        z43.v vVar = this.f470130b;
        if (z18 || z17) {
            vVar.f470134g.f470144p.f143443f.d(false);
        } else {
            vVar.f470134g.f470144p.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.app.c5
    public void b(boolean z17) {
        this.f470129a.b(z17);
    }

    @Override // com.tencent.mm.pluginsdk.model.app.c5
    public void reset() {
        this.f470129a.reset();
    }
}
