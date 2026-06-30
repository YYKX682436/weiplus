package w22;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f442571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w22.v vVar) {
        super(0);
        this.f442571d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "video play callback");
        w22.v vVar = this.f442571d;
        vVar.f442588i = true;
        pm0.v.X(new w22.q(vVar));
        return jz5.f0.f302826a;
    }
}
