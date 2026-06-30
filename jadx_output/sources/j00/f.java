package j00;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f296767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f296768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bw5.x7 x7Var, boolean z17, java.lang.String str, int i17) {
        super(0);
        this.f296767d = x7Var;
        this.f296768e = z17;
        this.f296769f = str;
        this.f296770g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bw5.x7 x7Var;
        java.lang.String str;
        kotlinx.coroutines.z zVar;
        kotlinx.coroutines.z zVar2;
        j00.n nVar = j00.n.f296837a;
        boolean z17 = this.f296768e;
        int i17 = this.f296770g;
        b00.t2 t2Var = (b00.t2) ((c00.f4) i95.n0.c(c00.f4.class));
        java.lang.String str2 = this.f296769f;
        c00.j3 j3Var = new c00.j3(str2, t2Var.wi(str2, null));
        int wi6 = z17 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) : 1;
        kotlinx.coroutines.z a17 = kotlinx.coroutines.b0.a(null, 1, null);
        kotlinx.coroutines.z a18 = kotlinx.coroutines.b0.a(null, 1, null);
        j00.g gVar = new j00.g(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", "fetchPresentJumpInfoAsync");
        bw5.t8 b17 = n00.g.f333821a.b();
        int i18 = (b17.f33309g[4] ? b17.f33308f : new bw5.r8()).f32436e;
        int i19 = x02.g.f450981d;
        x02.e eVar = (x02.e) urgen.ur_7522.UR_5358.UR_1332();
        bw5.x7 ecs_jump_info = this.f296767d;
        if (eVar != null) {
            j00.l lVar = new j00.l(gVar);
            kotlin.jvm.internal.o.g(ecs_jump_info, "ecs_jump_info");
            byte[] byteArray = ecs_jump_info.toByteArray();
            x02.d dVar = new x02.d();
            dVar.f450977d = lVar;
            long cppPointer = ((x02.g) eVar).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            x7Var = ecs_jump_info;
            str = "MicroMsg.EcsGiftEntrancePreloadLogicNew";
            zVar = a18;
            zVar2 = a17;
            urgen.ur_7522.UR_5358.UR_BA14(cppPointer, byteArray, z17 ? 1 : 0, str2, i17, i18, dVar);
        } else {
            x7Var = ecs_jump_info;
            str = "MicroMsg.EcsGiftEntrancePreloadLogicNew";
            zVar = a18;
            zVar2 = a17;
        }
        b00.d dVar2 = b00.d.f16648a;
        com.tencent.wechat.aff.ecs.c a19 = dVar2.a();
        java.lang.String a27 = a19.a(z17 ? 1 : 0, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a27)) {
            dVar2.a().c(z17 ? 1 : 0, str2, new j00.k(z17 ? 1 : 0, str2, new j00.h(zVar)));
        } else {
            ((kotlinx.coroutines.a0) zVar).U(a27);
        }
        try {
            kotlinx.coroutines.l.f(null, new j00.j(zVar2, zVar, j3Var, z17, wi6, null), 1, null);
        } catch (kotlinx.coroutines.x3 unused) {
            com.tencent.mars.xlog.Log.w(str, "checkPreloadWhenExposure: timeout after 1000ms");
            bw5.x7 x7Var2 = ((kotlinx.coroutines.c3) zVar2).A() ? (bw5.x7) ((kotlinx.coroutines.a0) zVar2).J() : x7Var;
            java.lang.String a28 = ((kotlinx.coroutines.c3) zVar).A() ? (java.lang.String) ((kotlinx.coroutines.a0) zVar).J() : a19.a(z17 ? 1 : 0, str2);
            if (x7Var2 != null) {
                nVar.a(j3Var, z17, wi6, x7Var2, a28, 1, 0L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "checkPreloadWhenExposure: error " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
