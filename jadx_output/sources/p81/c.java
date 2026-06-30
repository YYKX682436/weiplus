package p81;

/* loaded from: classes7.dex */
public class c implements m81.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f352717a;

    public c(p81.d dVar, km5.b bVar) {
        this.f352717a = bVar;
    }

    @Override // m81.d
    public void c(java.lang.String str, m81.c cVar, java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(cVar == m81.c.OK);
        this.f352717a.c(objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.ActionGetEncryptPkg.PlainActionDownloadPkg", "%s onPkgUpdateResult, ret %s", str, cVar.name());
    }
}
