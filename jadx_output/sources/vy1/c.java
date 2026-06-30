package vy1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f441443a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f441444b;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f441447e;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f441445c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f441446d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f441448f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f441449g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f441450h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f441451i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f441452j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f441453k = new java.util.concurrent.ConcurrentHashMap();

    public void a() {
        this.f441443a = null;
        this.f441444b = null;
        ((java.util.concurrent.ConcurrentHashMap) this.f441445c).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f441446d).clear();
        this.f441447e = null;
        ((java.util.concurrent.CopyOnWriteArrayList) this.f441448f).clear();
        ((java.util.concurrent.CopyOnWriteArrayList) this.f441449g).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f441450h).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f441451i).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f441452j).clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f441453k).clear();
    }

    public java.lang.String toString() {
        return "ViewDataEntity{viewId='" + this.f441443a + "', viewUniqueId='" + this.f441444b + "', lastReportTimes='" + this.f441453k + "', reportIntervals='" + this.f441452j + "', viewParams=" + this.f441445c + "', viewEventParams=" + this.f441446d + "', innerProperty='" + this.f441450h + '}';
    }
}
