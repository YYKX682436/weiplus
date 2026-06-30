package e23;

/* loaded from: classes12.dex */
public class c extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f246793q;

    /* renamed from: r, reason: collision with root package name */
    public final e23.b f246794r;

    public c(int i17) {
        super(7, i17);
        this.f246794r = new e23.b(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f246793q = o13.q.d(context.getResources().getString(com.tencent.mm.R.string.ffl), "", p13.i.a(i(), i(), false, false)).f351105a;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246794r;
    }
}
