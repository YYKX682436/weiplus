package mm2;

/* loaded from: classes10.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f329183a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f329184b;

    public j7(java.lang.String str, java.lang.String str2) {
        this.f329183a = str;
        this.f329184b = str2;
    }

    public final boolean a() {
        java.lang.String str = this.f329183a;
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        java.lang.String str2 = this.f329184b;
        return str2 == null || str2.length() == 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.j7)) {
            return false;
        }
        mm2.j7 j7Var = (mm2.j7) obj;
        return kotlin.jvm.internal.o.b(this.f329183a, j7Var.f329183a) && kotlin.jvm.internal.o.b(this.f329184b, j7Var.f329184b);
    }

    public int hashCode() {
        java.lang.String str = this.f329183a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f329184b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SingSongPanelLocateInfo(songName=" + this.f329183a + ", uniqueAddId=" + this.f329184b + ')';
    }
}
