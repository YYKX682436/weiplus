package f25;

/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f259104a;

    /* renamed from: b, reason: collision with root package name */
    public final int f259105b;

    public l0(java.lang.String requestScene, int i17) {
        kotlin.jvm.internal.o.g(requestScene, "requestScene");
        this.f259104a = requestScene;
        this.f259105b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        f25.l0 l0Var = obj instanceof f25.l0 ? (f25.l0) obj : null;
        return l0Var != null && kotlin.jvm.internal.o.b(l0Var.f259104a, this.f259104a) && l0Var.f259105b == this.f259105b;
    }

    public int hashCode() {
        return this.f259104a.hashCode() + this.f259105b;
    }

    public java.lang.String toString() {
        return "IPluginAudioFocusManager.RequestScene(requestScene:" + this.f259104a + ",featureFlag:" + this.f259105b + ')';
    }
}
