package uf5;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f427308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uf5.x xVar, java.lang.String str) {
        super(0);
        this.f427308d = xVar;
        this.f427309e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j75.f Q6 = this.f427308d.Q6();
        if (Q6 != null) {
            Q6.B3(new uf5.a(this.f427309e));
        }
        return jz5.f0.f302826a;
    }
}
