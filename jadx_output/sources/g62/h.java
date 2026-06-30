package g62;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f269083a;

    /* renamed from: b, reason: collision with root package name */
    public final long f269084b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f269085c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f269086d;

    public h(long j17, java.lang.String str, long j18, boolean z17) {
        this.f269083a = str;
        this.f269084b = j18;
        this.f269086d = z17;
        this.f269085c = new java.text.SimpleDateFormat("[yy-MM-dd HH:mm:ss:SSS]").format(new java.util.Date(j18));
    }

    public java.lang.String toString() {
        return this.f269085c + ":" + this.f269083a;
    }
}
