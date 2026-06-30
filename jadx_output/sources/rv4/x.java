package rv4;

/* loaded from: classes12.dex */
public final class x implements nv4.g {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f400560a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.y f400561b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f400562c;

    public x(rv4.w session, rv4.y delegate) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f400560a = session;
        this.f400561b = delegate;
    }

    public void a() {
        rv4.w wVar = this.f400560a;
        nv4.k kVar = wVar.f331675b;
        java.lang.String str = wVar.f331674a;
        ov4.f fVar = ov4.f.f349231f;
        ov4.g[] gVarArr = ov4.g.f349235d;
        kVar.c(new ov4.e(str, null, "", 0, 3, fVar, 0L, "1001", "", "", 0, null, 0, 7242, null));
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "[setting-button]-" + this.f400562c;
    }

    @Override // nv4.g
    public void w() {
        rv4.w wVar = this.f400560a;
        nv4.k kVar = wVar.f331675b;
        java.lang.String str = wVar.f331674a;
        ov4.f fVar = ov4.f.f349230e;
        ov4.g[] gVarArr = ov4.g.f349235d;
        kVar.d("setting-btn", new ov4.e(str, null, "", 0, 3, fVar, 0L, "1001", "", "", 0, null, 0, 7242, null));
    }
}
