package jk5;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.j f300163d;

    public f(jk5.j jVar) {
        this.f300163d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jk5.c cVar = jk5.c.Finished;
        jk5.j jVar = this.f300163d;
        l56.i iVar = jVar.f300169b;
        jk5.c cVar2 = jk5.c.Failed;
        if (iVar != null) {
            l56.c cVar3 = new l56.c(l56.j.GET, "https://api.twitter.com/1.1/account/verify_credentials.json");
            m56.b bVar = jVar.f300168a;
            l56.i iVar2 = jVar.f300169b;
            m56.a aVar = (m56.a) bVar;
            aVar.getClass();
            java.lang.String str = "signing request: " + cVar3.b();
            l56.a aVar2 = aVar.f324336a;
            aVar2.a(str);
            if (!("".equals(iVar2.f316692d) && "".equals(iVar2.f316693e))) {
                cVar3.d("oauth_token", iVar2.f316692d);
            }
            aVar2.a("setting token to: " + iVar2);
            aVar.a(cVar3, iVar2);
            aVar.b(cVar3);
            try {
                if (cVar3.c().f316687a != 200) {
                    cVar = cVar2;
                }
                cVar2 = cVar;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Twitter", e17, "request error.", new java.lang.Object[0]);
            }
        }
        jVar.f300176i.sendMessage(jVar.f300176i.obtainMessage(1010, cVar2));
    }
}
