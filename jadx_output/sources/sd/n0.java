package sd;

/* loaded from: classes8.dex */
public class n0 implements pf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f406627a;

    public n0(sd.o0 o0Var) {
        this.f406627a = o0Var;
    }

    public boolean a(java.lang.String str) {
        java.util.Iterator it = this.f406627a.f406637p.f362233a.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            android.support.v4.media.f.a(pair.first);
            java.util.regex.Pattern pattern = (java.util.regex.Pattern) pair.second;
            if (pattern != null && pattern.matcher(str).matches()) {
                throw null;
            }
        }
        return false;
    }

    public void b(java.lang.String str) {
        sd.o0 o0Var = this.f406627a;
        o0Var.f406638q = str;
        ((od.n) o0Var.f406634m.f344519d).f344524a.a();
        sd.p0 p0Var = o0Var.f406632h;
        if (p0Var != null) {
            od.l lVar = o0Var.f406634m;
            lVar.f344516a.evaluateJavascript(p0Var.a(), null);
            o0Var.f406632h.b(str);
        }
    }

    public android.webkit.WebResourceResponse c(java.lang.String str) {
        android.webkit.WebResourceResponse e17;
        d(str);
        sd.o0 o0Var = this.f406627a;
        sd.p0 p0Var = o0Var.f406632h;
        return (p0Var == null || (e17 = p0Var.e(str)) == null) ? o0Var.f406636o.b(str) : e17;
    }

    public final void d(java.lang.String str) {
        java.lang.String path;
        sd.o0 o0Var = this.f406627a;
        if (o0Var.f406640s) {
            return;
        }
        if ((str == null || str.length() == 0 || (path = android.net.Uri.parse(str).getPath()) == null || !path.trim().endsWith("html")) ? false : true) {
            return;
        }
        o0Var.i();
    }
}
