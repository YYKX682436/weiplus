package w22;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f442568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w22.v vVar, java.lang.String str) {
        super(1);
        this.f442568d = vVar;
        this.f442569e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "voice text block " + booleanValue);
        w22.v vVar = this.f442568d;
        vVar.f442587h = true;
        if (booleanValue) {
            db5.t7.makeText(vVar.f442580a, com.tencent.mm.R.string.c0_, 0).show();
        } else {
            vVar.f442585f = this.f442569e;
        }
        pm0.v.X(new w22.q(vVar));
        return jz5.f0.f302826a;
    }
}
