package kk4;

/* loaded from: classes15.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f308607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kk4.f0 f0Var, java.lang.String str, java.util.Map map) {
        super(0);
        this.f308605d = f0Var;
        this.f308606e = str;
        this.f308607f = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f308605d.f308525a.setDataSource(this.f308606e, this.f308607f);
        return jz5.f0.f302826a;
    }
}
