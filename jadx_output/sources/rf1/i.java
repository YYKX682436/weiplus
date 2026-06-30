package rf1;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f394627a = "ok";

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f394628b = null;

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mErrorMsg:");
        sb6.append(this.f394627a);
        sb6.append(" mWifiList:");
        java.util.List list = this.f394628b;
        if (list == null || list.size() <= 0) {
            sb6.append("null:");
        } else {
            for (rf1.h hVar : this.f394628b) {
                sb6.append(" WiFiItem:");
                sb6.append(hVar);
            }
        }
        return sb6.toString();
    }
}
