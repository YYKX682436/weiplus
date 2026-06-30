package w6;

/* loaded from: classes13.dex */
public class o0 implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f443177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f443179d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f443180e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f443181f;

    /* renamed from: g, reason: collision with root package name */
    public final t6.h f443182g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f443183h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.l f443184i;

    /* renamed from: j, reason: collision with root package name */
    public int f443185j;

    public o0(java.lang.Object obj, t6.h hVar, int i17, int i18, java.util.Map map, java.lang.Class cls, java.lang.Class cls2, t6.l lVar) {
        q7.n.b(obj);
        this.f443177b = obj;
        if (hVar == null) {
            throw new java.lang.NullPointerException("Signature must not be null");
        }
        this.f443182g = hVar;
        this.f443178c = i17;
        this.f443179d = i18;
        q7.n.b(map);
        this.f443183h = map;
        if (cls == null) {
            throw new java.lang.NullPointerException("Resource class must not be null");
        }
        this.f443180e = cls;
        if (cls2 == null) {
            throw new java.lang.NullPointerException("Transcode class must not be null");
        }
        this.f443181f = cls2;
        q7.n.b(lVar);
        this.f443184i = lVar;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w6.o0)) {
            return false;
        }
        w6.o0 o0Var = (w6.o0) obj;
        return this.f443177b.equals(o0Var.f443177b) && this.f443182g.equals(o0Var.f443182g) && this.f443179d == o0Var.f443179d && this.f443178c == o0Var.f443178c && this.f443183h.equals(o0Var.f443183h) && this.f443180e.equals(o0Var.f443180e) && this.f443181f.equals(o0Var.f443181f) && this.f443184i.equals(o0Var.f443184i);
    }

    @Override // t6.h
    public int hashCode() {
        if (this.f443185j == 0) {
            int hashCode = this.f443177b.hashCode();
            this.f443185j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f443182g.hashCode()) * 31) + this.f443178c) * 31) + this.f443179d;
            this.f443185j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f443183h.hashCode();
            this.f443185j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f443180e.hashCode();
            this.f443185j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f443181f.hashCode();
            this.f443185j = hashCode5;
            this.f443185j = (hashCode5 * 31) + this.f443184i.hashCode();
        }
        return this.f443185j;
    }

    public java.lang.String toString() {
        return "EngineKey{model=" + this.f443177b + ", width=" + this.f443178c + ", height=" + this.f443179d + ", resourceClass=" + this.f443180e + ", transcodeClass=" + this.f443181f + ", signature=" + this.f443182g + ", hashCode=" + this.f443185j + ", transformations=" + this.f443183h + ", options=" + this.f443184i + '}';
    }
}
