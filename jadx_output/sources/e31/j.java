package e31;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f247075a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f247076b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f247077c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f247078d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f247079e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f247080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f247081g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f247082h;

    /* renamed from: i, reason: collision with root package name */
    public int f247083i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f247084j = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f247085k;

    public j(boolean z17, boolean z18) {
        this.f247075a = z17;
        this.f247076b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e31.j)) {
            return false;
        }
        e31.j jVar = (e31.j) obj;
        return this.f247075a == jVar.f247075a && this.f247076b == jVar.f247076b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f247075a) * 31) + java.lang.Boolean.hashCode(this.f247076b);
    }

    public java.lang.String toString() {
        return "SubscribeStatusResult(isSubscribed=" + this.f247075a + ", isSwitchOpened=" + this.f247076b + ')';
    }
}
