package px2;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.a1 f358906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f358907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f358908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(bb2.a1 a1Var, long j17, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f358906d = a1Var;
        this.f358907e = j17;
        this.f358908f = finderThumbPlayerProxy;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bb2.a1 a1Var = this.f358906d;
        a1Var.getBulletManager().n(this.f358907e, this.f358908f.V(), false);
        a1Var.setReuse(false);
        return jz5.f0.f302826a;
    }
}
