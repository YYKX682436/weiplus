package cv;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f222516a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f222517b;

    /* renamed from: c, reason: collision with root package name */
    public int f222518c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f222519d;

    public v0(int i17, java.lang.String str, int i18) {
        this.f222516a = i17;
        this.f222517b = str;
        this.f222518c = i18;
        this.f222519d = "";
        if (str == null) {
            this.f222517b = b(i17);
        }
    }

    public final java.lang.String a() {
        java.lang.String str = this.f222517b;
        int i17 = this.f222516a;
        if (str == null) {
            this.f222517b = b(i17);
        }
        java.lang.String str2 = this.f222517b;
        return str2 == null ? b(i17) : str2;
    }

    public final java.lang.String b(int i17) {
        if (i17 == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6p);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 2) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6n);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 == 3) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        if (i17 != 4) {
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6n);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            return string4;
        }
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        return string5;
    }

    public final java.lang.String c() {
        int i17 = this.f222516a;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "" : "BluetoothAndroid" : "Headphones" : "Receiver" : "Speaker";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof cv.v0)) {
            return false;
        }
        cv.v0 v0Var = (cv.v0) obj;
        return this.f222516a == v0Var.f222516a && kotlin.jvm.internal.o.b(this.f222517b, v0Var.f222517b);
    }

    public int hashCode() {
        long j17 = this.f222516a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return (int) (j17 + android.os.SystemClock.elapsedRealtime());
    }

    public java.lang.String toString() {
        return "AudioRouteInfo(deviceType=" + this.f222516a + ", deviceName=" + this.f222517b + ", state=" + this.f222518c + ')';
    }

    public /* synthetic */ v0(int i17, java.lang.String str, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? 1 : i17, (i19 & 2) != 0 ? null : str, (i19 & 4) != 0 ? 3 : i18);
    }
}
