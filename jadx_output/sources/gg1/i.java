package gg1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final x91.h f271568a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f271569b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f271570c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f271571d;

    public i(x91.h mrDevice) {
        kotlin.jvm.internal.o.g(mrDevice, "mrDevice");
        this.f271568a = mrDevice;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(gg1.i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.video.cast.MRDeviceWithStatus");
        return kotlin.jvm.internal.o.b(this.f271568a, ((gg1.i) obj).f271568a);
    }

    public int hashCode() {
        return this.f271568a.hashCode();
    }

    public java.lang.String toString() {
        return "MRDeviceWithStatus(mrDevice=" + this.f271568a + ", isSelected=" + this.f271569b + ", isConnectSuccess=" + this.f271570c + ", isConnecting=" + this.f271571d + ')';
    }
}
