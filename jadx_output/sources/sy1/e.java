package sy1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f413843a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f413844b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f413845c;

    public e(sy1.f fVar) {
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof sy1.e)) {
            sy1.e eVar = (sy1.e) obj;
            if (this.f413843a == eVar.hashCode() && u46.l.c(this.f413844b, eVar.f413844b)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "SyncSessionPage{pageId=" + this.f413844b + ", sourceViewId='" + this.f413845c + "'}";
    }
}
