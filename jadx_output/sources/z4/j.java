package z4;

/* loaded from: classes13.dex */
public abstract class j implements z4.r {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f470068c = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470069a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f470070b;

    public j(java.lang.String str, java.lang.String str2) {
        this.f470069a = str;
        this.f470070b = str2;
        ((java.util.HashSet) f470068c).add(this);
    }

    public abstract boolean a();

    public boolean b() {
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.containsFeature(z4.a.f470054a, this.f470070b);
    }
}
