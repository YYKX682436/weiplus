package es3;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f256422d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f256423e;

    /* renamed from: f, reason: collision with root package name */
    public final int f256424f;

    public a(int i17, java.lang.String str, java.lang.String str2, float f17, float f18, int i18, int i19, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wo0();
        lVar.f70665b = new r45.xo0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmfacingcreatechatroom";
        lVar.f70667d = vd1.j.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f256423e = a17;
        r45.wo0 wo0Var = (r45.wo0) a17.f70710a.f70684a;
        this.f256424f = i17;
        wo0Var.f389331d = i17;
        wo0Var.f389332e = str;
        wo0Var.f389339o = str2;
        wo0Var.f389333f = f18;
        wo0Var.f389334g = f17;
        wo0Var.f389335h = i18;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            wo0Var.f389336i = str3;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            wo0Var.f389337m = str4;
        }
        wo0Var.f389338n = i19;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, f18, f17, i18);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f256422d = u0Var;
        return dispatch(sVar, this.f256423e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return vd1.j.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.xo0 xo0Var;
        java.util.LinkedList linkedList;
        if (this.f256424f == 0 && (xo0Var = (r45.xo0) this.f256423e.f70711b.f70700a) != null && (linkedList = xo0Var.f390290f) != null) {
            java.lang.System.currentTimeMillis();
            int size = linkedList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i27 = 0; i27 < size; i27++) {
                r45.yo0 yo0Var = (r45.yo0) linkedList.get(i27);
                com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                if (com.tencent.mm.sdk.platformtools.t8.K0(yo0Var.f391251d)) {
                    r0Var.f70529a = yo0Var.f391252e;
                } else {
                    r0Var.f70529a = yo0Var.f391251d;
                }
                r0Var.f70532d = yo0Var.f391254g;
                r0Var.f70534f = 1;
                arrayList.add(r0Var);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().m0(arrayList);
            java.lang.System.currentTimeMillis();
        }
        this.f256422d.onSceneEnd(i18, i19, str, this);
    }
}
