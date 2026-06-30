package tr5;

/* loaded from: classes13.dex */
public final class g0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final tr5.z f421492d;

    /* renamed from: e, reason: collision with root package name */
    public final tr5.q f421493e;

    public g0(java.lang.String[] strArr, tr5.q qVar) {
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
        }
        if (qVar != null) {
            this.f421492d = new tr5.z(strArr);
            this.f421493e = qVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
    }

    public java.lang.String toString() {
        return "LookupResult{ipSet=" + this.f421492d + ", stat=" + this.f421493e + '}';
    }

    public g0(tr5.z zVar, tr5.q qVar) {
        if (zVar == null) {
            throw new java.lang.IllegalArgumentException("ipSet".concat(" can not be null"));
        }
        if (qVar != null) {
            this.f421492d = zVar;
            this.f421493e = qVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
    }
}
