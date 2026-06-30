package e23;

/* loaded from: classes12.dex */
public class g0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f246853q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f246854r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f246855s;

    /* renamed from: t, reason: collision with root package name */
    public final e23.f0 f246856t;

    /* renamed from: u, reason: collision with root package name */
    public final e23.e0 f246857u;

    public g0(int i17) {
        super(0, i17);
        this.f246856t = new e23.f0(this);
        this.f246857u = new e23.e0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String f17 = com.tencent.mm.plugin.fts.ui.n3.f(this.f423764g);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (f17 == null) {
            f17 = "";
        }
        this.f246853q = f17;
        if (this.f423763f == 2) {
            int i17 = this.f423764g != -4 ? 0 : com.tencent.mm.R.string.f490471w0;
            java.lang.String string = i17 == 0 ? null : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17);
            this.f246854r = string != null ? string : "";
            this.f246855s = this.f423764g == -4 ? new com.tencent.mm.plugin.fts.ui.o3(i()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHeaderDataItem", "fillingDataItem: header=%s", this.f246853q);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246856t;
    }

    public u13.e o() {
        return this.f246857u;
    }
}
