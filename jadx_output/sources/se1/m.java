package se1;

/* loaded from: classes12.dex */
public class m implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final java.net.HttpURLConnection f406796d;

    public m(java.net.HttpURLConnection httpURLConnection) {
        this.f406796d = httpURLConnection;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return java.lang.Integer.valueOf(this.f406796d.getResponseCode());
    }
}
