package fw;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f267034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fw.v f267035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fq0.x xVar, fw.v vVar) {
        super(0);
        this.f267034d = xVar;
        this.f267035e = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fq0.x xVar = this.f267034d;
        if (xVar.f265483g > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "saveCardHeight " + xVar);
            this.f267035e.B(xVar.f265477a, xVar.f265483g);
        }
        return jz5.f0.f302826a;
    }
}
