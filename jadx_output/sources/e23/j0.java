package e23;

/* loaded from: classes12.dex */
public class j0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f246876q;

    /* renamed from: r, reason: collision with root package name */
    public final u13.f f246877r;

    /* renamed from: s, reason: collision with root package name */
    public final u13.e f246878s;

    public j0(int i17) {
        super(11, i17);
        this.f246877r = new e23.i0(this);
        this.f246878s = new e23.h0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f246876q = o13.q.m(context.getString(com.tencent.mm.R.string.icq), context.getString(com.tencent.mm.R.string.icp), android.text.TextUtils.ellipsize(i(), com.tencent.mm.plugin.fts.ui.d.f138036e, 400.0f, android.text.TextUtils.TruncateAt.MIDDLE).toString());
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246877r;
    }
}
