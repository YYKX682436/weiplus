package vq4;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f439286a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f439287b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f439288c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f439289d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f439290e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f439291f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f439292g;

    public e(org.json.JSONObject BTBatteryTemp, org.json.JSONObject CTCpuTemp, org.json.JSONObject PTDeviceTemp, java.lang.String avgCurrentValue, java.lang.String avgMemoryPss, java.lang.String avgCpuLoad, java.lang.String cpuLoadInfo) {
        kotlin.jvm.internal.o.g(BTBatteryTemp, "BTBatteryTemp");
        kotlin.jvm.internal.o.g(CTCpuTemp, "CTCpuTemp");
        kotlin.jvm.internal.o.g(PTDeviceTemp, "PTDeviceTemp");
        kotlin.jvm.internal.o.g(avgCurrentValue, "avgCurrentValue");
        kotlin.jvm.internal.o.g(avgMemoryPss, "avgMemoryPss");
        kotlin.jvm.internal.o.g(avgCpuLoad, "avgCpuLoad");
        kotlin.jvm.internal.o.g(cpuLoadInfo, "cpuLoadInfo");
        this.f439286a = BTBatteryTemp;
        this.f439287b = CTCpuTemp;
        this.f439288c = PTDeviceTemp;
        this.f439289d = avgCurrentValue;
        this.f439290e = avgMemoryPss;
        this.f439291f = avgCpuLoad;
        this.f439292g = cpuLoadInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq4.e)) {
            return false;
        }
        vq4.e eVar = (vq4.e) obj;
        return kotlin.jvm.internal.o.b(this.f439286a, eVar.f439286a) && kotlin.jvm.internal.o.b(this.f439287b, eVar.f439287b) && kotlin.jvm.internal.o.b(this.f439288c, eVar.f439288c) && kotlin.jvm.internal.o.b(this.f439289d, eVar.f439289d) && kotlin.jvm.internal.o.b(this.f439290e, eVar.f439290e) && kotlin.jvm.internal.o.b(this.f439291f, eVar.f439291f) && kotlin.jvm.internal.o.b(this.f439292g, eVar.f439292g);
    }

    public int hashCode() {
        return (((((((((((this.f439286a.hashCode() * 31) + this.f439287b.hashCode()) * 31) + this.f439288c.hashCode()) * 31) + this.f439289d.hashCode()) * 31) + this.f439290e.hashCode()) * 31) + this.f439291f.hashCode()) * 31) + this.f439292g.hashCode();
    }

    public java.lang.String toString() {
        return "ProfileReportInfo(BTBatteryTemp=" + this.f439286a + ", CTCpuTemp=" + this.f439287b + ", PTDeviceTemp=" + this.f439288c + ", avgCurrentValue=" + this.f439289d + ", avgMemoryPss=" + this.f439290e + ", avgCpuLoad=" + this.f439291f + ",cpuLoadInfo:" + this.f439292g + ')';
    }
}
