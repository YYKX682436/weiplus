package us5;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430577a;

    /* renamed from: b, reason: collision with root package name */
    public int f430578b;

    /* renamed from: c, reason: collision with root package name */
    public double f430579c;

    public b(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f430577a = name;
    }

    public final void a(double d17) {
        if (d17 > 2.147483647E9d || d17 < -2.147483648E9d) {
            com.tencent.mars.xlog.Log.i("CollectAvgData", "averageData error value: " + d17);
            return;
        }
        int i17 = this.f430578b + 1;
        this.f430578b = i17;
        double d18 = this.f430579c;
        this.f430579c = d18 + ((d17 - d18) / i17);
        com.tencent.mars.xlog.Log.i("CollectAvgData", "averageData name: " + this.f430577a + " value: " + d17 + " count: " + this.f430578b + " avgData: " + this.f430579c);
    }
}
