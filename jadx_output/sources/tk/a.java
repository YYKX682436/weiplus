package tk;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f419857a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.mm.biz.h2 f419858b;

    public a(boolean z17, com.tencent.wechat.mm.biz.h2 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f419857a = z17;
        this.f419858b = scene;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.a)) {
            return false;
        }
        tk.a aVar = (tk.a) obj;
        return this.f419857a == aVar.f419857a && this.f419858b == aVar.f419858b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f419857a) * 31) + this.f419858b.hashCode();
    }

    public java.lang.String toString() {
        return "BizPublishEditorCheckResult(shouldUseNewEditor=" + this.f419857a + ", scene=" + this.f419858b + ')';
    }
}
