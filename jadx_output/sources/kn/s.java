package kn;

/* loaded from: classes11.dex */
public class s extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309451d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309452e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f309453f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f309454g;

    /* renamed from: h, reason: collision with root package name */
    public int f309455h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f309456i;

    /* renamed from: m, reason: collision with root package name */
    public int f309457m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f309458n;

    public s(java.lang.String str) {
        this.f309458n = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        this.f309458n = str;
        r45.sc3 sc3Var = new r45.sc3();
        sc3Var.f385623d = str;
        lVar.f70664a = sc3Var;
        lVar.f70665b = new r45.tc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getchatroominfodetail";
        lVar.f70667d = 223;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f309451d = lVar.a();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str == null ? "" : str;
        objArr[1] = com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatRoomInfoDetail", "chatRoomName:%s stack:%s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309452e = u0Var;
        return dispatch(sVar, this.f309451d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 223;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032c  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.mm.network.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kn.s.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
