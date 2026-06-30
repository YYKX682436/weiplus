package pm;

/* loaded from: classes11.dex */
public class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f356744d;

    /* renamed from: e, reason: collision with root package name */
    public long f356745e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f356746f;

    /* renamed from: g, reason: collision with root package name */
    public int f356747g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356748h;

    /* renamed from: i, reason: collision with root package name */
    public int f356749i;

    public a(int i17, long j17, java.lang.String str, int i18, boolean z17, int i19) {
        this.f356744d = i17;
        this.f356745e = j17;
        this.f356746f = str;
        this.f356747g = i18;
        this.f356748h = z17;
        this.f356749i = i19;
    }

    public java.lang.String toString() {
        return this.f356746f + " id:" + this.f356745e + " unReadCount:" + this.f356747g + "\u3000notificationId:" + this.f356744d;
    }

    public a(int i17, boolean z17) {
        this.f356745e = -1L;
        this.f356746f = "";
        this.f356749i = 0;
        this.f356744d = i17;
        this.f356748h = z17;
    }
}
