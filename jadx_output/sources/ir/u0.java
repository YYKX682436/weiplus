package ir;

/* loaded from: classes15.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f293907a;

    public u0(int i17) {
        this.f293907a = i17;
    }

    public boolean a(java.lang.Object obj) {
        return equals(obj);
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof ir.u0) && ((ir.u0) obj).f293907a == this.f293907a;
    }
}
