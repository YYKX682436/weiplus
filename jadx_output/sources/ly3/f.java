package ly3;

/* loaded from: classes11.dex */
public class f extends z73.a implements ly3.e {
    public f(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f470572i = "rtosconfig";
        this.f470569f = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append(com.tencent.mm.sdk.platformtools.z.f193115k ? "_arm64-v8a" : "_armeabi-v7a");
        this.f470570g = sb6.toString();
        java.util.LinkedList c17 = z73.h.c();
        this.f470571h = c17;
        r45.e35 e35Var = new r45.e35();
        e35Var.f372968d = "patchId";
        e35Var.f372969e = com.tencent.mm.sdk.platformtools.o4.L().getString("patch_id", "").toString();
        c17.add(e35Var);
        this.f470575o = !z17 ? 1 : 0;
    }

    @Override // z73.a, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.NetSceneCheckSoRes", "doScene type:%s, baseId:%s, patchId:%s, scene:%d", this.f470572i, this.f470569f, this.f470570g, java.lang.Integer.valueOf(this.f470575o));
        return super.doScene(sVar, u0Var);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.NetSceneCheckSoRes", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f470568e.onSceneEnd(i18, i19, str, this);
    }
}
