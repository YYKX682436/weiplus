package ng1;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f336942a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f336943b;

    public m(java.lang.String appId, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f336942a = appId;
        this.f336943b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.m)) {
            return false;
        }
        ng1.m mVar = (ng1.m) obj;
        return kotlin.jvm.internal.o.b(this.f336942a, mVar.f336942a) && this.f336943b == mVar.f336943b;
    }

    public int hashCode() {
        return (this.f336942a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f336943b);
    }

    public java.lang.String toString() {
        return "WALaunchCheckDemoInfoParams(appId=" + this.f336942a + ", warmLaunch=" + this.f336943b + ')';
    }
}
