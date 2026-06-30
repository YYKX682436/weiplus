package g43;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g43.a f268740d = new g43.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        m53.t b17 = com.tencent.mm.plugin.game.commlib.i.b();
        if (b17 != null) {
            m53.l lVar = b17.f324065f;
            java.lang.Integer valueOf = lVar != null ? java.lang.Integer.valueOf(lVar.f323856f) : null;
            if (valueOf != null) {
                i17 = valueOf.intValue();
                return java.lang.Integer.valueOf(i17);
            }
        }
        i17 = 50;
        return java.lang.Integer.valueOf(i17);
    }
}
