package dn1;

/* loaded from: classes12.dex */
public final class f extends pq5.c implements en1.j {
    public f(dn1.e eVar) {
    }

    @Override // en1.j
    public void onAuthResponse(final o45.ug ugVar, final o45.vg vgVar, final boolean z17) {
        w(new dn1.g(this, ugVar, vgVar, z17));
        fs.g.b(en1.l.class, new fs.o() { // from class: dn1.f$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((en1.l) nVar).onAuthResponse(o45.ug.this, vgVar, z17);
                return false;
            }
        });
    }

    @Override // en1.j
    public void onRegResponse(final o45.ci ciVar, final java.lang.String str, final int i17, final java.lang.String str2, final java.lang.String str3, final int i18) {
        w(new dn1.h(this, ciVar, str, i17, str2, str3, i18));
        fs.g.b(en1.l.class, new fs.o() { // from class: dn1.f$$b
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((en1.l) nVar).onRegResponse(o45.ci.this, str, i17, str2, str3, i18);
                return false;
            }
        });
    }
}
