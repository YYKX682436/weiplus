package s7;

/* loaded from: classes16.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f403840a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f403841b = 0;

    public u(s7.b bVar) {
    }

    public void a() {
        this.f403841b += 1000;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f403840a.iterator();
        while (it.hasNext()) {
            sb6.append((s7.v) it.next());
            sb6.append(' ');
        }
        sb6.append('[');
        sb6.append(this.f403841b);
        sb6.append(']');
        return sb6.toString();
    }
}
