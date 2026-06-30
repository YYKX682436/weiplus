package wv1;

/* loaded from: classes9.dex */
public class b extends wv1.g {

    /* renamed from: g, reason: collision with root package name */
    public ot0.q f449934g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f449935h;

    @Override // wv1.a
    public java.lang.String c() {
        return p() != null ? com.tencent.mm.sdk.platformtools.t8.u1(p().f348690o, "") : "";
    }

    @Override // wv1.a
    public java.lang.String d() {
        return p() != null ? p().n() : "";
    }

    @Override // wv1.a
    public long e() {
        if (p() != null) {
            return p().f348682m;
        }
        return 0L;
    }

    @Override // wv1.g, wv1.e
    public java.lang.String m() {
        if (this.f449935h == null && p() != null && p().f348694p != null && p().f348694p.length() > 0) {
            com.tencent.mm.pluginsdk.model.app.d D0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(p().f348694p);
            if (D0 != null) {
                this.f449935h = D0.field_fileFullPath;
            }
        }
        java.lang.String str = this.f449935h;
        return str != null ? str : "";
    }

    public final ot0.q p() {
        if (this.f449934g == null) {
            this.f449934g = ot0.q.v(this.f449930b.j());
        }
        return this.f449934g;
    }
}
