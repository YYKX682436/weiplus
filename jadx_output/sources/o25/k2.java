package o25;

/* loaded from: classes7.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f342550a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f342551b = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f342552c = new java.util.HashMap();

    public void a(java.lang.String str, long j17) {
        this.f342551b.add(new o25.j2(this, str, j17, ""));
        if (str.equals("onPageStarted") || str.equals("onPageFinished") || str.equals("getA8KeyStart") || str.equals("getA8KeyEnd") || str.equals("firstScreenTimestamp") || str.equals("firstScreenTime")) {
            java.util.HashMap hashMap = this.f342552c;
            if (hashMap.get(str) == null) {
                hashMap.put(str, new o25.j2(this, str, j17, ""));
            }
            ((o25.j2) hashMap.get(str)).f342546b = j17;
        }
    }

    public long b(java.lang.String str, long j17) {
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f342551b;
        if (concurrentLinkedDeque != null && !concurrentLinkedDeque.isEmpty()) {
            java.util.Iterator it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                o25.j2 j2Var = (o25.j2) it.next();
                if (j2Var.f342545a.equals(str)) {
                    return j2Var.f342546b;
                }
            }
        }
        return j17;
    }
}
