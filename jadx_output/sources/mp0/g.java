package mp0;

/* loaded from: classes15.dex */
public final class g implements mp0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mp0.h f330439a;

    public g(mp0.h hVar) {
        this.f330439a = hVar;
    }

    public void a(hp0.e resultData) {
        kotlin.jvm.internal.o.g(resultData, "resultData");
        fp0.u uVar = fp0.u.f265290f;
        mp0.h hVar = this.f330439a;
        hVar.getClass();
        hVar.f330445n = uVar;
        hVar.g(resultData);
        if ((resultData.a() ? resultData : null) != null) {
            java.lang.String str = hVar.f330444m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ImageLoader] onTaskDownFin. get bitmap successs. ");
            ip0.a aVar = hVar.f330440f;
            sb6.append(aVar);
            sb6.append(' ');
            sb6.append(resultData.f282910b);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            cp0.l.f220755b.a().a(aVar, resultData, hVar.f330443i);
        }
        hVar.f(resultData);
        hVar.b(hVar.f330445n);
    }

    public void b() {
        fp0.u uVar = fp0.u.f265291g;
        mp0.h hVar = this.f330439a;
        hVar.getClass();
        hVar.f330445n = uVar;
        com.tencent.mars.xlog.Log.i(hVar.f330444m, "onTaskFail " + hVar.f330440f);
        hVar.b(hVar.f330445n);
    }
}
