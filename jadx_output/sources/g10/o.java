package g10;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g10.v f267540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f267541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, g10.v vVar, bw5.x7 x7Var) {
        super(0);
        this.f267539d = str;
        this.f267540e = vVar;
        this.f267541f = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, bizName = " + this.f267539d);
        this.f267540e.Ai(this.f267541f);
        return jz5.f0.f302826a;
    }
}
