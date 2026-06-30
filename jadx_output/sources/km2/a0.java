package km2;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f309049a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f309050b;

    public a0(java.util.LinkedList chatroomList, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        chatroomList = (i17 & 1) != 0 ? new java.util.LinkedList() : chatroomList;
        str = (i17 & 2) != 0 ? null : str;
        kotlin.jvm.internal.o.g(chatroomList, "chatroomList");
        this.f309049a = chatroomList;
        this.f309050b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.a0)) {
            return false;
        }
        km2.a0 a0Var = (km2.a0) obj;
        return kotlin.jvm.internal.o.b(this.f309049a, a0Var.f309049a) && kotlin.jvm.internal.o.b(this.f309050b, a0Var.f309050b);
    }

    public int hashCode() {
        int hashCode = this.f309049a.hashCode() * 31;
        java.lang.String str = this.f309050b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "LuckyMoneyLiveData(chatroomList=" + this.f309049a + ", clientBuff=" + this.f309050b + ')';
    }
}
