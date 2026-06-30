package fa1;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager f260703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f260704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f260705c;

    public z(com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager wAGameMISSignatureManager, long j17, int i17) {
        this.f260703a = wAGameMISSignatureManager;
        this.f260704b = j17;
        this.f260705c = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        boolean z17;
        r45.eq5 eq5Var = (r45.eq5) oVar.f70711b.f70700a;
        if (eq5Var != null && eq5Var.f373677d != null) {
            com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager wAGameMISSignatureManager = this.f260703a;
            synchronized (wAGameMISSignatureManager) {
                z17 = wAGameMISSignatureManager.f78197b == 0;
            }
            if (z17) {
                return;
            } else {
                this.f260703a.nativeSignature(this.f260704b, eq5Var.f373677d.g(), this.f260705c);
            }
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("WAGameMISSignatureManager", "hy: upload failed: %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
    }
}
