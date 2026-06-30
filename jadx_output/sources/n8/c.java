package n8;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final n8.c f335471d = new n8.c(0, 0, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f335472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335473b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.AudioAttributes f335474c;

    public c(int i17, int i18, int i19, n8.b bVar) {
        this.f335472a = i17;
        this.f335473b = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n8.c.class != obj.getClass()) {
            return false;
        }
        n8.c cVar = (n8.c) obj;
        return this.f335472a == cVar.f335472a && this.f335473b == cVar.f335473b;
    }

    public int hashCode() {
        return ((((this.f335472a + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX) * 31) + 0) * 31) + this.f335473b;
    }
}
