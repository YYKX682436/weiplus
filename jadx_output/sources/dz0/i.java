package dz0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f244873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f244874b;

    public i(java.lang.Boolean bool, java.lang.Boolean bool2, int i17, kotlin.jvm.internal.i iVar) {
        bool = (i17 & 1) != 0 ? null : bool;
        bool2 = (i17 & 2) != 0 ? null : bool2;
        this.f244873a = bool;
        this.f244874b = bool2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0.i)) {
            return false;
        }
        dz0.i iVar = (dz0.i) obj;
        return kotlin.jvm.internal.o.b(this.f244873a, iVar.f244873a) && kotlin.jvm.internal.o.b(this.f244874b, iVar.f244874b);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f244873a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Boolean bool2 = this.f244874b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MusicPickerSwitchOption(musicMuted=" + this.f244873a + ", originMuted=" + this.f244874b + ')';
    }
}
