package rk4;

/* loaded from: classes11.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.q3 f396877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(rk4.q3 q3Var, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        super(1);
        this.f396877d = q3Var;
        this.f396878e = str;
        this.f396879f = str2;
        this.f396880g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm0.v.X(new rk4.n3((ll4.c) obj, this.f396877d, this.f396878e, this.f396879f, this.f396880g));
        return jz5.f0.f302826a;
    }
}
