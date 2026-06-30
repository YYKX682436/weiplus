package ej4;

/* loaded from: classes10.dex */
public final class k implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253369d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f253370e;

    public k(java.lang.String iconId, java.lang.String str) {
        kotlin.jvm.internal.o.g(iconId, "iconId");
        this.f253369d = iconId;
        this.f253370e = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej4.k)) {
            return false;
        }
        ej4.k kVar = (ej4.k) obj;
        return kotlin.jvm.internal.o.b(this.f253369d, kVar.f253369d) && kotlin.jvm.internal.o.b(this.f253370e, kVar.f253370e);
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        int hashCode = this.f253369d.hashCode() * 31;
        java.lang.String str = this.f253370e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "RecentStatusInfo(iconId=" + this.f253369d + ", statusDesc=" + this.f253370e + ')';
    }
}
