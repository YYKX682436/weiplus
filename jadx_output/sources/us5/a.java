package us5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430574a;

    /* renamed from: b, reason: collision with root package name */
    public int f430575b;

    /* renamed from: c, reason: collision with root package name */
    public double f430576c;

    public a(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f430574a = name;
    }

    public final void a(double d17) {
        java.lang.String str = this.f430574a;
        if (d17 > 2.147483647E9d || d17 < -2.147483648E9d) {
            com.tencent.mars.xlog.Log.i("CollectAccumulationData", "accumulationData error name: " + str + " value: " + d17);
            return;
        }
        this.f430575b++;
        this.f430576c += d17;
        com.tencent.mars.xlog.Log.i("CollectAccumulationData", "accumulationData name: " + str + " value: " + d17 + " count: " + this.f430575b + " totalData: " + this.f430576c);
    }
}
