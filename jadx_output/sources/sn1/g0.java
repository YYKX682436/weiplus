package sn1;

/* loaded from: classes12.dex */
public class g0 extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.x f410008u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.y f410009v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f410010w;

    public g0(java.lang.String str, long j17, long j18, java.lang.String str2, java.lang.String str3, com.tencent.mm.modelbase.u0 u0Var) {
        wn1.x xVar = new wn1.x();
        this.f410008u = xVar;
        this.f410009v = new wn1.y();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        xVar.f447504d = str;
        xVar.f447505e = j17;
        xVar.f447506f = j18;
        xVar.f447507g = str2;
        xVar.f447508h = str3;
        this.f410010w = u0Var;
    }

    @Override // sn1.i
    public boolean K() {
        boolean z17;
        try {
            byte[] byteArray = this.f410008u.toByteArray();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f410013g;
            synchronized (concurrentHashMap) {
                int i17 = sn1.i.f410022s;
                sn1.i.f410022s = i17 + 1;
                this.f410024d = i17;
                on1.f.a(byteArray, i17, (short) 15, this.f410025e, sn1.i.f410017n);
                sn1.e eVar = sn1.i.f410016m;
                if (eVar != null) {
                    ((ln1.g) eVar).d(this.f410024d, this.f410025e.value, 15);
                }
                concurrentHashMap.put(java.lang.Integer.valueOf(this.f410024d), this);
            }
            z17 = true;
        } catch (java.lang.Exception e17) {
            z17 = false;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupBaseScene", e17, "req to buf fail: " + e17.toString(), new java.lang.Object[0]);
        }
        if (!z17) {
            wn1.y yVar = this.f410009v;
            wn1.x xVar = this.f410008u;
            yVar.f447510d = xVar.f447504d;
            yVar.f447511e = xVar.f447505e;
            yVar.f447512f = xVar.f447506f;
            yVar.f447513g = xVar.f447507g;
            this.f410010w.onSceneEnd(1, -2, "doScene failed", this);
        }
        return z17;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f M() {
        return this.f410008u;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f N() {
        return this.f410009v;
    }

    @Override // sn1.i
    public void P(int i17) {
        J(0, 0, ya.b.SUCCESS);
        this.f410010w.onSceneEnd(0, 0, "", this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 15;
    }
}
