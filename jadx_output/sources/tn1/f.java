package tn1;

/* loaded from: classes12.dex */
public class f extends kn1.a {

    /* renamed from: d, reason: collision with root package name */
    public static tn1.f f420817d;

    /* renamed from: b, reason: collision with root package name */
    public tn1.d f420818b;

    /* renamed from: c, reason: collision with root package name */
    public tn1.c f420819c;

    public static tn1.f f() {
        if (f420817d == null) {
            tn1.f fVar = new tn1.f();
            f420817d = fVar;
            kn1.a.a(fVar);
        }
        return f420817d;
    }

    @Override // kn1.a
    public void b() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        tn1.d dVar = this.f420818b;
        objArr[0] = java.lang.Integer.valueOf(dVar != null ? dVar.f420812o : -1);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BackupStorageModel", "releaseBackupModel: uin=%s", objArr);
        f420817d = null;
    }

    public void c() {
        if (e().f420812o != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupStorageModel", "[backupInitStorage] backupStorage has already initialized");
            return;
        }
        gm0.j1.i();
        java.lang.String d17 = gm0.j1.u().d();
        int C = c01.d9.b().C();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupStorageModel", "[backupInitStorage] accountPath=%s, uin=%d", d17, java.lang.Integer.valueOf(C));
        tn1.d e17 = e();
        e17.getClass();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(C);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupStorage", "setBackupStorage, accPath:%s, accUin:%d, caller:%s", d17, valueOf, new com.tencent.mm.sdk.platformtools.z3());
        e17.f420812o = C;
        e17.f420813p = d17;
        e17.f420811n = c01.d9.b().s();
        e17.f420798a = c01.d9.b().p();
        e17.f420799b = c01.d9.b().q();
        e17.f420801d = c01.d9.b().r();
        e17.f420800c = c01.d9.b().u();
        e17.f420804g = c01.d9.b().y();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        e17.f420802e = m11.b1.Di();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        e17.f420803f = com.tencent.mm.storage.n5.f().c();
        e17.f420806i = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        e17.f420805h = t21.o2.Ui();
        e17.f420807j = (com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai();
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        e17.f420808k = zo3.p.Ri();
        e17.f420809l = (com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
        c01.d9.b().getClass();
        gm0.j1.i();
        gm0.j1.b().c();
        e17.f420810m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
    }

    public tn1.c d() {
        if (this.f420819c == null) {
            this.f420819c = new tn1.c();
        }
        return this.f420819c;
    }

    public tn1.d e() {
        if (this.f420818b == null) {
            this.f420818b = new tn1.d();
        }
        return this.f420818b;
    }
}
