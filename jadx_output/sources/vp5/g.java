package vp5;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final vp5.f f439109a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439110b;

    public g(vp5.f pluginPermissions, java.lang.String appId) {
        kotlin.jvm.internal.o.g(pluginPermissions, "pluginPermissions");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f439109a = pluginPermissions;
        this.f439110b = appId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.g)) {
            return false;
        }
        vp5.g gVar = (vp5.g) obj;
        return kotlin.jvm.internal.o.b(this.f439109a, gVar.f439109a) && kotlin.jvm.internal.o.b(this.f439110b, gVar.f439110b);
    }

    public int hashCode() {
        return (this.f439109a.hashCode() * 31) + this.f439110b.hashCode();
    }

    public java.lang.String toString() {
        return "PluginPermission(pluginPermissions=" + this.f439109a + ", appId=" + this.f439110b + ")";
    }
}
