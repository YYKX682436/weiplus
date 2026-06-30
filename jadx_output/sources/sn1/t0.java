package sn1;

/* loaded from: classes12.dex */
public class t0 extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.q f410100u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.r f410101v;

    public t0(java.lang.String str) {
        wn1.q qVar = new wn1.q();
        this.f410100u = qVar;
        this.f410101v = new wn1.r();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", str);
        qVar.f447453d = str;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f M() {
        return this.f410100u;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f N() {
        return this.f410101v;
    }

    @Override // sn1.i
    public void P(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupStartScene", "onSceneEnd.");
        int i18 = this.f410101v.f447464g;
        if (i18 != 0) {
            J(4, i18, "BackupStartScene onSceneEnd failed");
        } else {
            J(0, i18, "BackupStartScene onSceneEnd success");
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3;
    }
}
