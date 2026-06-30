package vf0;

/* loaded from: classes12.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final vf0.j3 f436196a;

    public i3(vf0.j3 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f436196a = scene;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf0.i3) && this.f436196a == ((vf0.i3) obj).f436196a;
    }

    public int hashCode() {
        return this.f436196a.hashCode();
    }

    public java.lang.String toString() {
        return "VideoSendParamsExtra(scene=" + this.f436196a + ')';
    }
}
