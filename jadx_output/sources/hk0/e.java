package hk0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.h f281724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f281725b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281726c;

    public e(hk0.h doodleType, int i17, int i18) {
        kotlin.jvm.internal.o.g(doodleType, "doodleType");
        this.f281724a = doodleType;
        this.f281725b = i17;
        this.f281726c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.e)) {
            return false;
        }
        hk0.e eVar = (hk0.e) obj;
        return this.f281724a == eVar.f281724a && this.f281725b == eVar.f281725b && this.f281726c == eVar.f281726c;
    }

    public int hashCode() {
        return (((this.f281724a.hashCode() * 31) + java.lang.Integer.hashCode(this.f281725b)) * 31) + java.lang.Integer.hashCode(this.f281726c);
    }

    public java.lang.String toString() {
        return "DoodleBean(doodleType=" + this.f281724a + ", color=" + this.f281725b + ", index=" + this.f281726c + ')';
    }

    public /* synthetic */ e(hk0.h hVar, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(hVar, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? 0 : i18);
    }
}
