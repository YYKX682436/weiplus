package te2;

/* loaded from: classes10.dex */
public final class d9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f417957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f417959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.tt1 f417960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f417961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(int i17, int i18, te2.m9 m9Var, r45.tt1 tt1Var, yz5.l lVar) {
        super(0);
        this.f417957d = i17;
        this.f417958e = i18;
        this.f417959f = m9Var;
        this.f417960g = tt1Var;
        this.f417961h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f417961h;
        int i17 = this.f417958e;
        te2.m9 m9Var = this.f417959f;
        int i18 = this.f417957d;
        if (i18 == 0 && i17 == 0) {
            ((mm2.m6) m9Var.f418150e.a(mm2.m6.class)).f329249q.a(this.f417960g);
            int size = ((mm2.m6) m9Var.f418150e.a(mm2.m6.class)).f329249q.f234085a.size();
            com.tencent.mars.xlog.Log.i(m9Var.f418234m, "loadSongListData - success, size: " + size);
            lVar.invoke(java.lang.Integer.valueOf(size));
        } else {
            com.tencent.mars.xlog.Log.i(m9Var.f418234m, "loadSongListData - failed, errType: " + i18 + ", errCode: " + i17);
            lVar.invoke(0);
        }
        return jz5.f0.f302826a;
    }
}
