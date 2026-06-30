package fm3;

/* loaded from: classes10.dex */
public final class r implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f264115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264117c;

    public r(r45.ss4 ss4Var, java.lang.String str, yz5.l lVar) {
        this.f264115a = ss4Var;
        this.f264116b = str;
        this.f264117c = lVar;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        if (z17) {
            this.f264115a.set(2, this.f264116b);
        }
        this.f264117c.invoke(java.lang.Boolean.valueOf(z17));
    }
}
