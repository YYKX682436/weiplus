package g04;

/* loaded from: classes15.dex */
public class d implements gx5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f267452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g04.i f267454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine f267455d;

    public d(com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine, long j17, java.lang.String str, g04.i iVar) {
        this.f267455d = imageWordScanDetailEngine;
        this.f267452a = j17;
        this.f267453b = str;
        this.f267454c = iVar;
    }

    public void a(g04.k kVar) {
        java.lang.String b17;
        r45.tu5 a17;
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        kd0.t2 t2Var = (kd0.t2) i95.n0.c(kd0.t2.class);
        kd0.a aVar = kd0.a.f306597g;
        java.lang.String sessionId = this.f267452a + "";
        ((jd0.f2) t2Var).getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (cz3.e.f225027a.c()) {
            java.lang.String str = this.f267453b;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = (java.lang.String) cz3.e.f225030d.remove(str);
                if (!(str2 == null || str2.length() == 0) && (a17 = cz3.e.a((b17 = cz3.e.b(aVar, str)))) != null) {
                    java.util.LinkedList crashList = a17.f386815d;
                    if (crashList != null) {
                        crashList.size();
                    }
                    kotlin.jvm.internal.o.f(crashList, "crashList");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : crashList) {
                        if (!kotlin.jvm.internal.o.b(((r45.uu5) obj).f387652e, str2)) {
                            arrayList.add(obj);
                        }
                    }
                    crashList.clear();
                    crashList.addAll(arrayList);
                    arrayList.size();
                    if (crashList.isEmpty()) {
                        com.tencent.mm.sdk.platformtools.v3 v3Var = cz3.e.f225029c;
                        if (v3Var != null && (o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.i()) != null) {
                            o4Var.remove(b17);
                        }
                        ((lt0.f) cz3.e.f225031e).remove(b17);
                    } else {
                        cz3.e.e(b17, a17);
                    }
                }
            }
        }
        g04.i iVar = this.f267454c;
        com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine = this.f267455d;
        if (kVar != null && iVar != null) {
            imageWordScanDetailEngine.f160018f.put(iVar.f267464a, kVar);
        }
        com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine.a(imageWordScanDetailEngine, iVar, new g04.l(kVar));
    }
}
