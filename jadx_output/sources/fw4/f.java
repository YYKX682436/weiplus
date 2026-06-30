package fw4;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f267097a;

    /* renamed from: b, reason: collision with root package name */
    public final fw4.e f267098b;

    public f(com.tencent.mm.modelbase.m1 netSceneBase, fw4.e callback) {
        kotlin.jvm.internal.o.g(netSceneBase, "netSceneBase");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f267097a = netSceneBase;
        this.f267098b = callback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw4.f)) {
            return false;
        }
        fw4.f fVar = (fw4.f) obj;
        return kotlin.jvm.internal.o.b(this.f267097a, fVar.f267097a) && kotlin.jvm.internal.o.b(this.f267098b, fVar.f267098b);
    }

    public int hashCode() {
        return (this.f267097a.hashCode() * 31) + this.f267098b.hashCode();
    }

    public java.lang.String toString() {
        return "GetDownloadAppInfoRequest(netSceneBase=" + this.f267097a + ", callback=" + this.f267098b + ')';
    }
}
