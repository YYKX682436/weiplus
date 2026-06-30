package q81;

/* loaded from: classes7.dex */
public class c extends q81.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.predownload.o f360695a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360696b;

    public c(com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar) {
        this.f360695a = oVar;
        this.f360696b = oVar != null ? oVar.f75874p : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if ((r8 ? r0.update(r7, new java.lang.String[0]) : r0.insert(r7)) != false) goto L47;
     */
    @Override // q81.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, java.lang.String r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q81.c.b(java.lang.String, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.ff7) obj).f374291d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetCode";
    }

    @Override // q81.a
    public boolean f() {
        boolean z17;
        if (com.tencent.mm.plugin.appbrand.appcache.predownload.u0.wi() == null) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            z17 = a17.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl.CanRetryOnGetCodeSequenceNotChangedForScene:" + this.f360696b, false);
        } else {
            z17 = false;
        }
        return z17;
    }
}
