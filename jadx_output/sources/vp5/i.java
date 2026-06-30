package vp5;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f439116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f439117b;

    /* renamed from: c, reason: collision with root package name */
    public final long f439118c;

    /* renamed from: d, reason: collision with root package name */
    public final long f439119d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f439120e;

    public i(java.lang.String appid, long j17, long j18, long j19, boolean z17) {
        kotlin.jvm.internal.o.g(appid, "appid");
        this.f439116a = appid;
        this.f439117b = j17;
        this.f439118c = j18;
        this.f439119d = j19;
        this.f439120e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.i)) {
            return false;
        }
        vp5.i iVar = (vp5.i) obj;
        return kotlin.jvm.internal.o.b(this.f439116a, iVar.f439116a) && this.f439117b == iVar.f439117b && this.f439118c == iVar.f439118c && this.f439119d == iVar.f439119d && this.f439120e == iVar.f439120e;
    }

    public int hashCode() {
        return (((((((this.f439116a.hashCode() * 31) + java.lang.Long.hashCode(this.f439117b)) * 31) + java.lang.Long.hashCode(this.f439118c)) * 31) + java.lang.Long.hashCode(this.f439119d)) * 31) + java.lang.Boolean.hashCode(this.f439120e);
    }

    public java.lang.String toString() {
        return "RuntimeReadyData(appid=" + this.f439116a + ", appVersion=" + this.f439117b + ", appState=" + this.f439118c + ", uvLoopPtr=" + this.f439119d + ", forceHavePermission=" + this.f439120e + ")";
    }
}
