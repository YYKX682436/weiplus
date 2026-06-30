package go5;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go5.c0 f274118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f274119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f274120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f274121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f274122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ go5.b f274123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(go5.c0 c0Var, int i17, boolean z17, int i18, int i19, go5.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274118d = c0Var;
        this.f274119e = i17;
        this.f274120f = z17;
        this.f274121g = i18;
        this.f274122h = i19;
        this.f274123i = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new go5.b0(this.f274118d, this.f274119e, this.f274120f, this.f274121g, this.f274122h, this.f274123i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        go5.b0 b0Var = (go5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f274119e;
        long j17 = i17;
        go5.c0 c0Var = this.f274118d;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerImpl", "putModelMd5() called with: sampleRate = " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.voip.model.s1 s1Var = com.tencent.mm.plugin.voip.model.s1.f176798a;
        s1Var.c(sb6, 112, j17 <= 16000 ? 3 : 4);
        if (sb6.length() > 0) {
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            byte[] m17 = r26.i0.m(sb7);
            com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(m17.length);
            allocateDirect.put(m17);
            v0Var.D(951, allocateDirect, m17.length);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        s1Var.c(sb8, 112, 13);
        if (sb8.length() > 0) {
            java.lang.String sb9 = sb8.toString();
            kotlin.jvm.internal.o.f(sb9, "toString(...)");
            byte[] m18 = r26.i0.m(sb9);
            com.tencent.mm.plugin.voipmp.platform.v0 v0Var2 = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
            java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(m18.length);
            allocateDirect2.put(m18);
            v0Var2.D(970, allocateDirect2, m18.length);
        }
        if (j17 <= 16000) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            s1Var.c(sb10, 112, 7);
            if (sb10.length() > 0) {
                java.lang.String sb11 = sb10.toString();
                kotlin.jvm.internal.o.f(sb11, "toString(...)");
                byte[] m19 = r26.i0.m(sb11);
                com.tencent.mm.plugin.voipmp.platform.v0 v0Var3 = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
                java.nio.ByteBuffer allocateDirect3 = java.nio.ByteBuffer.allocateDirect(m19.length);
                allocateDirect3.put(m19);
                v0Var3.D(952, allocateDirect3, m19.length);
            }
        }
        c0Var.getClass();
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerImpl", "WaveHAid, flag:%s, type:%s, device:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni));
        if (bj6) {
            byte[] bArr = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni & 255), (byte) ((Ni >> 8) & 255), (byte) ((Ni >> 16) & 255), (byte) ((Ni >> 24) & 255)};
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.D(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX, java.nio.ByteBuffer.allocateDirect(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).put(bArr), 8);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerImpl", "WaveHAid, params:%d,%d,%d,%d,%d,%d,%d,%d, size:%d, buffer:%d,%d", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]), java.lang.Byte.valueOf(bArr[5]), java.lang.Byte.valueOf(bArr[6]), java.lang.Byte.valueOf(bArr[7]), 8, java.lang.Byte.valueOf(wrap.get()), java.lang.Byte.valueOf(wrap.get()));
        }
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("startPlay() called with: speakerOn = ");
        boolean z17 = this.f274120f;
        sb12.append(z17);
        sb12.append(", sampleRate = ");
        sb12.append(i17);
        sb12.append(", channels = ");
        int i18 = this.f274121g;
        sb12.append(i18);
        sb12.append(", frameDuration = ");
        int i19 = this.f274122h;
        sb12.append(i19);
        sb12.append(", audioDataGetter = ");
        go5.b bVar = this.f274123i;
        sb12.append(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerImpl", sb12.toString());
        com.tencent.mm.plugin.voip.model.e eVar = new com.tencent.mm.plugin.voip.model.e();
        eVar.c(i17, i18, i19, 0);
        eVar.b(com.tencent.mm.sdk.platformtools.x2.f193071a, z17);
        eVar.f176454q = new go5.a0(c0Var, bVar);
        c0Var.f274124a = eVar;
        eVar.R = c0Var.f274126c;
        eVar.d();
        return jz5.f0.f302826a;
    }
}
