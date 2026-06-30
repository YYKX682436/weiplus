package ly0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f322187a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f322188b;

    /* renamed from: c, reason: collision with root package name */
    public int f322189c;

    /* renamed from: d, reason: collision with root package name */
    public int f322190d;

    public d(java.lang.String taskId, int i17, int i18) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f322188b = taskId;
        this.f322189c = i17;
        this.f322190d = i18;
    }

    public final void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AIGC.AIMediaGeneratePollingTask", "update QueryState: currentInterval:" + this.f322189c + " nextInterval:" + i17 + " currentMaxCount: " + this.f322190d + ", nextQueryCount:" + i18);
        this.f322189c = i17;
        this.f322190d = i18;
        this.f322187a = 0;
    }

    public java.lang.String toString() {
        return "QueryState(serverTasKId='" + this.f322188b + "', clientRetryCount=" + this.f322187a + " serverInterval=" + this.f322189c + ", serverQueryMaxCount=" + this.f322190d + ')';
    }
}
