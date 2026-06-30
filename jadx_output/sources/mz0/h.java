package mz0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mz0.b2 b2Var) {
        super(0);
        this.f332965d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        mz0.b2 b2Var = this.f332965d;
        mz0.b2.O6(b2Var);
        return kz5.c1.k(new jz5.l(kz0.a.f313647o, java.lang.Integer.valueOf(((i17 * 3) / 4) - mz0.b2.O6(b2Var))), new jz5.l(kz0.a.f313646n, java.lang.Integer.valueOf(i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 44 * 8))), new jz5.l(kz0.a.f313644i, java.lang.Integer.valueOf(i17 / 2)));
    }
}
