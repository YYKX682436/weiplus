package se4;

/* loaded from: classes9.dex */
public class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public km5.b f406930a = null;

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        if (!((java.lang.Boolean) bVar.a(0)).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterPrepareAskFunc", "not need prepare ask, return");
            return (java.lang.Boolean) bVar.a(1);
        }
        this.f406930a = km5.u.b();
        if (!cu5.b.c()) {
            return java.lang.Boolean.FALSE;
        }
        iu5.e iVar = gm0.j1.a() ? new oe4.i() : new oe4.j();
        wt5.a.h();
        this.f406930a.b();
        cu5.b.d(new se4.i(this, bVar), false, iVar);
        bVar.a(1);
        return (java.lang.Boolean) bVar.a(1);
    }
}
