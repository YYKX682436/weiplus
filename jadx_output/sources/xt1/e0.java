package xt1;

/* loaded from: classes8.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456462d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f456463e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456464f;

    public e0(int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tu();
        lVar.f70665b = new r45.uu();
        lVar.f70666c = "/cgi-bin/micromsg-bin/cardsync";
        lVar.f70667d = 1047;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456462d = a17;
        r45.w54 w54Var = new r45.w54();
        w54Var.f388898f = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null);
        w54Var.f388896d = xt1.t0.ij().f449280d;
        w54Var.f388897e = xt1.t0.ij().f449281e;
        r45.tu tuVar = (r45.tu) a17.f70710a.f70684a;
        tuVar.f386804d = i17;
        tuVar.f386806f = w54Var;
        tuVar.f386807g = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456464f = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f456462d;
        r45.tu tuVar = (r45.tu) oVar.f70710a.f70684a;
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(282880, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(str);
        this.f456463e = h17;
        if (h17.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
        }
        tuVar.f386805e = x51.j1.a(this.f456463e);
        java.lang.Object[] objArr = new java.lang.Object[1];
        byte[] bArr = this.f456463e;
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", objArr);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1047;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00bf. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[SYNTHETIC] */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r7, int r8, int r9, java.lang.String r10, com.tencent.mm.network.v0 r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt1.e0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
