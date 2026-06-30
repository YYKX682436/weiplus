package q11;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f359530a;

    public a(int i17) {
        this.f359530a = new jt0.j(i17);
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        kk.j jVar = this.f359530a;
        if (jVar != null) {
            return ((lt0.f) jVar).put(obj, obj2);
        }
        throw new java.lang.NullPointerException("mData == null");
    }

    public final synchronized java.lang.String toString() {
        kk.j jVar;
        jVar = this.f359530a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        return jVar.toString();
    }
}
