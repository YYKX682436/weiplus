package s1;

/* loaded from: classes14.dex */
public final class w0 implements s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f402084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f402085b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f402086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f402088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f402089f;

    public w0(int i17, int i18, java.util.Map map, s1.x0 x0Var, yz5.l lVar) {
        this.f402087d = i17;
        this.f402088e = x0Var;
        this.f402089f = lVar;
        this.f402084a = i17;
        this.f402085b = i18;
        this.f402086c = map;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f402086c;
    }

    @Override // s1.u0
    public void e() {
        s1.m1 m1Var = s1.n1.f402041a;
        p2.s layoutDirection = this.f402088e.getLayoutDirection();
        int i17 = s1.n1.f402043c;
        p2.s sVar = s1.n1.f402042b;
        s1.n1.f402043c = this.f402087d;
        s1.n1.f402042b = layoutDirection;
        this.f402089f.invoke(m1Var);
        s1.n1.f402043c = i17;
        s1.n1.f402042b = sVar;
    }

    @Override // s1.u0
    public int getHeight() {
        return this.f402085b;
    }

    @Override // s1.u0
    public int getWidth() {
        return this.f402084a;
    }
}
