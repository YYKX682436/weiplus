package m51;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final h51.j f323524a;

    /* renamed from: b, reason: collision with root package name */
    public final h51.j f323525b;

    /* renamed from: c, reason: collision with root package name */
    public final long f323526c;

    public a(h51.j jVar, h51.j jVar2, long j17) {
        this.f323524a = jVar;
        this.f323525b = jVar2;
        this.f323526c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m51.a.class != obj.getClass()) {
            return false;
        }
        m51.a aVar = (m51.a) obj;
        h51.j jVar = aVar.f323525b;
        h51.j jVar2 = this.f323525b;
        if (jVar2 == null) {
            if (jVar != null) {
                return false;
            }
        } else if (!jVar2.equals(jVar)) {
            return false;
        }
        h51.j jVar3 = aVar.f323524a;
        h51.j jVar4 = this.f323524a;
        if (jVar4 == null) {
            if (jVar3 != null) {
                return false;
            }
        } else if (!jVar4.equals(jVar3)) {
            return false;
        }
        return this.f323526c == aVar.f323526c;
    }

    public int hashCode() {
        h51.j jVar = this.f323525b;
        int hashCode = ((jVar == null ? 0 : jVar.hashCode()) + 31) * 31;
        h51.j jVar2 = this.f323524a;
        int hashCode2 = jVar2 != null ? jVar2.hashCode() : 0;
        long j17 = this.f323526c;
        return ((hashCode + hashCode2) * 31) + ((int) (j17 ^ (j17 >>> 32)));
    }
}
