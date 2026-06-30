package g4;

/* loaded from: classes5.dex */
public abstract class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f268215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f268216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268218d;

    public b5(int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this.f268215a = i17;
        this.f268216b = i18;
        this.f268217c = i19;
        this.f268218d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.b5)) {
            return false;
        }
        g4.b5 b5Var = (g4.b5) obj;
        return this.f268215a == b5Var.f268215a && this.f268216b == b5Var.f268216b && this.f268217c == b5Var.f268217c && this.f268218d == b5Var.f268218d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f268215a) + java.lang.Integer.hashCode(this.f268216b) + java.lang.Integer.hashCode(this.f268217c) + java.lang.Integer.hashCode(this.f268218d);
    }
}
