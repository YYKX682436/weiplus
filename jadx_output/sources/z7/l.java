package z7;

/* loaded from: classes16.dex */
public abstract class l implements java.io.Serializable {
    static {
        z7.l lVar = z7.a.f470463a;
        z7.l lVar2 = z7.a.f470463a;
        z7.l lVar3 = z7.a.f470463a;
    }

    public z7.i d() {
        throw new java.lang.UnsupportedOperationException("Not an object: " + toString());
    }

    public java.lang.String e(z7.p pVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            if (pVar == null) {
                throw new java.lang.NullPointerException("config is null");
            }
            z7.q qVar = new z7.q(stringWriter, 128);
            g(pVar.a(qVar));
            qVar.flush();
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract void g(z7.m mVar);

    public abstract int hashCode();

    public java.lang.String toString() {
        return e(z7.p.f470498a);
    }
}
