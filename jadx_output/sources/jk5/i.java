package jk5;

/* loaded from: classes13.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f300166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jk5.j f300167e;

    public i(jk5.j jVar, android.os.Bundle bundle) {
        this.f300167e = jVar;
        this.f300166d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        jk5.j jVar = this.f300167e;
        if (jVar.f300170c == null) {
            return;
        }
        jVar.d(true);
        java.lang.String string = this.f300166d.getString("oauth_verifier");
        l56.i iVar = null;
        if (string != null) {
            l56.k kVar = new l56.k(string);
            try {
                iVar = ((m56.a) jVar.f300168a).c(jVar.f300170c, kVar);
            } catch (j56.a unused) {
            }
        }
        if (iVar == null) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new jk5.h(this));
            return;
        }
        jVar.f300169b = iVar;
        jVar.e(iVar);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new jk5.g(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|onComplete";
    }
}
