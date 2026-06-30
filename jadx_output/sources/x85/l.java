package x85;

/* loaded from: classes9.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x85.j f452598a;

    public l(x85.j jVar) {
        this.f452598a = jVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetLensListTask", "cgi callback : " + fVar.f70615a + ' ' + fVar.f70616b);
        x85.j jVar = this.f452598a;
        if (jVar == null) {
            return null;
        }
        jVar.a(fVar.f70615a, fVar.f70616b, (r45.xh3) fVar.f70618d);
        return jz5.f0.f302826a;
    }
}
