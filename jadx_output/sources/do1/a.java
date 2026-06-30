package do1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f242069a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f242070b;

    public a(boolean z17, boolean z18) {
        this.f242069a = z17;
        this.f242070b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do1.a)) {
            return false;
        }
        do1.a aVar = (do1.a) obj;
        return this.f242069a == aVar.f242069a && this.f242070b == aVar.f242070b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f242069a) * 31) + java.lang.Boolean.hashCode(this.f242070b);
    }

    public java.lang.String toString() {
        return "BackupExtraInfo(isRoam=" + this.f242069a + ", isTextOnly=" + this.f242070b + ')';
    }
}
