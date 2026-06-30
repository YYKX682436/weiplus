package hp0;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f282912a;

    public f(int i17) {
        this.f282912a = new jt0.j(i17);
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        kk.j jVar = this.f282912a;
        if (jVar != null) {
            return ((lt0.f) jVar).put(obj, obj2);
        }
        throw new java.lang.NullPointerException("mData == null");
    }

    public final synchronized java.lang.String toString() {
        kk.j jVar;
        jVar = this.f282912a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        return jVar.toString();
    }
}
