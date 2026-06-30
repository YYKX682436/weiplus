package vd1;

/* loaded from: classes7.dex */
public final class a implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f435560a = new java.util.concurrent.ConcurrentLinkedDeque();

    @Override // m3.e
    public java.lang.Object a() {
        vd1.g gVar = (vd1.g) this.f435560a.poll();
        return gVar == null ? new vd1.g() : gVar;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        vd1.g jsApiInfo = (vd1.g) obj;
        kotlin.jvm.internal.o.g(jsApiInfo, "jsApiInfo");
        return this.f435560a.offer(jsApiInfo);
    }
}
