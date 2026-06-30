package qb2;

/* loaded from: classes8.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f361192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f361194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f361195g;

    public d1(qb2.r1 r1Var, java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        this.f361192d = r1Var;
        this.f361193e = str;
        this.f361194f = map;
        this.f361195g = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f361192d.k(this.f361193e, this.f361194f, this.f361195g, "4");
    }
}
