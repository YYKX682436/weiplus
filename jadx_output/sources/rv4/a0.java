package rv4;

/* loaded from: classes12.dex */
public abstract class a0 implements nv4.g {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f400427a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f400428b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400429c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f400430d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f400431e;

    public a0(rv4.w session, boolean z17, java.lang.String title, boolean z18) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(title, "title");
        this.f400427a = session;
        this.f400428b = z17;
        this.f400429c = title;
        this.f400430d = z18;
    }

    public final ov4.e a(ov4.f fVar) {
        return new ov4.e(this.f400427a.f331674a, null, "", 0, 3, fVar, 0L, b(), "", this.f400429c, 0, null, 0, 7242, null);
    }

    public abstract java.lang.String b();

    public abstract boolean d();

    public abstract void e(boolean z17);

    @Override // nv4.g
    public void w() {
        this.f400427a.f331675b.d("setting-entry-" + this.f400429c + '-' + d(), a(ov4.f.f349230e));
    }
}
