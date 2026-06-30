package mm1;

/* loaded from: classes11.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ il4.e f328656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm1.f0 f328658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(il4.e eVar, java.lang.String str, mm1.f0 f0Var) {
        super(0);
        this.f328656d = eVar;
        this.f328657e = str;
        this.f328658f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        il4.e eVar = this.f328656d;
        if (eVar.f292106c == 0) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizAudioServicesImpl", "play with fromScene 0", new java.lang.Object[0]);
        }
        int i17 = jm4.m3.f300398e;
        java.lang.String str = this.f328657e;
        jm4.k3 k3Var = (jm4.k3) urgen.ur_0025.UR_65C4.UR_C306(new java.lang.String[]{str});
        kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskServiceCpp");
        jm4.m3 m3Var = (jm4.m3) k3Var;
        m3Var.e(eVar.f292106c);
        eVar.f292122s.f292135g = str;
        mm1.f0.wi(this.f328658f, m3Var, eVar, 0);
        return jz5.f0.f302826a;
    }
}
