package ii;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ji.h[] f291604a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.p[] f291605b;

    /* renamed from: c, reason: collision with root package name */
    public final ki.b f291606c;

    public a(ji.h[] appBgSumPssMonitorConfigs, ji.p[] processBgMemoryMonitorConfigs, ki.b trimMemoryConfig) {
        kotlin.jvm.internal.o.g(appBgSumPssMonitorConfigs, "appBgSumPssMonitorConfigs");
        kotlin.jvm.internal.o.g(processBgMemoryMonitorConfigs, "processBgMemoryMonitorConfigs");
        kotlin.jvm.internal.o.g(trimMemoryConfig, "trimMemoryConfig");
        this.f291604a = appBgSumPssMonitorConfigs;
        this.f291605b = processBgMemoryMonitorConfigs;
        this.f291606c = trimMemoryConfig;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii.a)) {
            return false;
        }
        ii.a aVar = (ii.a) obj;
        return kotlin.jvm.internal.o.b(this.f291604a, aVar.f291604a) && kotlin.jvm.internal.o.b(this.f291605b, aVar.f291605b) && kotlin.jvm.internal.o.b(this.f291606c, aVar.f291606c);
    }

    public int hashCode() {
        ji.h[] hVarArr = this.f291604a;
        int hashCode = (hVarArr != null ? java.util.Arrays.hashCode(hVarArr) : 0) * 31;
        ji.p[] pVarArr = this.f291605b;
        int hashCode2 = (hashCode + (pVarArr != null ? java.util.Arrays.hashCode(pVarArr) : 0)) * 31;
        ki.b bVar = this.f291606c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MemoryCanaryConfig(appBgSumPssMonitorConfigs=" + java.util.Arrays.toString(this.f291604a) + ", processBgMemoryMonitorConfigs=" + java.util.Arrays.toString(this.f291605b) + ", trimMemoryConfig=" + this.f291606c + ")";
    }
}
