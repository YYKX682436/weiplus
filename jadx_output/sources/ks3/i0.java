package ks3;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.j0 f311687d;

    public i0(ks3.j0 j0Var) {
        this.f311687d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hs3.q qVar = this.f311687d.f311699d;
        if (qVar != null) {
            hs3.i iVar = (hs3.i) qVar;
            iVar.f284579e = true;
            org.apache.http.client.methods.HttpRequestBase httpRequestBase = iVar.f284576b;
            if (httpRequestBase != null && !httpRequestBase.isAborted()) {
                iVar.f284576b.abort();
            }
            org.apache.http.client.HttpClient httpClient = iVar.f284575a;
            if (httpClient != null) {
                httpClient.getConnectionManager().shutdown();
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|onCancelled";
    }
}
