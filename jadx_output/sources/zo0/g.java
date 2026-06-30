package zo0;

/* loaded from: classes10.dex */
public abstract class g {
    public final void a(ip0.a url, ep0.h fileNameCreator, fp0.c loader, zo0.c callback) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(loader, "loader");
        kotlin.jvm.internal.o.g(callback, "callback");
        zo0.f fVar = new zo0.f(loader, this, url, fileNameCreator, callback);
        fp0.o oVar = (fp0.o) loader;
        if (oVar.f265271c == null) {
            gp0.g gVar = (gp0.g) oVar.f265269a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pool heavy poolSize ");
            gp0.h hVar = gVar.f274174c;
            sb6.append(hVar.f274178a);
            sb6.append(" priority ");
            int i17 = hVar.f274178a;
            sb6.append(i17);
            sb6.append(" name: ");
            java.lang.String str = gVar.f274176e;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(gVar.f274177f, sb6.toString());
            oVar.f265271c = new gp0.c(str, i17, i17, new kp0.a());
        }
        fp0.a aVar = oVar.f265271c;
        if (aVar != null) {
            ((gp0.c) aVar).execute(fVar);
        }
    }

    public abstract void b(ip0.a aVar, ep0.h hVar, zo0.b bVar);
}
