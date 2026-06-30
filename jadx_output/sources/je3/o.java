package je3;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f299305a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f299306b;

    /* renamed from: c, reason: collision with root package name */
    public long f299307c;

    /* renamed from: d, reason: collision with root package name */
    public long f299308d;

    /* renamed from: e, reason: collision with root package name */
    public long f299309e;

    /* renamed from: f, reason: collision with root package name */
    public long f299310f;

    /* renamed from: g, reason: collision with root package name */
    public long f299311g;

    /* renamed from: h, reason: collision with root package name */
    public long f299312h;

    /* renamed from: i, reason: collision with root package name */
    public long f299313i;

    /* renamed from: j, reason: collision with root package name */
    public long f299314j;

    public o(java.lang.String bizName, java.lang.String str, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, int i17, kotlin.jvm.internal.i iVar) {
        java.lang.String sessionID = (i17 & 2) != 0 ? java.lang.String.valueOf(java.lang.System.currentTimeMillis()) : str;
        long j39 = (i17 & 4) != 0 ? 0L : j17;
        long j47 = (i17 & 8) != 0 ? 0L : j18;
        long j48 = (i17 & 16) != 0 ? 0L : j19;
        long j49 = (i17 & 32) != 0 ? 0L : j27;
        long j57 = (i17 & 64) != 0 ? 0L : j28;
        long j58 = (i17 & 128) != 0 ? 0L : j29;
        long j59 = (i17 & 256) != 0 ? 0L : j37;
        long j66 = (i17 & 512) != 0 ? 0L : j38;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(sessionID, "sessionID");
        this.f299305a = bizName;
        this.f299306b = sessionID;
        this.f299307c = j39;
        this.f299308d = j47;
        this.f299309e = j48;
        this.f299310f = j49;
        this.f299311g = j57;
        this.f299312h = j58;
        this.f299313i = j59;
        this.f299314j = j66;
    }

    public final void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f299314j = elapsedRealtime;
        je3.i.M2(je3.k.f299298e, this.f299306b, this.f299305a, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.DESTROY, elapsedRealtime - this.f299313i, null, 0.0f, 48, null);
    }

    public final void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f299310f = elapsedRealtime;
        je3.i.M2(je3.k.f299298e, this.f299306b, this.f299305a, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.SETUP, elapsedRealtime - this.f299309e, null, 0.0f, 48, null);
    }

    public final void c() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f299312h = elapsedRealtime;
        je3.i.M2(je3.k.f299298e, this.f299306b, this.f299305a, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.START, elapsedRealtime - this.f299311g, null, 0.0f, 48, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je3.o)) {
            return false;
        }
        je3.o oVar = (je3.o) obj;
        return kotlin.jvm.internal.o.b(this.f299305a, oVar.f299305a) && kotlin.jvm.internal.o.b(this.f299306b, oVar.f299306b) && this.f299307c == oVar.f299307c && this.f299308d == oVar.f299308d && this.f299309e == oVar.f299309e && this.f299310f == oVar.f299310f && this.f299311g == oVar.f299311g && this.f299312h == oVar.f299312h && this.f299313i == oVar.f299313i && this.f299314j == oVar.f299314j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f299305a.hashCode() * 31) + this.f299306b.hashCode()) * 31) + java.lang.Long.hashCode(this.f299307c)) * 31) + java.lang.Long.hashCode(this.f299308d)) * 31) + java.lang.Long.hashCode(this.f299309e)) * 31) + java.lang.Long.hashCode(this.f299310f)) * 31) + java.lang.Long.hashCode(this.f299311g)) * 31) + java.lang.Long.hashCode(this.f299312h)) * 31) + java.lang.Long.hashCode(this.f299313i)) * 31) + java.lang.Long.hashCode(this.f299314j);
    }

    public java.lang.String toString() {
        return "MagicBrushRuntimeInfo(bizName=" + this.f299305a + ", sessionID=" + this.f299306b + ", bindServiceStartTime=" + this.f299307c + ", bindServiceEndTime=" + this.f299308d + ", setupStartTime=" + this.f299309e + ", setupEndTime=" + this.f299310f + ", startStartTime=" + this.f299311g + ", startEndTime=" + this.f299312h + ", destroyStartTime=" + this.f299313i + ", destroyEndTime=" + this.f299314j + ')';
    }
}
