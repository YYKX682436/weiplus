package j93;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f298409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.n f298410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, j93.n nVar) {
        super(0);
        this.f298409d = i17;
        this.f298410e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = 1;
        int i18 = this.f298409d;
        if (1 <= i18) {
            while (true) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                if (rVar != null) {
                    j93.n nVar = this.f298410e;
                    ((cy1.a) rVar).Cj("view_exp", nVar.f298443f, kz5.c1.k(new jz5.l("view_id", "tag_recommend_main"), new jz5.l("note_sid", nVar.Q6()), new jz5.l("add_username", nVar.f298441d), new jz5.l("tag_index", java.lang.Integer.valueOf(i17 - 1))), 33926);
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return jz5.f0.f302826a;
    }
}
