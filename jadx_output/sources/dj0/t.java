package dj0;

/* loaded from: classes14.dex */
public class t extends dj0.s {
    public t(dj0.x xVar, dj0.t tVar) {
        super(xVar, tVar);
    }

    @Override // dj0.w
    public dj0.x a() {
        return new dj0.x(this.f232875c.consumeDisplayCutout());
    }

    @Override // dj0.r, dj0.w
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj0.t)) {
            return false;
        }
        dj0.t tVar = (dj0.t) obj;
        return java.util.Objects.equals(this.f232875c, tVar.f232875c) && java.util.Objects.equals(this.f232879g, tVar.f232879g);
    }

    @Override // dj0.w
    public int hashCode() {
        return this.f232875c.hashCode();
    }
}
