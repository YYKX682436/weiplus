package wi5;

/* loaded from: classes.dex */
public final class x extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f446359b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.mvvmlist.MvvmList f446360c;

    public x(ri5.j item, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f446359b = item;
        this.f446360c = mvvmList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.x)) {
            return false;
        }
        wi5.x xVar = (wi5.x) obj;
        return kotlin.jvm.internal.o.b(this.f446359b, xVar.f446359b) && kotlin.jvm.internal.o.b(this.f446360c, xVar.f446360c);
    }

    public int hashCode() {
        int hashCode = this.f446359b.hashCode() * 31;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f446360c;
        return hashCode + (mvvmList == null ? 0 : mvvmList.hashCode());
    }

    public java.lang.String toString() {
        return "SearchMoreClickAction(item=" + this.f446359b + ", searchMvvmList=" + this.f446360c + ')';
    }
}
