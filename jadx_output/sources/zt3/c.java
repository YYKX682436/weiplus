package zt3;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f475587a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f475588b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f475589c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f475590d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f475591e;

    public c(int i17, boolean z17, android.os.Bundle bundle, boolean z18, boolean z19) {
        this.f475587a = i17;
        this.f475588b = z17;
        this.f475589c = bundle;
        this.f475590d = z18;
        this.f475591e = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3.c)) {
            return false;
        }
        zt3.c cVar = (zt3.c) obj;
        return this.f475587a == cVar.f475587a && this.f475588b == cVar.f475588b && kotlin.jvm.internal.o.b(this.f475589c, cVar.f475589c) && this.f475590d == cVar.f475590d && this.f475591e == cVar.f475591e;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f475587a) * 31) + java.lang.Boolean.hashCode(this.f475588b)) * 31;
        android.os.Bundle bundle = this.f475589c;
        return ((((hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f475590d)) * 31) + java.lang.Boolean.hashCode(this.f475591e);
    }

    public java.lang.String toString() {
        return "MenuInfo(type=" + this.f475587a + ", selected=" + this.f475588b + ", extra=" + this.f475589c + ", isCanSelect=" + this.f475590d + ", isSelectStateChange=" + this.f475591e + ')';
    }

    public /* synthetic */ c(int i17, boolean z17, android.os.Bundle bundle, boolean z18, boolean z19, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? null : bundle, (i18 & 8) != 0 ? true : z18, (i18 & 16) != 0 ? true : z19);
    }
}
