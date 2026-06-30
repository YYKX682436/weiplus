package de2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f229375a;

    public e(int i17, int i18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        this.f229375a = (i19 & 4) != 0 ? false : z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de2.e)) {
            return false;
        }
        de2.e eVar = (de2.e) obj;
        eVar.getClass();
        return this.f229375a == eVar.f229375a;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Boolean.hashCode(this.f229375a);
    }

    public java.lang.String toString() {
        return "RowStatus(top=0, height=0, isOccupy=" + this.f229375a + ')';
    }
}
