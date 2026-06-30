package e23;

/* loaded from: classes12.dex */
public class s0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f246956q;

    /* renamed from: r, reason: collision with root package name */
    public final e23.r0 f246957r;

    public s0(int i17) {
        super(8, i17);
        this.f246957r = new e23.r0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String f17 = com.tencent.mm.plugin.fts.ui.n3.f(this.f423764g);
        if (f17 == null) {
            this.f246956q = "";
        } else {
            this.f246956q = context.getResources().getString(com.tencent.mm.R.string.icl, f17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMoreDataItem", "fillDataItem: tip=%s", this.f246956q);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246957r;
    }
}
