package o4;

/* loaded from: classes13.dex */
public final class a implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f342800a;

    public a(o4.b registry) {
        kotlin.jvm.internal.o.g(registry, "registry");
        this.f342800a = new java.util.LinkedHashSet();
        registry.b("androidx.savedstate.Restarter", this);
    }

    @Override // o4.d
    public android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArrayList("classes_to_restore", new java.util.ArrayList<>(this.f342800a));
        return bundle;
    }
}
