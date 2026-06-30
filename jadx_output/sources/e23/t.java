package e23;

/* loaded from: classes12.dex */
public class t extends e23.p0 {
    public final e23.s B;
    public java.lang.CharSequence C;

    public t(int i17) {
        super(i17);
        this.B = new e23.s(this);
    }

    @Override // e23.p0, u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        super.a(context, eVar, objArr);
        java.lang.String d17 = o13.n.d(this.f246925q.f351189g);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            d17 = o13.n.d(this.f246925q.f351187e);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = com.tencent.mm.plugin.fts.ui.d.f138035d;
        ((ke0.e) xVar).getClass();
        this.C = com.tencent.mm.pluginsdk.ui.span.c0.n(context, d17, f17);
    }

    @Override // e23.p0, u13.g
    public u13.f k() {
        return this.B;
    }
}
