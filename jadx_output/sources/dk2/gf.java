package dk2;

/* loaded from: classes3.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public final dk2.hf f233528a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f233529b;

    public gf(dk2.hf triggerScene, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(triggerScene, "triggerScene");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f233528a = triggerScene;
        this.f233529b = sessionId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.gf)) {
            return false;
        }
        dk2.gf gfVar = (dk2.gf) obj;
        return this.f233528a == gfVar.f233528a && kotlin.jvm.internal.o.b(this.f233529b, gfVar.f233529b);
    }

    public int hashCode() {
        return (this.f233528a.hashCode() * 31) + this.f233529b.hashCode();
    }

    public java.lang.String toString() {
        return "ShowBtnContext(triggerScene=" + this.f233528a + ", sessionId=" + this.f233529b + ')';
    }
}
