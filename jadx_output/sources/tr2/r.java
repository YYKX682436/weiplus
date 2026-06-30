package tr2;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tr2.r f421409d = new tr2.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFinderCheckEmoji: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(' ');
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(' ');
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.e("Finder.PostInteractionEasterEggUIC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
