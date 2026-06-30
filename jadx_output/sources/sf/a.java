package sf;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f406933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f406934b;

    public a(int i17, int i18) {
        this.f406933a = i17;
        this.f406934b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf.a)) {
            return false;
        }
        sf.a aVar = (sf.a) obj;
        return this.f406933a == aVar.f406933a && this.f406934b == aVar.f406934b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f406933a) * 31) + java.lang.Integer.hashCode(this.f406934b);
    }

    public java.lang.String toString() {
        return "KeyboardDisplayAction(keyboardType=" + this.f406933a + ", viewId=" + this.f406934b + ')';
    }
}
