package k14;

/* loaded from: classes2.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303391d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303392e;

    /* renamed from: f, reason: collision with root package name */
    public final int f303393f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f303394g;

    public w(java.lang.String str, int i17) {
        this.f303392e = str;
        this.f303393f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303391d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.wc0 wc0Var = new r45.wc0();
        wc0Var.f389061d = this.f303392e;
        wc0Var.f389062e = this.f303393f;
        wc0Var.f389063f = this.f303394g;
        lVar.f70664a = wc0Var;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/deluserauth";
        lVar.f70665b = new r45.xc0();
        lVar.f70667d = 1127;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1127;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.qv6 qv6Var = ((r45.xc0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f389967d;
        if (qv6Var != null) {
            i19 = qv6Var.f384304d;
            str = qv6Var.f384305e;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f303391d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public w(java.lang.String str, int i17, boolean z17) {
        this(str, i17);
        this.f303394g = z17;
    }
}
